package com.vru;

public class Employee {
	private int id;
	private String department;
	private double salary;
	private Mydate dateofJoining;
	public Employee(int id,String department,double salary,Mydate dateofJoining) {
		this.id=id;
		this.department=department;
		this.salary=salary;
		this.dateofJoining=dateofJoining;
	}
	//setter
	public void setid(int id) {
		this.id=id;
	}
	public void setdepartment( String department) {
		this. department= department;
	}
	public void setsalary(double salary) {
		this.salary=salary;
	}
	public void setdateofJoining( Mydate dateofJoining) {
		this .dateofJoining= dateofJoining;
	}
	//getter
	public int getid() {
		return id;
	}
	public  String getdepartment() {
		return  department;
	}
	public double getsalary() {
		return  salary;
	}
	public Mydate dateofJoining() {
		return dateofJoining;
	}
	//toString
	public String toString() {
		return  id+ department+salary+ dateofJoining;
	}

}
