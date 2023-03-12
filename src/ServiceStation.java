public class ServiceStation {

    public void check(Car car) {
        checkWheels(car);
        car.checkEngine();
    }

    public void check(Bicycle bicycle) {
        checkWheels(bicycle);
    }

    public void check(Truck truck) {
        checkWheels(truck);
        truck.checkEngine();
        truck.checkTrailer();
    }

    public void checkWheels(WithWheel withWheel) {
        System.out.println("Обслуживаем " + withWheel.getModelName());
        for (int i = 0; i < withWheel.getWheelsCount(); i++) {
            withWheel.updateTyre();
        }
    }

}
