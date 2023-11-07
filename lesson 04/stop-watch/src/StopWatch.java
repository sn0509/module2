public class StopWatch {

    private long  startTime, endTime;
    private boolean isRunning ;

    public StopWatch() {

    };


    public StopWatch(long startTime, long endTime, boolean isRunning) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.isRunning = isRunning;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }


    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }


    public void setRunning(boolean running) {
        isRunning = running;
    }
    public void start() {
//        System.out.println(java.time.LocalTime.now());
        this.startTime = System.currentTimeMillis();
        this.isRunning = true;
    }
    public void stop() {
//        System.out.println(java.time.LocalTime.now());
        this.endTime = System.currentTimeMillis();
        this.isRunning = false;
    }
    public long elapsedTime() {
        long elapsedTime;
        if (isRunning) {
            elapsedTime = System.currentTimeMillis() - this.startTime;
        } else {
            elapsedTime =(this.endTime- this.startTime);
        }
        return elapsedTime;
    }


}
