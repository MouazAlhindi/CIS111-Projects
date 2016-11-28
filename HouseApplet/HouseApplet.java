/*
Mouaz Alhindi
LAB 9: House Applet
*/
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HouseApplet extends JFrame{
   
   private int[] xCoorPoly = {50,250,450};
   private int[] yCoorPoly = {200,50,200};
   
   private int currentX;
   private int currentY;
 
   
   //constructor
   public HouseApplet(){
      
      getContentPane().setBackground(Color.white);
      
      
      setTitle("House Applet");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(500, 500);
      setVisible(true);  
   }
   
   //main paint method
   public void paint(Graphics g){
      super.paint(g);
      
      g.setColor(Color.black);
      drawHouse(g);
      drawDoor(g);
      drawWindow(g);
   }
   
   //draws house
   public void drawHouse(Graphics g){
      g.drawPolygon(xCoorPoly, yCoorPoly, 3);
      g.drawRect(50, 200, 400, 250);
   }
   
   //draws window
   public void drawWindow(Graphics g){
      
     //left window 
     g.drawRect(100, 300, 100, 100);
     g.drawLine(100, 350, 200, 350);
     g.drawLine(150, 300, 150, 400);
     //right window
     g.drawRect(300, 300, 100, 100);
     g.drawLine(300, 350, 400, 350); 
     g.drawLine(350, 300, 350, 400);
   }
   
   //draws door
   public void drawDoor(Graphics g){
      g.drawRect(225, 350, 50, 100); 
      g.fillOval(255,400,10,10);  
   }
   
   //draws no window
   public void openLeftWindow(Graphics g){
      
      //left window
      g.fillRect(100, 300, 100, 100);    
   }
   
   public void openRightWindow(Graphics g){
      //right window
      g.fillRect(300, 300, 100, 100);
   }
   
   //draws no door
   public void drawNoDoor(Graphics g){
      g.fillRect(225, 350, 50, 100);
   }
   
   /*
   //Mouse Listener
   private class MyMouseListener implements MouseListener{
   
      public void mouseClicked(MouseEvent e){
         currentX = e.getX();
         currentY = e.getY();
         
         repaint();
         
         //left window if statement
            //if((currentX >= 100 && currentX <= 200) && (currentY >= 300 && currentY <= 400) ){
           //    openLeftWindow();
           // }
      }
   }
   
   */

   //Main Method
   public static void main(String[] args){
      HouseApplet test = new HouseApplet();
   }
   
}