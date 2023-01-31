package tms;

import java.sql.SQLException;

public class Admin extends User{
    
    public void addUser(User u) throws SQLException {
        DB.addNewUser(u);
    }

    public boolean updateUser (boolean xUsername, boolean xPassword, boolean xRole, int userId, String newRole, String newUsername, String newPassword) throws SQLException {
        if(xUsername && !DB.updateUser(userId, "username", newUsername)){
            return false;
        }
        if(xPassword && !DB.updateUser(userId, "password", newPassword)){
            return false;
        }
        if(xRole && !DB.updateUser(userId, "type", newRole))
            return false;
            
        return true;
    }
    
    public boolean deleteUser(int userId) throws SQLException {
        return DB.deleteUser(userId);
    }

    public boolean addProject(String name, int leaderId) throws SQLException {
        return DB.AddProject(name, leaderId);
    }
    
    public boolean updateProject(int projectId, String newName, int newLeaderId, boolean xNewName, boolean xNewLeader) throws SQLException {
        if(xNewName && !DB.updateProject("name", projectId, newName, newLeaderId, 1)){
            return false;
        }
        if(xNewLeader && !DB.updateProject("LeaderID", projectId, newName, newLeaderId, 2)){
            return false;
        }
        
        return true;
    }
    
    public boolean deleteProject(int projectId) throws SQLException {
        return DB.deleteProject(projectId);
    }
    
    public boolean updateTaskPhase(int taskId, String taskNewPhase) throws SQLException {
        return DB.updateTaskPhase(taskId, taskNewPhase);
    }
}
