package spaceinvaders;

import javax.swing.JButton;


public class TankThread implements Runnable{
    
    public static final long TIMEOUT = 20;
    
    private Tank tank;

    public TankThread(JButton tankB) {
        this.tank = new Tank(tankB);
    }
    
    
    @Override
    public void run() {
         while(true){
            //far muovere la navicella
            //tank.move();
            
            try{
                //aspettare 20ms
                Thread.sleep(TIMEOUT);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        
    }
    
    
}
