SELECT UGU.USER_ID, UGU.NICKNAME, UGU.CITY || ' ' || UGU.STREET_ADDRESS1 || ' ' || UGU.STREET_ADDRESS2 AS 전체주소, SUBSTR(TLNO, 1, 3) || '-' || SUBSTR(TLNO, 4, 4) || '-' || SUBSTR(TLNO, 8, 4) AS 전화번호
  FROM (
      SELECT WRITER_ID
        FROM USED_GOODS_BOARD
       GROUP BY WRITER_ID
       HAVING COUNT(*) >= 3
  ) A
  JOIN USED_GOODS_USER UGU
    ON A.WRITER_ID = UGU.USER_ID
 ORDER BY UGU.USER_ID DESC