-- 조건에 맞는 도서와 저자 리스트 출력하기

-- '경제' 카테고리에 속하는 도서들의 도서 ID(BOOK_ID), 저자명(AUTHOR_NAME), 출판일(PUBLISHED_DATE) 리스트를 출력하는 SQL문을 작성해주세요.
-- 결과는 출판일을 기준으로 오름차순 정렬해주세요.
SELECT 
    A.BOOK_ID, 
    B.AUTHOR_NAME, 
    TO_CHAR(A.PUBLISHED_DATE, 'YYYY-MM-DD') AS PUBLISHED_DATE
FROM
    BOOK A
        JOIN
    AUTHOR B
        ON A.AUTHOR_ID = B.AUTHOR_ID
WHERE 
    A.CATEGORY = '경제'
ORDER BY
    A. PUBLISHED_DATE;



-- ORACLE의 DATE형식 포맷
-- 1) 파라미터가 CHAR형일때는 DATE로 변환 후, CHAR로 다시 변환
SELECT 
    TO_CHAR(TO_DATE('2017-10-10 12:12:12', 'YYYY-MM-DD HH24:MI:SS'), 'YYYY-MM-DD HH24:MI:SS') 
FROM 
    DUAL;

-- 2) 파라미터가 DATE형일때는 바로 CHAR로 변환
SELECT 
    TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS') 
FROM 
    DUAL;