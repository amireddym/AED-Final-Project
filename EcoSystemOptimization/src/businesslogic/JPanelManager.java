/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic;

import javax.swing.JPanel;
import userinterface.cityOfficialsWorkArea.CityOfficialHomeJPanel;
import userinterface.cleanersWorkArea.CleanerHomeJPanel;
import userinterface.deliveryVolunteerWorkArea.DeliveryVolunteerHomeJPanel;
import userinterface.donarsWorkArea.DonorHomeJPanel;
import userinterface.orgManagersWorkArea.OrgManagerHomeJPanel;
import userinterface.systemAdminsWorkArea.SysAdminHomeJPanel;

/**
 *
 * @author manojreddy
 */
public class JPanelManager {
    
    public static JPanel getSysAdminHomePanel(JPanel userProcessJpanel, EcoSystem ecoSystem, User userLogged) {
        
        return new SysAdminHomeJPanel(userProcessJpanel, ecoSystem, userLogged);
    }
    
    public static JPanel getCityOfficialHomePanel() {
        
        return new CityOfficialHomeJPanel();
    }
        
    public static JPanel getOrgManagerHomePanel() {
        
        return new OrgManagerHomeJPanel();
    }
    
    public static JPanel getDonorHomePanel(JPanel userProcessJpanel, EcoSystem ecoSystem, User userLogged) {
        
        return new DonorHomeJPanel(userProcessJpanel, ecoSystem, userLogged);
    }
    
    public static JPanel getDeliveryVolunteerHomePanel(JPanel userProcessJPanel, EcoSystem ecoSystem, User userLogged) {
        
        return new DeliveryVolunteerHomeJPanel(userProcessJPanel, ecoSystem, userLogged);
    }
    
    public static JPanel getCleanerHomePanel() {
        
        return new CleanerHomeJPanel();
    }
    
}
