import React from "react";

class RegisterForm extends React.Component{
    constructor(props){
        console.log("component updated")
        super(props)
        this.state={userName:'',comments:'',topics:'react'}

    }
    handleUserName=(event)=>{
        this.setState({userName:event.target.value})
    }
    handleComment=(event)=>{
        this.setState({comments:event.target.value})
    }
    handleTopic=(event)=>{
        this.setState({topics:event.target.value})
    }
    handleSubmit=(event)=>{
        console.log(`${this.state.userName}`)
        console.log(`${this.state.comments}`)
        event.preventDefault()
    }
    componentDidMount(){
        console.log("component mounted")
    }
    render(){
        return(
            <form onSubmit={this.handleSubmit}>
                <div>
                    userName:<input type="text" value={this.state.userName} onChange={this.handleUserName}></input>
                </div>
                <div>
                    Comments:<textarea value={this.state.comments} onChange={this.handleComment}/>

                </div>
                <div>
                    Topics:
                    <select value={this.state.topics} onChange={this.handleTopic}>
                       <option value="React">React</option>
                       <option value="Angular">Angular</option> 
                       <option value="Spring">Spring</option>
                    </select>
                </div>
                <div>
                    <button type="submit">Submit</button>
                </div>
            </form>
        )
    }
}
export default RegisterForm;