package com.sonata.model;

public class task {
	private int taskId;
	private int ownerId;
	private int creatorId;
	private String name;
	private String description;
	private String status;
	private String priority;
	private String notes;
	private boolean isBookMarked;
	private String createdOn;
	private String statusChangedOn;
	public int getTaskId() {
		return taskId;
	}
	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}
	public int getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}
	public int getCreatorId() {
		return creatorId;
	}
	public void setCreatorId(int creatorId) {
		this.creatorId = creatorId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public boolean isBookMarked() {
		return isBookMarked;
	}
	public void setBookMarked(boolean isBookMarked) {
		this.isBookMarked = isBookMarked;
	}
	public String getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}
	public String getStatusChangedOn() {
		return statusChangedOn;
	}
	public void setStatusChangedOn(String statusChangedOn) {
		this.statusChangedOn = statusChangedOn;
	}
	@Override
	public String toString() {
		return "task [taskId=" + taskId + ", ownerId=" + ownerId + ", creatorId=" + creatorId + ", name=" + name
				+ ", description=" + description + ", status=" + status + ", priority=" + priority + ", notes=" + notes
				+ ", isBookMarked=" + isBookMarked + ", createdOn=" + createdOn + ", statusChangedOn=" + statusChangedOn
				+ "]";
	}
	

}
