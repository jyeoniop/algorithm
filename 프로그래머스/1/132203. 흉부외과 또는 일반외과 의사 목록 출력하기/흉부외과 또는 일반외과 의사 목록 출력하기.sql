SELECT dr_name, dr_id, MCDP_CD, date_format(hire_ymd, '%Y-%m-%d')as HIRE_YMD
from doctor 
where MCDP_CD='CS' or MCDP_CD='GS'
order by HIRE_YMD desc, dr_name asc