import axios from "axios";
import React, { Component } from "react";

class DeleteTask extends Component {
    constructor(props){
        super(props)
        this.state = {
            task_ID:'',
        }
        this.changeHandler=this.changeHandler.bind(this);
        this.submitHandler=this.submitHandler.bind(this);
    }
    changeHandler = (event) => {
        this.setState({[event.target.name]:event.target.value})
    }
    submitHandler = (event) => {
        event.preventDefault()
        console.log(this.state)
        axios.get("http://localhost:8080/Task/"+this.state.task_ID,this.state)
        .then(response => {
            console.log(response)
        })
        .catch(error => {
            console.log(error)
        })
    }
    render(){
        const {task_ID} = this.state
        return (
            <div style={{"backgroundColor":"yellow","color":"black","textAlign":"center"}}>
                <h2>DeleteTask</h2>
            <form  onSubmit={this.submitHandler}>
                <div>
                    task_ID:
                    <input type="number" name="task_ID" value={task_ID} onChange={this.changeHandler} placeholder="task_ID" required/>
                </div>
                 <button type="submit">Submit</button>

            </form>
        </div>
            
        )
    }
}

export default DeleteTask;