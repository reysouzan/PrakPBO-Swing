/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import javax.swing.*;

/**
 *
 * @author ASUS
 */
public class Gui extends JFrame {

    public Gui() {
        setTitle("Login");
        setSize(350, 200);
        setVisible(true);
        setLayout(null);
        
        JLabel lusername = new JLabel ("Username");
        JLabel lpassword  = new JLabel ("Password");
        JButton btnlogin = new JButton ("Login");
        JButton btncancel = new JButton ("Cancel");
        JTextField fusername = new JTextField(10);
        JPasswordField fpassword = new JPasswordField(10); 
        
        add(lusername);
        add(btncancel);
        add(btnlogin);
        add(lpassword);
        add(fpassword);
        add(fusername);
        add(btncancel);
        add(btnlogin);
        
        lusername.setBounds(10,10,120,20);
        fusername.setBounds(130,10,120,20);
        lpassword.setBounds(10,35,120,20);
        fpassword.setBounds(130,35,120,20);
        btnlogin.setBounds(10,60,100,20);
        btncancel.setBounds(150,60,100,20);
        
    }
    
   
    
   
    
    
    
}
