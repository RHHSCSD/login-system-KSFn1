/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loginsystem;

//Import classes
import java.io.File;
import javax. swing. *;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author koosh
 */
public class LoginSystem {
    
    //Decalre fields
    private final File file = new File ("Info.txt"); 
    private final File namesFile = new File ("Names.txt"); 
    private String username; 
    private String password;
    
    //Declare arrays and veriables to store data from the file
    private int fileSize = readSize();
    private int namesSize = readSizeofCode(); 
    private String[] names = new String [fileSize];
    private String [] nName = new String [fileSize]; 
    private String[] user = new String [fileSize];
    private String[] pass  = new String [fileSize];
    private String[] emails  = new String [fileSize];
    private String [] age = new String [fileSize]; 
    
    private String []codeName = new String [namesSize];

    //Declare booleans to keep track of the data in the file
    private boolean doubleUser;
    private boolean invalidCodeName; 

    private boolean passCheck; 

    private static User person;
    private Search search = new Search();


 
    /**
     *
     * @param args
     */
    public static void main(String[] args ) {

        //Create an instance of the login page
        Login login = new Login(); 
        //Make the fram visible
        login.setVisible(true); 
        
     

    }

    //Create a method for logging in

   /**
     * Logs in the user by checking credentials against stored data.
     * Loads user data from file before attempting login.
     * Displays appropriate messages for success or failure.
     */
    public void login() {
          
        //Load the data into the arrays
        load(); 
        
    boolean usernameFound = false;
    
    //Loop through the arrays and try to match the entered username to the exisiting ones
    for (int i = 0; i < fileSize; i++) {
        
        //If username was found, set the boolean to be true
        if (user[i].equals(username)) {
            usernameFound = true;
            
            //Encrypt the password 
            String encrypt = encrypt(password); 
            // If successful login, no need to check further
            if (pass[i].equals(encrypt)) {
                JOptionPane.showMessageDialog(null, "Welcome");
                
                //Set the persoanl info of the user
               person = new User(username, nName[i], pass[i], names[i], emails[i], age[i]); 
                return; 
                // If incorrect password, no need to check further
            } else {
                JOptionPane.showMessageDialog(null, "The password is incorrect");
                return; 
            }
        }
    }
    // If the loop finishes and username is not found, show the message
    if (!usernameFound) {
        JOptionPane.showMessageDialog(null, "Username not found");
    }
}

    /**
     * Checks for duplicate usernames during registration.
     * Loads user data from file before performing check.
     * Updates the boolean 'doubleUser' if a duplicate username is found.
     */
    public void userCheck() {
     
     //Load the users
     load(); 
     if (fileSize > 0){
     //Loop through the users array
        for (int i = 0; i < fileSize; i++) {
            //If users at index mathced the entered username update the boolean to be true
            if (user[i].equals(username)) {
                //Update the boolean
                doubleUser = true;
                //Break out of the loop
                break;
 }
 }
}
}
    
    
    /**
     * Checks the validity of a provided code name.
     *
     * @param codeName The code name to be checked.
     */
    
        public void codeNameCheck(String codeName) {
      
        //Load the codeNames
     loadCodeNames(); 
     
            //User binary search to find if the passed in codeName is valid
            int i = search.binarySearch(codeName, this.codeName); 
    
            //If the method returrs -1, the codeName is not valid
            if (i == -1) {
               //Output that the username is invalid
                JOptionPane.showMessageDialog(null, "This code name is invalid or unavailable");
                
                //Uodate the boolean
                invalidCodeName = true; 

 }
            //If the method returns anything else
            else{
            //Refer to the codeNameSet method and pass in the codeName as an arguement
            codeNameSet(codeName);
            //Update the boolean
            invalidCodeName = false; 
 }
}

        
        //Create a method to delete the used code name from the file
        private void codeNameSet(String codeName){
            
            //Run a for loop that goes through the entire array
            for (int i = 0; i < namesSize; i++){
                //If the word at index matched the parameter, set the word at idex to be null
                if (this.codeName[i].equals(codeName)){
                    this.codeName[i] = null; 
                    
                }
            }
            
            //Refer to the writeCodeName method
            writeCodeName(); 
        }
        
 
        //Create a method to re-write the file and delete the used code name
        private void writeCodeName (){
        try {
            //Open a print writer
            PrintWriter p = new PrintWriter(namesFile); 
            
            //Run a loop that goes through the entire codeName array
            for(int i = 0; i < this.codeName.length; i++){
        
                //Make sure to not print the used code name
                if (codeName[i] != null){
                    //Print the rest of the names
                p.println(this.codeName[i]); 
                }
            
        }
        }catch (IOException ex) {
            Logger.getLogger(LoginSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
 
        
        
    //Create a method to check if the password is strong enoguh 

     /**
     * Checks if the provided password meets certain criteria:
     * - Length greater than 7
     * - Contains at least one digit
     * - Contains at least one upper case letter
     * - Contains at least one lower case letter
     * Displays error messages for each failed criterion.
     * @param password The password to be checked.
     */
    public void passCheck(String password) {
        //Get the length of the password
        int length = this.password.length();
        //Declare booleans to keep track of the requirements met
        boolean digit = false;
        boolean upperCase = false;
        boolean lowerCase = false;

        //Run a for loop through every letter of the password, if a requirement was met, update the dedicated boolean
        for (int i = 0; i < length; i++) {
            if (Character.isDigit(password.charAt(i))) {
                digit = true;
            }
            if (Character.isUpperCase(password.charAt(i))) {
                upperCase = true;
            }
            if (Character.isLowerCase(password.charAt(i))) {
                lowerCase = true;
            }
        }

        //Output if not all requirements were met and specify which ones
        if (length < 7) {
            JOptionPane.showMessageDialog(null, "The length of the password has to be 8 letters or longer");
              passCheck = false; 
        }

        else if (!digit) {
            JOptionPane.showMessageDialog(null,"The password must include a digit");
           passCheck = false; 
        }

        else if (!upperCase) {
            JOptionPane.showMessageDialog(null,"The password must include an upper case letter");
          passCheck = false; 
        }

        else if (!lowerCase) {
            JOptionPane.showMessageDialog(null,"The password must include a lower case letter");
          passCheck = false; 
        }

        else {
            //If everything is ok, set the boolean to be true 
            passCheck = true; 
        }
    }
    
    
    
    
    
    
    
    
    

    //Create a method to read the file szie

     /**
     * Reads the size of the Info.text file by counting the number of lines.
     * @return The number of lines in the file.
     */
    public int readSize() {
        try {
            //Open scanner
            Scanner scanner = new Scanner(file);
            //Declare a counter
             int i = 0;
             //Run a loop that loops through the file until it reaches the end
            while (scanner.hasNextLine()){
                //Increament the counter
                i++;
                //Read the next line
                scanner.nextLine();
            }
            
            //Close the scanner
            scanner.close();
            //Return the number of lines
            return i;
        } catch (FileNotFoundException ex) {
            
        }
        return 0;
    }
    
    
     //Create a method to read the file szie

     /**
     * Reads the size of the Names.text file by counting the number of lines.
     * @return The number of lines in the file.
     */
    public int readSizeofCode() {
        try {
            //Open scanner
            Scanner scanner = new Scanner(namesFile);
            //Declare a counter
             int i = 0;
             //Run a loop that loops through the file until it reaches the end
            while (scanner.hasNextLine()){
                //Increament the counter
                i++;
                //Read the next line
                scanner.nextLine();
            }
            
            //Close the scanner
            scanner.close();
            //Return the number of lines
            return i;
        } catch (FileNotFoundException ex) {
            
        }
        return 0;
    }

    
    
    
    
    //Create a method to load the info from the file to the arrays

    /**
     * Loads user information from the file into arrays.
     * Assigns values to 'names', 'user', 'pass', 'emails', and 'age' arrays.
     */
public void load() {
    try {
        //Open scanner
        Scanner scanner = new Scanner(file);
        //Run a loop through the file
        for (int i = 0; i < fileSize; i++) {
            
            //Add each item to its dedicated array 
            names[i] = scanner.next();
            nName [i] = scanner.next(); 
            user[i] = scanner.next();
            pass[i] = scanner.next();
            emails[i] = scanner.next();
            age[i] = scanner.next();
        }
        //Close scanner
        scanner.close();
    } catch (FileNotFoundException ex) {
        System.out.println("File not found");
    }
}

 //Create a method to load the info from the file to the arrays

    /**
     * Loads the possible code names file into the array.
     */
public void loadCodeNames() {
    try {
        //Open scanner
        Scanner scanner = new Scanner(namesFile);
        
        //Run a loop through the entire file
        for (int i = 0; i < namesSize; i++) {

            //Add each code name to the array
            codeName[i] = scanner.nextLine(); 
        }
        //Close scanner
        scanner.close();
    } catch (FileNotFoundException ex) {
        System.out.println("File not found");
    }
}


    
    
    
    //Create an encrypt method 

    /**
     * Encrypts the provided password using MD5 algorithm.
     * @param encryptPass The password to be encrypted.
     * @return The encrypted password.
     */
    public String encrypt (String encryptPass){
        
        try {
            //java helper class to perform encryption
            MessageDigest md = MessageDigest.getInstance("MD5");
            //give the helper function the password
            md.update(encryptPass.getBytes());
            //perform the encryption
            byte byteData[] = md.digest();
            //To express the byte data as a hexadecimal number (the normal way)
            encryptPass = "";
            for (int i = 0; i < byteData.length; ++i) {
            encryptPass += (Integer.toHexString((byteData[i] & 0xFF)| 0x100).substring(1, 3));              
            }

        //Create getters and Setters
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(LoginSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Return the encrypted pass
        return encryptPass; 
    }
    
    
    
    //Create a method that write in the new user to a file
        /**
     * This method goes through every user and tries to match the username to a username in the user array. If found, the information will be 
       updated for that user. Otherwise, it will print out the existing user to the file without making any changes. 
     */
    public void writeFile () {
        //Load the data from the file
        load(); 
        try {
            
            try ( 
                //Open writer
                FileWriter p = new FileWriter(file, false)) {
                
                //Run a loop that goes through every username and tries to match it with username
                for (int i = 0; i < fileSize; i++){    
                    
                    if (user[i].equals(username)){
                        //Encrypt the password 
                        String encrypt = encrypt(password);
                        //Write to the file
                       p.write(names[i] + " " + codeName [i] + " "+ user[i] + " " + encrypt + " " + emails[i] + " " + age[i] + "\n");
                    }
                    else {
                //Write the rest of the users
                p.write(names[i] + " " + codeName[i] + " " + user[i] + " " + pass[i] + " " + emails[i] + " " + age[i] + "\n");
                    }
                }
                //Closer writer
                p.close();
                
                //Notify the user that the password was successfully changed
                JOptionPane.showMessageDialog(null, "Your password was successfully updated!"); 
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        } catch (IOException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    
    //Create a method to write the updated user information to the file
    
    /**
     * Updates user information in a file.
     *
     * This method updates the information of a user specified by their original
     * username in the file. It loads the data from the file, searches for the
     * original user's information, updates it, and writes the updated
     * information back to the file.
     *
     * @param originalUser The original username of the user whose information
     * is to be updated.
     */
    public void writeFile (String originalUser){
        
         //Load the data from the file
        load(); 
        try {
            
            try ( 
                //Open writer
                FileWriter p = new FileWriter(file, false)) {
                
                //Run a loop that goes through every username and tries to match it with username
                for (int i = 0; i < fileSize; i++){    
                    
                    if (user[i].equals(originalUser)){
              
                        //Write to the file
                       p.write(person.getName() + " " + person.getCodeName() + " " + person.getUsername() + " " + person.getPass() + " " + person.getEmail() + " " + person.getAge() + "\n");
                    }
                    else {
                //Write the rest of the users
                p.write(names[i] + " " + codeName[i] + " " + user[i] + " " + pass[i] + " " + emails[i] + " " + age[i] + "\n");
                    }
                }
                //Closer writer
                p.close();
                
                //Notify the user that the password was successfully changed
                 JOptionPane.showMessageDialog(null, "Your information was updated successfully!");
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        } catch (IOException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
        
    }
    
    //Create a method that write in the new user to a file
    /**
     * Writes the user's information to a file. Encrypts the password before
     * writing. Displays a success message if writing is successful.
     *
     * @param user The user object to be written to the file.
     */
    public void writeFile(User user) {

        //Encrypt the password
        String password = encrypt(user.getPass());
        try {
            //Write a new user to the file
            try ( //Open writer
                    FileWriter p = new FileWriter(file, true)) {
                //Write the new user to the file
                p.write(user.getName() + " " + user.getCodeName() + " " + user.getUsername() + " " + password + " " + user.getEmail() + " " + user.getAge() + "\n");
                //Closer writer
                p.close();

                //Notify the user that they have been successfully added
                JOptionPane.showMessageDialog(null, "You have been successfully added to the system! ");
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        } catch (IOException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    //Create getters and setters

    /**
     * Retrieves the username.
     * @return The username.
     */
public String getUsername(){
        return username; 
    }
    
    /**
     * Sets the username.
     * @param username The username to be set.
     */
    public void setUsername (String username){
        this.username = username;
    }
    
     //Create getters and Setters
    /**
     * Retrieves the password.
     * @return The passowrd.
     */
  
    public String getPassword(){
        return password; 
    }
    
  /**
     * Sets the password.
     * @param password The password to be set.
     */
    public void setPassword (String password){
        this.password = password;
    }
    
      /**
     * Retrieves the person.
     * @return The person.
     */
    
    public static User getPerson(){
        return person; 
    }
    
     /**
     * Sets the person.
     * @param person The person to be set.
     */
        public static void setPerson(User person){
        LoginSystem.person = person; 
    }
        
       /**
     * Retrieves the boolean named doubleUser.
     * @return The doubleUser.
     */
        public boolean getDoubleUser(){
            return doubleUser; 
        }
        
       /**
     * Sets the doubleUser.
     * @param doubleUser The doubleUser (true or false) to be set.
     */
        public void setDoubleUser(boolean doubleUser){
            this.doubleUser = doubleUser; 
        }
        
       /**
     * Retrieves the boolean named invalidCodeName.
     * @return The doubleUser.
     */
        public boolean getInvalidCodeName(){
            return invalidCodeName; 
        }
        
       /**
     * Retrieves the boolean named passCheck.
     * @return The passCheck.
     */
        
        public boolean getPassCheck(){
            return passCheck; 
        }
}