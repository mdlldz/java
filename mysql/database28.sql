CREATE USER 'mdl' @ 'localhost' IDENTIFIED BY '123456';
SELECT PASSWORD('123456')
SELECT * 
	FROM mysql.user;
SET PASSWORD = PASSWORD('123456');
SET PASSWORD FOR 'mdl'@'localhost' = PASSWORD('654321');
CREATE DATABASE testdb;

CREATE TABLE news (
    id INT,
    content VARCHAR(32)
);
INSERT INTO news VALUES(100, '北京新闻');
SELECT * FROM news;
GRANT SELECT , INSERT , UPDATE
	ON testdb.news
	TO 'mdl'@'localhost'
SET PASSWORD FOR 'shunping'@'localhost' = PASSWORD('abc');
REVOKE SELECT, UPDATE, INSERT ON testdb.news FROM 'mdl'@'localhost';
REVOKE ALL ON testdb.news FROM 'shunping'@'localhost';
DROP USER 'shunping'@'localhost';