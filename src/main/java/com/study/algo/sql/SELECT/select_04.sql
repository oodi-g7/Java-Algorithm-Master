-- 조건에 맞는 도서 리스트 출력하기

-- BOOK 테이블에서 2021년에 출판된 '인문' 카테고리에 속하는 도서 리스트를 찾아서 
-- 도서 ID(BOOK_ID), 출판일 (PUBLISHED_DATE)을 출력하는 SQL문을 작성해주세요.
-- 결과는 출판일을 기준으로 오름차순 정렬해주세요.
SELECT 
    BOOK_ID, 
    TO_CHAR(PUBLISHED_DATE, 'YYYY-MM-DD') AS PUBLISHED_DATE
FROM 
    BOOK
WHERE 
    TO_CHAR(PUBLISHED_DATE, 'YYYY') = '2021'
AND 
    CATEGORY = '인문'
ORDER BY 
    PUBLISHED_DATE;