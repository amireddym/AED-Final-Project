/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic;

import businesslogic.cityOfficial.CityOfficialDirectory;
import businesslogic.cleaner.CleanerDirectory;
import businesslogic.organization.OrganizationDirectory;
import java.util.Date;

/**
 *
 * @author manojreddy
 */
public class CityNetwork extends ModificationInfo{
    
    private CityName cityName;
    
    private OrganizationDirectory departmentDirectory = new OrganizationDirectory();
    
    private CityOfficialDirectory cityOfficialsDirectory = new CityOfficialDirectory();
    
    private CleanerDirectory cleanersDirectory = new CleanerDirectory();

    public CityNetwork(CityName cityName, Date createdDate, Date lastUpdatedDate, String createdBy, String modifiedBy) {
        super(createdDate, lastUpdatedDate, createdBy, modifiedBy);
        this.cityName = cityName;
    }

    public CityName getCityName() {
        return cityName;
    }

    public void setCityName(CityName cityName) {
        this.cityName = cityName;
    }

    public OrganizationDirectory getDepartmentDirectory() {
        return departmentDirectory;
    }

    public void setDepartmentDirectory(OrganizationDirectory departmentDirectory) {
        this.departmentDirectory = departmentDirectory;
    }

    public CityOfficialDirectory getCityOfficialsDirectory() {
        return cityOfficialsDirectory;
    }

    public void setCityOfficialsDirectory(CityOfficialDirectory cityOfficialsDirectory) {
        this.cityOfficialsDirectory = cityOfficialsDirectory;
    }

    public CleanerDirectory getCleanersDirectory() {
        return cleanersDirectory;
    }

    public void setCleanersDirectory(CleanerDirectory cleanersDirectory) {
        this.cleanersDirectory = cleanersDirectory;
    }
    
}
