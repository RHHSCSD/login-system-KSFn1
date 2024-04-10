/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package loginsystem;

//Import classes
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.*; 





/**
 *
 * @author koosh
 */
public class ChangeInfo extends javax.swing.JFrame {
    
    //Create instances of the user C\lass and the LoginSystem class
    private User user;  
    private LoginSystem login = new LoginSystem(); 
    
    //Save the origianl username
    final String originalUser = LoginSystem.getPerson().getUsername() ; 

    /**
 * Constructs a new instance of ChangeInfo.
 * 
 * This constructor initializes the ChangeInfo object by calling the initComponents() method 
 * to initialize components, and sets default values for the user object. It also sets the 
 * text fields with the corresponding values retrieved from the User class via the LoginSystem.
 */
    public ChangeInfo() {
        initComponents();
        // Initialize user object with default values
        this.user = new User("", "", "", "", "", "");
        
        //Set the texts for the text fields
        jTextField1.setText(LoginSystem.getPerson().getName());
        jTextField3.setText(LoginSystem.getPerson().getEmail());
        jTextField4.setText(LoginSystem.getPerson().getAge());
        jTextField2.setText(LoginSystem.getPerson().getUsername());
        
        

    }
     /**
     * This method closes the current panel. It's helpful when we want to switch from one tab to another. 
     */
    public void close() {
        WindowEvent CloseWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(CloseWindow);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setSize(new java.awt.Dimension(500, 500));

        jTextField1.setBackground(new java.awt.Color(153, 204, 255));
        jTextField1.setText("Enter Your Name");
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setBackground(new java.awt.Color(153, 204, 255));
        jTextField2.setText("Enter Your Username");
        jTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField2MouseClicked(evt);
            }
        });
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.setBackground(new java.awt.Color(153, 204, 255));
        jTextField3.setText("Enter Your Email");
        jTextField3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField3MouseClicked(evt);
            }
        });
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField4.setBackground(new java.awt.Color(153, 204, 255));
        jTextField4.setText("Enter Your Age");
        jTextField4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField4MouseClicked(evt);
            }
        });
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(153, 153, 255));
        jButton1.setText("Update Information");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 0, 51));
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(151, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(94, 94, 94))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(150, 150, 150))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
       
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        
    }//GEN-LAST:event_jTextField4ActionPerformed
    /**
     * Handles the action when the user presses Enter in the jTextField2 field.
     * It sets the entered text as the username in the login object.
     *
     * @param evt The ActionEvent instance that triggered the action
     */
    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
       login.setUsername(jTextField2.getText());
    }//GEN-LAST:event_jTextField2ActionPerformed
    /**
     * Performs actions when the jButton1 is clicked.
     *
     * This method handles the action event triggered by clicking jButton1. It
     * reads user input from various text fields, validates the input, updates
     * the setters of the User class with the input values, checks if the email
     * is in the correct format, ensures the age is reasonable, checks for
     * duplicate usernames, updates user information if all conditions are met,
     * and closes the current frame while opening the menu panel.
     *
     * @param evt The action event triggered by clicking jButton1.
     */

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        //Create booleans to keep track
        boolean emailCheck = true;
        boolean ageCheck = true; 

        //Set the doubleUser to false
        login.setDoubleUser(false); 
        
        //Read the user input and update the setters of the User Class with them 
        LoginSystem.getPerson().setName(jTextField1.getText());
        
        //Make sure the email is in the correct format
        String email = jTextField3.getText(); 
        
        if (!email.contains("@") || (!email.contains("."))){
            
            //Output to the screen that the email is not in the correct format
            JOptionPane.showMessageDialog(null, "Please enter a valid email address that includes a '@' and a '.'"); 
            
            //Update the boolean 
            emailCheck = false; 
        }
        
        else {
         LoginSystem.getPerson().setEmail(email);
        
        //Store the age into a variabke
        String age = jTextField4.getText(); 
        
        //Convert the age to int
        int ageNum = Integer.parseInt(age); 
        
        //Make sure the age is reasonable 
        if (ageNum > 130){
            JOptionPane.showMessageDialog(null, "There is no way you are older then 130 years old.");
            
            //Update the boolean 
            ageCheck = false; 
        }
        
        else if (ageNum < 0){
            JOptionPane.showMessageDialog(null, "How are you negative years old? Are you dead?");
            
            //Update the boolean 
            ageCheck = false; 
        }
        
        else {
        
        //Set the age
         LoginSystem.getPerson().setAge(age);
        
        //Pass in the username and password into the LoginSystem class in order to make sure they meet the requirements
        login.setUsername(jTextField2.getText());
        
        //Only check if the username is a duplicate if the username has been changed
        
        if (!login.getUsername().equals(originalUser)){
            
       
       //If the username was taken notify the user
        login.userCheck();
      if (login.getDoubleUser() == true){
          //Notify the user that the username is taken
            JOptionPane.showMessageDialog(null, "This username is already taken"); 
            
        }
        
       else {
            //Update the username in the User class
             LoginSystem.getPerson().setUsername(jTextField2.getText());
             
             
         
      }
        }  
        
        
       
        //Only proceed if everything is entered properly 
        if (emailCheck == true && ageCheck == true && login.getDoubleUser() == false){
            
         //Write the new info to the file 
         login.writeFile(originalUser);
       
        //Close the current frame
         close();
        //Open the menu panel
        LoginPage n = new LoginPage();
        n.setVisible(true);
        }
 
    
        
       
        }
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    /**

     *
     * @param evt The MouseEvent instance that triggered the action
     */
    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked

    }//GEN-LAST:event_jTextField1MouseClicked
    /**

     * @param evt The MouseEvent instance that triggered the action
     */
    private void jTextField3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField3MouseClicked

    }//GEN-LAST:event_jTextField3MouseClicked
    /**

     * @param evt The MouseEvent instance that triggered the action
     */
    private void jTextField4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField4MouseClicked

 
    }//GEN-LAST:event_jTextField4MouseClicked
    /**

     * @param evt The MouseEvent instance that triggered the action
     */
    private void jTextField2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2MouseClicked
    
    }//GEN-LAST:event_jTextField2MouseClicked

   /**
     * Handles the action when jButton2 is clicked. It closes the current frame
     * and opens the login menu panel.
     *
     * @param evt The ActionEvent instance that triggered the action
     */

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                //Close the current frame
         close();
        //Open the menu panel
        LoginPage n = new LoginPage();
        n.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ChangeInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangeInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangeInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangeInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangeInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
