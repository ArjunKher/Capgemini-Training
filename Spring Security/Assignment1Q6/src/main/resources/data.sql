INSERT INTO users(username, password, enabled)
values('user', '$2y$12$BR3xVh5PNwvBWZLEY59xTuuwad245UWfQCMAtF9HyyAKTbXJNDu3u', true);

INSERT INTO users(username, password, enabled)
values('admin', '$2y$12$zUIXJAdt97HMLthnm72bjeKUVLjwoViKg4gQK/ssYFsH1fIdwgz/W', true);

INSERT INTO users(username, password, enabled)
values('saurabh', '$2y$12$dOrZobJIGFpMe2OxRH2Txuv8Yb0YyMxfxhJbzxBFvzQgYiPhY2Kj.', true);



INSERT INTO authorities(username, authority)
values('user', 'ROLE_USER');
INSERT INTO authorities(username, authority)
values('admin', 'ROLE_ADMIN');

INSERT INTO authorities(username, authority)
values('admin', 'ROLE_ADMIN');

INSERT INTO authorities(username, authority)
values('saurabh', 'ROLE_ADMIN');