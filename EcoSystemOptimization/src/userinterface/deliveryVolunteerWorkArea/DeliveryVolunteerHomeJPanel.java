/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.deliveryVolunteerWorkArea;

import businesslogic.EcoSystem;
import businesslogic.User;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author manojreddy
 */
public class DeliveryVolunteerHomeJPanel extends javax.swing.JPanel {

    private JPanel userProcessJPanel;
    private EcoSystem ecoSystem;
    private User userLogged;
    
    /**
     * Creates new form DeliveryVolunteerHomeJPanel
     */
    public DeliveryVolunteerHomeJPanel(JPanel userProcessJPanel, EcoSystem ecoSystem, User userLogged) {
        initComponents();
        this.userProcessJPanel = userProcessJPanel;
        this.ecoSystem = ecoSystem;
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

        lbltitle = new javax.swing.JLabel();
        btnupdatemyprofile = new javax.swing.JButton();
        btnmanagemydeliveries = new javax.swing.JButton();

        lbltitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbltitle.setText("Delivery Volunteer Home Page");

        btnupdatemyprofile.setText("Update my Profile");
        btnupdatemyprofile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdatemyprofileActionPerformed(evt);
            }
        });

        btnmanagemydeliveries.setText("Manage My Deliveries");
        btnmanagemydeliveries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmanagemydeliveriesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(btnupdatemyprofile)
                        .addGap(171, 171, 171)
                        .addComponent(btnmanagemydeliveries))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(lbltitle)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(lbltitle, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnupdatemyprofile)
                    .addComponent(btnmanagemydeliveries))
                .addContainerGap(88, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnupdatemyprofileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdatemyprofileActionPerformed
        CardLayout cardLayout = (CardLayout) userProcessJPanel.getLayout();
        userProcessJPanel.add("UpdateDeliveryVolunteerProfileJPanel", new UpdateDeliveryVolunteerProfileJPanel(userProcessJPanel,ecoSystem,userLogged));
        cardLayout.next(userProcessJPanel);
    }//GEN-LAST:event_btnupdatemyprofileActionPerformed

    private void btnmanagemydeliveriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmanagemydeliveriesActionPerformed
        CardLayout cardLayout = (CardLayout) userProcessJPanel.getLayout();
        userProcessJPanel.add("ManageMyDeliveriesJPanel", new ManageMyDeliveriesJPanel(userProcessJPanel,ecoSystem,userLogged));
        cardLayout.next(userProcessJPanel);
    }//GEN-LAST:event_btnmanagemydeliveriesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnmanagemydeliveries;
    private javax.swing.JButton btnupdatemyprofile;
    private javax.swing.JLabel lbltitle;
    // End of variables declaration//GEN-END:variables
}
