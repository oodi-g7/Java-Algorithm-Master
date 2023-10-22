-- 즐겨찾기가 가장 많은 식당 정보 출력하기

-- REST_INFO 테이블에서 음식종류별로 즐겨찾기수가 가장 많은 식당의 
-- 음식 종류, ID, 식당 이름, 즐겨찾기수를 조회하는 SQL문을 작성해주세요. 
-- 이때 결과는 음식 종류를 기준으로 내림차순 정렬해주세요.
SELECT 
    FOOD_TYPE, REST_ID, REST_NAME, FAVORITES
FROM
    REST_INFO
WHERE
    (FOOD_TYPE, FAVORITES) 
    IN
        (SELECT FOOD_TYPE, MAX(FAVORITES) AS FAVORITES
        FROM REST_INFO
        GROUP BY FOOD_TYPE)
ORDER BY FOOD_TYPE DESC;



-- 서브쿼리 결과는 다음과 같다
FOOD_TYPE | FAVORITES
한식      | 235
양식      | 170
-- 해당 서브쿼리의 결과를 이용해야할때
-- 11번라인의 "(FOOD_TYPE, FAVORITES) IN" 이러한 표현도 있다는 거 알아두기!!!!