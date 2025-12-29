# -- 코드를 작성해주세요
with notup as(select item_id
    from item_tree
    where item_id not in (select distinct parent_item_id from item_tree where parent_item_id is not null)
)
select N.item_id, I.item_name, I.rarity
from notup as N join item_info as I on N.item_id=I.item_id

order by item_id desc