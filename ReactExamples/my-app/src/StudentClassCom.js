import React,{Component} from "react";

class StudentClassComp extends Component{
    render(){
        return (
            <div>
               <h1> {this.props.id}
                {this.props.name}
                {this.props.age}</h1>
            </div>
        );
    }
}
export default StudentClassComp;