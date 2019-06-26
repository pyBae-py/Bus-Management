/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus.management;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Sajeel Ahmad
 */
public class BusManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
            java.util.logging.Logger.getLogger(UserControlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserControlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserControlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserControlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        final JOptionPane optionPane;
        
        ImageIcon iO = new ImageIcon("Haehoo Express Logo.png");
        optionPane = new JOptionPane("Loading.. Please wait..\nWe are trying to load your application", JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE, null, new Object[]{}, null);
        JOptionPane.showMessageDialog(null,"Welcome to Haehoo Express\n\t\t\t\t\tI'm Ridin it","I'm Ridin it", JOptionPane.INFORMATION_MESSAGE,iO);
        final JDialog dialog = new JDialog();
        dialog.setTitle("Loading");
        dialog.setModal(true);
        dialog.setLocationRelativeTo(null);
        dialog.setContentPane(optionPane);

        dialog.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        dialog.pack();

        //create timer to dispose of dialog after 5 seconds
        Timer timer = new Timer(5000, new AbstractAction() {
   
        @Override
        public void actionPerformed(ActionEvent ae) {
        dialog.dispose();
    }
});
            timer.setRepeats(false);//the timer should only go off once

//start timer to close JDialog as dialog modal we must start the timer before its visible
            timer.start();

            dialog.setVisible(true); 
        
        MainScreen mr = new MainScreen();
        mr.setVisible(true);
        mr.setLocationRelativeTo(null);
    }
    
}
