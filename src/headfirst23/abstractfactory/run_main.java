package headfirst23.abstractfactory;

public class run_main {

	public static void main(String[] args) {
		Icar_factory Icar_factory_ref = new car_factory_adv();
		Icar_interface Icar_interface_ref = Icar_factory_ref.create_threeW_car();
		Icar_interface_ref.start();
		Icar_interface_ref.stop();
	}
}
