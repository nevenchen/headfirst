package headfirst22.factorymethod;


public class threeW_car_factory_imple implements Icar_factory {

    public Icar_interface create_car() {

        car_3w_imple car_3w_imple_ref = new car_3w_imple();
        car_3w_imple_ref.setName("大众A6");
        car_3w_imple_ref.setSpeed(400);

        return car_3w_imple_ref;

    }

}

