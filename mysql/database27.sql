CREATE VIEW emp_view01
	AS 
	SELECT empno,ename,job,deptno FROM emp;
DESC emp_view01;
SELECT empno,job FROM emp_view01;
SHOW CREATE VIEW emp_view01;
UPDATE emp_view01
	SET job = 'manager'
	WHERE empno = 7369;
SELECT * FROM emp;	
DROP VIEW emp_view01;
DESC emp_view01
CREATE VIEW emp_view02
	AS
	SELECT empno , ename FROM emp_view01;
CREATE VIEW emp_view3 
	AS
	SELECT empno ,ename ,dname,grade
	FROM emp,dept,salgrade
	WHERE emp.deptno = dept.deptno AND
	(sal BETWEEN losal AND hisal);
 DESC emp_view3;
 