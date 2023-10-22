-- 조건에 맞는 사용자와 총 거래금액 조회하기

-- USED_GOODS_BOARD와 USED_GOODS_USER 테이블에서 완료된 중고 거래의 총금액이 70만 원 이상인 사람의 
-- 회원 ID, 닉네임, 총거래금액을 조회하는 SQL문을 작성해주세요. 
-- 결과는 총거래금액을 기준으로 오름차순 정렬해주세요.
SELECT 
    A.WRITER_ID AS USER_ID, 
    B.NICKNAME AS NICKNAME, 
    SUM(A.PRICE) AS TOTAL_SALES
FROM 
    USED_GOODS_BOARD A
        JOIN 
    USED_GOODS_USER B 
        ON A.WRITER_ID = B.USER_ID
WHERE 
    A.STATUS = 'DONE'
GROUP BY 
    A.WRITER_ID, B.NICKNAME
HAVING 
    SUM(A.PRICE) >= 700000
ORDER BY 
    SUM(A.PRICE)



-- SELECT절에 집계함수를 제외한 컬럼은 GROUP BY절에 꼭 있어야 함
-- GROUP BY는 반드시 집계함수, 그룹함수와 함께 사용해야 함
-- GROUP BY로는 GROUP BY의 기준이 된 컬럼 외에는 다른 일반 컬럼을 조회하기 어려움
select 컬럼이름Z, 컬럼이름Y, 집계함수A(컬럼이름1), 집계함수B(컬럼이름2), ...
from 테이블이름
where 조건절
group by 컬럼이름Z, 컬럼이름Y, ...
having 그룹조건절
order by 컬럼이름Z, ... ;
-- 집계함수A, 집계함수B를 제외한 컬럼Z와 컬럼Y는 모두 GROUP BY 절에 포함되어 있음