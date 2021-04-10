package spaceinvaders;

import javax.swing.JButton;

public class RocketThread implements Runnable {

    public static final long TIMEOUT = 20;

    private Rocket rocket;

    public RocketThread(Rocket rocket) {
        //this.rocket = new Rocket(y, b);
        this.rocket = rocket;
    }

    @Override
    public void run() {
        while (true) {
            //far muovere il missile

            if (rocket.hasToMove()) {
                rocket.move();
            } else {
                rocket.raggiuntoTarget();
                
                if (rocket.hasToMove()) {
                    rocket.move();
                }

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
