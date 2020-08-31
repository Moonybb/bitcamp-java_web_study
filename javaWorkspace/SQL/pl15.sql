create or replace procedure proc01
(num in number,num2 out number)
is
begin
	num2 := num2+num;
	dbms_output.put_line('Hello World'||num);
end;
/