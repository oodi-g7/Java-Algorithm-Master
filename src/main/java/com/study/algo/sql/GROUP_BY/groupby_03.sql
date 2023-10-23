-- 저자 별 카테고리 별 매출액 집계하기

-- 2022년 1월의 도서 판매 데이터를 기준으로 저자 별, 카테고리 별 매출액(TOTAL_SALES = 판매량 * 판매가) 을 구하여, 
-- 저자 ID(AUTHOR_ID), 저자명(AUTHOR_NAME), 카테고리(CATEGORY), 매출액(SALES) 리스트를 출력하는 SQL문을 작성해주세요.
-- 결과는 저자 ID를 오름차순으로, 저자 ID가 같다면 카테고리를 내림차순 정렬해주세요.
SELECT 
    A.AUTHOR_ID,
    A.AUTHOR_NAME,
    B.CATEGORY,
    SUM(C.SALES*B.PRICE) AS TOTAL_SALES
FROM
    AUTHOR A
    JOIN BOOK B
        ON A.AUTHOR_ID = B.AUTHOR_ID
    JOIN BOOK_SALES C
        ON B.BOOK_ID = C.BOOK_ID
WHERE 
    TO_CHAR(C.SALES_DATE, 'YYYY-MM') = '2022-01'
GROUP BY 
    A.AUTHOR_ID, 
    A.AUTHOR_NAME, 
    B.CATEGORY
ORDER BY 
    A.AUTHOR_ID ASC, 
    B.CATEGORY DESC;

