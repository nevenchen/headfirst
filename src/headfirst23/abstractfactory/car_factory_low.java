package headfirst23.abstractfactory;

public class car_factory_low implements Icar_factory {

	public Icar_interface create_audi_car() {
		car_audi_imple_low car_audi_imple_low_ref = new car_audi_imple_low();
		car_audi_imple_low_ref.setName("奥迪A6");
		car_audi_imple_low_ref.setSpeed(300);
		return car_audi_imple_low_ref;
	}

	public Icar_interface create_threeW_car() {
		car_3w_imple_low car_3w_imple_low_ref = new car_3w_imple_low();
		car_3w_imple_low_ref.setName("大众A6");
		car_3w_imple_low_ref.setSpeed(300);
		return car_3w_imple_low_ref;
	}
}
