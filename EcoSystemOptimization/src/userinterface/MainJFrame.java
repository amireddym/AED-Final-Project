/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import businesslogic.CityNetwork;
import businesslogic.DB4OUtil.DB4OUtil;
import businesslogic.EcoSystem;
import businesslogic.JPanelManager;
import businesslogic.User;
import businesslogic.organization.Organization;
import java.awt.CardLayout;
import javax.swing.JPanel;
import userinterface.signUpWorkArea.SignUpJPanel;

/**
 *
 * @author manojreddy
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    
    private EcoSystem ecoSystem;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    
    public MainJFrame() {
        initComponents();
        ecoSystem = dB4OUtil.retrieveSystem();
        this.setSize(1680, 1050);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainJSplitPane = new javax.swing.JSplitPane();
        controlJPanel = new javax.swing.JPanel();
        userNameJLabel = new javax.swing.JLabel();
        userNameJTextField = new javax.swing.JTextField();
        passwordJLabel = new javax.swing.JLabel();
        logoutJButton = new javax.swing.JButton();
        loginJButton = new javax.swing.JButton();
        signUpJButton = new javax.swing.JButton();
        jPasswordField = new javax.swing.JPasswordField();
        userProcessJPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainJSplitPane.setDividerLocation(150);

        controlJPanel.setBackground(new java.awt.Color(102, 255, 255));
        controlJPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        userNameJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        userNameJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userNameJLabel.setText("User Name");

        userNameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameJTextFieldActionPerformed(evt);
            }
        });

        passwordJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        passwordJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passwordJLabel.setText("Password");

        logoutJButton.setText("Logout");
        logoutJButton.setEnabled(false);
        logoutJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutJButtonActionPerformed(evt);
            }
        });

        loginJButton.setText("Login");
        loginJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginJButtonActionPerformed(evt);
            }
        });

        signUpJButton.setText("SignUp");
        signUpJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlJPanelLayout = new javax.swing.GroupLayout(controlJPanel);
        controlJPanel.setLayout(controlJPanelLayout);
        controlJPanelLayout.setHorizontalGroup(
            controlJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlJPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(controlJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(signUpJButton)
                    .addComponent(logoutJButton)
                    .addComponent(loginJButton))
                .addGap(33, 33, 33))
            .addGroup(controlJPanelLayout.createSequentialGroup()
                .addGroup(controlJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(controlJPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(controlJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(controlJPanelLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(passwordJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(controlJPanelLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(userNameJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(controlJPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        controlJPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {loginJButton, logoutJButton, signUpJButton});

        controlJPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jPasswordField, userNameJTextField});

        controlJPanelLayout.setVerticalGroup(
            controlJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlJPanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(userNameJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(userNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(passwordJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loginJButton)
                .addGap(18, 18, 18)
                .addComponent(logoutJButton)
                .addGap(110, 110, 110)
                .addComponent(signUpJButton)
                .addContainerGap(173, Short.MAX_VALUE))
        );

        controlJPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {loginJButton, logoutJButton, signUpJButton});

        mainJSplitPane.setLeftComponent(controlJPanel);

        userProcessJPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        userProcessJPanel.setLayout(new java.awt.CardLayout());
        mainJSplitPane.setRightComponent(userProcessJPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainJSplitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 959, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainJSplitPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userNameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameJTextFieldActionPerformed

    private void logoutJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutJButtonActionPerformed
        // TODO add your handling code here:
        logoutJButton.setEnabled(false);
        
        loginJButton.setEnabled(true);
        userNameJTextField.setEnabled(true);
        userNameJTextField.setText("");
        jPasswordField.setEnabled(true);
        jPasswordField.setText("");
        signUpJButton.setEnabled(true);
        
        userProcessJPanel.removeAll();
        JPanel blankPanel = new JPanel();
        CardLayout cardLayout = (CardLayout) userProcessJPanel.getLayout();
        userProcessJPanel.add("BlankPanel", blankPanel);
        cardLayout.next(userProcessJPanel);
        
        dB4OUtil.storeSystem(ecoSystem);
    }//GEN-LAST:event_logoutJButtonActionPerformed

    private void loginJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginJButtonActionPerformed
        // TODO add your handling code here:
        
        String userName = userNameJTextField.getText();
        char[] passwordChars = jPasswordField.getPassword();
        String password = String.valueOf(passwordChars);
        
        User userLogged = null;
        
        //SysAdmin login functionality
        if(!ecoSystem.getSysAdminsDirectory().getSysAdmins().isEmpty()){
            
            userLogged = ecoSystem.getSysAdminsDirectory().isUserSysAdmin(userName, password);
            if(userLogged!=null) {
                CardLayout cardLayout = (CardLayout) userProcessJPanel.getLayout();
                userProcessJPanel.add("SysAdminHomePanel",JPanelManager.getSysAdminHomePanel(userProcessJPanel, ecoSystem, userLogged));
                cardLayout.next(userProcessJPanel);
                clearLoginPanels();
                return;
            }
                        
        }
        
        //CityOfficial login functionality
        if(userLogged==null) {
            
            if(!ecoSystem.getCityNetworkDirectory().getCityNetworks().isEmpty()) {
                for(CityNetwork cityNetwork:ecoSystem.getCityNetworkDirectory().getCityNetworks()) {
                    
                    if(!cityNetwork.getCityOfficialsDirectory().getCityOfficials().isEmpty()) {
                        
                        userLogged = cityNetwork.getCityOfficialsDirectory().isUserCityOfficial(userName,password);
                        if(userLogged!=null) {
                            CardLayout cardLayout = (CardLayout) userProcessJPanel.getLayout();
                            userProcessJPanel.add("CityOfficalHomePanel", JPanelManager.getCityOfficialHomePanel(userProcessJPanel,ecoSystem,userLogged,cityNetwork));
                            cardLayout.next(userProcessJPanel);
                            clearLoginPanels();
                            return;
                        }
                    }
                }
            }
        }
        
        //Donor login functionality
        if(userLogged==null) {
            
            if(!ecoSystem.getDonorsDirectory().getDonors().isEmpty()) {
                
                userLogged = ecoSystem.getDonorsDirectory().isUserDonor(userName, password);
                if(userLogged!=null) {
                    CardLayout cardLayout = (CardLayout) userProcessJPanel.getLayout();
                    userProcessJPanel.add("DonorHomePanel",JPanelManager.getDonorHomePanel());
                    cardLayout.next(userProcessJPanel);
                    clearLoginPanels();
                    return;
                }
            }
        }
        
        //Cleaner login functionality
        if(userLogged==null) {
            
            if(!ecoSystem.getCityNetworkDirectory().getCityNetworks().isEmpty()) {
                for(CityNetwork cityNetwork:ecoSystem.getCityNetworkDirectory().getCityNetworks()){
                    
                    if(!cityNetwork.getCleanersDirectory().getCleaners().isEmpty()) {
                        
                        userLogged = cityNetwork.getCleanersDirectory().isUserCleaner(userName, password);
                        if(userLogged!=null) {
                            CardLayout cardLayout = (CardLayout) userProcessJPanel.getLayout();
                            userProcessJPanel.add("CleanerHomePanel",JPanelManager.getCleanerHomePanel());
                            cardLayout.next(userProcessJPanel);
                            clearLoginPanels();
                            return;
                        }
                    }
                }
            }
        }
        
        //OrgManager login functionality
        if(userLogged==null) {
            
            if(!ecoSystem.getCityNetworkDirectory().getCityNetworks().isEmpty()) {
                for(CityNetwork cityNetwork:ecoSystem.getCityNetworkDirectory().getCityNetworks()) {
                    
                    if(!cityNetwork.getOrganizationDirectory().getOrganizations().isEmpty()) {
                        for(Organization organization:cityNetwork.getOrganizationDirectory().getOrganizations()) {
                            
                            if(!organization.getOrgManagerDirectory().getOrgManagers().isEmpty()) {
                                
                                userLogged = organization.getOrgManagerDirectory().isUserOrgManager(userName,password);
                                if(userLogged!=null) {
                                    CardLayout cardLayout = (CardLayout) userProcessJPanel.getLayout();
                                    userProcessJPanel.add("OrgMangerHomePanel", JPanelManager.getOrgManagerHomePanel());
                                    cardLayout.next(userProcessJPanel);
                                    clearLoginPanels();
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }

        //DeliveryVolunteer login functionality
        if(userLogged==null) {
            
            if(!ecoSystem.getCityNetworkDirectory().getCityNetworks().isEmpty()) {
                for(CityNetwork cityNetwork:ecoSystem.getCityNetworkDirectory().getCityNetworks()) {
                    
                    if(!cityNetwork.getOrganizationDirectory().getOrganizations().isEmpty()) {
                        for(Organization organization:cityNetwork.getOrganizationDirectory().getOrganizations()) {
                            
                            if(!organization.getDeliveryVolunteerDirectory().getDeliveryVolunteers().isEmpty()) {
                                
                                userLogged = organization.getDeliveryVolunteerDirectory().isUserDeliveryVolunteer(userName, password);
                                if(userLogged!=null) {
                                    CardLayout cardLayout = (CardLayout) userProcessJPanel.getLayout();
                                    userProcessJPanel.add("DeliveryVolunteerHomePanel", JPanelManager.getDeliveryVolunteerHomePanel());
                                    cardLayout.next(userProcessJPanel);
                                    clearLoginPanels();
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }        
        
    }//GEN-LAST:event_loginJButtonActionPerformed

    private void signUpJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpJButtonActionPerformed
        // TODO add your handling code here:
        
        CardLayout cardLayout = (CardLayout) userProcessJPanel.getLayout();
        userProcessJPanel.add("SignUpPanel", new SignUpJPanel());
        cardLayout.next(userProcessJPanel);
        
    }//GEN-LAST:event_signUpJButtonActionPerformed

    private void clearLoginPanels() {
        
        userNameJTextField.setText("");
        userNameJTextField.setEnabled(false);
        jPasswordField.setText("");
        jPasswordField.setEnabled(false);
        loginJButton.setEnabled(false);
        logoutJButton.setEnabled(true);
        signUpJButton.setEnabled(false);
        
    }
    
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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel controlJPanel;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JButton loginJButton;
    private javax.swing.JButton logoutJButton;
    private javax.swing.JSplitPane mainJSplitPane;
    private javax.swing.JLabel passwordJLabel;
    private javax.swing.JButton signUpJButton;
    private javax.swing.JLabel userNameJLabel;
    private javax.swing.JTextField userNameJTextField;
    private javax.swing.JPanel userProcessJPanel;
    // End of variables declaration//GEN-END:variables
}
