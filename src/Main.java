public class Main {

    public static void main(String[] args) {
        int color = 3;


        switch (color) {
            case 1 -> System.out.println("Stop!");
            case 2 -> System.out.println("Ready!");
            case 3 -> System.out.println("Go!");
            default -> System.out.println("Traffic lights don't work");
        }
    }
}
