function outer() {
    var outerVal = '외부함수';
    
    function inner() {              // 외부에서는 간섭 불가능하고 내부에서는 간섭 가능
        var innerVal = '내부함수';
        console.log(outerVal, innerVal);
    }

    inner();
}

// inner();     //내부함수는 함수 외부에서 접근 불가
outer();