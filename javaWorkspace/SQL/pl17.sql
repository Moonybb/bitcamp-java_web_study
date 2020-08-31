create or replace trigger tri01
before insert on dept
begin
	dbms_output.put_line('insert event');
end;
/