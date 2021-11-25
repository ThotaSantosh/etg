package com.sonata.JavaBean;

public class Student {
private int stdid;
private String sname;
private double smarks;
Address obj;
public int getStdid() {
	return stdid;
}
public void setStdid(int stdid) {
	this.stdid = stdid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public double getSmarks() {
	return smarks;
}
public void setSmarks(double smarks) {
	this.smarks = smarks;
}
public Address getObj() {
	return obj;
}
public void setObj(Address obj) {
	this.obj = obj;
}
@Override
public String toString() {
	return "Student [stdid=" + stdid + ", sname=" + sname + ", smarks=" + smarks + ", obj=" + obj + "]";
}

}
