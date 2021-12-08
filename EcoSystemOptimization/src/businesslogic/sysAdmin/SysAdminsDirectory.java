/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.sysAdmin;

import java.util.List;

/**
 *
 * @author manojreddy
 */
public class SysAdminsDirectory {
    
    private List<SysAdmin> sysAdmins;

    public List<SysAdmin> getSysAdmins() {
        return sysAdmins;
    }

    public void setSysAdmins(List<SysAdmin> sysAdmins) {
        this.sysAdmins = sysAdmins;
    }
    
}
