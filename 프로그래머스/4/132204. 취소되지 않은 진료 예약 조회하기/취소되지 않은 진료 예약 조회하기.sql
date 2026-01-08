-- 코드를 입력하세요
SELECT a.APNT_NO, p.PT_NAME, a.PT_NO, a.MCDP_CD, d.DR_NAME, a.APNT_YMD
from APPOINTMENT as a join DOCTOR as d on a.MDDR_ID=d.DR_ID 
join PATIENT as p on a.PT_NO=p.PT_NO
where date_format(a.apnt_ymd, '%Y-%m-%d')='2022-04-13' and a.MCDP_CD='CS' and a.APNT_CNCL_YN='N'
order by a.APNT_YMD asc