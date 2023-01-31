package tms;

import javax.swing.JTable;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;

public final class  Database {
    private final Connection c;
    private PreparedStatement pst;
    private boolean attended;
    private Statement st;
    private ResultSet rs;
    private String sql;

    public Database() throws SQLException{// Open connection
//          String url = "jdbc:mysql://sql7.freesqldatabase.com:3306/sql7585316?useUnicode=true&characterEncoding=UTF-8"; //Online
            String url = "jdbc:mysql://localhost:3306/DATABASE_NAME?useUnicode=true&characterEncoding=UTF-8"; //Local
//           c = DriverManager.getConnection(url, "sql7585316", "8a9X58QSj8"); //Online
            c = DriverManager.getConnection(url, "root", ""); //Local
    }
    
    public UserType login(String username, String password) throws SQLException{
        sql = "select * from `User` where username=? and password=?;";
        pst = c.prepareStatement(sql);
        pst.setString(1, username);
        pst.setString(2, password);
        rs = pst.executeQuery();

        if(rs.next()){// If found User get his/her Role
             sql = "select type from `User` where Username = ?";
             pst = c.prepareStatement(sql);
             pst.setString(1, username);
             rs = pst.executeQuery();

             if(rs.next())
                 return UserType.valueOf(rs.getString("type"));
        }else
            return null;
            
        return null;
    }
    
    public void getUserInfo(User user, String username, String password) throws SQLException{
        sql = "select * from `User` where username=? and password=?";
        pst = c.prepareStatement(sql);
        pst.setString(1, username);
        pst.setString(2, password);
        rs = pst.executeQuery();
        
        if(rs.next()){
            user.setID(rs.getInt("ID"));
            user.setName(rs.getString("name"));
            user.setType(rs.getString("type"));
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
        }
    }
    
    public void endTask(int id) throws SQLException {
        sql = "UPDATE Task SET Phase = 'Ended', ActualEndTime=CURDATE() WHERE ID =" + id + ";";
        st = c.createStatement();
        st.execute(sql);
    }
    
     public Object[] addRequest(String reason, int ID) throws SQLException{
        sql = "insert into Requests(reason, userID, Date) values('" + reason +"', "+ ID + ", CURDATE());";
        st = c.createStatement();
        st.execute(sql);
        
        sql = "select ID, reason, status, Date from Requests where Date=CURDATE() and reason='" + reason + "' and userID=" + ID;
        st = c.createStatement();
        rs = st.executeQuery(sql);
        if(rs.next()){
            return new Object[]{rs.getInt("ID"), rs.getString("reason"), rs.getString("status"), rs.getString("Date")};
        }
        return null;
     }
     
    public void getResult(JTable t, int ID) throws SQLException{
        DefaultTableModel dtm = (DefaultTableModel)t.getModel();
        
        st = c.createStatement();
        sql = "select ID, reason, status, Date from Requests where userID="+ ID;
        rs = st.executeQuery(sql);

        while(rs.next())
            dtm.addRow(new Object[]{rs.getInt("ID"), rs.getString("reason"), rs.getString("status"), rs.getString("Date")});
        
        t.setDefaultEditor(Object.class, null);
    }
    
    void getRequestTasks(JTable t, int ID) throws SQLException {
        DefaultTableModel dtm = (DefaultTableModel)t.getModel();
        
        st = c.createStatement();
        sql = "select ID, title, Description, startDate, endDate from Task where userID=" + ID + " and status='NotAssigned';";
        rs = st.executeQuery(sql);

        while(rs.next())
            dtm.addRow(new Object[]{rs.getInt("ID"), rs.getString("title"), rs.getString("Description"), rs.getString("startDate"), rs.getString("endDate")});
        
        t.setDefaultEditor(Object.class, null);
    }
    
    void approveTask(int taskID, int id, String status, String phase) throws SQLException {
        sql = "UPDATE Task SET Phase='"+ phase +"', Status='" + status + "', startDate=CURDATE() WHERE ID =" + taskID + " and userID="+ id +";";
        st = c.createStatement();
        st.execute(sql);
    }
    
    public void GetProjectInfo(Project project, int ID) throws SQLException{
        sql = "select * from `Project` where LeaderID=?;";
        pst = c.prepareStatement(sql);
        pst.setString(1, String.valueOf(ID));
        rs = pst.executeQuery();
        if(rs.next()){
            project.setID(rs.getInt("projectID"));
            project.setName(rs.getString("name"));
        }
        else{
            project.setID(0);
            project.setName("None");
        }
    }
    
    public void DBAddTask(String taskTitle, String taskDiscription, int eID, String t4, int projectID, String c1, int leaderID) throws SQLException{
        st = c.createStatement();

        sql = "INSERT INTO `Task`(`title`,`Description`,`userID`,`endDate`,`projectID`,`priority`, `LeaderID`)"
                + "   VALUES('" + taskTitle+"','" + taskDiscription+"'," + eID+",'"+ t4+"','"+projectID+"','"+c1+"'," + leaderID + ")";
        st.execute(sql);
    }
    
    public boolean DBUpdate(String taskID, String taskField, String DBfield) throws SQLException{
        st = c.createStatement();

        if("userID".equals(DBfield)){
            sql = "Select type from User where `ID` = "+taskField+";";
            rs = st.executeQuery(sql);
            
            if(!rs.next() || UserType.valueOf(rs.getString("type")) != UserType.Employee)
                return false;
        }
        
        sql = "UPDATE `Task` SET `"+DBfield+"` = '" + taskField +"' WHERE `ID` = "+taskID+";";
        st.execute(sql);
        return true;
    }
    
    public Task DBUpdateTask(String taskID, int leaderID) throws SQLException{
        st = c.createStatement();
        sql = "select * from `Task` where ID='" + taskID + "' and LeaderID = " + leaderID + ";";
        rs = st.executeQuery(sql);

        if(!rs.next())
            return null;

        else{
            Task t = new Task();
            Employee e = new Employee();

            e.setID(rs.getInt("userID"));
            t.setTitle(rs.getString("title"));
            t.setDescription(rs.getString("Description"));
            t.setAssignedEmployee(e);
            t.setDeadline(rs.getString("endDate"));
            t.setPriority(rs.getString("priority"));

            return t;
        }
    }
    
    public void ShowAllTaskDB(JTable table, int leaderID) throws SQLException{
        st = c.createStatement();
        sql = "select * from `Task`q WHERE `LeaderID`=" + leaderID + ";";
        rs = st.executeQuery(sql);
        DefaultTableModel tbModel = (DefaultTableModel)table.getModel();
        tbModel.setRowCount(0);
        while(rs.next()){
            String ID = rs.getString("ID");
            String Title = rs.getString("Title");
            String Description = rs.getString("Description");
            String phase = rs.getString("phase");
            String priority = rs.getString("priority");
            String Employee = rs.getString("userID");
            String Status = rs.getString("Status");
            String Deadline = rs.getString("endDate");
            String[] Data = {ID,Title,Description,phase,priority,Employee,Deadline,Status};

            tbModel.addRow(Data);
        }
    }
    
   public String getName(int ID) throws SQLException{
        String name = null;
        st = c.createStatement();
        sql = "select name from `User` where ID = "+ID+";";
        ResultSet ss = st.executeQuery(sql);
        
        if(ss.next())
            name = ss.getString("name");
            
        return name;
   }
    
    public void ShowAllRequestDB(JTable table) throws SQLException{
        st = c.createStatement();
        sql = "select * from `requests` Where `status` = 'Pending';";
        rs = st.executeQuery(sql);
        DefaultTableModel tbModel = (DefaultTableModel)table.getModel();

        while(rs.next()){
            int ID = rs.getInt("ID");
            int UserID = rs.getInt("userID");
            String reason = rs.getString("reason");
            String date = rs.getString("Date");
            String name = getName(UserID);
            Object Data[] = {Integer.toString(ID), UserID, name, reason, date};               
            tbModel.addRow(Data);
        }
    }
    
    public void UpdateRequestStatus(String Status, String ID) throws SQLException{
        st = c.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        sql = "UPDATE `Requests` SET `status` = '" + Status +"' WHERE `ID` = "+ID+";";
        st.execute(sql);
    }
    
    public void DeleteTask(String ID) throws SQLException{
        st = c.createStatement();
        sql = "Delete from `Task` where ID = '"+ID+"';";
        st.execute(sql);
    }
    
    public void ShowAllEmployeeDB(JTable t, int projectID) throws SQLException{
        st = c.createStatement();
        sql = "select DISTINCT Task.userID, User.name from Task inner join User on Task.userID=User.ID where Task.projectID=" + projectID + ";";
        rs = st.executeQuery(sql);
        DefaultTableModel dtm = (DefaultTableModel)t.getModel();
        
        while(rs.next()){
            dtm.addRow(new Object[]{rs.getInt("userID"), rs.getString("name")});
        }
        
        t.setDefaultEditor(Object.class, null);
    }
    
    public void addNewUser(User u) throws SQLException{
        st = c.createStatement();
        sql = "insert into User (name, username, password, type) values (?, ?, ?, ?)";
        pst = c.prepareStatement(sql);
        pst.setString(1, u.getName());
        pst.setString(2, u.getUsername());
        pst.setString(3, u.getPassword());
        pst.setString(4, u.getType());

        pst.execute();
    }

    public boolean updateUser(int userId, String field, String newData) throws SQLException {
        st = c.createStatement();

        sql = "select name from User where ID = ?;";

        pst = c.prepareStatement(sql);
        pst.setInt(1, userId);

        rs = pst.executeQuery();

        if(rs.next()){
            sql = "update User set " + field + " = ? where ID = ?;";
            pst = c.prepareStatement(sql);
            pst.setString(1, newData);
            pst.setInt(2, userId);

            pst.execute();

            return true;
        } else {
            return false;
        }
    }
    
    public boolean deleteUser(int userId) throws SQLException {
        st = c.createStatement();

        sql = "select ID from User where ID = ?";

        pst = c.prepareStatement(sql);
        pst.setInt(1, userId);

        rs = pst.executeQuery();

        if(rs.next()){
            sql = "delete from User where ID = ?;";
            pst = c.prepareStatement(sql);
            pst.setInt(1, userId);

            pst.execute();

            return true;
        } else
            return false;
    }

    public boolean AddProject(String name, int leaderId) throws SQLException {
        sql = "select ID from User where type = 'Leader' and ID = ?";

        pst = c.prepareStatement(sql);
        pst.setInt(1, leaderId);

        rs = pst.executeQuery();

        if(rs.next()){

            sql = "insert into Project (name, LeaderID) values (?, ?);";
            pst = c.prepareStatement(sql);
            pst.setString(1, name);
            pst.setInt(2, leaderId);
            pst.execute();

            sql = "select projectID from Project where name = ? and LeaderID = ?;";
            pst = c.prepareStatement(sql);
            pst.setString(1,name);
            pst.setInt(2, leaderId);
            rs = pst.executeQuery();
            rs.next();
            int projectid = rs.getInt("projectID"); // to get the project id of the project just added to insert it into project id in User table.

            sql = "update User set projectID=? where ID=?;";
            pst = c.prepareStatement(sql);
            pst.setInt(1,projectid);
            pst.setInt(2, leaderId);
            pst.execute();

            return true;
        } 
        else {
            return false;
        }
    }

    public boolean updateProject(String field, int projectId, String name, int newLeaderId, int xFact) throws SQLException {
        sql = "select projectID from Project where projectID = ?";

        pst = c.prepareStatement(sql);
        pst.setInt(1, projectId);

        rs = pst.executeQuery();

        if(rs.next()){
            sql = "update Project set " + field +" = ? where projectID = ?";

            pst = c.prepareStatement(sql);

            if(xFact == 1)
                pst.setString(1, name);

            if(xFact == 2)
                pst.setInt(1, newLeaderId);

            pst.setInt(2, projectId);

            pst.execute();

            return true;
        } else
            return false;
    }

    public boolean deleteProject(int projectId) throws SQLException {
        st = c.createStatement();

        sql = "select projectID from Project where projectID = ?";

        pst = c.prepareStatement(sql);
        pst.setInt(1, projectId);

        rs = pst.executeQuery();

        if(rs.next()){

            sql = "delete from Project where projectID = ?";
            pst = c.prepareStatement(sql);

            pst.setInt(1, projectId);

            pst.execute();

            return true;
        } else {
            return false;
        }
    }
    
    public boolean updateTaskPhase(int taskId, String taskNewPhase) throws SQLException {
        st = c.createStatement();


        sql = "select priority from Task where ID = ?";

        pst = c.prepareStatement(sql);
        pst.setInt(1, taskId);

        rs = pst.executeQuery();

        if(rs.next()){
            sql = "update Task set phase = ? where ID = ?;";
            pst = c.prepareStatement(sql);
            pst.setString(1, taskNewPhase);
            pst.setInt(2, taskId);

            pst.execute();

            return true;
        } else {
            return false;
        }
    }
         
    public String employeeAttended(int ID) throws SQLException{
        String timeStamp = new SimpleDateFormat("yyyy-MM-dd HH:mm").format(new java.util.Date());
        String DateStamp = new SimpleDateFormat("yyyy-MM-dd").format(new java.util.Date());
        
        sql = "select Attendance from Timecards where userID = ? and Attendance like ?;";
        pst = c.prepareStatement(sql);
        pst.setInt(1, ID);
        pst.setString(2, DateStamp + "%");
        rs = pst.executeQuery();
        
        if(!rs.next()){
            attended = true;
            sql = "insert into Timecards(Attendance, userID) values (NOW(), ?)";
            pst = c.prepareStatement(sql);
            pst.setInt(1, ID);
            pst.execute();
            return timeStamp;
        }
        attended = false;
        return "Already attended.";
    }
    
    public void employeeDepurtaure(int ID) throws SQLException{
        if(attended){
            String DateStamp = new SimpleDateFormat("yyyy-MM-dd").format(new java.util.Date());
            sql = "update Timecards set Departure=NOW() where UserID=? and Attendance like ?;";
            
            pst = c.prepareStatement(sql);
            pst.setInt(1, ID);
            pst.setString(2, DateStamp + "%");

            pst.executeUpdate();
        }
    }
    
    public void employeeTasks(JTable table, int ID)throws SQLException{
        DefaultTableModel dtm = (DefaultTableModel)table.getModel();
        
        dtm.setRowCount(0);

        pst = c.prepareStatement("select ID, priority, title, Description, phase, startDate, endDate from Task where userID=? and NOT phase='Ended' and Status='approved';");// and assigned
        pst.setInt(1, ID);
        rs = pst.executeQuery();

        while (rs.next()) {

            dtm.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7)});
            System.out.print(dtm.getRowCount() +"\n");
        }
        table.setDefaultEditor(Object.class, null);
    }
    
    public void closeConnection() throws SQLException {
        if(st != null)
            st.close();
        if(pst != null)
            pst.close();
        if(c != null)
            c.close();
    }
}
