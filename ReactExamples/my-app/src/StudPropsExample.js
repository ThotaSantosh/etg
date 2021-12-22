import React from "react";
const StudPropsExample=(props)=>{
    return(
        <div>
            <h1>My Student Props example{props.id} {props.name} {props.age}</h1>
            <h2>{props.children}</h2>
        </div>
    )
}

export default StudPropsExample;