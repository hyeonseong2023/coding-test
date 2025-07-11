SELECT TO_CHAR(ONS.SALES_DATE, 'YYYY-MM-DD') AS SALES_DATE, ONS.PRODUCT_ID, ONS.USER_ID, ONS.SALES_AMOUNT
FROM ONLINE_SALE ONS
WHERE TO_CHAR(ONS.SALES_DATE, 'YYYYMM') = '202203'
UNION ALL
SELECT TO_CHAR(OFS.SALES_DATE, 'YYYY-MM-DD') AS SALES_DATE, OFS.PRODUCT_ID, NULL AS USER_ID, OFS.SALES_AMOUNT
FROM OFFLINE_SALE OFS
WHERE TO_CHAR(OFS.SALES_DATE, 'YYYYMM') = '202203'
ORDER BY SALES_DATE, PRODUCT_ID, USER_ID