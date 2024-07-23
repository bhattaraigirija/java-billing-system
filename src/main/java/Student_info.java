
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Student_info extends JFrame {
    Student_info(){
        setSize(500,700);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        
        JLabel l9=new JLabel("Student Information");
      l9.setBounds(120,20,300,50);
      l9.setFont(new Font("Algerian",Font.BOLD,30));
      l9.setForeground(Color.blue);
      add(l9);
    
      
      JLabel add=new JLabel(" Name:");
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
      
      
      JLabel add4=new JLabel("Faculty");
      add4.setFont(new Font("Bahnschrift",Font.BOLD,20));
      add4.setBounds(50,295,150,20);
      add(add4);
      String Faculty []={"***","BCA","BBA","BBA","BA","BSc","BSc CSIT","MBS","TTM"};
      JComboBox cb=new JComboBox(Faculty);
      cb.setBounds(170, 290, 250, 35);
      add(cb);
      
      JLabel add9=new JLabel("Semester");
      add9.setFont(new Font("Bahnschrift",Font.BOLD,20));
      add9.setBounds(50,350,150,20);
      add(add9);
      String sem []={"***","1","2","3","4","5","6 ","7","8"};
      JComboBox cb_sem=new JComboBox(sem);
      cb_sem.setBounds(170, 345, 250, 35);
      add(cb_sem);
      
      JLabel add0=new JLabel("Year");
      add0.setFont(new Font("Bahnschrift",Font.BOLD,20));
      add0.setBounds(50,400,150,20);
      add(add0);
      String year []={"***","1","2","3","4"};
      JComboBox cb_year=new JComboBox(year);
      cb_year.setBounds(170, 395, 250, 35);
      add(cb_year);
      
       JLabel add5=new JLabel("Class");
      add5.setFont(new Font("Bahnschrift",Font.BOLD,20));
      add5.setBounds(50,450,150,20);
      add(add5);
      String class1 []={ "***","1","2","3","4","5","6","7","8","8","10","11","12"};
      JComboBox cb1=new JComboBox(class1);
      cb1.setBounds(170, 445, 250, 35);
      add(cb1);
      
       JLabel add6=new JLabel("Roll No. :");
      add6.setFont(new Font("Bahnschrift",Font.BOLD,20));
      add6.setBounds(50,500,150,20);
      add(add6);
      JTextField user6=new JTextField();
      user6.setBounds(170, 495, 250, 35);
      add(user6);
      
       JLabel add7=new JLabel("Date :");
      add7.setFont(new Font("Bahnschrift",Font.BOLD,20));
      add7.setBounds(50,550,150,20);
      add(add7);
      JTextField user7=new JTextField();
      user7.setBounds(170, 545, 250, 35);
      add(user7);
      
      /*  JCheckBox ck=new JCheckBox("Show Password");
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
       */
       
     
       JButton btn1=new JButton("Back");
      btn1.setBounds(100, 600, 150, 40);
      btn1.setBackground(Color.GREEN);
      btn1.setForeground(Color.white);      
      add(btn1);
      btn1.addActionListener((ActionEvent e) -> {
          new Home();
         dispose();
       });
     
        JButton btn2=new JButton("Next");
      btn2.setBounds(300, 600, 150, 40);
      btn2.setBackground(Color.GREEN);
      btn2.setForeground(Color.white);      
      add(btn2);
      
      btn2.addActionListener((ActionEvent e) -> {
          new Fee();
         dispose();
       });
    }
        
    }
    

