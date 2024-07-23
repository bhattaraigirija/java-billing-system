
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class login  extends JFrame {
    login(){
      setTitle("LOGIN PAGE");
      setSize(500,400);
      setLocationRelativeTo(null);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(null);
      setVisible(true);
    
      JLabel l9=new JLabel("Login Page");
      l9.setBounds(170,20,200,50);
      l9.setFont(new Font("Algerian",Font.BOLD,30));
      l9.setForeground(Color.blue);
      add(l9);
    
      
      JLabel add=new JLabel("Username :");
      add.setFont(new Font("Bahnschrift",Font.BOLD,20));
      add.setBounds(50,100,150,20);
      add(add);
      setVisible(true);
        
      JTextField user=new JTextField();
      user.setBounds(170, 95, 250, 35);
      add(user);
      
      JLabel add1=new JLabel("Password :");
      add1.setFont(new Font("Bahnschrift",Font.BOLD,20));
      add1.setBounds(50,160,150,20);
      add(add1);
      setVisible(true);
      JPasswordField user1=new JPasswordField();
      user1.setBounds(170, 160, 250, 35);
      add(user1);
       
     JCheckBox ck=new JCheckBox("Show Password");
     ck.setBounds(170,200,260,20);
     ck.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
          if(ck.isSelected()){
              user1.setEchoChar((char)0);
          }else
          {
               user1.setEchoChar('*'); 
          }
      }            
    });
     add(ck);
     
     
     
     
      JButton btn=new JButton("LOG IN");
      btn.setBounds(160, 225, 200, 40);
      btn.setBackground(Color.GREEN);
      btn.setForeground(Color.white);
      add(btn);
       JButton btn1=new JButton("REGISTER");
      btn1.setBounds(160, 280, 200, 40);
      btn1.setBackground(Color.GREEN);
      btn1.setForeground(Color.white);      
      add(btn1);
       
      JLabel add3=new JLabel("Forgot Password ???");
       add3.setFont(new Font("Bahnschrift",Font.BOLD,13));
      add3.setBounds(180, 330, 200,20);
      add(add3);
      
      
       btn.addActionListener((ActionEvent e)->{
   String username= user.getText().toString();
      String pass=new String(user1.getPassword());
      //JOptionPane.showMessageDialog(null,"Username:"+"  " +username);
        //   JOptionPane.showMessageDialog(null,"Password:"+"  " +pass);
           if(username.equals("admin")&& pass.equals("")){
              new Home();
               dispose();
           }
          else{
    JOptionPane.showMessageDialog(null,"Incorrect username and password");
      }
       });
      
        btn1.addActionListener((ActionEvent e) ->{
          new register_db();
         dispose();
       });
    }
}
      
