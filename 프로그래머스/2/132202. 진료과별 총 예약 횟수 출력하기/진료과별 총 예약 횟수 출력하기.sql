
SELECT MCDP_CD as 진료과코드,count(pt_no)as 5월예약건수
from APPOINTMENT 
where date(apnt_ymd) like '%2022-05%'
group by MCDP_CD
order by 5월예약건수, 진료과코드