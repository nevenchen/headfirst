package headfirst18.decorator.staff.concrete;

import headfirst18.decorator.staff.Staff;
import headfirst18.decorator.staff.StaffType;


public class PermanentStaff extends StaffType{
	
	private Staff staff;
	
	public PermanentStaff(Staff staff) {
		this.staff = staff;
	}
	public void doJob() {
        System.out.println("I have passed the provation, I can user computer now.");
        staff.doJob();
	}
}
