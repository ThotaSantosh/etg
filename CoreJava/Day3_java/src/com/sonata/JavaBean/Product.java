package com.sonata.JavaBean;

public class Product {
private String pplace;
private String pstate;
private String pManufac;
public String getPplace() {
	return pplace;
}
public void setPplace(String pplace) {
	this.pplace = pplace;
}
public String getPstate() {
	return pstate;
}
public void setPstate(String pstate) {
	this.pstate = pstate;
}
public String getpManufac() {
	return pManufac;
}
public void setpManufac(String pManufac) {
	this.pManufac = toString();
}
@Override
public String toString() {
	return "Product [pplace=" + pplace + ", pstate=" + pstate + ", pManufac=" + pManufac + "]";
}

}
