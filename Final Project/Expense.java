//Expense Class from Money interface

public class Expense extends Money{
   
   //FEILDS
   
   //CONSTRUCTOR
   public Expense(double d, String s){
      super(d, s);
   }
   
   //METHODS
   public double getValue(){
      return -(getData());
   }
}