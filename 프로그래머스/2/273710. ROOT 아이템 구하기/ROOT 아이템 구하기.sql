-- 코드를 작성해주세요
select I.item_id, I.item_name
from ITEM_INFO as I join ITEM_TREE  as T on I.item_id = T.item_id
where T.parent_item_id is null
order by I.item_id