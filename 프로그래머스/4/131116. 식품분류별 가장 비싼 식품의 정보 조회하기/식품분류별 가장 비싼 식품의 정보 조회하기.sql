SELECT A.CATEGORY, A.MAX_PRICE, FP.PRODUCT_NAME
FROM FOOD_PRODUCT FP
JOIN (
    SELECT CATEGORY, MAX(PRICE) AS MAX_PRICE
    FROM FOOD_PRODUCT
    GROUP BY CATEGORY
    ) A
ON FP.CATEGORY = A.CATEGORY AND FP.PRICE = A.MAX_PRICE
WHERE A.CATEGORY IN ('과자', '국', '김치', '식용유')
ORDER BY A.MAX_PRICE DESC