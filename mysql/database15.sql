SELECT IF(TRUE,'北京','上海') FROM DUAL;
SELECT IFNULL(NULL,'mdl');
SELECT CASE 
	WHEN TRUE THEN 'jack'
	WHEN TRUE FALSE 'tom'
	ELSE 'mary' END;
SELECT ename,IF(comm IS NULL,0.0,comm)
	FROM emp;
SELECT ename,IFNULL(comm,0.0)
	FROM emp;
SELECT ename,job
	FROM emp;
SELECT ename, (
    SELECT CASE
        WHEN job = 'CLERK' THEN '职员'
        WHEN job = 'MANAGER' THEN '经理'
        WHEN job = 'SALESMAN' THEN '销售人员'
        ELSE job 
    END
) 
FROM emp;