package com.vru;
import java.util.Scanner;
import java.util.ArrayList;
public class Employee_Management 
{

	public static void main(String[] args, Mydate date) {
		Scanner sc=new Scanner(System.in) ;
		ArrayList<Employee> employees = new ArrayList<>();
		
		boolean abc=false;
		while(!abc) {
			System.out.println("1.ADD Employee \n 2.Display all Employee\n 3.Search Employee by id\n 4.Display Employee joined in given Year\n 5.Find Empolyee with Maximum Salary\n 6.Find Empolyee with Minimum Salary\n 7.EXIT");
			int c= sc.nextInt() ;
			switch(c) {
			case 1:
				  System.out.print("Enter Employee ID: ");
	                int id = sc.nextInt();
	                sc.nextLine(); // consume newline

	                System.out.print("Enter Employee Name: ");
	                String name = sc.nextLine();
	                System.out.print("Date: ");
                    int dd = sc.nextInt();
                    System.out.print("Month: ");
                    int mm = sc.nextInt();
                    System.out.print("Year: ");
                    int yyyy = sc.nextInt();
	                System.out.print("Enter Joining Year: ");
	                Mydate year = new Mydate(dd,mm,yyyy);

	                System.out.print("Enter Salary: ");
	                double salary = sc.nextDouble();

	                Employee emp = new Employee(id,name,salary,year);
	                employees.add(emp);
	                System.out.println("Employee added successfully!");
	                break;
	           
		

			}
		}

	
	}
}
