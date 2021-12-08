/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.organization;

import businesslogic.ModificationInfo;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author manojreddy
 */
public class OrgManagerDirectory extends ModificationInfo{
    
    private List<OrgManager> orgManagers = new ArrayList<>();

    public OrgManagerDirectory(Date createdDate, Date lastUpdatedDate, String createdBy, String modifiedBy) {
        super(createdDate, lastUpdatedDate, createdBy, modifiedBy);
    }
    
    public OrgManagerDirectory(List<OrgManager> orgManagers, Date createdDate, Date lastUpdatedDate, String createdBy, String modifiedBy) {
        super(createdDate, lastUpdatedDate, createdBy, modifiedBy);
        this.orgManagers = orgManagers;
    }
    
    public OrgManagerDirectory() {
        super(new Date(), new Date(), "SysAdmin", "SysAdmin");
    }

    public List<OrgManager> getOrgManagers() {
        return orgManagers;
    }

    public void setOrgManagers(List<OrgManager> orgManagers) {
        this.orgManagers = orgManagers;
    }
    
}
