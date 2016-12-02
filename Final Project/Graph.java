//Graph Panel

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Graph extends JPanel{
   
   //Data points for Graphs
   
   
   //Vars
   private int width;
   private int height;
   private int unitSeperation;
   private int border;
   
   //Java GUI componenets
   private JTextField xAxisLabel;
   private JTextField yAxisLabel;
   

   public Graph(){
      //setup drawing
       //getContentPane().setBackground(Color.white);
   
      //inialize GUI Componenets
      xAxisLabel = new JTextField("Proceding Profit/Expense");
      yAxisLabel = new JTextField("Total Income");
      
      
      setSize(500, 500);
   }
   
   public void paint(Graphics g){
      super.paint(g);
   }
   
   

}