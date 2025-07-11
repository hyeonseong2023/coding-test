WITH HOURS AS (
  SELECT LEVEL - 1 AS HOUR
  FROM DUAL
  CONNECT BY LEVEL <= 24
)
SELECT H.HOUR, NVL(COUNT(AO.DATETIME), 0) AS COUNT
FROM HOURS H
LEFT JOIN ANIMAL_OUTS AO
ON EXTRACT(HOUR FROM CAST(AO.DATETIME AS TIMESTAMP)) = H.HOUR
GROUP BY H.HOUR
ORDER BY H.HOUR