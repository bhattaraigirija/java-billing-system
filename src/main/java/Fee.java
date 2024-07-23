
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Fee extends JFrame {
    Fee(){
         setSize(800,600);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        JLabel l9=new JLabel("Fee Information");
      l9.setBounds(220,10,300,40);
      l9.setFont(new Font("Algerian",Font.BOLD,30));
      l9.setForeground(Color.blue);
      add(l9);
    JLabel add0=new JLabel(" 1.Admission Fee:");
      add0.setFont(new Font("Bahnschrift",Font.BOLD,20));
      add0.setBounds(30,55,150,20);
      add(add0);
      setVisible(true);
      JTextField user0=new JTextField();
      user0.setBounds(190, 45, 160, 35);
      add(user0);
      
      JLabel add=new JLabel(" 2. Reg Fee:");
      add.setFont(new Font("Bahnschrift",Font.BOLD,20));
      add.setBounds(30,95,150,24);
      add(add);
      setVisible(true);
        
      JTextField user=new JTextField();
      user.setBounds(190, 90, 160, 35);
      add(user);
      
      JLabel add1=new JLabel("3. Tuition Fee:");
      add1.setFont(new Font("Bahnschrift",Font.BOLD,20));
      add1.setBounds(30,145,150,20);
      add(add1);
      setVisible(true);
      
        
      JTextField user1=new JTextField();
      user1.setBounds(190, 140,160, 35);
      add(user1);
      
       JLabel add2=new JLabel("4.Identity Card Fee :");
      add2.setFont(new Font("Bahnschrift",Font.BOLD,20));
      add2.setBounds(30,195,150,20);
      add(add2);
      setVisible(true);
      JTextField user2=new JTextField();
      user2.setBounds(190, 190, 160, 35);
      add(user2);
      
       JLabel add3=new JLabel("5. Labtory Fee:");
      add3.setFont(new Font("Bahnschrift",Font.BOLD,20));
      add3.setBounds(30,245,150,20);
      add(add3);
      JTextField user3=new JTextField();
      user3.setBounds(190, 240, 160, 35);
      add(user3);
      
      
      JLabel add4=new JLabel("6. Library Fee:");
      add4.setFont(new Font("Bahnschrift",Font.BOLD,20));
      add4.setBounds(30,295,150,20);
      add(add4);
      JTextField cb=new JTextField ();
      cb.setBounds(190, 290, 160, 35);
      add(cb);
      
       JLabel add5=new JLabel("7. Sports Fee:");
      add5.setFont(new Font("Bahnschrift",Font.BOLD,20));
      add5.setBounds(30,350,150,20);
      add(add5);
      JTextField  cb1=new JTextField ();
      cb1.setBounds(190, 345, 160, 35);
      add(cb1);
      
       JLabel add6=new JLabel("8. Exam Fee:");
      add6.setFont(new Font("Bahnschrift",Font.BOLD,20));
      add6.setBounds(30,400,150,20);
      add(add6);
      JTextField user6=new JTextField();
      user6.setBounds(190, 395, 160, 35);
      add(user6);
      
       JLabel add7=new JLabel("9. Hostel Fee:");
      add7.setFont(new Font("Bahnschrift",Font.BOLD,20));
      add7.setBounds(30,450,150,20);
      add(add7);
      JTextField user7=new JTextField();
      user7.setBounds(190, 445,160, 35);
      add(user7);
      
        
      JLabel add10=new JLabel(" 10.Miscelleneous Fee:");
      add10.setFont(new Font("Bahnschrift",Font.BOLD,20));
      add10.setBounds(395,45,200,20);
      add(add10);
      setVisible(true);
      
      JTextField user10=new JTextField();
      user10.setBounds(600, 40, 160, 35);
      add(user10);
     
      JLabel add11=new JLabel(" 12.Uniform Fee:");
      add11.setFont(new Font("Bahnschrift",Font.BOLD,20));
      add11.setBounds(395,90,150,24);
      add(add11);
      setVisible(true);
        
      JTextField user11=new JTextField();
      user11.setBounds(600, 85, 160, 35);
      add(user11);
    
      JLabel add12=new JLabel("13. Fine/Late Fee:");
      add12.setFont(new Font("Bahnschrift",Font.BOLD,20));
      add12.setBounds(398,140,150,20);
      add(add12);
      setVisible(true); 
      JTextField user12=new JTextField();
      user12.setBounds(600, 135, 160, 35);
      add(user12);
      
      JLabel add13=new JLabel("14.Monthly Fee:");
       add13.setFont(new Font("Bahnschrift",Font.BOLD,20));
      add13.setBounds(398, 180, 190, 35);
      add(add13);
      JTextField use13=new JTextField();
      use13.setBounds(600, 180, 160, 35);
      add(use13);
      
     JLabel add14=new JLabel("15.Insurance:");
      add14.setFont(new Font("Bahnschrift",Font.BOLD,20));
      add14.setBounds(398, 230, 190, 35);
      add(add14);
      JTextField use14=new JTextField();
      use14.setBounds(600, 230, 160, 35);
      add(use14);
      
       JLabel add15=new JLabel("16.School Devlopment Fee:");
        add15.setFont(new Font("Bahnschrift",Font.BOLD,20));
      add15.setBounds(398, 280, 190, 35);
      add(add15);
      JTextField use15=new JTextField();
      use15.setBounds(600, 280, 160, 35);
      add(use15);
      
      
       JLabel add16=new JLabel("17.Copy & Books:");
        add16.setFont(new Font("Bahnschrift",Font.BOLD,20));
      add16.setBounds(398, 323, 190, 35);
      add(add16);
      JTextField use16=new JTextField();
      use16.setBounds(600, 323, 160, 35);
      add(use16);
      
       JLabel add17=new JLabel("18.Student Union Fee:");
        add17.setFont(new Font("Bahnschrift",Font.BOLD,20));
      add17.setBounds(398, 364, 190, 35);
      add(add17);
      JTextField use17=new JTextField();
      use17.setBounds(600, 364, 160, 35);
      add(use17);
       JLabel add18=new JLabel("19.Bus Fare:");
        add18.setFont(new Font("Bahnschrift",Font.BOLD,20));
      add18.setBounds(398, 404, 190, 35);
      add(add18);
      JTextField use18=new JTextField();
      use18.setBounds(600, 404, 160, 35);
      add(use18);
      
       JLabel add19=new JLabel("20.Other Fee:");
        add19.setFont(new Font("Bahnschrift",Font.BOLD,20));
      add19.setBounds(398, 444, 190, 35);
      add(add19);
      JTextField use19=new JTextField();
      use19.setBounds(600, 444, 160, 35);
      add(use19);
      /*
       JTextField user20=new JTextField("21.");
      user20.setBounds(398, 460, 190, 35);
      add(user20);
      JTextField use20=new JTextField();
      use20.setBounds(600, 460, 160, 35);
      add(use20);
      
      */
      
         JButton btn1=new JButton("Back");
      btn1.setBounds(100, 500, 150, 40);
      btn1.setBackground(Color.GREEN);
      btn1.setForeground(Color.white);      
      add(btn1);
      btn1.addActionListener((ActionEvent e) -> {
          new Student_info();
         dispose();
       });
     
        JButton btn2=new JButton("Next");
      btn2.setBounds(500, 500, 150, 40);
      btn2.setBackground(Color.GREEN);
      btn2.setForeground(Color.white);      
      add(btn2);
      
      btn2.addActionListener((ActionEvent e) -> {
          new Print_save();
         dispose();
       });
    }
    
}
