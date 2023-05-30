package co.edu.sena.demo.Models;

public class User {

  private Integer user_id;

  private String user_firsname;

  private String user_lastname;

  private String user_email;

  private String user_pssword;

  public User() {
  }

  public User(Integer user_id, String user_firsname, String user_lastname, String user_email, String user_pssword) {
    this.user_id = user_id;
    this.user_firsname = user_firsname;
    this.user_lastname = user_lastname;
    this.user_email = user_email;
    this.user_pssword = user_pssword;
  }

  public Integer getUser_id() {
    return user_id;
  }

  public void setUser_id(Integer user_id) {
    this.user_id = user_id;
  }

  public String getUser_firsname() {
    return user_firsname;
  }

  public void setUser_firsname(String user_firsname) {
    this.user_firsname = user_firsname;
  }

  public String getUser_lastname() {
    return user_lastname;
  }

  public void setUser_lastname(String user_lastname) {
    this.user_lastname = user_lastname;
  }

  public String getUser_email() {
    return user_email;
  }

  public void setUser_email(String user_email) {
    this.user_email = user_email;
  }

  public String getUser_pssword() {
    return user_pssword;
  }

  public void setUser_pssword(String user_pssword) {
    this.user_pssword = user_pssword;
  }




}