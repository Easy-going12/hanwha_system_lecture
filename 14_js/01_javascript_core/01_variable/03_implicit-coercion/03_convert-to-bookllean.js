/*
    자바스크립트 엔진은 boolean 타입이 아닌데도 true로 판단될 값을 Truty뜻 또한
    false를 판단될 값을 Falsy값으로 console.error('구분한다',구분한다)
    Truthhy - true, Faily -> false로 암묵적 타입 변환를 한다.
 */

if(true) console.log('if(true)');
if(false) console.log('if(false)');
if(undefined) console.log('if(undefined)');
if(null) console.log('if(null)');
if(0) console.log('if(0)');
if(NaN) console.log('if(NaN)');
if('') console.log("if('')");
if('JavaScript') console.log('if(JavaScript)');  