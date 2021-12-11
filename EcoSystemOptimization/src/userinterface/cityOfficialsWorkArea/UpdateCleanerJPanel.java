/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

package userinterface.cityOfficialsWorkArea;


import businesslogic.User;
import businesslogic.cleaner.Cleaner;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Image;
import java.io.File;
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
public class UpdateCleanerJPanel extends javax.swing.JPanel {

    /** Creates new form UpdateCleanerJPanel */
    private JPanel userProcessContainer;
    private Cleaner cleaner;
    private User userAccount;
    private String imagePath;
    
    public UpdateCleanerJPanel(JPanel userProcessContainer, Cleaner cleaner, User userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.cleaner=cleaner;
        this.userAccount  = userAccount;
        picHolderjLabel.setSize(126, 139);
        populateData();
        
    }
    private void populateData(){
        nametxt.setText(cleaner.getName());
        phoneNumbertxt.setText(cleaner.getPhoneNo());
        emailIdtxt.setText(cleaner.getEmail());
        addresstxt.setText(cleaner.getAddress());
        usernametxt.setText(cleaner.getUserName());
        passwordtxt.setText(cleaner.getPassword());
        imagePath =cleaner.getProfilePic();
        setPhoto(cleaner.getProfilePic());
        
    
    }
    
      private void setPhoto(String profilePic) {
        
 
        ImageIcon photo = new ImageIcon(profilePic);
        Image photoResized = photo.getImage().getScaledInstance(picHolderjLabel.getWidth(), picHolderjLabel.getHeight(),4);
        picHolderjLabel.setIcon(new ImageIcon(photoResized));
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nametxt = new javax.swing.JTextField();
        phoneNumbertxt = new javax.swing.JTextField();
        emailIdtxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        addresstxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        usernametxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        passwordtxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        picHolderjLabel = new javax.swing.JLabel();
        uploadbtn = new javax.swing.JButton();
        updatebtn = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();

        jLabel1.setText("Update Cleaner");

        jLabel2.setText("Name:");

        jLabel3.setText("Phone Number:");

        jLabel4.setText("Email Id:");

        jLabel5.setText("Address:");

        jLabel6.setText("UserName:");

        jLabel7.setText("Password:");

        picHolderjLabel.setText("<Image>");

        uploadbtn.setText("Edit Picture");
        uploadbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadbtnActionPerformed(evt);
            }
        });

        updatebtn.setText("Update");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
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
                .addGap(17, 17, 17)
                .addComponent(backbtn)
                .addGap(163, 163, 163)
                .addComponent(jLabel1)
                .addContainerGap(326, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(188, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addGap(159, 159, 159))
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(passwordtxt, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(usernametxt, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addresstxt, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(emailIdtxt, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(phoneNumbertxt, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nametxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(78, 78, 78)
                        .addComponent(uploadbtn)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(updatebtn)
                        .addGap(309, 309, 309))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 542, Short.MAX_VALUE)
                    .addComponent(picHolderjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(23, 23, 23)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(backbtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(uploadbtn)
                        .addGap(132, 132, 132))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(phoneNumbertxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(emailIdtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(addresstxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(usernametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(passwordtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(updatebtn)
                        .addContainerGap())))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(46, 46, 46)
                    .addComponent(picHolderjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(191, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        // TODO add your handling code here:
        if(isDataEnteredValid()) {
            cleaner.setName(nametxt.getText());
            cleaner.setPhoneNo(phoneNumbertxt.getText());
         cleaner.setAddress(addresstxt.getText());
         cleaner.setEmail(emailIdtxt.getText());
         cleaner.setPassword(passwordtxt.getText());
            cleaner.setUserName(usernametxt.getText());
            cleaner.setModifiedBy(userAccount.getName());
            cleaner.setLastUpdatedDate(new Date());

            JOptionPane.showMessageDialog(this, "Successfully Updated ");
        }else {
            JOptionPane.showMessageDialog(this, "Error! Please enter valid values");
        }
    }//GEN-LAST:event_updatebtnActionPerformed

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
            imagePath = selectedFile.getAbsolutePath();
            setPhoto(imagePath);
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
    private javax.swing.JButton updatebtn;
    private javax.swing.JButton uploadbtn;
    private javax.swing.JTextField usernametxt;
    // End of variables declaration//GEN-END:variables

}
