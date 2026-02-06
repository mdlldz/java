SELECT * FROM emp
	WHERE hiredate > '1992 - 01 - 01';
SELECT ename , sal FROM emp
	WHERE ename LIKE 'S%';
SELECT ename ,  sal FROM emp
	WHERE ename LIKE '__O%';
SELECT * FROM emp
	WHERE mgr IS NULL;
DESC emp;
SELECT * FROM emp
	ORDER BY sal
SELECT * FROM emp 
	ORDER BY deptno ASC;
SELECT * FROM emp
	ORDER BY empno
		LIMIT 0,3;
SELECT * FROM emp
	ORDER BY empno
		LIMIT 3,3;
SELECT * FROM emp
	ORDER BY empno
		LIMIT 6,3;
SELECT * FROM emp
	ORDER BY empno
		LIMIT 12,3;
SELECT	COUNT(*),AVG(sal),job
	FROM emp
	GROUP BY job; 
SELECT COUNT(*),COUNT(comm) 
	FROM emp;
SELECT COUNT(*),COUNT(IF(comm IS NULL,1,NULL))
	FROM emp;
SELECT COUNT(*),COUNT(*) - COUNT(comm)
	FROM emp;
SELECT COUNT(mgr DISTINCT mgr)
	FROM emp;
SELECT MAX(sal) - MIN(sal)
	FROM emp;
SELECT * FROM emp;
SELECT deptno,AVG(sal) AS avgsal
	FROM emp
	GROUP BY deptno
	HAVING avgsal > 1000
	ORDER BY avgsal DESC
	LIMIT 0,2

		

