DROP DATABASE CZ3002_login;
CREATE DATABASE CZ3002_login;
USE CZ3002_login;
CREATE TABLE login_info (username varchar(64), password varchar(64));
INSERT INTO login_info (username, password) VALUES
    ('admin', 'admin'),
    ('user1', 'pass1'),
    ('user2', 'pass2');

SELECT * FROM login_info;