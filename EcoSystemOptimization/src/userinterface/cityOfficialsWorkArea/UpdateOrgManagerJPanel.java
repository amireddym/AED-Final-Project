/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.cityOfficialsWorkArea;

import businesslogic.EcoSystem;
import businesslogic.User;
import businesslogic.helper.Constants;
import businesslogic.helper.EmailHelper;
import businesslogic.helper.PhoneNoHelper;
import businesslogic.helper.UserNameHelper;
import businesslogic.organization.OrgManager;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Image;
import java.io.File;
import java.nio.file.Paths;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author anshitaverma
 */
public class UpdateOrgManagerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form UpdateOrgManagerJPanel
     */
    private JPanel userProcessJpanel;
    private EcoSystem ecoSystem;
    private OrgManager orgManager;
    private User userLogged;
    
    private String imagePath;
    public UpdateOrgManagerJPanel(JPanel userProcessJpanel, EcoSystem ecoSystem, OrgManager orgManager, User userLogged) {
        initComponents();
        this.userProcessJpanel = userProcessJpanel;
        this.ecoSystem = ecoSystem;
        this.orgManager = orgManager;
        this.userLogged = userLogged;
        picHolderjLabel.setSize(126, 139);
        
        populateData();
    }
       private void populateData() {
        
        userNamejTextField.setText(orgManager.getUserName());
        namejTextField.setText(orgManager.getName());
        passwordjTextField.setText(orgManager.getPassword());
        phoneNojTextField.setText(orgManager.getPhoneNo());
        emailjTextField.setText(orgManager.getEmail());
        addressjTextField.setText(orgManager.getAddress());
        
        setPhoto(orgManager.getProfilePic());
    }
       
       private void setPhoto(String profilePic) {
        
        if(profilePic.equals(Constants.DEFAULT_PROFILE_IMAGE_PATH)) {
            ImageIcon photo = new ImageIcon(Paths.get(Constants.DEFAULT_PROFILE_IMAGE_PATH).toAbsolutePath().toString());
            Image photoResized = photo.getImage().getScaledInstance(picHolderjLabel.getWidth(), picHolderjLabel.getHeight(),4);
            picHolderjLabel.setIcon(new ImageIcon(photoResized));
            return;
        }
 
        ImageIcon photo = new ImageIcon(profilePic);
        Image photoResized = photo.getImage().getScaledInstance(picHolderjLabel.getWidth(), picHolderjLabel.getHeight(),4);
        picHolderjLabel.setIcon(new ImageIcon(photoResized));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backjButton = new javax.swing.JButton();
        headerjLabel = new javax.swing.JLabel();
        picHolderjLabel = new javax.swing.JLabel();
        uploadjButton = new javax.swing.JButton();
        namejTextField = new javax.swing.JTextField();
        namejLabel = new javax.swing.JLabel();
        userNamejLabel = new javax.swing.JLabel();
        userNamejTextField = new javax.swing.JTextField();
        passwordjTextField = new javax.swing.JTextField();
        passwordjLabel = new javax.swing.JLabel();
        emailjLabel = new javax.swing.JLabel();
        emailjTextField = new javax.swing.JTextField();
        phoneNojTextField = new javax.swing.JTextField();
        phoneNojLabel = new javax.swing.JLabel();
        addressjLabel = new javax.swing.JLabel();
        addressjTextField = new javax.swing.JTextField();
        updatejButton = new javax.swing.JButton();

        backjButton.setText("< < Back");
        backjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButtonActionPerformed(evt);
            }
        });

        headerjLabel.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        headerjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerjLabel.setText("Update Organization Manager");

        picHolderjLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        uploadjButton.setText("upload");
        uploadjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadjButtonActionPerformed(evt);
            }
        });

        namejLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        namejLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        namejLabel.setText("Name :");

        userNamejLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        userNamejLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        userNamejLabel.setText("User Name :");

        passwordjLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        passwordjLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        passwordjLabel.setText("Password :");

        emailjLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        emailjLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        emailjLabel.setText("Email :");

        phoneNojLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        phoneNojLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        phoneNojLabel.setText("Phone No :");

        addressjLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        addressjLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        addressjLabel.setText("Address :");

        updatejButton.setText("Update");
        updatejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatejButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(backjButton)
                        .addGap(106, 106, 106)
                        .addComponent(headerjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(passwordjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(passwordjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(userNamejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(userNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(125, 125, 125)
                                .addComponent(uploadjButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(emailjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(emailjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(phoneNojLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addressjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addressjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(phoneNojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(namejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(namejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(100, 100, 100)
                                .addComponent(picHolderjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(updatejButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(picHolderjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(uploadjButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(headerjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(backjButton))
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(namejLabel)
                            .addComponent(namejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(userNamejLabel)
                            .addComponent(userNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(passwordjLabel)
                            .addComponent(passwordjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emailjLabel)
                            .addComponent(emailjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(phoneNojLabel)
                            .addComponent(phoneNojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addressjLabel)
                            .addComponent(addressjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addComponent(updatejButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButtonActionPerformed
        // TODO add your handling code here:
        userProcessJpanel.remove(this);

        Component[] components = userProcessJpanel.getComponents();
        ManageOrganizationJPanel manageOrganizationsJPanel = (ManageOrganizationJPanel) components[components.length-1];
        manageOrganizationsJPanel.populateData();

        CardLayout cardLayout = (CardLayout) userProcessJpanel.getLayout();
        cardLayout.previous(userProcessJpanel);
    }//GEN-LAST:event_backjButtonActionPerformed

    private void uploadjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadjButtonActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File("/"));
        fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("Jpeg format", "jpeg"));
        fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("Jpg format", "jpg"));
        fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("Png format", "png"));
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            imagePath = selectedFile.getAbsolutePath();
            setPhoto(imagePath);
        }
    }//GEN-LAST:event_uploadjButtonActionPerformed

    private void updatejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatejButtonActionPerformed
        // TODO add your handling code here:
        if(isDataEnteredValid()) {

            if(UserNameHelper.isUserNameAlreadyExisted(ecoSystem, userNamejTextField.getText())) {
                JOptionPane.showMessageDialog(this, "UserName already Exists in the Ecosystem.");
                return;
            }
            if(EmailHelper.isEmailAlreadyExisted(ecoSystem, emailjTextField.getText())) {
                JOptionPane.showMessageDialog(this, "Email already Exists in the Ecosystem.");
                return;
            }
            if(PhoneNoHelper.isPhoneNoAlreadyExisted(ecoSystem, phoneNojTextField.getText())) {
                JOptionPane.showMessageDialog(this, "PhoneNo already Exists in the Ecosystem.");
                return;
            }

            orgManager.setName(namejTextField.getText());
            orgManager.setUserName(userNamejTextField.getText());
            orgManager.setPassword(passwordjTextField.getText());
            orgManager.setEmail(emailjTextField.getText());
            orgManager.setPhoneNo(phoneNojTextField.getText());
            orgManager.setAddress(addressjTextField.getText());

            JOptionPane.showMessageDialog(this, "Successfully saved new Organization Manager");
        }else{
            JOptionPane.showMessageDialog(this, "Error saving new Organization Manager. Please check DataTypes");
        }
    }//GEN-LAST:event_updatejButtonActionPerformed
    private boolean isDataEnteredValid() {
        if(namejTextField.getText().matches("^[a-zA-Z0-9 ']+$") && userNamejTextField.getText().matches("^[a-zA-Z0-9]+$") && 
                emailjTextField.getText().matches("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$") && 
                !phoneNojTextField.getText().isEmpty() && phoneNojTextField.getText().matches("^[0-9]+$") 
                && phoneNojTextField.getText().length()==10 && passwordjTextField.getText().matches("^[a-zA-Z0-9]+$"))  {
           return true; 
        }
        return false;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressjLabel;
    private javax.swing.JTextField addressjTextField;
    private javax.swing.JButton backjButton;
    private javax.swing.JLabel emailjLabel;
    private javax.swing.JTextField emailjTextField;
    private javax.swing.JLabel headerjLabel;
    private javax.swing.JLabel namejLabel;
    private javax.swing.JTextField namejTextField;
    private javax.swing.JLabel passwordjLabel;
    private javax.swing.JTextField passwordjTextField;
    private javax.swing.JLabel phoneNojLabel;
    private javax.swing.JTextField phoneNojTextField;
    private javax.swing.JLabel picHolderjLabel;
    private javax.swing.JButton updatejButton;
    private javax.swing.JButton uploadjButton;
    private javax.swing.JLabel userNamejLabel;
    private javax.swing.JTextField userNamejTextField;
    // End of variables declaration//GEN-END:variables
}