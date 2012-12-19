package headfirst18.decorator.staff.concrete;

import headfirst18.decorator.staff.Staff;
import headfirst18.decorator.staff.StaffType;


public class TemporaryStaff extends StaffType{

	private Staff staff;
	
	public TemporaryStaff(Staff staff){
		this.staff = staff;
	}
	
	public void doJob(){
		System.out.println("I am on probation, i have no right to use computer.");
	}
}
