-- 특정 기간동안 대여 가능한 자동차들의 대여비용 구하기

-- CAR_RENTAL_COMPANY_CAR 테이블과 CAR_RENTAL_COMPANY_RENTAL_HISTORY 테이블과 CAR_RENTAL_COMPANY_DISCOUNT_PLAN 테이블에서 
-- 자동차 종류가 '세단' 또는 'SUV' 인 자동차 중 2022년 11월 1일부터 2022년 11월 30일까지 대여 가능하고 
-- 30일간의 대여 금액이 50만원 이상 200만원 미만인 자동차에 대해서 
-- 자동차 ID, 자동차 종류, 대여 금액(컬럼명: FEE) 리스트를 출력하는 SQL문을 작성해주세요. 
-- 결과는 대여 금액을 기준으로 내림차순 정렬하고, 대여 금액이 같은 경우 자동차 종류를 기준으로 오름차순 정렬, 
-- 자동차 종류까지 같은 경우 자동차 ID를 기준으로 내림차순 정렬해주세요.
SELECT 
    A.CAR_ID,
    A.CAR_TYPE,
    A.DAILY_FEE AS FEE
FROM
    CAR_RENTAL_COMPANY_CAR A
        JOIN
    CAR_RENTAL_COMPANY_RENTAL_HISTORY B
        ON A.CAR_ID = B.CAR_ID
WHERE
    A.CAR_TYPE IN ('세단', 'SUV')
AND
    TO_DATE(B.START_DATE, 'YYYY-MM-DD') < '2022-11-01'
AND
    TO_DATE(B.END_DATE, 'YYYY-MM-DD') > '2022-11-30'
