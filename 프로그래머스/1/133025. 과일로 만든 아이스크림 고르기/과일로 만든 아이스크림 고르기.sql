SELECT h.flavor as flavor
from FIRST_HALF as h join ICECREAM_INFO as i on h.flavor=i.flavor
where i.INGREDIENT_TYPE = 'fruit_based'and h.TOTAL_ORDER>= 3000
order by h.TOTAL_ORDER desc