-- 5월 식품들의 총매출 조회하기

-- FOOD_PRODUCT와 FOOD_ORDER 테이블에서 생산일자가 2022년 5월인 식품들의 
-- 식품 ID, 식품 이름, 총매출을 조회하는 SQL문을 작성해주세요. 
-- 이때 결과는 총매출을 기준으로 내림차순 정렬해주시고 총매출이 같다면 식품 ID를 기준으로 오름차순 정렬해주세요.
SELECT 
    A.PRODUCT_ID,
    A.PRODUCT_NAME,
    SUM(A.PRICE*B.AMOUNT) AS TOTAL_SALES
FROM
    FOOD_PRODUCT A
    JOIN FOOD_ORDER B
        ON A.PRODUCT_ID = B.PRODUCT_ID
WHERE 
    TO_CHAR(B.PRODUCE_DATE, 'YYYY-MM') = '2022-05'
GROUP BY
    A.PRODUCT_ID, A.PRODUCT_NAME
ORDER BY
    TOTAL_SALES DESC, A.PRODUCT_ID ASC;