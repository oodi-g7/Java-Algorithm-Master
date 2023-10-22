-- 자동차 대여 기록에서 장기/단기 대여 구분하기

-- CAR_RENTAL_COMPANY_RENTAL_HISTORY 테이블에서 대여 시작일이 2022년 9월에 속하는 대여 기록에 대해서 
-- 대여 기간이 30일 이상이면 '장기 대여' 그렇지 않으면 '단기 대여' 로 표시하는 컬럼(컬럼명: RENT_TYPE)을 추가하여 
-- 대여기록을 출력하는 SQL문을 작성해주세요. 
-- 결과는 대여 기록 ID를 기준으로 내림차순 정렬해주세요.
SELECT
    HISTORY_ID,
    CAR_ID,
    TO_CHAR(START_DATE, 'YYYY-MM-DD') AS START_DATE,
    TO_CHAR(END_DATE, 'YYYY-MM-DD') AS END_DATE,
    CASE 
        WHEN (END_DATE - START_DATE + 1) >= 30
            THEN '장기 대여'
            ELSE '단기 대여'
        END 
    AS REND_TYPE
FROM
    CAR_RENTAL_COMPANY_RENTAL_HISTORY
WHERE TO_CHAR(START_DATE, 'YYYY-MM') = '2022-09'
ORDER BY HISTORY_ID DESC;


-- CASE WHEN ~~ THEN ~~ ELSE ~~ END 잊지말기!!!!!
-- ORACLE에선 날짜 관련 컬럼 나오면 무조건 TO_CHAR이용해서 예시와 동일한 형식으로 바꿔주기 !
-- END_DATE - START_DATE + 1 의 경우,
    -- END_DATE : 2023-10-23
    -- START_DATE : 2023-10-22 일때,
    -- 'END_DATE - START_DATE' 는 1일로 나오지만, 사실상 대여기간은 22일, 23일 이틀임
    -- 그러므로 END_DATE - START_DATE + 1 로 계산해야 함!!