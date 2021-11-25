package com.example.demo;

import java.util.List;

public interface TaskDao {
	public int save(Object object);
	public List<Task> getAllTasks();
	public int setpriority(Object object);
	public String addAll(Object obj);
}
