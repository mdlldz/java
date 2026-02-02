CREATE TABLE student(
    id INT NOT NULL DEFAULT 1,
    NAME VARCHAR(20) NOT NULL DEFAULT '',
    chinese FLOAT NOT NULL DEFAULT 0.0,
    english FLOAT NOT NULL DEFAULT 0.0,
    math FLOAT NOT NULL DEFAULT 0.0
);
INSERT INTO student(id,NAME,chinese,english,math) VALUES(1,'韩顺平',89,78,90);
INSERT INTO student(id,NAME,chinese,english,math) VALUES(2,'张飞',67,98,56);
INSERT INTO student(id,NAME,chinese,english,math) VALUES(3,'宋江',87,78,77);
INSERT INTO student(id,NAME,chinese,english,math) VALUES(4,'关羽',88,98,90);
INSERT INTO student(id,NAME,chinese,english,math) VALUES(5,'赵云',82,84,67);
INSERT INTO student(id,NAME,chinese,english,math) VALUES(6,'欧阳锋',55,85,45);
INSERT INTO student(id,NAME,chinese,english,math) VALUES(7,'黄蓉',75,65,30);
SELECT `name`,english FROM student;
SELECT DISTINCT english FROM student;
SELECT `name`,(english + chinese + math) FROM student;
SELECT `name`,(english + chinese + math + 10) AS allscore FROM student;
SELECT * FROM student
WHERE `name` = '赵云';
SELECT * FROM student
WHERE english > 90;
SELECT * FROM student
WHERE math > 60 AND id > 4;
SELECT * FROM student
WHERE (chinese + english + math) > 200 AND
      math < chinese AND `name` LIKE '赵%'
SELECT * FROM student 
WHERE english BETWEEN 80 AND 90;
SELECT * FROM student
WHERE math = 90 OR math = 89 OR math = 91; 
SELECT * FROM student
WHERE math IN (90,89,91); 
SELECT * FROM student
	ORDER BY math;
SELECT * FROM student
	ORDER BY math DESC;
SELECT COUNT(*) FROM student;
SELECT COUNT(*) FROM student
WHERE math > 90;
CREATE TABLE t15 (
    `name` VARCHAR(20)
);

INSERT INTO t15 VALUES('tom');
INSERT INTO t15 VALUES('jack');
INSERT INTO t15 VALUES('mary');
INSERT INTO t15 VALUES(NULL);

SELECT * FROM t15;

SELECT COUNT(*) FROM t15; 
SELECT COUNT(`name`) FROM t15;
SELECT SUM(math) FROM student;
SELECT SUM(math + chinese + english) AS total FROM student;
SELECT SUM(chinese)/ COUNT(*) FROM student;
SELECT AVG(math) FROM student;
SELECT MAX(math + english + chinese),MIN(math + english + chinese) FROM student;