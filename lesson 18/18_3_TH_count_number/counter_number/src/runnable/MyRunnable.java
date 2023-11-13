package runnable;
public class MyRunnable implements Runnable{
    @Override
    public void run(){
        CounterThread counter = new CounterThread();
        counter.start();
    }



}
