with getid as(SELECT host_id
from PLACES 
group by HOST_ID
having count(ID)>=2)
select p.*
from getid as g join places as p on g.host_id=p.host_id
order by p.id asc