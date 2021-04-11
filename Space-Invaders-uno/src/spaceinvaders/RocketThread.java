package spaceinvaders;

import java.util.concurrent.atomic.AtomicBoolean;
import javax.swing.JButton;

public class RocketThread implements Runnable {

    public static final long TIMEOUT = 20;
    
    private final AtomicBoolean running = new AtomicBoolean(false);
    private Rocket rocket;

    public RocketThread(Rocket rocket) {
        this.rocket = rocket;
    }
    
    public void stop(){
        running.set(false);
    }

    @Override
    public void run() {
        running.set(true);
        while (running.get()) {
            //far muovere il missile
            if (rocket.hasToMove()) {
                rocket.move();
            } else {
                rocket.raggiuntoTarget();
                stop();
                /*if (rocket.hasToMove()) {
                    rocket.move();
                    stop();
                }*/
            }
            try {
                //aspettare 20ms
                Thread.sleep(TIMEOUT);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }

}
