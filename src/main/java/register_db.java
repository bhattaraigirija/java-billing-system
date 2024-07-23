
import javax.swing.JFrame;
import java.sql.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

 


 class register_db extends JFrame { 
          Connection conn;
        Statement st;
        void getConnection(){
            
        
        
        try {
                Class.forName("com.mysqli.jdbc.driver");
                conn=DriverManager.getConnection("jdbc:mysqli://localhost:3306/project_i","root","");
                st=conn.createStatement();
                JOptionPane.showMessageDialog(null,"Database connected");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }
        
        
        
        
        
        
        
        setSize(500,600);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        
        JLabel l9=new JLabel("REGISTER");
      l9.setBounds(170,20,200,50);
      l9.setFont(new Font("Algerian",Font.BOLD,30));
      l9.setForeground(Color.blue);
      add(l9);
    
      
      JLabel add=new JLabel("School Name:");
      add.setFont(new Font("Bahnschrift",Font.BOLD,20));
      add.setBounds(50,95,150,20);
      add(add);
      setVisible(true);
        
      JTextField user=new JTextField();
      user.setBounds(170, 90, 250, 35);
      add(user);
      
      JLabel add1=new JLabel("Address :");
      add1.setFont(new Font("Bahnschrift",Font.BOLD,20));
      add1.setBounds(50,145,150,20);
      add(add1);
      setVisible(true);
      
        
      JTextField user1=new JTextField();
      user1.setBounds(170, 140, 250, 35);
      add(user1);
      
       JLabel add2=new JLabel("Email :");
      add2.setFont(new Font("Bahnschrift",Font.BOLD,20));
      add2.setBounds(50,195,150,20);
      add(add2);
      setVisible(true);
      JTextField user2=new JTextField();
      user2.setBounds(170, 190, 250, 35);
      add(user2);
      
       JLabel add3=new JLabel("Phone :");
      add3.setFont(new Font("Bahnschrift",Font.BOLD,20));
      add3.setBounds(50,245,150,20);
      add(add3);
      JTextField user3=new JTextField();
      user3.setBounds(170, 240, 250, 35);
      add(user3);
      
        JLabel add4=new JLabel("Website :");
      add4.setFont(new Font("Bahnschrift",Font.BOLD,20));
      add4.setBounds(50,295,150,20);
      add(add4);
      JTextField user4=new JTextField();
      user4.setBounds(170, 290, 250, 35);
      add(user4);
      
       JLabel add5=new JLabel("Username :");
      add5.setFont(new Font("Bahnschrift",Font.BOLD,20));
      add5.setBounds(50,350,150,20);
      add(add5);
      JTextField user5=new JTextField();
      user5.setBounds(170, 345, 250, 35);
      add(user5);
      
       JLabel add6=new JLabel("Password :");
      add6.setFont(new Font("Bahnschrift",Font.BOLD,20));
      add6.setBounds(50,400,150,20);
      add(add6);
      JPasswordField user6=new JPasswordField();
      user6.setBounds(170, 395, 250, 35);
      add(user6);
      
        JCheckBox ck=new JCheckBox("Show Password");
        ck.setBounds(170,440,260,20);
        ck.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e){
          if(ck.isSelected()){
              user6.setEchoChar((char)0);
          }else
          {
               user6.setEchoChar('*'); 
          }
      }            
    });
     add(ck);
       
       
     
       JButton btn1=new JButton("Save");
      btn1.setBounds(100, 480, 150, 40);
      btn1.setBackground(Color.GREEN);
      btn1.setForeground(Color.white);      
      add(btn1);
     /* btn1.addActionListener(new ActionListener(){
        public void actionPerformed(e){
            if(btn1.isSelected()){
                JOptionPane.showMassegeDialog(this,"Registred Successfully");
            }
        }});*/
     
        JButton btn2=new JButton("Cancel");
      btn2.setBounds(300, 480, 150, 40);
      btn2.setBackground(Color.GREEN);
      btn2.setForeground(Color.white);      
      add(btn2);
      
      btn1.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent ae){
          
              String school_name=user.getText();     
            String address=user1.getText();   
            String email=user2.getText(); 
            String phone=user3.getText();     
            String website=user4.getText();   
            String username=user5.getText(); 
            String password=new String(user6.getPassword()); 
            try{
                String sql="INSERT INTO `register` (`School`, `Address`, `Email`, `Phone`, `Website`, `Username`, `Password`) VALUES "
                     +"( '"+school_name+"','"+address+"','"+email+"','"+phone+"','"+website+"','"+username+"','"+password+"')";
                st.execute(sql); 
                 JOptionPane.showMessageDialog(null,"Registered Successfully");
            }catch(Exception e){
                 JOptionPane.showMessageDialog(null,e); 
            }
          new login();
         //dispose();
          }
          });
      
      
      btn2.addActionListener((ActionEvent e) -> {
          new login();
         dispose();
       });
    }
        
    }
  