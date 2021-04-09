package spaceinvaders;

import javax.swing.JButton;


public class Alien extends ElementoDiGioco{
    
    public Alien(double y, JButton b){
        setButton(b);
        setY(y);
        setTargetX(JFrameSI.ALIEN_XMAX);
        setTargetY(y);
        setX(JFrameSI.ALIEN_XMIN);
        setStepX(1);
        setStepY(0);
    }

    @Override
    public void raggiuntoTarget() {
        System.out.println(" Sono in raggiuntoTarghet di Alien");
        //se l'alieno ha raggiunto il margine max
        if(getX() == JFrameSI.ALIEN_XMAX){
            setTargetX(JFrameSI.ALIEN_XMIN);
        }
        //se l'alieno ha raggiunti il margine min
        else{
            setTargetX(JFrameSI.ALIEN_XMAX);
        }
        setStepX(-getStepX());
    }
}
