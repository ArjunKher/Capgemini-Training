INSERT INTO users(username, password, enabled)
values('user', 'pass', true);

INSERT INTO users(username, password, enabled)
values('admin', 'admin', true);



INSERT INTO autorities(username, authority)
values('user', 'ROLE_USER');

INSERT INTO authorities(username, authority)
values('admin', 'ROLE_ADMIN');