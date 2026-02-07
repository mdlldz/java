CREATE TABLE my_tab01 (
    id INT,
    `name` VARCHAR(32),
    sal DOUBLE,
    job VARCHAR(32),
    deptno INT
);
DESC my_tab01;
SELECT * FROM my_tab01;
INSERT INTO my_tab01 (id, `name`, sal, job, deptno)
	SELECT empno, ename, sal, job, deptno FROM emp;
SELECT  COUNT(*) FROM my_tab01;
CREATE TABLE my_table02 LIKE emp;
DESC my_table02;
INSERT INTO my_table02
	SELECT * FROM emp;
SELECT * FROM my_table02;
CREATE TABLE my_tmp LIKE my_table02;
INSERT INTO my_tmp
	SELECT DISTINCT * FROM my_table02;
DELETE FROM my_table02;

INSERT INTO my_table02
	SELECT * FROM my_tmp;
DROP TABLE my_tmp;
SELECT * FROM my_table02; 