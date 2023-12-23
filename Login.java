package BankManagementSystem;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


class App extends JFrame{

    Container c;
    JLabel labCard,labPin,labWel;
    JButton buttonSignin,buttonClear,buttonSignup;
    JTextField txtCardn,txtpinn;


    App(){

            c = getContentPane();
		    c.setLayout(null);
            labCard = new JLabel("Card Number:");
		    labPin = new JLabel("Pin Number :");


        Icon i1 = new ImageIcon(ClassLoader.getSystemResource("icons//logo.png"));
		Image i2 = ((ImageIcon) i1).getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
		Icon i3 = new ImageIcon(i2);
		JLabel label = new JLabel(i3);
		
		labWel = new JLabel("Welcome To ATM");
		txtCardn = new JPasswordField(20);
		txtpinn = new JPasswordField(20);
		buttonSignin = new JButton("Sign in");
		buttonClear = new JButton("Clear");
		buttonSignup = new JButton("Sign Up");
		buttonSignin.setBounds(280,400,100,40);
		buttonSignin.setBackground(Color.BLACK);
		buttonSignin.setForeground(Color.WHITE);
		buttonClear.setBounds(400,400,100,40);
		buttonClear.setBackground(Color.BLACK);
		buttonClear.setForeground(Color.WHITE);
		buttonSignup.setBounds(293,450,200,40);
		buttonSignup.setBackground(Color.BLACK);
		buttonSignup.setForeground(Color.WHITE);
		labCard.setBounds(150,200,200,100);
		txtCardn.setBounds(300,240,300,25);
		labPin.setBounds(150,300,200,100);
		txtpinn.setBounds(300,340,300,25);
		label.setBounds(230,130,100,100);
		//labIcon.setBounds(70,10,100,100);
		labWel.setBounds(350,10,250,350);
                
                Font y = new Font("Arial",Font.PLAIN,15);
		Font f = new Font("Raleway",Font.BOLD,20);
		labCard.setFont(f);
		labPin.setFont(f);
		labWel.setFont(f);
		txtCardn.setFont(y);
		txtpinn.setFont(y);
		buttonSignin.setFont(f);
		buttonClear.setFont(f);
		buttonSignup.setFont(f);
		
		c.add(labCard);
		c.add(labPin);
		c.add(txtCardn);
		c.add(txtpinn);
		c.add(buttonSignin);
		c.add(buttonClear);
		c.add(buttonSignup);
		c.add(labWel);
		c.add(label);



         ActionListener a1=(ae)->{
			
			txtCardn.setText("");
			txtpinn.setText("");
		
			};
			buttonClear.addActionListener(a1);
			
ActionListener a2 = (ae)->{
		setVisible(false);
		new Signup().setVisible(true);
	
		};	
		buttonSignup.addActionListener(a2);


			/*public void actionPerformed(ActionEvent ae){

				if(ae.getSource() == clear){
					txtCardn.setText("");
					txtpinn.setText("");
				}else if(ae.getSource() == signup){
					setVisible(false);
					new Signup().setVisible(true);
				}

			}*/
			

    }    

}

public class Login{

    public static void main(String args[])
	{ 
		App l = new App();
		l.setSize(800,600);
		l.setLocationRelativeTo(null);
		l.setTitle("Automated Teller Machine");
		l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		l.setVisible(true);
		
	}

}