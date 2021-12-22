import React,{Component} from "react";
import axios from "axios";

class GetApiData extends Component{
    constructor(){
        super()
        this.state={
            taskID:''
        }
        this.handleClick=this.handleClick.bind(this)
    }
    handleClick(){
        axios.get('http://localhost:8080/gettasks/')
        .then(response=> this.setState({taskID:response.data.taskID}))
    }
    render(){
        return(
            <div>
                <button className="button" onClick={this.handleClick}>Click Me</button>
           <p>{this.state.taskID}</p>
            </div>
        )
    }
}
export default GetApiData;