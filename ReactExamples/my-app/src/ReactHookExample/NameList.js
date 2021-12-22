import React from "react";

function NameList(){
    const names=['santosh','lalith','durga']
    const nameList=names.map(name=><h1>{name}</h1>)
    const Product=[{id:1,name:'mobile',rate:12345},
                    {id:2,name:'tv',rate:43256},
                    {id:3,name:'ac' ,rate:435634}]

    const productList=Product.map(product =><h1>{product.id}{product.name}</h1>)
    return(
        <div>
            {nameList}
            {productList}
        </div>
    )
}
export default NameList;