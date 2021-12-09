/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.donarsWorkArea;

import businesslogic.CityName;
import businesslogic.CityNetwork;
import userinterface.systemAdminsWorkArea.*;
import businesslogic.EcoSystem;
import businesslogic.User;
import businesslogic.donor.Donor;
import businesslogic.enums.Category;
import businesslogic.enums.PickUp;
import businesslogic.enums.UsageStatus;
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
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author manojreddy
 */
public class MakeNewDonationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form UpdateSysAdminJPanel
     */
    
    private JPanel userProcessJpanel;
    private EcoSystem ecoSystem;
    private User userLogged;
    private Donor donor;
    private String imagePath = Constants.DEFAULT_IMAGE_PATH;
    
    /**
     * Creates new form MakeNewDonationJPanel
     */
    public MakeNewDonationJPanel(JPanel userProcessJpanel, EcoSystem ecoSystem, User userLogged) {
        initComponents();
        this.userProcessJpanel = userProcessJpanel;
        this.ecoSystem = ecoSystem;
        this.userLogged = userLogged;
        this.donor = (Donor) userLogged;
        
        populateCategories();
        populateCities();
        populatePickUpMode();
        populateUsageStatus();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usageStatusjComboBox = new javax.swing.JComboBox<>();
        lblpickupmode = new javax.swing.JLabel();
        pickupmodejComboBox = new javax.swing.JComboBox<>();
        lblselectfoodbank = new javax.swing.JLabel();
        selectfoodbankjComboBox = new javax.swing.JComboBox<>();
        txtlblpickupaddress = new javax.swing.JTextField();
        lblpickupaddress = new javax.swing.JLabel();
        txtlbldateOfExpiry = new javax.swing.JTextField();
        lbldateOfExpiry = new javax.swing.JLabel();
        lblinformation = new javax.swing.JLabel();
        headerjLabel = new javax.swing.JLabel();
        txtinformation = new javax.swing.JTextField();
        lblcity = new javax.swing.JLabel();
        donationcategoryjComboBox = new javax.swing.JComboBox<>();
        btnmakenewdonation = new javax.swing.JButton();
        lbldonationCategory = new javax.swing.JLabel();
        lblpicHolder = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        uploadjButton = new javax.swing.JButton();
        addCityjComboBox = new javax.swing.JComboBox<>();

        usageStatusjComboBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                usageStatusjComboBoxMousePressed(evt);
            }
        });

        lblpickupmode.setText("PickUp Mode:");

        pickupmodejComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pickupmodejComboBoxActionPerformed(evt);
            }
        });

        lblselectfoodbank.setText("Select Food Bank>>");

        selectfoodbankjComboBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                selectfoodbankjComboBoxMousePressed(evt);
            }
        });

        lblpickupaddress.setText("PickUp Address:");

        lbldateOfExpiry.setText("Date of Expiry:");

        lblinformation.setText("Information:");

        headerjLabel.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        headerjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerjLabel.setText("Please Select a Donation Category");

        lblcity.setText("City:");

        btnmakenewdonation.setText("Create Donation Request");
        btnmakenewdonation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmakenewdonationActionPerformed(evt);
            }
        });

        lbldonationCategory.setText("Donation Category:");

        lblpicHolder.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setText("Usage Status:");

        uploadjButton.setText("upload");
        uploadjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(256, 256, 256)
                    .addComponent(headerjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addComponent(lblpickupaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(12, 12, 12)
                    .addComponent(txtlblpickupaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(lbldateOfExpiry, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(43, 43, 43)
                    .addComponent(txtlbldateOfExpiry, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addComponent(lblpicHolder, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(183, 183, 183)
                    .addComponent(btnmakenewdonation, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createSequentialGroup()
                    .addGap(28, 28, 28)
                    .addComponent(uploadjButton)))
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblpickupmode, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(pickupmodejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblselectfoodbank)
                        .addGap(20, 20, 20)
                        .addComponent(selectfoodbankjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(lblcity, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblinformation, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(txtinformation, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbldonationCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(donationcategoryjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usageStatusjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addCityjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(headerjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblinformation, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtinformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(donationcategoryjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbldonationCategory)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(usageStatusjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pickupmodejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selectfoodbankjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblpickupmode)
                                    .addComponent(lblselectfoodbank)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblcity)
                                        .addComponent(addCityjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtlblpickupaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtlbldateOfExpiry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblpickupaddress)
                                    .addComponent(lbldateOfExpiry))))
                        .addGap(79, 79, 79)
                        .addComponent(lblpicHolder, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnmakenewdonation)
                        .addGap(100, 100, 100)))
                .addComponent(uploadjButton))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void usageStatusjComboBoxMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usageStatusjComboBoxMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_usageStatusjComboBoxMousePressed

    private void selectfoodbankjComboBoxMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectfoodbankjComboBoxMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectfoodbankjComboBoxMousePressed

    public void populateCategories() {
        
        donationcategoryjComboBox.removeAllItems();
        String[] categories = Category.getCategoriesArray();
        for(String category:categories) {
            donationcategoryjComboBox.addItem(category);
        }
    }
    
    public void populateUsageStatus() {
        
        usageStatusjComboBox.removeAllItems();
        String[] usageStatus = UsageStatus.getUsageStatusArray();
        for(String status:usageStatus) {
            usageStatusjComboBox.addItem(status);
        }
    }
    
    public void populatePickUpMode() {
        
        pickupmodejComboBox.removeAllItems();
        String[] modes = PickUp.getPickUpArray();
        for(String mode:modes) {
            pickupmodejComboBox.addItem(mode);
        }
        
        String selectedItem = (String) pickupmodejComboBox.getSelectedItem();
        if(selectedItem.equalsIgnoreCase("Home")) {
            selectfoodbankjComboBox.setEnabled(false);
        }else{
            selectfoodbankjComboBox.setEnabled(true);
        }
    }
    
    public void populateCities() {
        
        addCityjComboBox.removeAllItems();
        String[] cities = CityName.getCitiesArray();
        for(String city:cities) {
            addCityjComboBox.addItem(city);
        }
    }
    
    
    private void btnmakenewdonationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmakenewdonationActionPerformed
        //        int selectedIndex = donationcategoryjComboBox.getSelectedIndex();
        //        if(selectedIndex<0) {
            //            JOptionPane.showMessageDialog(this, "Please add a city to proceed further");
            //            return;
            //        }

        
    }//GEN-LAST:event_btnmakenewdonationActionPerformed

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
        Image photoResized = photo.getImage().getScaledInstance(lblpicHolder.getWidth(), lblpicHolder.getHeight(),4);        
        lblpicHolder.setIcon(new ImageIcon(photoResized));
    }
    
    private void pickupmodejComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pickupmodejComboBoxActionPerformed
        String selectedItem = (String) pickupmodejComboBox.getSelectedItem();
        if(selectedItem.equalsIgnoreCase("Home")) {
            selectfoodbankjComboBox.setEnabled(false);
        }else{
            selectfoodbankjComboBox.setEnabled(true);
        }
    }//GEN-LAST:event_pickupmodejComboBoxActionPerformed


    
       
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> addCityjComboBox;
    private javax.swing.JButton btnmakenewdonation;
    private javax.swing.JComboBox<String> donationcategoryjComboBox;
    private javax.swing.JLabel headerjLabel;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblcity;
    private javax.swing.JLabel lbldateOfExpiry;
    private javax.swing.JLabel lbldonationCategory;
    private javax.swing.JLabel lblinformation;
    private javax.swing.JLabel lblpicHolder;
    private javax.swing.JLabel lblpickupaddress;
    private javax.swing.JLabel lblpickupmode;
    private javax.swing.JLabel lblselectfoodbank;
    private javax.swing.JComboBox<String> pickupmodejComboBox;
    private javax.swing.JComboBox<String> selectfoodbankjComboBox;
    private javax.swing.JTextField txtinformation;
    private javax.swing.JTextField txtlbldateOfExpiry;
    private javax.swing.JTextField txtlblpickupaddress;
    private javax.swing.JButton uploadjButton;
    private javax.swing.JComboBox<String> usageStatusjComboBox;
    // End of variables declaration//GEN-END:variables
}
