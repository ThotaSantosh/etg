var proArray=[
    {price:"100",product:"mobile"},
    {price:"200",product:"laptop"},
    {price:"300",product:"Mic"},
    {price:"400",product:"pc"}
];
//mapExample

var newPro=proArray.map(function(value){
return value.price;
})

console.log(newPro);
//with arrow function.
var newPro1=proArray.map(value => value.price);
console.log(newPro1);

//filter Example

var filterEx=proArray.filter(function(value){
    if(value.price<300){
        return true;
    }

})
console.log(filterEx);

//with arrow function

const arrowValue=proArray.filter(value =>value.price>300);
console.log(arrowValue);
//sort example
const sortProduct=proArray.sort((a,b)=>(a.product>b.product ? 1:-1  ));
console.log(sortProduct);


