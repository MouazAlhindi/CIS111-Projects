//Input data class, acts as backend for data

import java.util.*;

public class InputData{
   //FEILDS
   private ArrayList<Money> list = new ArrayList();
   
   //CONSTRUCTOR
   public InputData(){
   
   }
   
   //METHODS
   public void addProfit(double val, String des){
      list.add(new Profit(val, des));
   }
   
   public void addExpense(double val, String des){
      list.add(new Expense(val, des));
   }
   
   public double getTotalIncome(){
      double totalIncome = 0;
      
      for(Money m: list){
         totalIncome += m.getValue();
      }
      
      return totalIncome;
   }
   
   public double getTotalProfit(){
      double totalProfit = 0;
      
      for(Money m: list){
         if(m instanceof Profit){
            totalProfit += m.getValue();
         }
      }
      
      return totalProfit;
   }
   
   public double getTotalExpense(){
      double totalExpense = 0;
      
      for(Money m: list){
         if(m instanceof Expense){
            totalExpense += m.getValue();
         }
      }
      
      return totalExpense;
   }
}
