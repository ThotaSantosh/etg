package com.sonata.JavaBean;

public class Pobject {
private int pid;
private String pname;
private double pprice;
Product obj;
public Product getObj() {
	return obj;
}
public void setObj(Product obj) {
	this.obj = obj;
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public double getPprice() {
	return pprice;
}
public void setPprice(double pprice) {
	this.pprice = pprice;
}
@Override
public String toString() {
	return "Pobject [pid=" + pid + ", pname=" + pname + ", pprice=" + pprice + ", obj=" + obj + "]";
}



}
