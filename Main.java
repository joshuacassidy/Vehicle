public class Main {

    public static void main(String[] args){
        //Clear console for unix terminals and emulators will not work with window cmd.exe
        System.out.print("\033[H\033[2J");
        Toyota toyota = new Toyota((int) Math.random() * 5);
        toyota.accelerate((int) (Math.random() * 25));
        toyota.steer((int) (Math.random() * 100));
        toyota.accelerate(-(int) (Math.random() * 25));
        toyota.accelerate((int) (Math.random() * 25));

    }

}
