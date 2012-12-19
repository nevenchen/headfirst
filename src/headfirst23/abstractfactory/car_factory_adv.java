package headfirst23.abstractfactory;

public class car_factory_adv implements Icar_factory {

	public Icar_interface create_audi_car() {
		car_audi_imple_adv car_audi_imple_adv = new car_audi_imple_adv();
		car_audi_imple_adv.setName("奥迪A6");
		car_audi_imple_adv.setSpeed(300);
		return car_audi_imple_adv;
	}

	public Icar_interface create_threeW_car() {
		car_3w_imple_adv car_3w_imple_adv_ref = new car_3w_imple_adv();
		car_3w_imple_adv_ref.setName("大众A6");
		car_3w_imple_adv_ref.setSpeed(300);
		return car_3w_imple_adv_ref;
	}
}
