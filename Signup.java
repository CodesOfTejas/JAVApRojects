package BankManagementSystem;

import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;





class Signup extends JFrame implements ActionListener{

    
    long random;
    JTextField nameTextField , fnameTextField , emailTxt , addTxt , cityTxt , stateTxt , pinTxt, dobTextField ;
    JButton next;
    JRadioButton male , female , married , unMarried;
     private JDateChooser dateChooser;

    
    Signup(){
    
        setLayout(null); 
        
        Random ran = new Random();
         random = Math.abs((ran.nextLong() % 9000L) + 1000L);
        JLabel formNo = new JLabel("Application Form No : " + random );
        formNo.setFont(new Font("Raleway",Font.BOLD,38));
        formNo.setBounds(140,20,600,40);
        add(formNo);
        
        JLabel personalDetails = new JLabel("Page 1 : Personal Details");
        personalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        personalDetails.setBounds(290,80,400,30);
        add(personalDetails);
        
        
        JLabel naMe = new JLabel("Name : ");
        naMe.setFont(new Font("Raleway",Font.BOLD,20));
        naMe.setBounds(100,140,100,30);
        add(naMe);
        
        // we have creating textfield globally
        
         nameTextField = new JTextField();
        
        nameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        nameTextField.setBounds(300,140,400,30);
        add(nameTextField);
        
        
        JLabel fName = new JLabel("Father's Name : ");
        fName.setFont(new Font("Raleway",Font.BOLD,20));
        fName.setBounds(100,190,200,30);
        add(fName);
        
        fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        fnameTextField.setBounds(300,190,400,30);
        add(fnameTextField);
        
        
        JLabel dob = new JLabel("Date Of Birth : ");
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100,240,300,30);
        add(dob);
        
        JDateChooser dateChooser = new JDateChooser();
       dateChooser.setBounds(300,240,400,30);
        add(dateChooser);
        
        
        JLabel gen = new JLabel("Gender : ");
        gen.setFont(new Font("Raleway",Font.BOLD,20));
        gen.setBounds(100,290,300,30);
        add(gen);
        
        male = new JRadioButton("Male");
        male.setBounds(300,290,60,30);
        male.setBackground(Color.WHITE);
        add(male);
        female = new JRadioButton("Female");
        female.setBounds(450,290,120,30);
        female.setBackground(Color.WHITE);
        add(female);
        
        //selecting both option so thats why we take new class here"ButtonGroup"
        
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        
        JLabel email = new JLabel("Email Address : ");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,340,300,30);
        add(email);
        
        
        emailTxt = new JTextField();
        emailTxt.setFont(new Font("Raleway",Font.BOLD,14));
        emailTxt.setBounds(300,340,400,30);
        add(emailTxt);

        
        JLabel marStat = new JLabel("Marital Status : ");
        marStat.setFont(new Font("Raleway",Font.BOLD,20));
        marStat.setBounds(100,390,300,30);
        add(marStat);
        
        
        married = new JRadioButton("Married");
        married.setBounds(300,390,100,30);
        married.setBackground(Color.WHITE);
        add(married);
        unMarried = new JRadioButton("UnMarried");
        unMarried.setBounds(450,390,100,30);
        unMarried.setBackground(Color.WHITE);
        add(unMarried);
        
        //selecting both option so thats why we take new class here"ButtonGroup"
        
        ButtonGroup marStatGroup = new ButtonGroup();
        marStatGroup.add(married);
        marStatGroup.add(unMarried);
        
        
        
        
        JLabel address = new JLabel("Address : ");
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(100,440,300,30);
        add(address);
        
        
        addTxt = new JTextField();
        addTxt.setFont(new Font("Raleway",Font.BOLD,14));
        addTxt.setBounds(300,440,400,30);
        add(addTxt);
        
        
        JLabel city = new JLabel("City : ");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100,490,300,30);
        add(city);
        
        
        cityTxt = new JTextField();
        cityTxt.setFont(new Font("Raleway",Font.BOLD,14));
        cityTxt.setBounds(300,490,400,30);
        add(cityTxt);
        
        
        JLabel state = new JLabel("State : ");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100,540,300,30);
        add(state);
        
        
        stateTxt = new JTextField();
        stateTxt.setFont(new Font("Raleway",Font.BOLD,14));
        stateTxt.setBounds(300,540,400,30);
        add(stateTxt);
        
        
        JLabel pinCode = new JLabel("Pin Code : ");
        pinCode.setFont(new Font("Raleway",Font.BOLD,20));
        pinCode.setBounds(100,590,300,30);
        add(pinCode);
        
        
        pinTxt = new JTextField();
        pinTxt.setFont(new Font("Raleway",Font.BOLD,14));
        pinTxt.setBounds(300,590,400,30);
        add(pinTxt);
        
        
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);
        

        
        getContentPane().setBackground(Color.WHITE);
        
    setSize(850,800);
    setLocation(350,10);
    setVisible(true);
    
    
    
    }
    
    public void actionPerformed(ActionEvent ae){
        
        String formNu = "" + random; // its long
        
        
        // random contais number in long so we have to pass it into string we have to do this " "" + random  "
        //it will convert it into string ... concatination
        
        
        String name = nameTextField.getText();
        String fname = fnameTextField.getText();
        String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String email =  emailTxt.getText();
        String add = addTxt.getText();
        String city = cityTxt.getText();
        String state = stateTxt.getText();
        String pin = pinTxt.getText();
        
        String gender = null;
        if(male.isSelected()){
            
            gender = "male";
            
        }else if  (female.isSelected()){
            
            gender="female";
        
        
        }
        
        String marital = "null";
        if(married.isSelected()){
            marital="married";
        }else if(unMarried.isSelected())
                {
        
        marital="unmarried";
        
        }
       
        
        //we are hitting data base now
        
        try{
        
            
            
            
            
            
            
            if(name.equals("")){
        
            JOptionPane.showMessageDialog(null, "The name field should not be empty");
        
        }else if(fname.equals("")){

                JOptionPane.showMessageDialog(null, "The Fathers name field should not be empty");
        }
        else{
            
             ConnectionOne c  = new ConnectionOne();
            String query = "insert into signup values('"+formNu+"','"+name+"','"+fname+"','"+dobTextField+"','"+email+"','"+add+"','"+city+"','"+state+"','"+pin+"','"+gender+"','"+marital+"')";
           
            //now we have to run dlm command 
            
            c.s.executeUpdate(query);
            }
        
            
            
            //need to add code for mmore field
            
            
            
            
            
            
            
            
            
            
        }catch(Exception e){
        
                System.out.println(e);
        
        }
      
       
        
    }
    public static void main(String args[]){
   
    new Signup();
    
    }
    }





