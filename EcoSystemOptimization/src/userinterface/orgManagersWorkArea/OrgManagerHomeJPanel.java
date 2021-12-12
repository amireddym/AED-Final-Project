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

        setLayout(null);

        headerjLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        headerjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerjLabel.setText("Manage Organization");
        add(headerjLabel);
        headerjLabel.setBounds(234, 37, 380, 29);

        manageOrganizationInfoJButton.setText("Manage Organization Info");
        manageOrganizationInfoJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrganizationInfoJButtonActionPerformed(evt);
            }
        });
        add(manageOrganizationInfoJButton);
        manageOrganizationInfoJButton.setBounds(327, 299, 207, 25);

        manageDeliveryVolunteersJButton.setText("Manage Delivery Volunteers");
        manageDeliveryVolunteersJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageDeliveryVolunteersJButtonActionPerformed(evt);
            }
        });
        add(manageDeliveryVolunteersJButton);
        manageDeliveryVolunteersJButton.setBounds(327, 243, 207, 25);

        manageDonationsJButton.setText("Manage Donations");
        manageDonationsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageDonationsJButtonActionPerformed(evt);
            }
        });
        add(manageDonationsJButton);
        manageDonationsJButton.setBounds(327, 187, 207, 25);

        organizationjLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        organizationjLabel.setText("Organization Name:");
        add(organizationjLabel);
        organizationjLabel.setBounds(239, 124, 181, 28);

        organizationValuejLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        organizationValuejLabel.setText("<Value>");
        add(organizationValuejLabel);
        organizationValuejLabel.setBounds(453, 124, 277, 28);

        lblheadercityTag.setText("City:");
        add(lblheadercityTag);
        lblheadercityTag.setBounds(710, 20, 26, 30);
        add(lblheadercityName);
        lblheadercityName.setBounds(770, 20, 130, 30);
    }// </editor-fold>//GEN-END:initComponents

    private void manageOrganizationInfoJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrganizationInfoJButtonActionPerformed
        // TODO add your handling code here:
        CardLayout cardLayout = (CardLayout) userProcessJPanel.getLayout();
        userProcessJPanel.add("UpdateOrganizationInfo", new UpdateOrganizationInfoJPanel(userProcessJPanel, ecoSystem, cityNetwork, organization, userLogged));
        cardLayout.next(userProcessJPanel);
    }//GEN-LAST:event_manageOrganizationInfoJButtonActionPerformed

    private void manageDeliveryVolunteersJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageDeliveryVolunteersJButtonActionPerformed

        CardLayout cardLayout = (CardLayout) userProcessJPanel.getLayout();
        userProcessJPanel.add("ManageDeliveryVolunteers",new ManageDeliveryVolunteersJPanel(userProcessJPanel, ecoSystem, cityNetwork, organization, userLogged));
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
