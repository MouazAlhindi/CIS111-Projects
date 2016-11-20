/*
Mouaz Alhindi
LAB 8: Page 

*/
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JoesAutoShop extends JFrame {

   private Jobs jobPanel;
   private GreetingsPanel welcomePanel;
   private JPanel buttonPanel;
   private JLabel totalCost;
   private JTextField total;
   private JButton calcButton;
   
   
   public JoesAutoShop(){
      
      setTitle("Joes Automotive");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(new BorderLayout());
      
      makeButtonPanel();

      
   }
   
   //method to add a button panel
   public void makeButtonPanel(){
      
      totalCost = new JLabel("Cost of selected Job(s): ");
      total = new JTextField(4);
      total.setEditable(true);
      
      buttonPanel = new JPanel(); 
      
      calcButton = new JButton("Calculate Cost");
      
      calcButton.addActionListener(new CalcButtonListener());
      
      buttonPanel.add(calcButton);
      buttonPanel.add(total);
      buttonPanel.add(totalCost);
   }
   
    private class CalcButtonListener implements ActionListener{
   
      public void actionPreformed(ActionEvent e){
         double cost = jobPanel.getJobCost();
         double tax = .06;
         
         cost +=  cost * tax;
         
         String input = Double.toString(cost);
         total.setText(input);
         
         
      }
   }
   
   
   
}