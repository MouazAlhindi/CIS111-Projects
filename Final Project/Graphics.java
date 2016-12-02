//Graphics Class

//import statements
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Graphics extends JFrame{

   public Graphics(){
      
      
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      pack();
      setVisible(true);
   }
   
   private class AddButtonListener implements ActionListener{
   
      public void actionPreformed(ActionEvent e){
      
      }
   
   }
   
   
   public static void main(String[] args){
      InputData backEnd = new InputData();
      Graph dataGraph = new Graph();
      Graphics program = new Graphics();
      
      
   }

}