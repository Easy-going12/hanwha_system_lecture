/* 프로퍼티 값 단축(변수로 리터럴 객체 쉽게 만들기) */

var id = 'p-001';
var price = 30000;

var product = {
    id: id,
    price: price
};
console.log('product:',product);

var product2 = {id, price};
console.log('product2',product2);