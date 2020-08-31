select ename, decode(deptno,
	10,'accounting',
	20,'reseach',
	30,'sales'
	,40,'oprations') from emp
/
