package com.sonata.model;

public class Notification {
private int notificationId;
private int taskId;
private int taskOwnerId;
private String status;
private String createdOn;
private String statusChangedOn;
public int getNotificationId() {
	return notificationId;
}
public void setNotificationId(int notificationId) {
	this.notificationId = notificationId;
}
public int getTaskId() {
	return taskId;
}
public void setTaskId(int taskId) {
	this.taskId = taskId;
}
public int getTaskOwnerId() {
	return taskOwnerId;
}
public void setTaskOwnerId(int taskOwnerId) {
	this.taskOwnerId = taskOwnerId;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
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
	return "Notification [notificationId=" + notificationId + ", taskId=" + taskId + ", taskOwnerId=" + taskOwnerId
			+ ", status=" + status + ", createdOn=" + createdOn + ", statusChangedOn=" + statusChangedOn + "]";
}

}
