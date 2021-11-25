package com.example.demo;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.impl.TaskDaoImpl;

@RestController
public class RESTController {
	
	@Autowired
	TaskDao task;
	
	@Autowired
	Task tk;
	
	@Autowired
	TaskDaoImpl dao;

	@RequestMapping(value = "/task", method = RequestMethod.GET,produces = {"application/json","application/xml"})
	public List<Task> getTask() {
		return task.getAllTasks();
	}
	@RequestMapping(value="/priority")
	public int setPriority(@PathVariable("taskid") int taskid, @PathVariable("priority") String priority, Model model) {
		model.addAttribute("taskid", taskid);
		model.addAttribute("priority", priority);
		tk.setTaskID(taskid);
		tk.setPriority(priority);
			return task.setpriority(tk);
	}
	
	/*@PostMapping(value= "/tasks", consumes = "application/json", produces = "application/json")
	public Task addTask(@RequestBody Task task) throws Exception
	{
	//Generate resource id
	Integer id = ((Object) task.getAllTasks()).getTaskList().size() + 1;
	task.setTaskID(id);

	//add resource
	task.addTask(task);
	return task.getAllTasks();

	}*/

}
