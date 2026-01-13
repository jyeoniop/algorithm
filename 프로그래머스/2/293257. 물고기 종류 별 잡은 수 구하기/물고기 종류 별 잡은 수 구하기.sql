select count(i.id) as fish_count, n.fish_name
from FISH_INFO  as i join FISH_NAME_INFO  as n on i.fish_type=n.fish_type
group by n.fish_name
order by fish_count desc