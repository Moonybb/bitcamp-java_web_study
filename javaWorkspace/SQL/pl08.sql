declare
	cnt INTEGER := 0;
begin
	while cnt<5 loop
	dbms_output.put_line('cnt='||cnt);
	cnt := cnt+1;
	end loop;
end;
/