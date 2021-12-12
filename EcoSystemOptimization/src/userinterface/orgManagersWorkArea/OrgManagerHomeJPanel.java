/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.orgManagersWorkArea;

import businesslogic.CityNetwork;
import businesslogic.EcoSystem;
import businesslogic.User;
import businesslogic.organization.Organization;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author manojreddy
 */
public class OrgManagerHomeJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NgoManagerHomeJPanel
     */
    
    private JPanel userProcessJPanel;
    private EcoSystem ecoSystem;
    private CityNetwork cityNetwork;
    private Organization organization;
    private User userLogged;
    
    public OrgManagerHomeJPanel(JPanel userProcessJPanel, EcoSystem ecoSystem, CityNetwork cityNetwork, Organization organization, User userLogged) {
        initComponents();
        
        this.userProcessJPanel = userProcessJPanel;
        this.ecoSystem = ecoSystem;
        this.cityNetwork = cityNetwork;
        this.organization = organization;
        this.userLogged = userLogged;
        
        lblheadercityName.setText(cityNetwork.getCityName().name());
        organizationValuejLabel.setText(organization.getOrganizationName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerjLabel = new javax.swing.JLabel();
        manageOrganizationInfoJButton = new javax.swing.JButton();
        manageDeliveryVolunteersJButton = new javax.swing.JButton();
        manageDonationsJButton = new javax.swing.JButton();
        organizationjLabel = new javax.swing.JLabel();
        organizationValuejLabel = new javax.swing.JLabel();
        lblheadercityTag = new javax.swing.JLabel();
        lblheadercityName = new javax.swing.JLabel();

        headerjLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        headerjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerjLabel.setText("Manage Organization");

        manageOrganizationInfoJButton.setText("Manage Organization Info");
        manageOrganizationInfoJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrganizationInfoJButtonActionPerformed(evt);
            }
        });

        manageDeliveryVolunteersJButton.setText("Manage Delivery Volunteers");
        manageDeliveryVolunteersJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageDeliveryVolunteersJButtonActionPerformed(evt);
            }
        });

        manageDonationsJButton.setText("Manage Donations");
        manageDonationsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageDonationsJButtonActionPerformed(evt);
            }
        });

        organizationjLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        organizationjLabel.setText("Organization Name:");

        organizationValuejLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        organizationValuejLabel.setText("<Value>");

        lblheadercityTag.setText("City:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(organizationjLabel)
                        .addGap(33, 33, 33)
                        .addComponent(organizationValuejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(headerjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(327, 327, 327)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(manageDeliveryVolunteersJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(manageOrganizationInfoJButton)
                            .addComponent(manageDonationsJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(260, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblheadercityTag)
                .addGap(34, 34, 34)
                .addComponent(lblheadercityName, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {manageDeliveryVolunteersJButton, manageDonationsJButton, manageOrganizationInfoJButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblheadercityTag, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblheadercityName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(headerjLabel)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(organizationjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(organizationValuejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(manageDonationsJButton)
                .addGap(31, 31, 31)
                .addComponent(manageDeliveryVolunteersJButton)
                .addGap(31, 31, 31)
                .addComponent(manageOrganizationInfoJButton)
                .addContainerGap(91, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageOrganizationInfoJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrganizationInfoJButtonActionPerformed
        // TODO add your handling code here:
        CardLayout cardLayout = (CardLayout) userProcessJPanel.getLayout();
        userProcessJPanel.add("UpdateOrganizationInfo", new UpdateOrganizationInfoJPanel(userProcessJPanel, ecoSystem, organization, userLogged));
        cardLayout.next(userProcessJPanel);
    }//GEN-LAST:event_manageOrganizationInfoJButtonActionPerformed

    private void manageDeliveryVolunteersJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageDeliveryVolunteersJButtonActionPerformed

        CardLayout cardLayout = (CardLayout) userProcessJPanel.getLayout();
        userProcessJPanel.add("ManageDeliveryVolunteers",new ManageDeliveryVolunteersJPanel(userProcessJPanel, ecoSystem, organization, userLogged));
        cardLayout.next(userProcessJPanel);
    }//GEN-LAST:event_manageDeliveryVolunteersJButtonActionPerformed

    private void manageDonationsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageDonationsJButtonActionPerformed

        CardLayout cardLayout = (CardLayout) userProcessJPanel.getLayout();
        userProcessJPanel.add("ManageDonationsPanel", new ManageDonationsJPanel(userProcessJPanel, ecoSystem, cityNetwork, organization, userLogged));
        cardLayout.next(userProcessJPanel);
    }//GEN-LAST:event_manageDonationsJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel headerjLabel;
    private javax.swing.JLabel lblheadercityName;
    private javax.swing.JLabel lblheadercityTag;
    private javax.swing.JButton manageDeliveryVolunteersJButton;
    private javax.swing.JButton manageDonationsJButton;
    private javax.swing.JButton manageOrganizationInfoJButton;
    private javax.swing.JLabel organizationValuejLabel;
    private javax.swing.JLabel organizationjLabel;
    // End of variables declaration//GEN-END:variables
}
