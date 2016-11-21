//for misc jobs
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class UndefinedJobPanel extends JPanel{
   
   private JCheckBox otherJob;
   private JLabel descriptionLabel;
   private JTextArea descriptionTxt;

   
   public UndefinedJobPanel(){
      otherJob = new JCheckBox("Other Job");
      descriptionLabel = new JLabel();
      descriptionTxt = new JTextArea(4, 25);
      
      add(otherJob);
      add(descriptionLabel);
      add(descriptionTxt);

         
      }
      
    public double getJobCost(){
         if(otherJob.isSelected()){
            return 200;
         } else{
            return 0;
         }
    }
      
}



