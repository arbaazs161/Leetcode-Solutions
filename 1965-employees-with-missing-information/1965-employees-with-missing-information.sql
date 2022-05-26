/* Write your T-SQL query statement below */
select
    coalesce(E.[employee_id], S.[employee_id]) as 'employee_id'
from [dbo].[Employees] E
    full outer join [dbo].[Salaries] S
        on E.[employee_id] = S.[employee_id]
where 1 = 1
    and E.[name] is null
    or S.[salary] is null
order by 'employee_id';