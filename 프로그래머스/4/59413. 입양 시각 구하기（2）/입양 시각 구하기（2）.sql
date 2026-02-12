with recursive time as(
    select 0 as hour
    union all
    select hour+1
    from time
    where hour<23
)
select time.hour as hour, count(case when animal_outs.animal_id is null then null else 1 end) as count
from time left join animal_outs on time.hour=hour(animal_outs.datetime)
group by time.hour