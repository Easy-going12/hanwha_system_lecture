/*
    ES11(2020)에 도입된 연산자로 연산자의 촤향이 null 또는 undefined인 경우
    error 대신 underfined를 반환하고 그렇지 않으면 우향의 프로퍼티 참조를 이어간다
    (.(dot notation)은 객체의 프로퍼티에 접근하는 접근 연산자)
*/

var obj = null;    
// obj = {
//     'value': 'abc'
// };

var val = obj?.value;       // NPE 방지 코드
console.log(val);

/* 좌향이 null이나 underfined가 아니라면 ?. 쓸 필요 없이 .으로만 사용해도 된다. */
var str = '';
console.log(Object.getOwnPropertyDescriptor(str))
var len = str?.length;      
console.log(len);