package spaceinvaders;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class JFrameSI extends javax.swing.JFrame {

    public static final double STEP = 20.0;
    public static final double TANK_XMIN = 8.0;
    public static final double TANK_XMAX = 568.0;
    public static final double ALIEN_XMIN = TANK_XMIN;
    public static final double ALIEN_XMAX = TANK_XMAX;
    public static final double ROCKET_YMIN = 270.0;
    public static final double ROCKET_YMAX = 8.0;

    Rocket rocket;
    Tank tank;
    ExecutorService exe;

    /**
     * Creates new form JFrameSI
     */
    public JFrameSI() {
        initComponents();

        setSize(800, 600);
        //var exe = Executors.newCachedThreadPool();
        exe = Executors.newCachedThreadPool();
        exe.execute(new AliensThread(jButtonAlien1, jButtonAlien2, jButtonAlien3));
        tank = new Tank(jButtonStarship);
        exe.execute(new TankThread(tank));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonAlien1 = new javax.swing.JButton();
        jButtonAlien2 = new javax.swing.JButton();
        jButtonAlien3 = new javax.swing.JButton();
        jButtonRocket = new javax.swing.JButton();
        jButtonStarship = new javax.swing.JButton();
        jButtonLeft = new javax.swing.JButton();
        jButtonRight = new javax.swing.JButton();
        jButtonFire = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonAlien1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/spaceinvaders/alien01.png"))); // NOI18N

        jButtonAlien2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/spaceinvaders/alien01.png"))); // NOI18N

        jButtonAlien3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/spaceinvaders/alien01.png"))); // NOI18N

        jButtonRocket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/spaceinvaders/rocket.png"))); // NOI18N
        jButtonRocket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRocketActionPerformed(evt);
            }
        });

        jButtonStarship.setIcon(new javax.swing.ImageIcon(getClass().getResource("/spaceinvaders/starship.png"))); // NOI18N
        jButtonStarship.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStarshipActionPerformed(evt);
            }
        });

        jButtonLeft.setText("<<");
        jButtonLeft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLeftActionPerformed(evt);
            }
        });

        jButtonRight.setText(">>");
        jButtonRight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRightActionPerformed(evt);
            }
        });

        jButtonFire.setText("Fire");
        jButtonFire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFireActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jButtonLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonRight, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonFire, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 193, Short.MAX_VALUE)
                        .addComponent(jButtonRocket, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonAlien2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonAlien1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonAlien3))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonStarship, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jButtonAlien1)
                .addGap(18, 18, 18)
                .addComponent(jButtonAlien2)
                .addGap(18, 18, 18)
                .addComponent(jButtonAlien3)
                .addGap(113, 113, 113)
                .addComponent(jButtonStarship)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonLeft)
                        .addComponent(jButtonRight)
                        .addComponent(jButtonFire))
                    .addComponent(jButtonRocket))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLeftActionPerformed
        tank.setTargetX(tank.getTargetX() - STEP);
    }//GEN-LAST:event_jButtonLeftActionPerformed

    private void jButtonStarshipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStarshipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonStarshipActionPerformed

    private void jButtonFireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFireActionPerformed
        //var exeR = Executors.newSingleThreadExecutor();
        RocketThread rt;
        if (rocket != null && !rocket.getButton().isVisible()) {
            rocket = new Rocket(tank.getX(), jButtonRocket);
            rt = new RocketThread(rocket);
            exe.execute(rt);
        } else if (rocket == null) {
            rocket = new Rocket(tank.getX(), jButtonRocket);
            rt = new RocketThread(rocket);
            exe.execute(rt);
        }
    }//GEN-LAST:event_jButtonFireActionPerformed

    private void jButtonRightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRightActionPerformed
        tank.setTargetX(tank.getTargetX() + STEP);
    }//GEN-LAST:event_jButtonRightActionPerformed

    private void jButtonRocketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRocketActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonRocketActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameSI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameSI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameSI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameSI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameSI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlien1;
    private javax.swing.JButton jButtonAlien2;
    private javax.swing.JButton jButtonAlien3;
    private javax.swing.JButton jButtonFire;
    private javax.swing.JButton jButtonLeft;
    private javax.swing.JButton jButtonRight;
    private javax.swing.JButton jButtonRocket;
    private javax.swing.JButton jButtonStarship;
    // End of variables declaration//GEN-END:variables
}
