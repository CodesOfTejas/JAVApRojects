package BankManagementSystem;

import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;





class SignupTwo extends JFrame implements ActionListener{

    
    long random;
    JTextField nameTextField , fnameTextField , emailTxt , addTxt , cityTxt , stateTxt , pinTxt;
    JButton next;
    JRadioButton male , female , married , unMarried;
     private JDateChooser dateChooser;

    
    SignupTwo(){
    
        setLayout(null); 
        setTitle("New Account Application Form Page - 2");
        
        
        
        JLabel additionalDetails = new JLabel("Page 2 : Additional Details");
        additionalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        additionalDetails.setBounds(290,80,400,30);
        add(additionalDetails);
        
        
        JLabel religion = new JLabel("Religion : ");
        religion.setFont(new Font("Raleway",Font.BOLD,20));
        religion.setBounds(100,140,100,30);
        add(religion);



        String valReligion[] = {"Hindu","Christian","Muslim","Sikh","Parsi","Other"};
        JComboBox jaat = new JComboBox<>(valReligion);

         jaat.setBounds(300,140,400,30);
         jaat.setBackground(Color.WHITE);
        add(jaat);
        
        // we have creating textfield globally
        
         nameTextField = new JTextField();
        
        nameTextField.setFont(new Font("Raleway",Font.BOLD,14));
       // nameTextField.setBounds(300,140,400,30);
       // add(nameTextField);
        
        
        JLabel catagory = new JLabel("Catagory : ");
        catagory.setFont(new Font("Raleway",Font.BOLD,20));
        catagory.setBounds(100,190,200,30);
        add(catagory);
        
        String cat[] = {"General","Other Backward Classes","Nometic Tibes","Scheduled Cast","Scheduled Tibes"};
        JComboBox valCat = new JComboBox<>(cat);
        valCat.setBounds(300,190,400,30);
        valCat.setBackground(Color.WHITE);
        add(valCat);

        fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        //fnameTextField.setBounds(300,190,400,30);
        //add(fnameTextField);
        
        
        JLabel netIncome = new JLabel("Net income : ");
        netIncome.setFont(new Font("Raleway",Font.BOLD,20));
        netIncome.setBounds(100,240,300,30);
        add(netIncome);

        String income[] = {"Null","< 1,50,000","< 2,50,000","<5,00,000","upto 10,00,000"};
        JComboBox inc = new JComboBox<>(income);
        inc.setBounds(300,240,400,30);
        inc.setBackground(Color.WHITE);
        add(inc);


      
        
        
        JLabel education = new JLabel("Education : ");
        education.setFont(new Font("Raleway",Font.BOLD,20));
        education.setBounds(100,290,300,30);
        add(education);
        
        String  educAT[] = {"Bachelor Of Engineer","M.B.B.S.","B.Tech","Pharma","Other"};
        JComboBox edu = new JComboBox<>(educAT);
        edu.setBounds(300,290,400,30);
        edu.setBackground(Color.WHITE);
        add(edu);
       /*  male = new JRadioButton("Male");
        male.setBounds(300,290,60,30);
        male.setBackground(Color.WHITE);
        add(male);
        female = new JRadioButton("Female");
        female.setBounds(450,290,120,30);
        female.setBackground(Color.WHITE);
        add(female);*/
        
        //selecting both option so thats why we take new class here"ButtonGroup"
        
       /* ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female); */
        
        JLabel qualification = new JLabel("Qualification : ");
        qualification.setFont(new Font("Raleway",Font.BOLD,20));
        qualification.setBounds(100,340,300,30);
        add(qualification);

        String qual[] = {"Engineer","Doctor","Architect","Designer","Banking","Contractor"};
        JComboBox netQual = new JComboBox<>(qual);
        netQual.setBackground(Color.WHITE);
        netQual.setBounds(300,340,400,30);
        add(netQual);
        
        emailTxt = new JTextField();
        emailTxt.setFont(new Font("Raleway",Font.BOLD,14));
        emailTxt.setBounds(300,340,400,30);
        add(emailTxt);

        
        JLabel occupation = new JLabel("Occupation : ");
        occupation.setFont(new Font("Raleway",Font.BOLD,20));
        occupation.setBounds(100,390,300,30);
        add(occupation);
        
        
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
        
        
        
        
        JLabel pannumber = new JLabel("PAN number : ");
        pannumber.setFont(new Font("Raleway",Font.BOLD,20));
        pannumber.setBounds(100,440,300,30);
        add(pannumber);
        
        
        addTxt = new JTextField();
        addTxt.setFont(new Font("Raleway",Font.BOLD,14));
        addTxt.setBounds(300,440,400,30);
        add(addTxt);
        
        
        JLabel aadhar = new JLabel("AADHAR Number : ");
        aadhar.setFont(new Font("Raleway",Font.BOLD,20));
        aadhar.setBounds(100,490,300,30);
        add(aadhar);
        
        
        cityTxt = new JTextField();
        cityTxt.setFont(new Font("Raleway",Font.BOLD,14));
        cityTxt.setBounds(300,490,400,30);
        add(cityTxt);
        
        
        JLabel disable = new JLabel("Valunerable Member: ");
        disable.setFont(new Font("Raleway",Font.BOLD,20));
        disable.setBounds(100,540,300,30);
        add(disable);
        
        
        stateTxt = new JTextField();
        stateTxt.setFont(new Font("Raleway",Font.BOLD,14));
        stateTxt.setBounds(300,540,400,30);
        add(stateTxt);
        
        
        JLabel extAcc = new JLabel("Existing account : ");
        extAcc.setFont(new Font("Raleway",Font.BOLD,20));
        extAcc.setBounds(100,590,300,30);
        add(extAcc);
        
        
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
   
    new SignupTwo();
    
    }
    }





