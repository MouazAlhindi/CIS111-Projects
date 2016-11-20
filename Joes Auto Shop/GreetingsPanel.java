//Greeting Panel

import javax.swing.*;
import java.awt.*;

public class GreetingsPanel extends JPanel{
   
   private JLabel greeting;
   
   public GreetingsPanel(){
   
      //create the label
      greeting = new JLabel("Welcome to Joe's Automotive!");
      
      //add the label to the panel
      add(greeting);
      
   }

}