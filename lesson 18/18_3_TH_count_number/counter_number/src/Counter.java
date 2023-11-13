public class Counter implements Runnable{

    @Override
    public void run() {
        try{
            for (int i=0; i<=10;i++){
                System.out.println("Thread count: " + i);
                Thread.sleep(2000);
            }
        }catch (Exception e){
            System.out.println("My thread Interrupted");
        }
        System.out.println("Over!");

    }
}
