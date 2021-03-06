/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import SupportClasses.AppInfo;
import SupportClasses.Database;
import Classes.Personal;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


/**
 *
 * @author baris
 */
public class DeletePersonalPage extends javax.swing.JFrame {

    private Database db = Database.getInstance();
    private Personal personal;
    
    public DeletePersonalPage() {
        initComponents();
        this.initalSettings();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        appNameLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        searchMailTF = new javax.swing.JTextField();
        deleteButton = new javax.swing.JButton();
        versionLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(100, 300, 0, 0));
        setResizable(false);

        appNameLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        appNameLabel.setText("%APPNAME%");

        jLabel1.setText("Please insert e-mail address");

        deleteButton.setText("DELETE");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        versionLabel.setText("%VERSION%");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(appNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(searchMailTF, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel1)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(versionLabel)
                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(appNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchMailTF, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addComponent(versionLabel))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
    if(this.checkInput()){
            this.personal = this.db.getPersonal(this.searchMailTF.getText());
            if(this.personal != null){
                String answer = JOptionPane.showInputDialog(this, AppInfo.DOUBLE_CHECK_MESSAGE, AppInfo.APP_NAME, 3);
                if(answer.toLowerCase().equals("yes")){
                    this.db.deleteUser(this.personal.getEmail());
                    this.db.deletePersonal(this.personal.getEmail());
                    this.showMessage(AppInfo.SUCCESS_DELETE, 1);
                }else{
                    this.showMessage(AppInfo.PROCCESS_CANCEL_MESSAGE, 2);
                }
            }else{
                this.showMessage(AppInfo.WRONG_INPUT, 0);
            }
        }else{
            this.showMessage(AppInfo.WRONG_INPUT, 0);
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

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
            java.util.logging.Logger.getLogger(DeletePersonalPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeletePersonalPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeletePersonalPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeletePersonalPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeletePersonalPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel appNameLabel;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField searchMailTF;
    private javax.swing.JLabel versionLabel;
    // End of variables declaration//GEN-END:variables

    private void initalSettings() {
        URL iconURL = getClass().getResource(AppInfo.APP_ICON);
        ImageIcon icon = new ImageIcon(iconURL);
        this.setIconImage(icon.getImage());
        this.setTitle(AppInfo.APP_NAME + " - " + AppInfo.DELETE_PERSONAL_PAGE);
        this.appNameLabel.setText(AppInfo.APP_NAME);
        this.versionLabel.setText(AppInfo.VERSION);
        this.deleteButton.setIcon(new ImageIcon(getClass().getResource(AppInfo.DELETE_ICON)));
        this.jPanel1.setBackground(AppInfo.APP_COLOR);
        this.setVisible(true);
        
    }
    
    private void showMessage(String message, int type){
        JOptionPane.showMessageDialog(this, message, AppInfo.APP_NAME, type);
        
    }

    private boolean checkInput() {
        if(this.searchMailTF.getText().trim().length() == 0)
                return false;
        return true;
    }
    
    

}
