package model;


public class GameExecution {

    private boolean isRunning;

    public GameExecution() {
        this.isRunning = false;
    }


    public void setRunning(boolean isRunning) {
        this.isRunning = isRunning;
    }

    public boolean isRunning() {
        return this.isRunning;
    }
}
