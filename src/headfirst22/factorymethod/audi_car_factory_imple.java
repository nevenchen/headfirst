package headfirst22.factorymethod;

public class audi_car_factory_imple implements Icar_factory {

	public Icar_interface create_car() {
		car_audi_imple car_audi_imple_ref = new car_audi_imple();
		car_audi_imple_ref.setName("奥迪A6");
		car_audi_imple_ref.setSpeed(300);
		return car_audi_imple_ref;
	}
}
