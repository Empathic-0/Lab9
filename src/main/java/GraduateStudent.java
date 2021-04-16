/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alexander
 */
public class GraduateStudent extends Student {
  private String type;

  public GraduateStudent(String type, String studentID, String firstname, String lastname) {
    super(studentID, firstname, lastname);
    this.type = type;
  }

  public String getType(){
    return this.type;
  }

  public void setType(String type){
    this.type = type;
  }

}
