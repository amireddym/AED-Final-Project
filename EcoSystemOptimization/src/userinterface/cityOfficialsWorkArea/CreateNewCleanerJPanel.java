/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.cityOfficialsWorkArea;

import businesslogic.CityNetwork;
import businesslogic.EcoSystem;
import businesslogic.User;
import businesslogic.cleaner.Cleaner;
import businesslogic.enums.UserRole;
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
 * @author anshitaverma
 */
public class CreateNewCleanerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateNewCleanerJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem ecoSystem;
    private User userAccount;
    private CityNetwork cityNetwork;
    //add default image
    private String imagepath;
    public CreateNewCleanerJPanel(JPanel userProcessContainer, EcoSystem ecoSystem, User userAccount, CityNetwork cityNetwork) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = ecoSystem;
        this.userAccount  = userAccount;
        this.cityNetwork = cityNetwork;
        picHolderjLabel.setSize(126, 139);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        picHolderjLabel = new javax.swing.JLabel();
        uploadbtn = new javax.swing.JButton();
        nametxt = new javax.swing.JTextField();
        phoneNumbertxt = new javax.swing.JTextField();
        emailIdtxt = new javax.swing.JTextField();
        addresstxt = new javax.swing.JTextField();
        usernametxt = new javax.swing.JTextField();
        passwordtxt = new javax.swing.JTextField();
        savebtn = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();

        jLabel1.setText("Create New Cleaner");

        jLabel2.setText("Name:");

        jLabel3.setText("Address:");

        jLabel4.setText("Email Id:");

        jLabel5.setText("Phone Number:");

        jLabel6.setText("UserName:");

        jLabel7.setText("Password:");

        picHolderjLabel.setText("     <Image>");
        picHolderjLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        uploadbtn.setText("Upload");
        uploadbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadbtnActionPerformed(evt);
            }
        });

        passwordtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordtxtActionPerformed(evt);
            }
        });

        savebtn.setText("Save");
        savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtnActionPerformed(evt);
            }
        });

        backbtn.setText("Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel6))))
                                .addGap(77, 77, 77)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(phoneNumbertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addresstxt, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(emailIdtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(usernametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(passwordtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(uploadbtn))
                            .addComponent(picHolderjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(backbtn)
                        .addGap(137, 137, 137)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(savebtn)
                            .addComponent(jLabel1))))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(backbtn))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(phoneNumbertxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addresstxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(emailIdtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(usernametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(passwordtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(savebtn)
                        .addContainerGap(54, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(picHolderjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(uploadbtn)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void savebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtnActionPerformed
        // TODO add your handling code here:
           if(isDataEnteredValid()) {
            String name = nametxt.getText();
            String userName = usernametxt.getText();
            String address=addresstxt.getText();
            
            String password = passwordtxt.getText();
            String email = emailIdtxt.getText();
            String phoneNo = phoneNumbertxt.getText();

            Cleaner cleaner = new Cleaner(name, phoneNo, email, address,userName, password, UserRole.Cleaner,imagepath,
                new Date(), new Date(), userAccount.getName(), userAccount.getName());
            cityNetwork.getCleanersDirectory().getCleaners().add(cleaner);

            JOptionPane.showMessageDialog(this, "Successfully Saved ");
            resetUi();
        }else{
            JOptionPane.showMessageDialog(this, "Error! Please enter valid values");
        }
    }//GEN-LAST:event_savebtnActionPerformed

    private void uploadbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadbtnActionPerformed
        // TODO add your handling code here:
        
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File("/"));
        fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("Jpeg format", "jpeg"));
        fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("Jpg format", "jpg"));
        fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("Png format", "png"));
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            imagepath = selectedFile.getAbsolutePath();
            setPhoto(imagepath);
        }
    }//GEN-LAST:event_uploadbtnActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] components = userProcessContainer.getComponents();
        ManageCleanersJPanel manageCleanersJPanel = (ManageCleanersJPanel) components[components.length-1];
        manageCleanersJPanel.populateData();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backbtnActionPerformed

    private void passwordtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordtxtActionPerformed
   
       private boolean isDataEnteredValid() {
        if(nametxt.getText().matches("^[a-zA-Z0-9 ']+$") && usernametxt.getText().matches("^[a-zA-Z0-9]+$") && 
                emailIdtxt.getText().matches("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$") && 
                !phoneNumbertxt.getText().isEmpty() && phoneNumbertxt.getText().matches("^[0-9]+$") 
                && phoneNumbertxt.getText().length()==10 && passwordtxt.getText().matches("^[a-zA-Z0-9]+$")
                &&!addresstxt.getText().isEmpty())  {
           return true; 
        }
        return false;
    } 
    
    
    private void resetUi() {
        
        nametxt.setText("");
        usernametxt.setText("");
        addresstxt.setText("");
        passwordtxt.setText("");
        emailIdtxt.setText("");
        phoneNumbertxt.setText("");
        setDefaultPhoto();
        
    }
    
    //have to make changes
     private void setDefaultPhoto() {
        
       // setPhoto(Paths.get(Constants.DEFAULT_PROFILE_IMAGE_PATH).toAbsolutePath().toString());
    }

    private void setPhoto(String imagePath) {
        ImageIcon photo = new ImageIcon(imagePath);
        Image photoResized = photo.getImage().getScaledInstance(picHolderjLabel.getWidth(), picHolderjLabel.getHeight(),4);
        picHolderjLabel.setIcon(new ImageIcon(photoResized));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addresstxt;
    private javax.swing.JButton backbtn;
    private javax.swing.JTextField emailIdtxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField nametxt;
    private javax.swing.JTextField passwordtxt;
    private javax.swing.JTextField phoneNumbertxt;
    private javax.swing.JLabel picHolderjLabel;
    private javax.swing.JButton savebtn;
    private javax.swing.JButton uploadbtn;
    private javax.swing.JTextField usernametxt;
    // End of variables declaration//GEN-END:variables
}
