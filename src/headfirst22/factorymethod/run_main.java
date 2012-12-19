package headfirst22.factorymethod;

public class run_main {

	public static void main(String[] args) {
		Icar_factory car_factory = new audi_car_factory_imple();
		Icar_interface car_ref = car_factory.create_car();
		car_ref.start();
		car_ref.stop();
	}
}
