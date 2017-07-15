public class Car extends Vehicle {

    private int wheels;
    private int doors;
    private int gears;
    private Boolean isManual;

    private int currentGear;

    public Car(String name, String size, int wheels, int doors, int gears, Boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Changed to " + this.currentGear + " gear.");
    }


    public void changeVelocity(int speed, int direction){
        System.out.println("Velocity " + speed + " direction " + direction);
        move(speed,direction);
    }
}