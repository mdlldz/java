SELECT ename, sal, dname, emp.deptno
FROM emp, dept
WHERE emp.deptno = dept.deptno;
SELECT worker.ename , boss.ename 
	FROM emp worker,emp boss
	WHERE worker.mgr = boss.empno;
SELECT * FROM emp;