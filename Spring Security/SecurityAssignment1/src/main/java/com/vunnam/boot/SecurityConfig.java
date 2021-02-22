package com.vunnam.boot;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	@Autowired  //By default this dataSource points to H2
	DataSource dataSource;

	/////With InMemory
	/*@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
		.withUser("vunnam")
		.password("Krrish")
		.roles("ADMIN")
		.and()
		.withUser("user")
		.password("user")
		.roles("USER");
	}*/
	
	//With JDBC H2 Database
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.jdbcAuthentication()
		.dataSource(dataSource);
		/*.withDefaultSchema()
		.withUser(
				User.withUsername("user")
				.password("user123")
				.roles("USER")
				)
		.withUser(
				User.withUsername("admin")
				.password("admin321")
				.roles("ADMIN")
				);
		*/
	}
	
	@Bean
	public PasswordEncoder passEncoder() {
		//return new BCryptPasswordEncoder();
		return NoOpPasswordEncoder.getInstance();
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/admin").hasRole("ADMIN")
		.antMatchers("/user").hasAnyRole("USER","ADMIN")
		.antMatchers("/").permitAll()
		.and().formLogin().loginPage("/login").permitAll()
		.and()
		.logout()  
	    .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
	    .and()
	    .rememberMe()
	    .key("remember007")
	    .rememberMeParameter("remember-me")
	    .rememberMeCookieName("rememberLogin")
	    .tokenValiditySeconds(10);
	}
	
}
