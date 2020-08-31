declare
   v_deptno dept.deptno%type;
   v_dname dept.dname%type;
   v_loc dept.loc%type;
   cursor cur is (select * from dept);

begin
   open cur;
   loop
   if cur%NOTFOUND then
	exit;
   end if;
   fetch cur into v_deptno, v_dname, v_loc;
      dbms_output.put_line(v_deptno);
      dbms_output.put_line(v_dname);
      dbms_output.put_line(v_loc);
   end loop;
   close cur;

end;
/