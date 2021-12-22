import React,{Component} from "react";
import StudentClassComp from "./StudentClassCom";
import StudPropsExample from "./StudPropsExample";

class StudentClassComponent extends Component{
    render(){
        return(
            <div>
                <h1>My Student Class component</h1>
                <StudPropsExample id={101} name="santosh" age={23}>
                    <p>This is child student tag</p>
                </StudPropsExample>
               
                <StudentClassComp id={102} name="Lalith" age={23}></StudentClassComp>
                
            </div>
        )
    }
}

export default StudentClassComponent;