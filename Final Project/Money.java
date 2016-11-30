//Money Interface

public abstract class Money{
   
   //FEILDS
   private double value;
   private String description;
   
   //CONSTRUCTOR
   public Money(double v, String d){
      this.value = v;
      this.description = d;
   }
   
   //METHODS
   public abstract double getValue();
   
   public double getData(){
      return value;
   }
   
   public String getDescription(){
      return description;
   }
}