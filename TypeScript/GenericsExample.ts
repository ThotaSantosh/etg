function getArray(items :any[]):any[]{
    return new Array().concat(items);
}

var myNumArr=getArray([100,200,300]);
var myStrArr=getArray(["Hello","World"]);

myNumArr.push(400);
myStrArr.push("hello typeScript");

myNumArr.push("hi");
myStrArr.push(500);

console.log(myNumArr);
console.log(myStrArr);
