/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.donarsWorkArea;

import businesslogic.CityNetwork;
import businesslogic.EcoSystem;
import businesslogic.User;
import businesslogic.donor.Donation;
import businesslogic.donor.Donor;
import businesslogic.enums.Category;
import businesslogic.enums.DonationStatus;
import java.awt.CardLayout;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author manojreddy
 */
public class ManageMyDonationsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SysAdminHomeJPanel
     */
    
    private JPanel userProcessJpanel;
    private EcoSystem ecoSystem;
    private User userLogged;
    private Donor donor;
    private static final Logger logger = Logger.getLogger(ManageMyDonationsJPanel.class.getName());
    
    public ManageMyDonationsJPanel(JPanel userProcessJpanel, EcoSystem ecoSystem, User userLogged) {
        initComponents();
        this.userProcessJpanel = userProcessJpanel;
        this.ecoSystem = ecoSystem;
        this.userLogged = userLogged;
        this.donor = (Donor) userLogged;

        populateCategories();
        populateDonationHistoryTable();
    }
    
    public void populateCategories() {
        
        donationcategoryjComboBox.removeAllItems();
        String[] categories = Category.getCategoriesArray();
        for(String category:categories) {
            donationcategoryjComboBox.addItem(category);
        }
    }
    
    
    public void populateDonationHistoryTable() {
        
//        int selectedIndex = donationcategoryjComboBox.getSelectedIndex();
//        if(selectedIndex<0) {
//            JOptionPane.showMessageDialog(this, "Please select a category to proceed further");
//            return;
//        }
//        
//        int selectedIndex2 = cityjComboBox.getSelectedIndex();
//        if(selectedIndex2<0) {
//            JOptionPane.showMessageDialog(this, "Please select a city to proceed further");
//            return;
//        }
        
        DefaultTableModel donationHistory = (DefaultTableModel) tbldonationHistory.getModel();
        donationHistory.setRowCount(0);
        
        int donationsCount=0;
        for(Donation donation:donor.getDonations()) {
            if (donation.getCategory().name().equalsIgnoreCase(donationcategoryjComboBox.getSelectedItem().toString())){
            donationsCount++;
            Object[] row = new Object[9];
            row[0]=donationsCount;
            row[1]=donation.getDonor().getName();
            row[2]=donation;
            row[3]=donation.getUsageStatus();
            row[4]=donation.getDonationStatus();
            row[5]=donation.getAddressToPickUp();
            row[6]=donation.getCityNetwork().getCityName().name();;
            row[7]=donation.getDeliveryVolunteer()==null?"Not yet assigned":donation.getDeliveryVolunteer().getName();
            row[8]=donation.getOrganization()==null?"Not yet assigned":donation.getOrganization();
            donationHistory.addRow(row);
            }
        }
        countTotaljLabel.setText(String.valueOf(donationsCount));        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        donationcategoryjComboBox = new javax.swing.JComboBox<>();
        btnmakenewdonation = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbldonationHistory = new javax.swing.JTable();
        countTotaljLabel = new javax.swing.JLabel();
        countLablejLabel = new javax.swing.JLabel();
        lbldonationCategory1 = new javax.swing.JLabel();
        headerjLabel = new javax.swing.JLabel();
        btnnviewOrUpdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        backjButton2 = new javax.swing.JButton();

        setLayout(null);

        donationcategoryjComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                donationcategoryjComboBoxActionPerformed(evt);
            }
        });
        add(donationcategoryjComboBox);
        donationcategoryjComboBox.setBounds(20, 100, 224, 27);

        btnmakenewdonation.setText("Make New Donation >>");
        btnmakenewdonation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmakenewdonationActionPerformed(evt);
            }
        });
        add(btnmakenewdonation);
        btnmakenewdonation.setBounds(790, 360, 180, 29);

        tbldonationHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "S.No", "Donor", "Information", "Usage Status", "Status", "To be PickedUp at", "City", "Delivery Volunteer", "Sent To (Org)"
            }
        ));
        jScrollPane1.setViewportView(tbldonationHistory);

        add(jScrollPane1);
        jScrollPane1.setBounds(20, 180, 950, 170);

        countTotaljLabel.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        countTotaljLabel.setText("0");
        add(countTotaljLabel);
        countTotaljLabel.setBounds(70, 370, 9, 16);

        countLablejLabel.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        countLablejLabel.setText("Count :");
        add(countLablejLabel);
        countLablejLabel.setBounds(20, 370, 47, 16);

        lbldonationCategory1.setText("Donation Category:");
        add(lbldonationCategory1);
        lbldonationCategory1.setBounds(20, 70, 130, 20);

        headerjLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        headerjLabel.setText("My Donation History");
        add(headerjLabel);
        headerjLabel.setBounds(380, 20, 190, 30);

        btnnviewOrUpdate.setText("View/Update");
        btnnviewOrUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnviewOrUpdateActionPerformed(evt);
            }
        });
        add(btnnviewOrUpdate);
        btnnviewOrUpdate.setBounds(510, 360, 120, 29);

        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        add(btndelete);
        btndelete.setBounds(650, 360, 120, 29);

        backjButton2.setText("< < Back");
        backjButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton2ActionPerformed(evt);
            }
        });
        add(backjButton2);
        backjButton2.setBounds(20, 20, 101, 29);
    }// </editor-fold>//GEN-END:initComponents

    private void btnmakenewdonationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmakenewdonationActionPerformed
        CardLayout cardLayout = (CardLayout) userProcessJpanel.getLayout();
        userProcessJpanel.add("MakeNewDonationJPanel",new CreateNewDonationJPanel(userProcessJpanel,ecoSystem, userLogged));
        cardLayout.next(userProcessJpanel);
    }//GEN-LAST:event_btnmakenewdonationActionPerformed

    private void donationcategoryjComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_donationcategoryjComboBoxActionPerformed
        populateDonationHistoryTable();
    }//GEN-LAST:event_donationcategoryjComboBoxActionPerformed

    private void btnnviewOrUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnviewOrUpdateActionPerformed
        int selectedRow = tbldonationHistory.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row");
            return;
        }else {
            Donation selectedDonation = (Donation) tbldonationHistory.getValueAt(selectedRow, 2);
            
            if(selectedDonation.getDonationStatus().equals(DonationStatus.Closed)){
                JOptionPane.showMessageDialog(this, "This donation request is already Closed. Cannot edit now.");
                return;
            }
            
            if (selectedDonation.getDonationStatus().equals(DonationStatus.PickedUp)){
                JOptionPane.showMessageDialog(this, "This donation request is already Picked up. Cannot edit now.");
                return;
            }
            
            if (selectedDonation.getDonationStatus().equals(DonationStatus.Accepted)){
                JOptionPane.showMessageDialog(this, "This donation request is already Accepted. Cannot edit now.");
                return;
            }
            
            CardLayout cardLayout = (CardLayout) userProcessJpanel.getLayout();
            userProcessJpanel.add("ViewOrEditDonationJPanel",new ViewOrEditDonationJPanel(userProcessJpanel,ecoSystem, userLogged, selectedDonation));
            cardLayout.next(userProcessJpanel);
        }
    }//GEN-LAST:event_btnnviewOrUpdateActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        int selectedRow = tbldonationHistory.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row");
            return;
        }else {
            Donation selectedDonation = (Donation) tbldonationHistory.getValueAt(selectedRow, 2);
            if (!selectedDonation.getDonationStatus().equals(DonationStatus.ReadyToPickup)){
                JOptionPane.showMessageDialog(this, "!Error! You can only delete when the donation status is Ready for Pickup");
            }else{
                donor.getDonations().remove(selectedDonation);
                JOptionPane.showMessageDialog(this, "Donation request deleted successfully");
                logger.log(Level.INFO, "Donation deleted");
                populateDonationHistoryTable();
            }
        }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void backjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton2ActionPerformed
        // TODO add your handling code here:
        userProcessJpanel.remove(this);

        CardLayout cardLayout = (CardLayout) userProcessJpanel.getLayout();
        cardLayout.previous(userProcessJpanel);
    }//GEN-LAST:event_backjButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton2;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnmakenewdonation;
    private javax.swing.JButton btnnviewOrUpdate;
    private javax.swing.JLabel countLablejLabel;
    private javax.swing.JLabel countTotaljLabel;
    private javax.swing.JComboBox<String> donationcategoryjComboBox;
    private javax.swing.JLabel headerjLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbldonationCategory1;
    private javax.swing.JTable tbldonationHistory;
    // End of variables declaration//GEN-END:variables
}
