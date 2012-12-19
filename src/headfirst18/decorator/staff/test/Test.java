package headfirst18.decorator.staff.test;

import headfirst18.decorator.staff.Staff;
import headfirst18.decorator.staff.concrete.Developer;
import headfirst18.decorator.staff.concrete.PermanentStaff;
import headfirst18.decorator.staff.concrete.Salesman;
import headfirst18.decorator.staff.concrete.TemporaryStaff;


public class Test {

	/**
	 * @Description:
	 *
	 * @author name: neven
	 * @param @param args
	 * @return void
	 * 
	 * @Exception:
	 */
	public static void main(String[] args) {
		//1: Contact developer
		Staff staff1 = new PermanentStaff(new Developer());
		staff1.doJob();
		
		//2: Temporary salesman
		Staff staff2 = new TemporaryStaff(new Salesman());
		staff2.doJob();
	}
}
