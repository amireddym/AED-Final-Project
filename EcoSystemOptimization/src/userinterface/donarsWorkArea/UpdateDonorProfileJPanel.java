/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.donarsWorkArea;

import userinterface.systemAdminsWorkArea.*;
import businesslogic.EcoSystem;
import businesslogic.User;
import businesslogic.enums.UserRole;
import businesslogic.helper.Constants;
import businesslogic.helper.EmailHelper;
import businesslogic.helper.PhoneNoHelper;
import businesslogic.helper.UserNameHelper;
import businesslogic.helper.ValidateInputs;
import businesslogic.sysAdmin.SysAdmin;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Image;
import java.io.File;
import java.nio.file.Paths;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author manojreddy
 */
public class UpdateDonorProfileJPanel extends javax.swing.JPanel {

    /**
     * Creates new form UpdateSysAdminJPanel
     */
    
    private JPanel userProcessJpanel;
    private EcoSystem ecoSystem;
    private User userLogged;
    
    private String imagePath;
    
    public UpdateDonorProfileJPanel(JPanel userProcessJpanel, EcoSystem ecoSystem, User userLogged) {
        initComponents();
        this.userProcessJpanel = userProcessJpanel;
        this.ecoSystem = ecoSystem;
        this.userLogged = userLogged;
        
        picHolderjLabel.setSize(126, 139);
        populateData();
    }

    private void populateData() {
        
        namejTextField.setText(userLogged.getName());
        userNamejTextField.setText(userLogged.getUserName());
        passwordjTextField.setText(userLogged.getPassword());
        phoneNojTextField.setText(userLogged.getPhoneNo());
        emailjTextField.setText(userLogged.getEmail());
        addressjTextField.setText(userLogged.getAddress());
        imagePath = userLogged.getProfilePic();
        
        setPhoto(userLogged.getProfilePic());
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
        phoneNojTextField = new javax.swing.JTextField();
        headerjLabel = new javax.swing.JLabel();
        namejLabel = new javax.swing.JLabel();
        updatejButton = new javax.swing.JButton();
        userNamejTextField = new javax.swing.JTextField();
        userNamejLabel = new javax.swing.JLabel();
        namejTextField = new javax.swing.JTextField();
        addressjLabel = new javax.swing.JLabel();
        passwordjLabel = new javax.swing.JLabel();
        addressjTextField = new javax.swing.JTextField();
        passwordjTextField = new javax.swing.JTextField();
        emailjLabel = new javax.swing.JLabel();
        picHolderjLabel = new javax.swing.JLabel();
        emailjTextField = new javax.swing.JTextField();
        uploadjButton = new javax.swing.JButton();
        phoneNojLabel = new javax.swing.JLabel();

        backjButton.setText("< < Back");
        backjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButtonActionPerformed(evt);
            }
        });

        headerjLabel.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        headerjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerjLabel.setText("Update Donor Profile");

        namejLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        namejLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        namejLabel.setText("Name :");

        updatejButton.setText("Update");
        updatejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatejButtonActionPerformed(evt);
            }
        });

        userNamejLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        userNamejLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        userNamejLabel.setText("User Name :");

        addressjLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        addressjLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        addressjLabel.setText("Address :");

        passwordjLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        passwordjLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        passwordjLabel.setText("Password :");

        emailjLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        emailjLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        emailjLabel.setText("Email :");

        picHolderjLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        uploadjButton.setText("upload");
        uploadjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadjButtonActionPerformed(evt);
            }
        });

        phoneNojLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        phoneNojLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        phoneNojLabel.setText("Phone No :");

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
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(emailjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(namejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(phoneNojLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(userNamejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(passwordjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(passwordjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(phoneNojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(emailjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(userNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(namejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(188, 188, 188)
                                        .addComponent(uploadjButton))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(158, 158, 158)
                                        .addComponent(picHolderjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addressjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(addressjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(377, 377, 377)
                        .addComponent(updatejButton)))
                .addGap(65, 65, 65))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addressjTextField, emailjTextField, namejTextField, passwordjTextField, phoneNojTextField, userNamejTextField});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addressjLabel, emailjLabel, namejLabel, passwordjLabel, phoneNojLabel, userNamejLabel});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(backjButton))
                    .addComponent(headerjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(picHolderjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(namejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(userNamejLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(namejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(userNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(passwordjTextField)
                            .addComponent(passwordjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emailjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailjLabel))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(uploadjButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(phoneNojLabel))
                            .addComponent(phoneNojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(addressjLabel))
                            .addComponent(addressjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(46, 46, 46)
                .addComponent(updatejButton)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {addressjTextField, emailjTextField, namejTextField, passwordjTextField, phoneNojTextField, userNamejTextField});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {addressjLabel, emailjLabel, namejLabel, phoneNojLabel, userNamejLabel});

    }// </editor-fold>//GEN-END:initComponents

    private void backjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButtonActionPerformed
        // TODO add your handling code here:
        userProcessJpanel.remove(this);
        CardLayout cardLayout = (CardLayout) userProcessJpanel.getLayout();
        cardLayout.previous(userProcessJpanel);
    }//GEN-LAST:event_backjButtonActionPerformed

    private void updatejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatejButtonActionPerformed
        // TODO add your handling code here:
        if(isDataEnteredValid()) {

            if(!userLogged.getUserName().equals(userNamejTextField.getText()) && UserNameHelper.isUserNameAlreadyExisted(ecoSystem, userNamejTextField.getText())) {
                JOptionPane.showMessageDialog(this, "UserName already Exists in the Ecosystem.");
                return;
            }
            if(!userLogged.getEmail().equals(emailjTextField.getText()) && EmailHelper.isEmailAlreadyExisted(ecoSystem, emailjTextField.getText())) {
                JOptionPane.showMessageDialog(this, "Email already Exists in the Ecosystem.");
                return;
            }
            if(!userLogged.getPhoneNo().equals(phoneNojTextField.getText()) && PhoneNoHelper.isPhoneNoAlreadyExisted(ecoSystem, phoneNojTextField.getText())) {
                JOptionPane.showMessageDialog(this, "PhoneNo already Exists in the Ecosystem.");
                return;
            }

            userLogged.setName(namejTextField.getText());
            userLogged.setUserName(userNamejTextField.getText());
            userLogged.setPassword(passwordjTextField.getText());
            userLogged.setEmail(emailjTextField.getText());
            userLogged.setPhoneNo(phoneNojTextField.getText());
            userLogged.setAddress(addressjTextField.getText());
            userLogged.setProfilePic(imagePath);
            userLogged.setLastUpdatedDate(new Date());
            userLogged.setModifiedBy(userLogged.getUserName());
            JOptionPane.showMessageDialog(this, "Successfully updated the Donor Profile");
        }else{
            JOptionPane.showMessageDialog(this, "Error saving Donor Profile. Please check DataTypes");
        }
    }//GEN-LAST:event_updatejButtonActionPerformed

    private boolean isDataEnteredValid() {
        if(ValidateInputs.isNameValid(namejTextField.getText()) && ValidateInputs.isUsernameValid(userNamejTextField.getText()) && 
                ValidateInputs.isEmailValid(emailjTextField.getText()) && ValidateInputs.isPhoneNumberValid(phoneNojTextField.getText())
                && ValidateInputs.isPasswordValid(passwordjTextField.getText()) && ValidateInputs.isAddressValid(addressjTextField.getText()))  {
           return true; 
        }
        return false;
    }
    
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
