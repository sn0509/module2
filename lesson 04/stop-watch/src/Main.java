import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice;
        StopWatch stopWatch = new StopWatch(0l,0l,false);
    do {
        System.out.println("""
                Enter your choice:
                1. Start.
                2. Stop.
                3. Elapsed time.
                4. Exit.""");


        choice = scanner.nextInt();



        switch (choice) {
            case 1:
                stopWatch.start();

                break;
            case 2:
                stopWatch.stop();

                break;
            case 3:
                long elapsed = stopWatch.elapsedTime();
                System.out.println(elapsed);
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid number.");
                break;
        }

        }while (choice !=0);
    }
}