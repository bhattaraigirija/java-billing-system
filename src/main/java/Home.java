import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
public class Home extends JFrame {
    Home(){
        setSize(610,500);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        JMenuBar menub=new JMenuBar();
        menub.setBounds(0,0,610,35);
        menub.setBackground(Color.DARK_GRAY);
         add(menub);
       JMenu menu=new JMenu("Home");
        menu.setForeground(Color.white);
        menu.setBounds(0,0,50,35);
       menub.add(menu);
       JMenuItem i1=new JMenuItem("home");
       menu.add(i1);
        JMenu menu1=new JMenu("About");
        JMenuItem i2=new JMenuItem("About Application");
        JMenuItem i3=new JMenuItem("About Developer");
         menu1.setForeground(Color.white);
         menu1.add(i2);
          menu1.add(i3);
        menub.add(menu1);
        JMenu menu2=new JMenu("Help");
        JMenuItem i4=new JMenuItem("User Mannual");
        menu2.add(i4);
         menu2.setForeground(Color.white);
       menub. add(menu2);
        JMenu menu3=new JMenu("LogOut");
         JMenuItem i5=new JMenuItem("Click Here");
         menu3.add(i5);
         menu3.setForeground(Color.white);
       menub. add(menu3);
       
       i5.addActionListener((ActionEvent e) -> {
          new login();
         dispose();
       });
       
       
      JLabel l9=new JLabel("Choose One");
      l9.setBounds(240,40,200,50);
      l9.setFont(new Font("Algerian",Font.BOLD,20));
      l9.setForeground(Color.black);
      add(l9);ImageIcon img =new ImageIcon(new ImageIcon("D:\\Help\\Fourth Sem\\project i\\Billing_system\\Billing_system\\src\\main\\info.png\\").getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT));
       JButton jb=new JButton(img);
       jb.setBounds(80,100,200,200);
       add(jb);
       
   
       ImageIcon img1 =new ImageIcon(new ImageIcon("D:\\Help\\Fourth Sem\\project i\\Billing_system\\Billing_system\\src\\main\\user.png\\").getImage().getScaledInstance(220,220,Image.SCALE_DEFAULT));
       JButton jb1=new JButton(img1);
       jb1.setBounds(340,100,200,200);
       add(jb1);
       
       
     
       
       
       JLabel l8=new JLabel("View  Old  Information");
       l8.setBounds(95, 320, 200,35);
       l8.setFont(new Font("Bahnschrift",Font.BOLD,20));
       l8.setVisible(true);
       add(l8);
       JLabel l7=new JLabel("(Student Detail)");
       l7.setBounds(115, 350, 160,35);
       l7.setFont(new Font("Bahnschrift",Font.BOLD,20));
       l7.setVisible(true);
       add(l7);
       
       JLabel l6=new JLabel("Add New  Information");
       l6.setBounds(355, 320, 200,35);
       l6.setFont(new Font("Bahnschrift",Font.BOLD,20));
       l6.setVisible(true);
       add(l6);
       JLabel l5=new JLabel("(Print Bill)");
       l5.setBounds(395, 350, 200,35);
       l5.setFont(new Font("Bahnschrift",Font.BOLD,20));
       l5.setVisible(true);
       add(l5);
       
       
        jb1.addActionListener((ActionEvent e) -> {
          new Student_info();
         dispose();
       });
         jb.addActionListener((ActionEvent e) -> {
          new Data_Info();
         dispose();
       });
         
        
        
        
        
    }  
}
