SELECT ename,sal,job FROM emp WHERE sal>2500
SELECT ename,sal,job FROM emp WHERE job='MANAGER'
SELECT ename, sal, job FROM emp WHERE sal > 2500
UNION ALL
SELECT ename, sal, job FROM emp WHERE job = 'MANAGER'
LIMIT 0, 1000;
SELECT ename, sal, job FROM emp WHERE sal > 2500
UNION
SELECT ename, sal, job FROM emp WHERE job = 'MANAGER'
LIMIT 0, 1000;