package tms;

import java.sql.SQLException;
import javax.swing.JTable;

public class Leader extends Employee{
    
    public void getLeaderInfo(String username, String password) throws SQLException{
        DB.getUserInfo( this,  username,  password);
    }
    
    public void AddTask(String taskTitle, String taskDiscription, int eID, String t4, int projectID, String c1, int leaderID) throws SQLException{
        DB.DBAddTask(taskTitle, taskDiscription, eID, t4, projectID,c1, leaderID);
    } 
    
    public Task Update(String taskID, int leaderID) throws SQLException{ 
        return DB.DBUpdateTask(taskID, leaderID);
    }
    
    public boolean UpdateTask(String taskID,String taskField,String DBfield) throws SQLException{
        return DB.DBUpdate( taskID, taskField,DBfield);
    }

    public void ShowAllTasks(JTable table, int leaderID) throws SQLException{
        DB.ShowAllTaskDB(table, leaderID);
    }
    
    public void ShowAllRequests(JTable table) throws SQLException{
        DB.ShowAllRequestDB(table);
    }
    
    public void UpdateRequest(String Status, String ID) throws SQLException{
        DB.UpdateRequestStatus(Status, ID);
    }
    
    public void ShowAllEmployee(JTable table, int projectID) throws SQLException{
        DB.ShowAllEmployeeDB(table, projectID);
    }
    
    public void DeleteTask(String ID) throws SQLException{
        DB.DeleteTask(ID);
    }       
}