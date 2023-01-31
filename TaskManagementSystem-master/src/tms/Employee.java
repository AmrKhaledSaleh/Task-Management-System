package tms;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JTable;

public class Employee extends User{
    
    public String attended() throws SQLException{
        return DB.employeeAttended(this.getID());
    }

    public String Departure() throws SQLException{
         String timeStamp = new SimpleDateFormat("yyyy-MM-dd\nHH:mm").format(new java.util.Date());
         DB.employeeDepurtaure(this.getID());
         return timeStamp;
    }
    
    public void GetTasks(JTable t) throws SQLException{
        DB.employeeTasks(t, this.getID());
    }
    
    public void endTask(int ID) throws SQLException{
        DB.endTask(ID);
    }
    
    public Object[] addRequest(String reason) throws SQLException{
        return DB.addRequest(reason, this.getID());
    }
    
    public void getResults(JTable t) throws SQLException{
        DB.getResult(t, this.getID());
    }
    
    public void getRequestTasks(JTable t) throws SQLException {
        DB.getRequestTasks(t, this.getID());
    }

    public void approveTask(int taskID) throws SQLException {
        DB.approveTask(taskID, this.getID(), "approved", "Running");
    }

    public void disapproveTask(int taskID) throws SQLException {
        DB.approveTask(taskID, this.getID(), "disapproved", "Pending");
    }
}
