let exampleProduct = {
    items: ['Coffee', 'Donut'],
    producer: '신사임당'
};

function displayProduct(obj){
    console.log(obj.producer);
    console.log(obj.items);
    console.log(obj.brand);     //넘어온 객체에 brand가 없으면 추가되고 undfined가 됨
}

displayProduct(exampleProduct);

function displayProduct2({producer,items, brand = '엔코아'}){
    console.log(producer);
    console.log(items);
    console.log(brand);
}

displayProduct2(exampleProduct);