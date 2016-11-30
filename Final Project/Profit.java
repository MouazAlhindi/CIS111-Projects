//Profit class from Money interface

public class Profit extends Money{

   public Profit(double d, String n){
      super(d, n);
   }
   
   public double getValue(){
      return getData();
   }
   
}