import React,{Component} from "react";
import ClassComponent from "./ClassComponent";
import PropsExample from "./PropsExample";

class ClassComponentExample extends Component{
    render(){
        return(
            <div>
                <h1>My Class component</h1>
                <PropsExample name="santosh" age={23}>
                    <p>This is child tag</p>
                </PropsExample>
                <PropsExample name="Lalith" />
                <ClassComponent name="tulasi" age={23}></ClassComponent>
            </div>
        )
    }
}

export default ClassComponentExample;