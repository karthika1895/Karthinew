package org.emp;

public class Employee {
	public void empId(int id) {
		System.out.println("the employee id is" +id);
	}
	
	public void empId(String name) {
   System.out.println("The employee name is" +name);
	}
	public void empId(long phnno) {
    System.out.println("The employee phone no is" +phnno);
	}
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.empId(267);
		emp.empId("Karthika");
		emp.empId("994834981489");
	}

}
