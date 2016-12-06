//Graphics Class

//import statements
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Graphics extends JFrame{
   
   //GUI componenets
   private Graph graphPanel;
   private JLabel profitLabel;
   private JLabel expenseLabel;
   private JTextField profitInput;
   private JTextField expenseInput;
   private JButton addProfit;
   private JButton addExpense;
   
   
   public Graphics(){
      
      graphPanel = new Graph();
      
      profitLabel = new JLabel("Enter Profit: ");
      expenseLabel = new JLabel("Enter Expense: ");
      
      profitInput = new JTextField(10);
      profitInput.setEditable(true);
      expenseInput = new JTextField(10);
      expenseInput.setEditable(true);
      
      addProfit = new JButton("Add Profit");
      addProfit.addActionListener(new AddProfitButtonListener());
      
      addExpense = new JButton("Add Expense");
      addExpense.addActionListener(new AddExpenseButtonListener());
      
      setTitle("Money Manager");
      setSize(500, 500);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      pack();
      setVisible(true);
   }
   
   private class AddProfitButtonListener implements ActionListener{
   
      public void actionPerformed(ActionEvent e){
         
      }
   
   }
   
   private class AddExpenseButtonListener implements ActionListener{
      
      public void actionPerformed(ActionEvent e){
      
      }
   }
   
   
   public static void main(String[] args){
      InputData backEnd = new InputData();
      Graph dataGraph = new Graph();
      Graphics program = new Graphics();
      
      
   }

}