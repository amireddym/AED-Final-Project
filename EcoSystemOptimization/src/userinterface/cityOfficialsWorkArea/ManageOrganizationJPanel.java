/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.cityOfficialsWorkArea;

import businesslogic.CityNetwork;
import businesslogic.EcoSystem;
import businesslogic.User;
import businesslogic.organization.OrgManager;
import businesslogic.organization.Organization;
import java.awt.CardLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author anshitaverma
 */
public class ManageOrganizationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateNewOrganizationJPanel
     */
        private JPanel userProcessContainer;
        private User userLogged;
        private EcoSystem ecoSystem;
        private CityNetwork cityNetwork;
        
    public ManageOrganizationJPanel(JPanel jpanel, User userLogged, EcoSystem ecoSystem, CityNetwork cityNetwork) {
        this.ecoSystem=ecoSystem;
        this.userLogged=userLogged;
        this.userProcessContainer=jpanel;
        this.cityNetwork=cityNetwork;
        initComponents();
        populateData();
    }
    
    public void populateData(){
        DefaultTableModel model = (DefaultTableModel) manageOrgtbl.getModel();
        model.setRowCount(0);
        int count=0;
        for(Organization org:cityNetwork.getOrganizationDirectory().getOrganizations()){
            count++;
            Object[] row = new Object[7];
            row[0]=count;
            row[1]=org;
            row[2]=org.getOrganizationType();
            row[3]=org.getAddress();
            row[4]=org.getPhoneNo();
            row[5]=org.getEmail();
            row[6]=org.getCreatedBy();
            
            model.addRow(row);
        }
        DefaultTableModel managersModel = (DefaultTableModel) managerOrgtbl.getModel();
        managersModel.setRowCount(0);

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
        jScrollPane1 = new javax.swing.JScrollPane();
        manageOrgtbl = new javax.swing.JTable();
        addOrgbtn = new javax.swing.JButton();
        updateOrgbtn = new javax.swing.JButton();
        deleteOrgbtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        managerOrgtbl = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        addManagerbtn = new javax.swing.JButton();
        updateManagerbtn = new javax.swing.JButton();
        deleteManagerbtn = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();
        managerOrgbtn = new javax.swing.JButton();
        managerpicHolderJlbl = new javax.swing.JLabel();
        picHolderJlbl = new javax.swing.JLabel();

        jLabel1.setText("Manage Organizations ");

        manageOrgtbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Organization Name", "Organization Type", "Address", "Mobile Number", "Email Id", "Created By"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        manageOrgtbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageOrgtblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(manageOrgtbl);

        addOrgbtn.setText("Add");
        addOrgbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addOrgbtnActionPerformed(evt);
            }
        });

        updateOrgbtn.setText("Update");
        updateOrgbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateOrgbtnActionPerformed(evt);
            }
        });

        deleteOrgbtn.setText("Delete");
        deleteOrgbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteOrgbtnActionPerformed(evt);
            }
        });

        managerOrgtbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Manager Name", "Mobile Number", "Email Id", "Address", "Username", "Password"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        managerOrgtbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                managerOrgtblMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(managerOrgtbl);

        jLabel2.setText("Manage Organization Manager");

        addManagerbtn.setText("Add");
        addManagerbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addManagerbtnActionPerformed(evt);
            }
        });

        updateManagerbtn.setText("Update");
        updateManagerbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateManagerbtnActionPerformed(evt);
            }
        });

        deleteManagerbtn.setText("Delete");
        deleteManagerbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteManagerbtnActionPerformed(evt);
            }
        });

        backbtn.setText("Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        managerOrgbtn.setText("Manage Organization Manager");
        managerOrgbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managerOrgbtnActionPerformed(evt);
            }
        });

        managerpicHolderJlbl.setText("<Image>");

        picHolderJlbl.setText("<Image>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(managerOrgbtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(addOrgbtn)
                                .addGap(44, 44, 44)
                                .addComponent(updateOrgbtn)
                                .addGap(75, 75, 75)
                                .addComponent(deleteOrgbtn))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 846, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                        .addComponent(picHolderJlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(156, 156, 156))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backbtn)
                                .addGap(194, 194, 194)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(755, 755, 755)
                                        .addComponent(deleteManagerbtn)
                                        .addGap(48, 48, 48))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane2)
                                        .addGap(41, 41, 41)))
                                .addComponent(managerpicHolderJlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(addManagerbtn)
                .addGap(44, 44, 44)
                .addComponent(updateManagerbtn)
                .addGap(500, 500, 500))
            .addGroup(layout.createSequentialGroup()
                .addGap(292, 292, 292)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(backbtn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(picHolderJlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addOrgbtn)
                    .addComponent(updateOrgbtn)
                    .addComponent(deleteOrgbtn)
                    .addComponent(managerOrgbtn))
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addManagerbtn)
                            .addComponent(updateManagerbtn)
                            .addComponent(deleteManagerbtn)))
                    .addComponent(managerpicHolderJlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        // TODO add your handling code here:
         userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backbtnActionPerformed

    private void addManagerbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addManagerbtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = manageOrgtbl.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a Restaurant to add Managers");
            return;
        } else {
            DefaultTableModel organizationsModel = (DefaultTableModel) manageOrgtbl.getModel();
            Organization selectedOrganization = (Organization) organizationsModel.getValueAt(selectedRow, 1);
            CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
            userProcessContainer.add("SysAdminCreateManagerPanel", new CreateOrgManagerJPanel(userProcessContainer, ecoSystem, selectedOrganization, userLogged));
            cardLayout.next(userProcessContainer);

        }

    }//GEN-LAST:event_addManagerbtnActionPerformed

    private void deleteOrgbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteOrgbtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = manageOrgtbl.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row");
            return;
        } else {
            Organization org = (Organization) manageOrgtbl.getValueAt(selectedRow, 1);
            
            cityNetwork.getOrganizationDirectory().getOrganizations().remove(org);
           
            JOptionPane.showMessageDialog(null, "Organization deleted Successfully! ");
            picHolderJlbl.setText("");
          populateData();
        }
    }//GEN-LAST:event_deleteOrgbtnActionPerformed

    private void managerOrgbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managerOrgbtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = manageOrgtbl.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row");
            return;
        } else {
            Organization org = (Organization) manageOrgtbl.getValueAt(selectedRow, 1);
            DefaultTableModel managersModel = (DefaultTableModel) managerOrgtbl.getModel();
            managersModel.setRowCount(0);
            int employeeCount=0;
            for(OrgManager orgManager:org.getOrgManagerDirectory().getOrgManagers()) {
                employeeCount++;
                Object[] row = new Object[7];
                row[0] = employeeCount;
                row[1] = orgManager;
                row[2] = orgManager.getPhoneNo();
                row[3] = orgManager.getEmail();
                row[4] = orgManager.getAddress();
                row[5] = orgManager.getUserName();
                row[6] = orgManager.getPassword();
                managersModel.addRow(row);
            }
        }
    }//GEN-LAST:event_managerOrgbtnActionPerformed

    private void deleteManagerbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteManagerbtnActionPerformed
        // TODO add your handling code here:
        int selectedManager = managerOrgtbl.getSelectedRow();
        if(selectedManager < 0) {
            JOptionPane.showMessageDialog(this, "Please select a manager to delete");
            return;
        }
        DefaultTableModel managerModel = (DefaultTableModel) managerOrgtbl.getModel();
        OrgManager orgManager = (OrgManager) managerOrgtbl.getValueAt(selectedManager, 1);
        
        int selectedRow = manageOrgtbl.getSelectedRow();
        DefaultTableModel orgManagerModel = (DefaultTableModel) manageOrgtbl.getModel();
        Organization org = (Organization) orgManagerModel.getValueAt(selectedRow, 1);
    
        org.getOrgManagerDirectory().getOrgManagers().remove(orgManager);
            managerpicHolderJlbl.setText("");
        JOptionPane.showMessageDialog(this, "Successfully deleted Manager");
      
        populateData();
    
        
    }//GEN-LAST:event_deleteManagerbtnActionPerformed

    private void manageOrgtblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageOrgtblMouseClicked
        // TODO add your handling code here:
        int selectedIndex = manageOrgtbl.getSelectedRow();
        if(selectedIndex<0) {
            return;
        }
         Organization org=(Organization) manageOrgtbl.getValueAt(selectedIndex, 1);
         setPhoto(org.getOrganizationImage());
    }//GEN-LAST:event_manageOrgtblMouseClicked

    private void managerOrgtblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_managerOrgtblMouseClicked
        // TODO add your handling code here:
        int selectedIndex = managerOrgtbl.getSelectedRow();
        if(selectedIndex<0) {
            return;
        }
         OrgManager orgManager=(OrgManager) managerOrgtbl.getValueAt(selectedIndex, 1);
         setProfilePic(orgManager.getProfilePic());
    }//GEN-LAST:event_managerOrgtblMouseClicked

    private void updateManagerbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateManagerbtnActionPerformed
        // TODO add your handling code here:
        int selectedManager = managerOrgtbl.getSelectedRow();
        if(selectedManager < 0) {
            JOptionPane.showMessageDialog(this, "Please select a manager to Update");
            return;
        }
        DefaultTableModel organizationManagerModel = (DefaultTableModel) managerOrgtbl.getModel();
        OrgManager orgManager = (OrgManager) organizationManagerModel.getValueAt(selectedManager, 1);

        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("UpdateOrganizationManagerPanel", new UpdateOrgManagerJPanel(userProcessContainer, ecoSystem, orgManager, userLogged));
        cardLayout.next(userProcessContainer);
    }//GEN-LAST:event_updateManagerbtnActionPerformed

    private void updateOrgbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateOrgbtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = manageOrgtbl.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row");
            return;
        } else {
            Organization selectedOrganization = (Organization) manageOrgtbl.getValueAt(selectedRow, 1);
            UpdateOrganizationJPanel updateOrganizationJPanel = new UpdateOrganizationJPanel(userProcessContainer, ecoSystem, selectedOrganization, userLogged);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            userProcessContainer.add("UpdateOrganizationPanel", updateOrganizationJPanel);
    
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_updateOrgbtnActionPerformed

    private void addOrgbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addOrgbtnActionPerformed
        // TODO add your handling code here:
        CreateOrganizationJPanel panel = new CreateOrganizationJPanel(userProcessContainer, ecoSystem, userLogged,cityNetwork );
        //          userProcessContainer.remove(this);
        userProcessContainer.add("CreateNewOrganizationJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_addOrgbtnActionPerformed
    
    private void setPhoto(String profilePic) {
        
        ImageIcon photo = new ImageIcon(profilePic);
        Image photoResized = photo.getImage().getScaledInstance(picHolderJlbl.getWidth(), picHolderJlbl.getHeight(),4);
        picHolderJlbl.setIcon(new ImageIcon(photoResized));
    }
    
    private void setProfilePic(String profilePic) {
        
        ImageIcon photo = new ImageIcon(profilePic);
        Image photoResized = photo.getImage().getScaledInstance(managerpicHolderJlbl.getWidth(), managerpicHolderJlbl.getHeight(),4);
        managerpicHolderJlbl.setIcon(new ImageIcon(photoResized));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addManagerbtn;
    private javax.swing.JButton addOrgbtn;
    private javax.swing.JButton backbtn;
    private javax.swing.JButton deleteManagerbtn;
    private javax.swing.JButton deleteOrgbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable manageOrgtbl;
    private javax.swing.JButton managerOrgbtn;
    private javax.swing.JTable managerOrgtbl;
    private javax.swing.JLabel managerpicHolderJlbl;
    private javax.swing.JLabel picHolderJlbl;
    private javax.swing.JButton updateManagerbtn;
    private javax.swing.JButton updateOrgbtn;
    // End of variables declaration//GEN-END:variables
}
