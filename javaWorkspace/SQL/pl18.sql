create or replace trigger tri2
before update on dept
for each row
begin
	dbms_output.put_line('trigger');
	dbms_output.put_line('Old dname : '|| :old.dname);
	dbms_output.put_line('    New dname : '|| :new.dname);

end;
/