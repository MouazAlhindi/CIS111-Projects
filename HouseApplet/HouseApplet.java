/*
Mouaz Alhindi
LAB 9: House Applet
Purpose: Make an application that draws a house and responds to the users mouse
so that if you click on a window or door, the door or window that was clicked on
is shown either open or closed
*/
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HouseApplet extends JFrame{
   
   //COORDINATED OF ROOF POLOYGON
   private int[] xCoorPoly = {50,250,450};
   private int[] yCoorPoly = {200,50,200};
   //USED FOR OPEN CLOSE LOGIC
   boolean leftWindowOpen = false;
   boolean rightWindowOpen = false;
   boolean doorOpen = false;
   //CORRDINATED FOR MOUSE ON FRAME
   private int currentX;
   private int currentY;
 
   
   //CONSTRUCTOR
   public HouseApplet(){
      
      getContentPane().setBackground(Color.white);
      
      addMouseListener(new MyMouseListener());
      
      setTitle("House Applet");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(500, 500);
      setVisible(true);  
   }
   
   //MAIN PAINT METHOD
   public void paint(Graphics g){
      super.paint(g);
      
      g.setColor(Color.black);
      drawHouse(g);
      drawDoor(g);
      drawRightWindow(g);
      drawLeftWindow(g);
      

      
      
      //LEFT WINDOW OPEN CLOSE BOOLEAN LOGIC
      if((currentX >= 100 && currentX <= 200) && (currentY >= 300 && currentY <= 400) ){
         leftWindowOpen = openCloseLogic(leftWindowOpen);
      } 
      //RIGHT WINDOW OPEN CLOSE BOOLEAN LOGIC
      if((currentX >= 300 && currentX <= 400) && (currentY >= 300 && currentY <= 400)){
         rightWindowOpen = openCloseLogic(rightWindowOpen);
      }
      //DOOR OPEN CLOSE BOOLEAN LOGIC
      if((currentX >= 225 && currentX <= 275) && (currentY >= 350 && currentY <= 450)){
         doorOpen = openCloseLogic(doorOpen);
      }
      
      
      //LEFT WINDOW OPEN CLOSE GUI LOGIC
      if(leftWindowOpen == true){
         openLeftWindow(g);
      } else {
         drawLeftWindow(g);
      }
      //RIGHT WINDOW OPEN CLOSE GUI LOGIC
      if(rightWindowOpen == true){
         openRightWindow(g);
      } else {
         drawRightWindow(g);
      }
      //DOOR OPEN CLOSE GUI LOGIC
      if(doorOpen == true){
         drawNoDoor(g);
      }  else {
         drawDoor(g);
      }
   }
   
   public boolean openCloseLogic(boolean b){
      if(!b){
         b = true;
      } else {
         b = false;
      }
      
      return b;
   }
   
   //DRAW HOUSE
   public void drawHouse(Graphics g){
      g.drawPolygon(xCoorPoly, yCoorPoly, 3);
      g.drawRect(50, 200, 400, 250);
   }
   
   //DRAWS RIGHT WINDOW
   public void drawRightWindow(Graphics g){
     //RIGHT WINDOW
     g.drawRect(300, 300, 100, 100);
     g.drawLine(300, 350, 400, 350); 
     g.drawLine(350, 300, 350, 400);
   }
   
   //DRAWS LEFT WINDOW
   public void drawLeftWindow(Graphics g){
     //LEFT WINDOW 
     g.drawRect(100, 300, 100, 100);
     g.drawLine(100, 350, 200, 350);
     g.drawLine(150, 300, 150, 400);     
   }
   
   //DRAWS DOOR
   public void drawDoor(Graphics g){
      g.drawRect(225, 350, 50, 100); 
      g.fillOval(255,400,10,10);  
   }
   
   //DRAWS NO LEFT WINDOW
   public void openLeftWindow(Graphics g){
      //LEFT WINDOW
      g.fillRect(100, 300, 100, 100);    
   }
   
   //DRAWS NO RIGHT WINDOW
   public void openRightWindow(Graphics g){
      //RIGHT WINDOW
      g.fillRect(300, 300, 100, 100);
   }
   
   //DRWAS NO DOOR
   public void drawNoDoor(Graphics g){
      g.fillRect(225, 350, 50, 100);
   }
   

   //MOUSE LISTENER

   private class MyMouseListener implements MouseListener{
      
      //MOUSE CLICK EVENT GATHERS MOUSE COORDINATES AND REPAINTS GUI IMAGE
      public void mouseClicked(MouseEvent e){
         currentX = e.getX();
         currentY = e.getY();
         
         repaint();
      }
      
      //MOUSE PRESSED EVENT
      public void mousePressed(MouseEvent e){
      
      }
      
      //MOUSE RELEASED EVENT
      public void mouseReleased(MouseEvent e){
      
      }
      
      //MOUSE ENTERED EVENT
      public void mouseEntered(MouseEvent e){
      
      }
      
      //MOUSE EXITED EVENT
      public void mouseExited(MouseEvent e){
         
      }
   }
   

   //MAIN METHOD
   public static void main(String[] args){
      HouseApplet test = new HouseApplet();
   }
   
}