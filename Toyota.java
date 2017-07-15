public class Toyota extends Car {
    private int roadServiceMonths;

    public Toyota(int roadServiceMonths) {
        super("Toyota", "4 Wheel Drive", 5, 5, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }
    public void accelerate(int rate){
        int newVelocity = getCurrentVelocity() + rate;
        if (newVelocity == 0) {
            stop();
            changeGear(1);
        } else{
            for(int i = 1; i < newVelocity; i++){
                if(newVelocity > i && newVelocity/10 <= i){
                    changeGear(i);
                    break;
                }
            }
        } 

        if(newVelocity > 0){
            changeVelocity(newVelocity,getCurrentDirection());
        }
    }
}
