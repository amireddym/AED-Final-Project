/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.helper;

import businesslogic.CityNetwork;
import businesslogic.EcoSystem;
import businesslogic.cityOfficial.CityOfficial;
import businesslogic.cleaner.Cleaner;
import businesslogic.delivery.DeliveryVolunteer;
import businesslogic.donor.Donor;
import businesslogic.organization.OrgManager;
import businesslogic.organization.Organization;
import businesslogic.sysAdmin.SysAdmin;
import javax.swing.JOptionPane;

/**
 *
 * @author gunav
 */
public class ValidateInputs {
    
    public static boolean isDataValid(EcoSystem ecosystem, String username, String email, String phoneNo, String password){
        if(isUsernameValid(ecosystem, username)){
            if(isEmailValid(ecosystem, email)){
                if(isPhoneNumberValid(ecosystem, phoneNo)){
                    if(isPasswordValid(ecosystem, password)){
                        return true;
                    }
                }
            }
        }return false;
    }
    
    
//    -----------------------------------------------------------------------------------
//    -----------------------------------------------------------------------------------
  
    
    
    public static boolean isUsernameValid(EcoSystem ecosystem, String username){
        
        if(username.matches("^[a-zA-Z0-9]+$")){
            if(checkIfUserNameAlreadyExists(ecosystem, username)){
                JOptionPane.showMessageDialog(null, "!Error! Username already registered");
                return false;
            }else{
                return true;
            }
        }
        
        else{
            JOptionPane.showMessageDialog(null, "!Error! Username format is incorrect");
            return false;
        }
    }
    
    public static boolean checkIfUserNameAlreadyExists(EcoSystem ecoSystem, String username) {
        for(SysAdmin sysadmin : ecoSystem.getSysAdminsDirectory().getSysAdmins()){
            if (sysadmin.getUserName().contentEquals(username)){
                return true;
            }
        }
        
        for(Donor donor : ecoSystem.getDonorsDirectory().getDonors()){
            if (donor.getUserName().contentEquals(username)){
                return true;
            }
        }
        
        for(CityNetwork citynetwork : ecoSystem.getCityNetworkDirectory().getCityNetworks()){
            for(CityOfficial cityofficial : citynetwork.getCityOfficialsDirectory().getCityOfficials()){
                if(cityofficial.getUserName().contentEquals(username)){
                    return true;
                }
            }
        }
        
        for(CityNetwork citynetwork : ecoSystem.getCityNetworkDirectory().getCityNetworks()){
            for(Cleaner cleaner : citynetwork.getCleanersDirectory().getCleaners()){
                if(cleaner.getUserName().contentEquals(username)){
                    return true;
                }
            }
        }
        
        for(CityNetwork citynetwork : ecoSystem.getCityNetworkDirectory().getCityNetworks()){
            for(Organization org : citynetwork.getDepartmentDirectory().getDepartments()){
                for(OrgManager orgmanager : org.getOrgManagerDirectory().getOrgManagers()){
                    if(orgmanager.getUserName().contentEquals(username)){
                       return true;
                    }
                }                
            }
        }
        
        for(CityNetwork citynetwork : ecoSystem.getCityNetworkDirectory().getCityNetworks()){
            for(Organization org : citynetwork.getDepartmentDirectory().getDepartments()){
                for(DeliveryVolunteer deliveryvolunteer : org.getDeliveryVolunteerDirectory().getDeliveryVolunteers()){
                    if(deliveryvolunteer.getUserName().contentEquals(username)){
                       return true;
                    }
                }                
            }
        }
        
        return false;
    }
    
    
//    -----------------------------------------------------------------------------------
//    -----------------------------------------------------------------------------------
    
    
    public static boolean isEmailValid(EcoSystem ecosystem, String email){
        
        if(email.matches("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$")){
            if(checkIfEmailAlreadyExists(ecosystem, email)){
                JOptionPane.showMessageDialog(null, "!Error! Email already registered");
                return false;
            }else{
                return true;
            }
        }
        
        else{
            JOptionPane.showMessageDialog(null, "!Error! Email format is incorrect");
            return false;
        }
    }    
    
    
    public static boolean checkIfEmailAlreadyExists(EcoSystem ecoSystem, String email) {
        for(SysAdmin sysadmin : ecoSystem.getSysAdminsDirectory().getSysAdmins()){
            if (sysadmin.getEmail().contentEquals(email)){
                return true;
            }
        }
        
        for(Donor donor : ecoSystem.getDonorsDirectory().getDonors()){
            if (donor.getEmail().contentEquals(email)){
                return true;
            }
        }
        
        for(CityNetwork citynetwork : ecoSystem.getCityNetworkDirectory().getCityNetworks()){
            for(CityOfficial cityofficial : citynetwork.getCityOfficialsDirectory().getCityOfficials()){
                if(cityofficial.getEmail().contentEquals(email)){
                    return true;
                }
            }
        }
        
        for(CityNetwork citynetwork : ecoSystem.getCityNetworkDirectory().getCityNetworks()){
            for(Cleaner cleaner : citynetwork.getCleanersDirectory().getCleaners()){
                if(cleaner.getEmail().contentEquals(email)){
                    return true;
                }
            }
        }
        
        for(CityNetwork citynetwork : ecoSystem.getCityNetworkDirectory().getCityNetworks()){
            for(Organization org : citynetwork.getDepartmentDirectory().getDepartments()){
                for(OrgManager orgmanager : org.getOrgManagerDirectory().getOrgManagers()){
                    if(orgmanager.getEmail().contentEquals(email)){
                       return true;
                    }
                }                
            }
        }
        
        for(CityNetwork citynetwork : ecoSystem.getCityNetworkDirectory().getCityNetworks()){
            for(Organization org : citynetwork.getDepartmentDirectory().getDepartments()){
                for(DeliveryVolunteer deliveryvolunteer : org.getDeliveryVolunteerDirectory().getDeliveryVolunteers()){
                    if(deliveryvolunteer.getEmail().contentEquals(email)){
                       return true;
                    }
                }                
            }
        }
        
        return false;
    }



//    -----------------------------------------------------------------------------------
//    -----------------------------------------------------------------------------------

    public static boolean isPhoneNumberValid(EcoSystem ecosystem, String phoneNo){
        
        if(!phoneNo.isEmpty() && phoneNo.matches("^[0-9]+$") && phoneNo.length()==10){
            if(checkPhoneNoAlreadyExists(ecosystem, phoneNo)){
                JOptionPane.showMessageDialog(null, "!Error! Phonenumber already registered");
                return false;
            }else{
                return true;
            }
        }
        
        else{
            JOptionPane.showMessageDialog(null, "!Error! Phonenumber format is incorrect");
            return false;
        }
    }
    
    
    public static boolean checkPhoneNoAlreadyExists(EcoSystem ecoSystem, String phoneNo) {
        for(SysAdmin sysadmin : ecoSystem.getSysAdminsDirectory().getSysAdmins()){
            if (sysadmin.getPhoneNo().contentEquals(phoneNo)){
                return true;
            }
        }
        
        for(Donor donor : ecoSystem.getDonorsDirectory().getDonors()){
            if (donor.getPhoneNo().contentEquals(phoneNo)){
                return true;
            }
        }
        
        for(CityNetwork citynetwork : ecoSystem.getCityNetworkDirectory().getCityNetworks()){
            for(CityOfficial cityofficial : citynetwork.getCityOfficialsDirectory().getCityOfficials()){
                if(cityofficial.getPhoneNo().contentEquals(phoneNo)){
                    return true;
                }
            }
        }
        
        for(CityNetwork citynetwork : ecoSystem.getCityNetworkDirectory().getCityNetworks()){
            for(Cleaner cleaner : citynetwork.getCleanersDirectory().getCleaners()){
                if(cleaner.getPhoneNo().contentEquals(phoneNo)){
                    return true;
                }
            }
        }
        
        for(CityNetwork citynetwork : ecoSystem.getCityNetworkDirectory().getCityNetworks()){
            for(Organization org : citynetwork.getDepartmentDirectory().getDepartments()){
                for(OrgManager orgmanager : org.getOrgManagerDirectory().getOrgManagers()){
                    if(orgmanager.getPhoneNo().contentEquals(phoneNo)){
                       return true;
                    }
                }                
            }
        }
        
        for(CityNetwork citynetwork : ecoSystem.getCityNetworkDirectory().getCityNetworks()){
            for(Organization org : citynetwork.getDepartmentDirectory().getDepartments()){
                for(DeliveryVolunteer deliveryvolunteer : org.getDeliveryVolunteerDirectory().getDeliveryVolunteers()){
                    if(deliveryvolunteer.getPhoneNo().contentEquals(phoneNo)){
                       return true;
                    }
                }                
            }
        }
        
        return false;
    } 
    



//    -----------------------------------------------------------------------------------
//    -----------------------------------------------------------------------------------

    public static boolean isPasswordValid(EcoSystem ecosystem, String password){
        
        if(!password.isEmpty() && password.matches("^[a-zA-Z0-9]+$")){
            return true;
        }        
        else{
            JOptionPane.showMessageDialog(null, "!Error! Password format is incorrect");
            return false;
        }
    }
    
}
