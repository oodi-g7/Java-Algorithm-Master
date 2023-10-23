-- 성분으로 구분한 아이스크림 총 주문량

-- 상반기 동안 각 아이스크림 성분 타입과 성분 타입에 대한 아이스크림의 총주문량을 
-- 총주문량이 작은 순서대로 조회하는 SQL 문을 작성해주세요. 
-- 이때 총주문량을 나타내는 컬럼명은 TOTAL_ORDER로 지정해주세요.
SELECT
    B.INGREDIENT_TYPE,
    SUM(A.TOTAL_ORDER) AS TOTAL_ORDER
FROM
    FIRST_HALF A
        JOIN
    ICECREAM_INFO B
        ON A.FLAVOR = B.FLAVOR
GROUP BY 
    B.INGREDIENT_TYPE
ORDER BY 
    TOTAL_ORDER;
    
-- ORDER BY 절에 'A.TOTAL_ORDER'가 아니라
-- 'SUM(A.TOTAL_ORDER)'의 별칭인 TOTAL_ORDER를 써줘야함 !
-- ORDER BY A.TOTAL_ORDER는 집계함수 SUM으로 합치기 전이므로, 갯수가 맞지 않아 오류발생