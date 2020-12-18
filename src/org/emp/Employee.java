package org.emp;

public class Employee {
	
	private void empId() {
		System.out.println("The Employee Id is 3562");
	}
	private void empName() {
		System.out.println("The Employee name is Harish");
	}
	private void empDob() {
		System.out.println("The Employee Date of birth is 21st June, 1993");
	}
	private void empEmail() {
		System.out.println("The Employee email id is harishbob8@gmail.com");
	}
	private void empAddress() {
		System.out.println("The Employee Address is location in Chennai, TamilNadu");
	}
	
	private void emp1Giit() {
		System.out.println("Employee 1 from GitHub");

	}	private void emp2Git() {
		System.out.println("Emp2 has updated the code");

	}

	public static void main(String[] args) {
		Employee e=new Employee();
		
		e.empName();
		e.empId();
		e.empDob();
		e.empEmail();
		e.empAddress();
	}

}
