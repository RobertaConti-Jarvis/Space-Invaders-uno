
package spaceinvaders;

import javax.swing.JButton;


public class Tank extends ElementoDiGioco{
    
    public Tank(JButton b) {
        setButton(b);
        setX(JFrameSI.TANK_XMIN);
        setY(JFrameSI.ROCKET_YMIN);
        setTargetX(getX());
        setTargetY(getY());
        setStepX(2);
        setStepY(0);
    }

    @Override
    public void move() {
        System.out.println("sono nel move di Tank");
       //se devo andare a destra
       if(getTargetX()> getX()){
           setStepX(1);
       }
       //se devo andare a sinistra
       else{
           setStepX(-1);
       }
       //movimento del carroarmato
        setX(getX() + getStepX());
    }
}
