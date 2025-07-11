package com.vru;

public class Person {
	private String name;
	Mydate dateofBirth;
	
	public Person(String na,Mydate birth) {
		name=na;
		dateofBirth=birth;
		
	}
	//setter
	public void setname (String nam) {
		name=nam;
		
	}
	public void  setdateofBirth(Mydate bd) {
		dateofBirth=bd;
		
	}
	//getter
	public String getname() {
		return name;
	}
	public Mydate getdateofBirth() {
		return dateofBirth;
	}
	//toString
	public String toString(){
		return name + dateofBirth; 
}
}