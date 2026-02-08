SELECT dname, ename, job
FROM emp, dept
WHERE emp.deptno = dept.deptno
ORDER BY dname;
SELECT * FROM dept;
SELECT * FROM emp;
CREATE TABLE stu (
    id INT,
    `name` VARCHAR(32)
);
INSERT INTO stu VALUES(1, 'jack'), (2, 'tom'), (3, 'kity'), (4, 'nono');
SELECT * FROM stu;
CREATE TABLE exam(
    id INT,
    grade INT
);
INSERT INTO exam VALUES(1, 56), (2, 76), (11, 8);
SELECT * FROM exam;
SELECT `name`,stu.id,grade
	FROM stu LEFT JOIN exam
	ON stu.id = exam.id;
SELECT `name`,stu.id,grade
	FROM stu RIGHT JOIN exam
	ON stu.id = exam.id;
SELECT dname,ename,job
		FROM dept LEFT JOIN emp
		ON dept.deptno = emp.deptno;
SELECT dname,ename,job
		FROM dept RIGHT JOIN emp
		ON dept.deptno = emp.deptno;