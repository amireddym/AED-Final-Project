/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.donor;

import businesslogic.User;
import businesslogic.enums.UserRole;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author manojreddy
 */
public class Donor extends User{
    
    private List<Donation> donations = new ArrayList<>();
    
    public Donor(String name, String phoneNo, String email, String address, String userName, String password, UserRole userRole, String profilePic, Date createdDate, Date lastUpdatedDate, String createdBy, String modifiedBy) {
        super(name, phoneNo, email, address, userName, password, userRole, profilePic, createdDate, lastUpdatedDate, createdBy, modifiedBy);
    }

    public List<Donation> getDonations() {
        return donations;
    }

    public void setDonations(List<Donation> donations) {
        this.donations = donations;
    }
    
}
