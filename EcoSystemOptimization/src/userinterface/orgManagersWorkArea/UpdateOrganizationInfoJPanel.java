/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.orgManagersWorkArea;

import businesslogic.EcoSystem;
import businesslogic.User;
import businesslogic.enums.OrganizationType;
import businesslogic.helper.Constants;
import businesslogic.helper.EmailHelper;
import businesslogic.helper.PhoneNoHelper;
import businesslogic.organization.Organization;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author manojreddy
 */
public class UpdateOrganizationInfoJPanel extends javax.swing.JPanel {

    /**
     * Creates new form UpdateOrganizationInfoJPanel
     */
    
    private JPanel userProcessJpanel;
    private EcoSystem ecoSystem;
    private Organization organization;
    private User userLogged;
    
    private String imagePath;
    
    public UpdateOrganizationInfoJPanel(JPanel userProcessJpanel, EcoSystem ecoSystem, Organization organization, User userLogged) {
        initComponents();
        this.userProcessJpanel = userProcessJpanel;
        this.ecoSystem = ecoSystem;
        this.organization = organization;
        this.userLogged = userLogged;
        
        picHolderjLabel.setSize(126, 139);
        populateData();
    }

    private void populateData() {
        
        namejTextField.setText(organization.getOrganizationName());
        emailjTextField.setText(organization.getEmail());
        addressjTextField.setText(organization.getAddress());
        phoneNojTextField.setText(organization.getPhoneNo());
        imagePath = organization.getOrganizationImage();
        
        String[] organizationTypes  = OrganizationType.getOrganizationTypesArray();
        organizationTypejComboBox.removeAllItems();
        for(String organizationType: organizationTypes) {
            organizationTypejComboBox.addItem(organizationType);
        }
        
        organizationTypejComboBox.setSelectedItem(organization.getOrganizationType().name());
        
        setPhoto(imagePath);
    }
    
    private void setPhoto(String imagePath) {
        
        if(imagePath.equals(Constants.DEFAULT_ORGANIZATION_IMAGE_PATH)){
            ImageIcon photo = new ImageIcon(getClass().getResource(imagePath).getPath());
            Image photoResized = photo.getImage().getScaledInstance(picHolderjLabel.getWidth(), picHolderjLabel.getHeight(),4);
            picHolderjLabel.setIcon(new ImageIcon(photoResized));
            return;
        }
        ImageIcon photo = new ImageIcon(imagePath);
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

        organizationTypejComboBox = new javax.swing.JComboBox<>();
        headerjLabel = new javax.swing.JLabel();
        addressjTextField = new javax.swing.JTextField();
        emailjLabel = new javax.swing.JLabel();
        backjButton = new javax.swing.JButton();
        namejLabel = new javax.swing.JLabel();
        phoneNojTextField = new javax.swing.JTextField();
        uploadjButton = new javax.swing.JButton();
        picHolderjLabel = new javax.swing.JLabel();
        updatejButton = new javax.swing.JButton();
        emailjTextField = new javax.swing.JTextField();
        phoneNojLabel = new javax.swing.JLabel();
        organizationTypejLabel = new javax.swing.JLabel();
        namejTextField = new javax.swing.JTextField();
        addressjLabel = new javax.swing.JLabel();

        organizationTypejComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationTypejComboBoxActionPerformed(evt);
            }
        });

        headerjLabel.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        headerjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerjLabel.setText("Update Organization");

        emailjLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        emailjLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        emailjLabel.setText("Email :");

        backjButton.setText("< < Back");
        backjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButtonActionPerformed(evt);
            }
        });

        namejLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        namejLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        namejLabel.setText("Name :");

        uploadjButton.setText("upload");
        uploadjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadjButtonActionPerformed(evt);
            }
        });

        picHolderjLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        updatejButton.setText("Update");
        updatejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatejButtonActionPerformed(evt);
            }
        });

        phoneNojLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        phoneNojLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        phoneNojLabel.setText("Phone No :");

        organizationTypejLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        organizationTypejLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        organizationTypejLabel.setText("Organization Type :");

        addressjLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        addressjLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        addressjLabel.setText("Address :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(organizationTypejLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(updatejButton))
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
                                            .addComponent(phoneNojLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(addressjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(35, 35, 35)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(organizationTypejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(phoneNojTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                                            .addComponent(addressjTextField)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(namejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(35, 35, 35)
                                            .addComponent(namejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(emailjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(35, 35, 35)
                                            .addComponent(emailjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(picHolderjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(uploadjButton)))))
                .addContainerGap(199, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(headerjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(backjButton))
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(namejLabel)
                            .addComponent(namejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emailjLabel)
                            .addComponent(emailjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(phoneNojLabel)
                            .addComponent(phoneNojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(picHolderjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(uploadjButton)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressjLabel)
                    .addComponent(addressjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(organizationTypejLabel)
                    .addComponent(organizationTypejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(updatejButton)
                .addContainerGap(102, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void organizationTypejComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationTypejComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_organizationTypejComboBoxActionPerformed

    private void backjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButtonActionPerformed
        // TODO add your handling code here:
        userProcessJpanel.remove(this);

        Component[] components = userProcessJpanel.getComponents();
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

            if(EmailHelper.isEmailAlreadyExisted(ecoSystem, emailjTextField.getText())) {
                JOptionPane.showMessageDialog(this, "Email already Exists in the Ecosystem.");
                return;
            }

            if(PhoneNoHelper.isPhoneNoAlreadyExisted(ecoSystem, phoneNojTextField.getText())) {
                JOptionPane.showMessageDialog(this, "PhoneNo already Exists in the Ecosystem.");
                return;
            }

            organization.setOrganizationName(namejTextField.getText());
            organization.setEmail(emailjTextField.getText());
            organization.setPhoneNo(phoneNojTextField.getText());
            organization.setAddress(addressjTextField.getText());
            organization.setOrganizationImage(imagePath);
            organization.setOrganizationType(OrganizationType.valueOf((String) organizationTypejComboBox.getSelectedItem()));

            JOptionPane.showMessageDialog(this, "Successfully saved Organization");
        }else{
            JOptionPane.showMessageDialog(this, "Error saving Organization. Please check DataTypes");
        }
    }//GEN-LAST:event_updatejButtonActionPerformed

    private boolean isDataEnteredValid() {
        if(namejTextField.getText().matches("^[a-zA-Z0-9 ']+$") && 
                emailjTextField.getText().matches("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$") && 
                !phoneNojTextField.getText().isEmpty() && phoneNojTextField.getText().matches("^[0-9]+$") )  {
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
    private javax.swing.JComboBox<String> organizationTypejComboBox;
    private javax.swing.JLabel organizationTypejLabel;
    private javax.swing.JLabel phoneNojLabel;
    private javax.swing.JTextField phoneNojTextField;
    private javax.swing.JLabel picHolderjLabel;
    private javax.swing.JButton updatejButton;
    private javax.swing.JButton uploadjButton;
    // End of variables declaration//GEN-END:variables
}
