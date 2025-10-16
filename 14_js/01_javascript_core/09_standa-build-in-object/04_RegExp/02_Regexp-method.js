/*
   flag option의 종류
   1. i(case insensitive): 대소문자 구분 X
   2. g(global): 대상 문자열 텍스트 내에서 패턴과 일치하는 모든 문자열을 전역에서 검색
   3. m(multiline): ^, $가 패턴에 있는 경우 매 개행마다 각 줄의 시작과 종료를 기준으로 
                    검색되게 하는 옵션
                    (이 옵션이 없으면 ^와 $는 전체 문자열의 시작과 끝만 매칭)
*/


const target = "Java JavaScript";
const regex = /va/g;

/* 1. exec: 정규표현식에서 제공하는 메소드로 인수로 문자열을 주면 패턴을 찾아 반환(한번에 하나씩) */
console.log(regex.exec(target));
console.log(regex.exec(target));
console.log(regex.exec("hello"));   // 패턴과 일치하지 않으면 null 반환

/* 2. test: 정규표현식에서 제공하는 메소드로 매칭 결과를 boolean으로 반환 */
console.log(/va/.test(target));

/* 3. match */