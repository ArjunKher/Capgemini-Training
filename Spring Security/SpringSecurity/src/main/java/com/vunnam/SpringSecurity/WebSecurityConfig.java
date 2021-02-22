package com.vunnam.SpringSecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Autowired
	private UserDetailsService userDetailsService;
	
	
	@Bean
	AuthenticationProvider authenticationProvider(){
		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
		provider.setUserDetailsService(userDetailsService);
		provider.setPasswordEncoder(new BCryptPasswordEncoder());
		return provider;
	}


	
	  @Override protected void configure(HttpSecurity http) throws Exception {
	  http.authorizeRequests() .antMatchers("/admin").hasRole("ADMIN")
	  .antMatchers("/user").hasAnyRole("USER","ADMIN")
	  .antMatchers("/").permitAll()
	  .and().formLogin().loginPage("/login").permitAll() .and() .logout()
	  .logoutRequestMatcher(new AntPathRequestMatcher("/logout")) .and()
	  .rememberMe() .key("remember007") .rememberMeParameter("remember-me")
	  .rememberMeCookieName("rememberLogin") .tokenValiditySeconds(10) .and(); }
	 
	
	
}
