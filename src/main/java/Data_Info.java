
import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;


public class Data_Info extends JFrame {
    Data_Info(){
        setSize(900,700);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        
        String data[][]={ {"101","2019-06-08","Girija Prasad Bhattarai","Bhadrapur","BCA","4"}};   
        String column[]={"BILL NO.","DATE","NAME","ADDRESS","FACULTY","SEMESTER"/*,"CLASS","ROLL NO","PHONE","EMAIL","ADMISSION FEE","REG FEE","TUTION","ID","LAB","LIBRARY","SPORTS","EXAM","HOSTEL","MISCELLENEOUS","SPORTS","OTHER","   ","    ","    ","    ","    ","    ","    ","    ","    ",*/};  
        JTable jt=new JTable(data,column);     
        JScrollPane sp=new JScrollPane(jt);   
        sp.setBounds(10,20,800,80);        
        add(sp); 
                JButton btn1=new JButton("Back");
      btn1.setBounds(150, 609, 150, 40);
      btn1.setBackground(Color.GREEN);
      btn1.setForeground(Color.white);      
      add(btn1);
      btn1.addActionListener((ActionEvent e) -> {
          new Home();
         dispose();
       });
    }
    
}
