package tms;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Project {
    private int ID;
    private String name;
    private String CustomerName;
    private int NumOTasks;
    private Database DB;
    
    public Project(){
        try {
            DB = new Database();
        } catch (SQLException ex) {
            Logger.getLogger(Project.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Project(int ID, String name, String CustomerName, int NumOTasks) {
        this.ID = ID;
        this.name = name;
        this.CustomerName = CustomerName;
        this.NumOTasks = NumOTasks;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    public void setNumOTasks(int NumOTasks) {
        this.NumOTasks = NumOTasks;
    }
  
    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public int getNumOTasks() {
        return NumOTasks;
    }
    public void getProjectInfo(int ID) throws SQLException{
        DB.GetProjectInfo(this, ID);
    }
}
