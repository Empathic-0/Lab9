/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alexander
 */
public class Student {
  private String studentID; 
  private String firstName; 
  private String lastName;

  public Student(String studentId, String firstname, String lastname) {
    this.studentID = studentId;
    this.firstName = firstName;
    this.lastName = lastName;
  }
  
  public String getStudentID(){
    return this.studentID;
  }
  public String getFirstName(){
    return this.firstName;
  }
  public String getLastName(){
    return this.lastName;
  }

  public void setStudentID(String studentid){
    this.studentID = studentid;
  }
  public void setFirstName(String firstname){
    this.firstName = firstname;
  }
  public void setLastName(String lastname){
    this.lastName = lastname;
  }
}  
