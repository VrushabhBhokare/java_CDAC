package com.vru;

public class Mydate {
	int date;
	int month;
	int year;
	
	
	public Mydate(int a,int b,int c) {
		date=a;
		month=b;
		year=c;
	}
	//setter
	public void setdate(int dt) {
		date=dt;
	}
	public void setmonth(int mn) {
		month=mn;
	}public void setyear(int yr) {
		year=yr;
	}
	//getter
	
	public int getdate() {
		return date;
	}
	public int month() {
		return month;
	}public int year() {
		return year;
	}
	//toString
	public String toString() {
		return date+"/"+ month+"/" + year;
	}
}
