/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.systemAdminsWorkArea;

import businesslogic.CityNetwork;
import businesslogic.DB4OUtil.DB4OUtil;
import businesslogic.EcoSystem;
import businesslogic.User;
import businesslogic.enums.OrganizationType;
import businesslogic.helper.Constants;
import businesslogic.helper.EmailHelper;
import businesslogic.helper.PhoneNoHelper;
import businesslogic.helper.ValidateInputs;
import businesslogic.organization.Organization;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Image;
import java.io.File;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author manojreddy
 */
public class CreateNewOrganizationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateNewOrganizationJPanel
     */
    
    private JPanel userProcessJpanel;
    private EcoSystem ecoSystem;
    private CityNetwork cityNetwork;
    private User userLogged;
    private static final Logger logger = Logger.getLogger(CreateNewOrganizationJPanel.class.getName());
    private String imagePath = Constants.DEFAULT_ORGANIZATION_IMAGE_PATH;
    
    public CreateNewOrganizationJPanel(JPanel userProcessJpanel, EcoSystem ecoSystem, CityNetwork cityNetwork, User userLogged) {
        initComponents();
        this.userProcessJpanel = userProcessJpanel;
        this.ecoSystem = ecoSystem;
        this.cityNetwork = cityNetwork;
        this.userLogged = userLogged;
        
        picHolderjLabel.setSize(126, 139);
        poupulateOrganizationTypes();
        setDefaultPhoto();
    }

    private void poupulateOrganizationTypes() {
        
        organizationTypejComboBox.removeAllItems();
        
        String[] organizationTypes = OrganizationType.getOrganizationTypesArray();
        for(String organizationType:organizationTypes) {
            organizationTypejComboBox.addItem(organizationType);
        }
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
        namejTextField = new javax.swing.JTextField();
        addressjLabel = new javax.swing.JLabel();
        addressjTextField = new javax.swing.JTextField();
        picHolderjLabel = new javax.swing.JLabel();
        emailjLabel = new javax.swing.JLabel();
        uploadjButton = new javax.swing.JButton();
        emailjTextField = new javax.swing.JTextField();
        phoneNojLabel = new javax.swing.JLabel();
        organizationTypejLabel = new javax.swing.JLabel();
        organizationTypejComboBox = new javax.swing.JComboBox<>();

        backjButton.setText("< < Back");
        backjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButtonActionPerformed(evt);
            }
        });

        headerjLabel.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        headerjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerjLabel.setText("Create New Organization");

        namejLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        namejLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        namejLabel.setText("Name :");

        savejButton.setText("Save");
        savejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savejButtonActionPerformed(evt);
            }
        });

        addressjLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        addressjLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        addressjLabel.setText("Address :");

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

        organizationTypejLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        organizationTypejLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        organizationTypejLabel.setText("Organization Type :");

        organizationTypejComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationTypejComboBoxActionPerformed(evt);
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
                                .addGap(506, 506, 506)
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
                                    .addComponent(addressjTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                                    .addComponent(phoneNojTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                                    .addComponent(organizationTypejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(namejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(namejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(100, 100, 100)
                                .addComponent(picHolderjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(savejButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(organizationTypejLabel)))
                .addContainerGap(179, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addressjTextField, emailjTextField, namejTextField, phoneNojTextField});

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
                        .addGap(21, 21, 21)
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
                            .addComponent(addressjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(organizationTypejLabel)
                    .addComponent(organizationTypejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(savejButton)
                .addContainerGap(126, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButtonActionPerformed
        // TODO add your handling code here:
        logger.log(Level.INFO, "Back buttton pressed");
        userProcessJpanel.remove(this);

        Component[] components = userProcessJpanel.getComponents();
        ManageOrganizationsJPanel manageOrganizationsJPanel = (ManageOrganizationsJPanel) components[components.length-1];
        manageOrganizationsJPanel.populateOrganizations();

        CardLayout cardLayout = (CardLayout) userProcessJpanel.getLayout();
        cardLayout.previous(userProcessJpanel);
    }//GEN-LAST:event_backjButtonActionPerformed

    private void savejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savejButtonActionPerformed
        // TODO add your handling code here:
        logger.log(Level.INFO, "Save buttton pressed");
        if(isDataEnteredValid()) {

            if(EmailHelper.isEmailAlreadyExisted(ecoSystem, emailjTextField.getText())) {
                JOptionPane.showMessageDialog(this, "Email already Exists in the Ecosystem.");
                return;
            }
            
            if(PhoneNoHelper.isPhoneNoAlreadyExisted(ecoSystem, phoneNojTextField.getText())) {
                JOptionPane.showMessageDialog(this, "PhoneNo already Exists in the Ecosystem.");
                return;
            }

            String name = namejTextField.getText();
            String email = emailjTextField.getText();
            String phoneNo = phoneNojTextField.getText();
            String address = addressjTextField.getText();
            OrganizationType organizationType = OrganizationType.valueOf((String) organizationTypejComboBox.getSelectedItem());

            Organization organization = new Organization(name, organizationType, address, phoneNo, email, imagePath,
                new Date(), new Date(), userLogged.getName(), userLogged.getName());
            cityNetwork.getOrganizationDirectory().getOrganizations().add(organization);

            JOptionPane.showMessageDialog(this, "Successfully saved new Organization");
            resetUi();
        }else{
            JOptionPane.showMessageDialog(this, "Error saving new Organization. Please check DataTypes");
        }
    }//GEN-LAST:event_savejButtonActionPerformed

    private boolean isDataEnteredValid() {
        if(ValidateInputs.isNameValid(namejTextField.getText()) && 
                ValidateInputs.isEmailValid(emailjTextField.getText()) 
                && ValidateInputs.isPhoneNumberValid(phoneNojTextField.getText())
                && ValidateInputs.isAddressValid(addressjTextField.getText()))  {
           return true; 
        }
        return false;
    }
    
    private void resetUi() {
        
        namejTextField.setText("");
        emailjTextField.setText("");
        phoneNojTextField.setText("");
        addressjTextField.setText("");
        organizationTypejComboBox.setSelectedIndex(0);
        
        setDefaultPhoto();
    }
    
    private void setDefaultPhoto() {
        
        setPhoto(getClass().getResource(Constants.DEFAULT_ORGANIZATION_IMAGE_PATH).getPath());
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

    private void setPhoto(String imagePath) {
        ImageIcon photo = new ImageIcon(imagePath);
        Image photoResized = photo.getImage().getScaledInstance(picHolderjLabel.getWidth(), picHolderjLabel.getHeight(),4);
        picHolderjLabel.setIcon(new ImageIcon(photoResized));
    }
    
    private void organizationTypejComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationTypejComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_organizationTypejComboBoxActionPerformed


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
    private javax.swing.JButton savejButton;
    private javax.swing.JButton uploadjButton;
    // End of variables declaration//GEN-END:variables
}
