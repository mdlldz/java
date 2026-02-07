SELECT deptno
	FROM emp
	WHERE ename = 'SMITH';
SELECT *
FROM emp
WHERE deptno = (
    SELECT deptno
    FROM emp
    WHERE ename = 'SMITH'
);
SELECT DISTINCT job 
	FROM emp
	WHERE deptno = 20;
SELECT ename ,  job , sal , deptno
	FROM emp 
	WHERE job IN (SELECT DISTINCT job 
	FROM emp
	WHERE deptno = 20	
	) AND deptno <> 10;
SELECT *
	FROM emp
	WHERE(deptno,job) = (
	SELECT deptno , job
	FROM emp
	WHERE ename = 'SMITH'
	);
SELECT ename,sal,temp.avg_sal
	FROM emp,(
		SELECT deptno,AVG(sal) AS avg_sal
		FROM emp
		GROUP BY deptno
	) temp
	WHERE emp.deptno = temp.deptno AND emp.sal > temp.avg_sal
SELECT dname, dept.deptno, loc
FROM dept, (
    SELECT COUNT(*) AS '人数', deptno
    FROM emp
    GROUP BY deptno
) tmp
WHERE tmp.deptno = dept.deptno;