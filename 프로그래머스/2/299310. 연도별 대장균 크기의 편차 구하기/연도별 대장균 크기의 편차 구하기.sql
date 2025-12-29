-- 코드를 작성해주세요
with sizeofyear as(select year(DIFFERENTIATION_DATE) as year, max(SIZE_OF_COLONY) as maxsize
                   from ECOLI_DATA 
                   group by year(DIFFERENTIATION_DATE))
select S.year,  S.maxsize-O.SIZE_OF_COLONY as YEAR_DEV, O.id
from sizeofyear as S join ECOLI_DATA as O on S.year = year(O.DIFFERENTIATION_DATE)
order by year, YEAR_DEV