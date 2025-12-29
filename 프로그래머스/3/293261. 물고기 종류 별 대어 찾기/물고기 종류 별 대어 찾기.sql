with length as (select fish_type, max(length) as leng
    from fish_info
    group by fish_type
)
select F.id as ID,N.fish_name,  F.length 
from length as L join fish_info as F on L.leng = F.length and L.fish_type = F.fish_type
join fish_name_info as N on L.fish_type = N.fish_type
order by ID asc