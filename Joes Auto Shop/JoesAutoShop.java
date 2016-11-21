/*
Mouaz Alhindi
LAB 8: Page 

*/
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JoesAutoShop extends JFrame{

   private Jobs jobPanel;
   private GreetingsPanel welcomePanel;
   private UndefinedJobPanel otherJobPanel;
   private JPanel buttonPanel;
   private JLabel totalCost;
   private JTextField total;
   private JButton calcButton;
   
   
   public JoesAutoShop(){
      
      //initalize frame
      setTitle("Joes Automotive");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(1080, 720);
      
      //set a layout
      setLayout(new BorderLayout());
      
      //set panels 
      jobPanel = new Jobs();
      welcomePanel = new GreetingsPanel();
      otherJobPanel = new UndefinedJobPanel();
      makeButtonPanel();
      
      //add panels and set location
      add(welcomePanel, BorderLayout.NORTH);
      add(jobPanel, BorderLayout.CENTER);
      add(buttonPanel, BorderLayout.SOUTH);
      add(otherJobPanel, BorderLayout.EAST);
      
      
      pack();
      setVisible(true);

   }
   
   //method to add a components and initalize the buttonpanel
   private void makeButtonPanel(){
      
      totalCost = new JLabel("Cost of selected Job(s) [with tax]: ");
      total = new JTextField(10);
      total.setEditable(true);
      
      buttonPanel = new JPanel(); 
      
      calcButton = new JButton("Calculate Cost");
      
      calcButton.addActionListener(new CalcButtonListener());
      
      buttonPanel.add(calcButton);
      buttonPanel.add(totalCost);
      buttonPanel.add(total);
   }
   
    
    //calc button listener, will calculate total cost
    private class CalcButtonListener implements ActionListener{
   
      public void actionPerformed(ActionEvent e){
         double cost = jobPanel.getJobCost() + otherJobPanel.getJobCost();
         double tax = .06;
         
         cost +=  cost * tax;
         
         String input = Double.toString(cost);
         total.setText(input);    
      }
   }
   
   //main method
   public static void main(String[] args){
      JoesAutoShop test = new JoesAutoShop();
   }
   
   
   
}