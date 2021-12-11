/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.systemAdminsWorkArea;

import businesslogic.EcoSystem;
import businesslogic.User;
import businesslogic.enums.UserRole;
import businesslogic.helper.Constants;
import businesslogic.helper.EmailHelper;
import businesslogic.helper.PhoneNoHelper;
import businesslogic.helper.UserNameHelper;
import businesslogic.helper.ValidateInputs;
import businesslogic.organization.OrgManager;
import businesslogic.organization.Organization;
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
public class CreateOrganizationManagerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateOrganizationManagerJPanel
     */
    
    private JPanel userProcessJpanel;
    private EcoSystem ecoSystem;
    private Organization organization;
    private User userLogged;
    
    private String imagePath = Constants.DEFAULT_PROFILE_IMAGE_PATH;
    
    public CreateOrganizationManagerJPanel(JPanel userProcessJpanel, EcoSystem ecoSystem, Organization organization, User userLogged) {
        initComponents();
        this.userProcessJpanel = userProcessJpanel;
        this.ecoSystem = ecoSystem; 
        this.organization = organization;
        this.userLogged = userLogged;
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
        savejButton = new javax.swing.JButton();
        userNamejTextField = new javax.swing.JTextField();
        userNamejLabel = new javax.swing.JLabel();
        namejTextField = new javax.swing.JTextField();
        addressjLabel = new javax.swing.JLabel();
        passwordjLabel = new javax.swing.JLabel();
        addressjTextField = new javax.swing.JTextField();
        passwordjTextField = new javax.swing.JTextField();
        picHolderjLabel = new javax.swing.JLabel();
        emailjLabel = new javax.swing.JLabel();
        uploadjButton = new javax.swing.JButton();
        emailjTextField = new javax.swing.JTextField();
        phoneNojLabel = new javax.swing.JLabel();

        backjButton.setText("< < Back");
        backjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButtonActionPerformed(evt);
            }
        });

        headerjLabel.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        headerjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerjLabel.setText("Create New Organization Manager");

        namejLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        namejLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        namejLabel.setText("Name :");

        savejButton.setText("Save");
        savejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savejButtonActionPerformed(evt);
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

        picHolderjLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        emailjLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        emailjLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        emailjLabel.setText("Email :");

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
                        .addComponent(savejButton)))
                .addGap(251, 269, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addressjTextField, emailjTextField, namejTextField, passwordjTextField, phoneNojTextField, userNamejTextField});

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
                        .addComponent(savejButton)))
                .addContainerGap(79, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButtonActionPerformed
        // TODO add your handling code here:
        userProcessJpanel.remove(this);

        Component[] components = userProcessJpanel.getComponents();
        ManageOrganizationsJPanel manageOrganizationsJPanel = (ManageOrganizationsJPanel) components[components.length-1];
        manageOrganizationsJPanel.populateOrganizations();

        CardLayout cardLayout = (CardLayout) userProcessJpanel.getLayout();
        cardLayout.previous(userProcessJpanel);
    }//GEN-LAST:event_backjButtonActionPerformed

    private void savejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savejButtonActionPerformed
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

            String name = namejTextField.getText();
            String userName = userNamejTextField.getText();
            String password = passwordjTextField.getText();
            String email = emailjTextField.getText();
            String phoneNo = phoneNojTextField.getText();
            String address = addressjTextField.getText();

            OrgManager orgManager = new OrgManager(name, phoneNo, email, address, userName, password, UserRole.OrgManager, imagePath,
                new Date(), new Date(), userLogged.getName(), userLogged.getName());
            organization.getOrgManagerDirectory().getOrgManagers().add(orgManager);
            
            JOptionPane.showMessageDialog(this, "Successfully saved new Organization Manager");
            resetUi();
        }else{
            JOptionPane.showMessageDialog(this, "Error saving new Organization Manager. Please check DataTypes");
        }
    }//GEN-LAST:event_savejButtonActionPerformed

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

    private void resetUi() {
        
        namejTextField.setText("");
        userNamejTextField.setText("");
        passwordjTextField.setText("");
        emailjTextField.setText("");
        phoneNojTextField.setText("");
        addressjTextField.setText("");
        
        setDefaultPhoto();
    }
    
    private void setDefaultPhoto() {
        
        setPhoto(Paths.get(Constants.DEFAULT_PROFILE_IMAGE_PATH).toAbsolutePath().toString());
    }
    
    private void setPhoto(String imagePath) {
        ImageIcon photo = new ImageIcon(imagePath);
        Image photoResized = photo.getImage().getScaledInstance(picHolderjLabel.getWidth(), picHolderjLabel.getHeight(),4);
        picHolderjLabel.setIcon(new ImageIcon(photoResized));
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
    private javax.swing.JButton savejButton;
    private javax.swing.JButton uploadjButton;
    private javax.swing.JLabel userNamejLabel;
    private javax.swing.JTextField userNamejTextField;
    // End of variables declaration//GEN-END:variables
}
