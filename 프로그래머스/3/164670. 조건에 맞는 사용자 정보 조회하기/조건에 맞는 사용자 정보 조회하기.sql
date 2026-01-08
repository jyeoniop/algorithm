-- 코드를 입력하세요
SELECT u.user_id, u.nickname, concat(u.city," ",u.STREET_ADDRESS1," ",u.STREET_ADDRESS2) as 전체주소
, concat(substring(u.tlno,1,3),"-",substring(u.tlno,4,4), "-",substring(u.tlno,8))as 전화번호
from USED_GOODS_BOARD as b join USED_GOODS_USER  as u on b.writer_id=u.user_id
group by b.writer_id
having count(b.board_id)>=3
order by u.user_id desc