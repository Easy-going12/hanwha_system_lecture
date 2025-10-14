var test;
console.log(typeof test);

test = 1;
console.log(typeof test);

test = "JavaScript";
console.log(typeof test);

test = true;
console.log(typeof test);

test = Symbol();
console.log(typeof test);

test = {};                  // Json Object
console.log(typeof test);

test = [];                  // Json-Array
console.log(typeof test);

test = function(){};        // 함수가 리터널이 될 수 있다(함수 지향 프로그래밍 언어의 특징)
console.log(typeof test);