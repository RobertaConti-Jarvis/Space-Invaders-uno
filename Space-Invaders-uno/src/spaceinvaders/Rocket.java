package spaceinvaders;

import javax.swing.JButton;


public class Rocket extends ElementoDiGioco{
    
     public Rocket(double x, JButton b) {
        setButton(b);
        getButton().setVisible(true);
        setX(x);
        setButton(b);
        setTargetY(JFrameSI.ROCKET_YMAX);
        setTargetX(x);
        setY(JFrameSI.ROCKET_YMIN);
        setStepX(0);
        setStepY(-2);
    }

    @Override
    public void raggiuntoTarget() {
        System.out.println("siamo in raggiuntoTarghet di Rocket");
        //se il rocket è arrivato alla quota max
        if(getY() == JFrameSI.ROCKET_YMAX){
            //nasconde il bottone
            getButton().setVisible(false);
            setStepX(0);
            setStepY(0);
        }
        else{
            setTargetX(JFrameSI.ROCKET_YMIN);
//            setStepY(-getStepY());
        }
        
    }
     
}
