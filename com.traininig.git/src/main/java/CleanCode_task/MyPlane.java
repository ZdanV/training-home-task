package CleanCode_task;

public class MyPlane extends Plane{

    public MyPlane (String model) {
        super(model);
    }

    public MyPlane (int maxSpeed, int maxFlightDistance, int maxLoadCapacity) {
        super(maxSpeed, maxFlightDistance, maxLoadCapacity);
    }
}
