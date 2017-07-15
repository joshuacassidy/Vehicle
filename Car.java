public class Car extends Vehicle {

    private int wheels,doors,gears,currentGear;
    private Boolean isManual;

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
        System.out.printf("Changed to %s gear.\n",this.currentGear);
    }

    public void changeVelocity(int speed, int direction){
        System.out.printf("Velocity %s direction %s.\n",speed,direction);
        move(speed,direction);
    }
}
