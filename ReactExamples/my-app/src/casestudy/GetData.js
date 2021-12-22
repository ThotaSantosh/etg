import React,{Component} from 'react';
import axios from 'axios';



class GetData extends Component{
constructor(){
super()
this.state={
tasks:[]
}
this.handleClick = this.handleClick.bind(this)
}
handleClick(){
axios.get('http://localhost:8080/task')
.then(response => this.setState({tasks:response.data}))
}
render(){
return(
<div style={{"backgroundColor":"green","color":"black","textAlign":"center"}}>
<button className='button' onClick={this.handleClick}>Get Data</button>
<h2>Get Task Data</h2>
{this.state.tasks.map(task =>(<h3><center>
Task_ID: { task.task_ID} <br/>
Owner_ID: { task.owner_ID} <br/>
Creator_ID: { task.creator_ID} <br/>
Name: { task.name} <br/>
Description: { task.description} <br/>
Status: { task.status} <br/>
Priority: { task.priority} <br/>
Notes: { task.notes} <br/>
IsBookmarked: { task.isBookmarked} <br/>
Created_On: { task.created_On} <br/>
Status_Changed_On: { task.status_Changed_On} <br/> <br/>
</center>
</h3>))}
</div>
)
}
}
export default GetData;