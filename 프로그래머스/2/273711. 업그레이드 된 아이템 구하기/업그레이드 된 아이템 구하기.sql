-- 코드를 작성해주세요
with rare as(
    select T.item_id
    from item_info as I join item_tree as T on I.item_id=T.parent_item_id
    where I.rarity = 'RARE')
select I.item_id, I.item_name, I.rarity
from rare as R join item_info as I on R.item_id = I.item_id
order by I.item_id desc