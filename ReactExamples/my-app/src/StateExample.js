import React ,{Component} from "react";

class StateExample extends Component{
    constructor(){
        super()
        this.state={message:'Welcome Visitor'}
        this.changeMessage=this.changeMessage.bind(this);

    }
    changeMessage(){
        this.setState({message:'Thank you for Visiting'})
    }
    render(){
        return(
            <div>
                <h1>{this.state.message}</h1>
                <h2>Weclome to Sonata</h2>
                <button onClick={this.changeMessage}>Change</button>
            </div>
        )
    }
}
export default StateExample;