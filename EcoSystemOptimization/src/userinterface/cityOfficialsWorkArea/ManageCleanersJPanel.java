/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.cityOfficialsWorkArea;

import businesslogic.CityNetwork;
import businesslogic.EcoSystem;
import businesslogic.User;
import businesslogic.cleaner.Cleaner;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author anshitaverma
 */
public class ManageCleanersJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageCleanersJPanel
     */
    private JPanel userProcessContainer;
    private User userAccount;
    private EcoSystem ecoSystem;
    private CityNetwork cityNetwork;
     private Cleaner cleaner;
    
    public ManageCleanersJPanel(JPanel userProcessContainer,User userAccount,
        EcoSystem ecoSystem, CityNetwork cityNetwork) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount=userAccount;
        this.cityNetwork = cityNetwork;
        this.ecoSystem=ecoSystem;
        populateData();
        
    }
     private void populateData(){
                 DefaultTableModel manageCleanersModel = (DefaultTableModel) managecleanerstbl.getModel();
                 manageCleanersModel.setRowCount(0);
                 int currentCleaner=0;
                 
                 for(Cleaner cleaner:cityNetwork.getCleanersDirectory().getCleaners()){
                     currentCleaner++;
                     Object[] row = new Object[7];
                     row[0]=currentCleaner;
                     row[1]=cleaner.getName();
                     row[2]=cleaner.getPhoneNo();
                     row[3]=cleaner.getEmail();
                     row[4]=cleaner.getAddress();
                     row[5]=cleaner.getUserName();
                     row[6]=cleaner.getPassword();
                     manageCleanersModel.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        managecleanerstbl = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        nameHolderjLabel = new javax.swing.JLabel();
        picHolderjLabel = new javax.swing.JLabel();
        addBtn = new javax.swing.JButton();
        updatebtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();

        managecleanerstbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Name", "Phone Number", "Email Id", "Address", "UserName", "Password"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(managecleanerstbl);

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel1.setText("Manage Cleaners");

        nameHolderjLabel.setText("<Name>");

        picHolderjLabel.setText("<Profile Pic>");

        addBtn.setText("Create New Cleaner");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        updatebtn.setText("Update Details");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });

        deletebtn.setText("Delete");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
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
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(updatebtn)
                                .addGap(55, 55, 55)
                                .addComponent(deletebtn)
                                .addGap(55, 55, 55)
                                .addComponent(backbtn))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameHolderjLabel)
                            .addComponent(picHolderjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(addBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nameHolderjLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(picHolderjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBtn)
                    .addComponent(updatebtn)
                    .addComponent(deletebtn)
                    .addComponent(backbtn))
                .addGap(27, 27, 27))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backbtnActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
        // TODO add your handling code here:
         int selectedRow=managecleanerstbl.getSelectedRow();
         if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a Cleaner to delete");
            return;
        }else{
             Cleaner selectedCleaner=(Cleaner) managecleanerstbl.getValueAt(selectedRow, 1);
             cityNetwork.getCleanersDirectory().getCleaners().remove(selectedCleaner);
             JOptionPane.showMessageDialog(null, "Successfully deleted Cleaner Account ");

            populateData();
         }
    }//GEN-LAST:event_deletebtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("Create New Cleaners", new CreateNewCleanerJPanel(userProcessContainer,  ecoSystem, userAccount, cityNetwork));
        cardLayout.next(userProcessContainer);
    }//GEN-LAST:event_addBtnActionPerformed

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        // TODO add your handling code here:
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("Update Cleaner", new UpdateCleanerJPanel(userProcessContainer,  cleaner, userAccount));
        cardLayout.next(userProcessContainer);
    }//GEN-LAST:event_updatebtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton backbtn;
    private javax.swing.JButton deletebtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable managecleanerstbl;
    private javax.swing.JLabel nameHolderjLabel;
    private javax.swing.JLabel picHolderjLabel;
    private javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables
}
