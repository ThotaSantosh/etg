package com.sonata.Employee;

public class UsingPeople {

	public static void main(String[] args) {
		//creating the object
		Address add = new Address();
		add.setCity("Guntur");
		add.setDoorNo("4-16-25/f");
		add.setStreet("Bharatpet");
		add.setZipCode(522002);
		//Generating the object for address
		Address add1 = new Address();
		add1.setCity("Bangalore");
		add1.setDoorNo("8-22/p");
		add1.setStreet("Hootagali");
		add1.setZipCode(501011);
		
		TechnicalEmployee techStaff = new TechnicalEmployee("21018", "Santosh", add,"Java");
		float techStaffSal = 0;
		
		System.out.println("Below are the Technical Employee Details....");
		System.out.println(techStaff);
		System.out.println("Door No : "+ techStaff.getAddress().getDoorNo()+"\n"+"Street : "+ techStaff.getAddress().getStreet()+"\n"+"City : "+ techStaff.getAddress().getCity()+"\n"+"ZipCode : "+ techStaff.getAddress().getZipCode());
		System.out.println("Technical Skill : " + techStaff.getTechnicalSkill());
		try {
			techStaffSal = techStaff.calculateSlary(24000);
			System.out.println("Salary : "+techStaffSal);
		} catch (SalaryException e) {
			System.out.println(e);
		}
		
	
		System.out.println("###############################################");
		
		Staff staff = new Staff("123456", "Sailaja", add1,"Teaching");
		float staffSal = 0;
		System.out.println("Below are the Staff Details....");
		System.out.println(staff);
		System.out.println("Door No : "+ staff.getAddress().getDoorNo()+"\n"+"Street : "+ staff.getAddress().getStreet()+"\n"+"City : "+ staff.getAddress().getCity()+"\n"+"ZipCode : "+ staff.getAddress().getZipCode());
		System.out.println("Title : " + staff.getTitle());
        try {
			staffSal = staff.calculateSlary(93000);
			System.out.println("Salary : "+staffSal);
		} catch (SalaryException e) {
			System.out.println(e);
		}
		
	}

}
