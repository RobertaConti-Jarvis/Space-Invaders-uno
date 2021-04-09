package spaceinvaders;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;


public class AliensThread implements Runnable{
    
    public static final long TIMEOUT = 20;
    
    private List<Alien> alieni = new ArrayList<>();
    
    
    public AliensThread(JButton... icone){
        //creare collezione alieni
        for (int i = 0; i < icone.length; i++) {
            JButton ico = icone[i];
            Alien a = new Alien(i*20.0, ico);
            alieni.add(a);
        }
    }

    @Override
    public void run() {
        while(true){
            //far muovere tutti gli alieni
            alieni.forEach( a ->{
                if(a.hasToMove()){
                    a.move();
                }
                else{
                    a.raggiuntoTarget();
                    if(a.hasToMove()){
                        a.move();
                    }
                }
            });
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
