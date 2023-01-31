package tms;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class User {
    private int ID;
    private String name;
    private String username;
    private String password;
    private String type;
    protected Database DB = null;
    
    public User(){
        try {
            DB = new Database();
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void setType(String type){
        this.type = type;
    }
    
    public String getType(){
        return type;
    }
    
    public void setID(int ID){
        this.ID = ID;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public int getID(){
        return this.ID;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void closeConnection() throws SQLException{
        DB.closeConnection();
    }
    
    @Override
    public String toString(){
        return getClass().getName() + " "+ name + " "+ ID;
    }
}
