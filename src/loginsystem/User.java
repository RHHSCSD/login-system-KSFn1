/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loginsystem;

//Import classes
import java.io.File;

/**
 *
 * @author koosh
 */

/**
 * Represents a user in the login system.
 */
class User {
    
    //Declare fields 
    private String username;
    private String codeName; 
    private String pass;
    private String name;
    private String email;
    private String age;

    //Create a constructor 
    /**
     * Constructs a new user with the specified details.
     *
     * @param username The username of the user.
     * @param pass The password of the user.
     * @param name The name of the user.
     * @param email The email of the user.
     * @param age The age of the user.
     */
    public User(String username,String codeName, String pass, String name, String email, String age) {
        //Use the setters created to update the fields
        setUsername(username);
        setCodeName(codeName); 
        setPass(pass);
        setName(name);
        setEmail(email);
        setAge(age);
    }
    
   
    
   
    //Create getters and setters

     /**
     * Retrieves the username.
     * @return The username.
     */
    public String getUsername() {
        return username;
    }

      /**
     * Retrieves the pass.
     * @return The pass.
     */
    public String getPass() {
        return pass;
    }
    
      /**
     * Retrieves the email.
     * @return The email.
     */
    public String getEmail() {
        return email;
    }
      /**
     * Retrieves the age.
     * @return The age.
     */
    public String getAge() {
        return age;
    }
      /**
     * Retrieves the name.
     * @return The name.
     */
    public String getName() {
        return name;
    }
    
       
      /**
     * Retrieves the code name.
     * @return The code name.
     */
    public String getCodeName() {
        return codeName;
    }
    /**
     * Sets the username.
     * @param username The username to be set.
     */
    public void setUsername(String username) {
        this.username = username;
    }
    /**
     * Sets the password.
     * @param password The password to be set.
     */
    public void setPass(String pass) {
        this.pass = pass;
    }
    /**
     * Sets the email.
     * @param email The email to be set.
     */
    public void setEmail(String email) {
        this.email = email;
    }
    /**
     * Sets the age.
     * @param age The age to be set.
     */
    public void setAge(String age) {
        this.age = age;
    }
    /**
     * Sets the name.
     * @param name The name to be set.
     */
    public void setName(String name) {
        this.name = name;
    }
    
     /**
     * Sets the code name.
     * @param name The code name to be set.
     */
    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }
}
