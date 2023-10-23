-- 주문량이 많은 아이스크림들 조회하기

-- 7월 아이스크림 총 주문량과 상반기의 아이스크림 총 주문량을 더한 값이 큰 순서대로 
-- 상위 3개의 맛을 조회하는 SQL 문을 작성해주세요.
SELECT *
FROM (
        SELECT 
            A.FLAVOR
        FROM 
                FIRST_HALF A
            JOIN 
                (SELECT FLAVOR, SUM(TOTAL_ORDER) AS TOTAL_ORDER
                FROM JULY
                GROUP BY FLAVOR) B
            ON A.FLAVOR = B.FLAVOR
        ORDER BY 
            (A.TOTAL_ORDER + B.TOTAL_ORDER) DESC
    )
WHERE ROWNUM <= 3;

-- 1) 우선 JULY테이블에는 한가지 맛에 대해 여러 공장이 가동될 수 있으므로, 서브쿼리를 이용하여 아이스크림 맛에 대한 주문횟수를 미리 뽑아둔다.
-- 2) 1의 결과와 FIRST_HALF 테이블을 조인하여 아이스크림 맛 별로 주문횟수를 합산한 뒤 이를 정렬해준다.
-- 3) MYSQL과는 다르게 ORACLE은 LIMIT 사용 불가능 => ROWNUM 이용하기
    -- * MYSQL의 LIMIT은 ORDER BY절까지 쿼리가 모두 실행된 이후 결과값중에서 행을 가져오는거고
    -- * ORACLE의 ROWNUM은 쿼리 중간에 실행되어 결과가 달라질 수 있으므로 모든 결과를 뽑아내는 쿼리를 실행 후
    --   이를 감싸서 ROWNUM을 적용해주기!!
