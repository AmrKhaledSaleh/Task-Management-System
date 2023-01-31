package tms;

import java.util.*;
public class Task {
   private int id;
   private String title;
   private String description;
   private Employee assignedEmployee;
   private String task_phase;
   private Date start_date = new Date();
   private String end_date;
   private long estimated_hours;
   private String project_name;
   private String priority;
   private String creator_name;
   private String status;
   private int LeaderID;
           
   public Task(){
       
   }
   public Task( String title, String description, Employee assignedEmployee, String task_phase, String end_date, long estimated_hours, String project_name, String priority, String creator_name) {
      this.title = title;
      this.description = description;
      this.assignedEmployee = assignedEmployee;
      this.task_phase = task_phase;
      this.end_date = end_date;
      this.estimated_hours = estimated_hours;
      this.project_name = project_name;
      this.priority = priority;
      this.creator_name = creator_name;
   }
   
   public Employee getAssignedEmployee(){
       return assignedEmployee;
   }
   
   public void setAssignedEmployee(Employee e){
       this.assignedEmployee = e;
   }
   
   public int getId() {
      return id;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   public String getTitle() {
      return title;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public String getDescription() {
      return description;
   }

   public void setTask_phase(String task_phase) {
      this.task_phase = task_phase;
   }

   public String getTask_phase() {
      return task_phase;
   }

   public void setStart_date(Date start_date) {
      this.start_date = start_date;
   }

   public Date getStart_date() {
      return start_date;
   }

   public void setDeadline(String end_date) {
      this.end_date = end_date;
   }

   public String getDeadline() {
      return end_date;
   }

   public void setEstimated_hours(long estimated_hours) {
      this.estimated_hours = estimated_hours;
   }

   public long getEstimated_hours() {
      return estimated_hours;
   }

   public void setProject_name(String project_name) {
      this.project_name = project_name;
   }

   public String getProject_name() {
      return project_name;
   }


   public void setPriority(String priority) {
      this.priority = priority;
   }

   public String getPriority() {
      return priority;
   }

   public void setCreator_name(String creator_name) {
      this.creator_name = creator_name;
   }

   public String getCreator_name() {
      return creator_name;
   }
}