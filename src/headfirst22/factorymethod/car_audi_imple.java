package headfirst22.factorymethod;


public class car_audi_imple extends base_car_imple {
    public void start() {
        System.out.println(this.getName() + " 车以专利技术起动了　最高速度为："
                + this.getSpeed());
    }
    public void stop() {
        System.out.println(this.getName() + " 车以专利技术停车了");
    }
}

