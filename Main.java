public class Main {

    public static void main(String[] args){
        Toyota toyota = new Toyota((int) Math.random() * 5);
        toyota.accelerate((int) (Math.random() * 25));
        toyota.steer((int) (Math.random() * 100));
        toyota.accelerate(-(int) (Math.random() * 25));
        toyota.accelerate((int) (Math.random() * 25));

    }

}
