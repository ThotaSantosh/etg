function getArray12<T>(items : T[]): T[]{
    return new Array<T>().concat(items);
}

var myNumArr12=getArray12<number>([100,200,300]);
var myStrArr12=getArray12<string>(["Hello","World"]);

myNumArr12.push(400);
myStrArr12.push("HelloTypeScript");

myNumArr12.push("hi"); //compile error
myStrArr12.push(400);   //compile error

console.log(myNumArr12);
console.log(myStrArr12);