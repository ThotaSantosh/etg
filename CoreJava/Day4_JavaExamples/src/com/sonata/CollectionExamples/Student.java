package com.sonata.CollectionExamples;
import java.util.*;
public class Student implements Comparable<Student> {
int stdId;
String stdName;
int stdAge;

public Student(int stdId,String stdName, int stdAge) {
	this.stdId=stdId;
	this.stdName=stdName;
	this.stdAge=stdAge;
}
public int comapreTo(Student st) {
if(stdAge==st.stdAge)
	return 0;
else if(stdAge>st.stdAge)
	return 1;
else
	return -1;
}
public int compare(Student s1,Student s2) {
	if(s1.stdId==s2.stdId)
		return 0;
	else return s1.stdId>s2.stdId?1:-1;
	
	
}
@Override
public int compareTo(Student o) {
	// TODO Auto-generated method stub
	return 0;
}

}