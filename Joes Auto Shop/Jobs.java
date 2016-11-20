//Job Panel
import java.util.*;
import javax.swing.*;
import java.awt.*;

public class Jobs extends JPanel{
   
   //public feilds, just incase ActionListener class need to access this data
   public final double OIL_CHANGE = 26.0;
   public final double LUBE_JOB = 18.0;
   public final double RADIATOR_FLUSH = 30.0;
   public final double TRANSMISSION_FLUSH = 80.0;
   public final double INSPECTION = 15.0;
   public final double MUFFLER_REPLACEMENT = 100.0;
   public final double TIRE_ROTATION = 20.0;
   
   private JCheckBox oilChange;
   private JCheckBox lubeJob;
   private JCheckBox radiatorFlush;
   private JCheckBox transmissionFlush;
   private JCheckBox inspection;
   private JCheckBox mufflerReplacement;
   private JCheckBox tireRotation;
   
   
   
   public Jobs (){
      //set layout to order the diffrent jobs
      setLayout(new GridLayout(7, 1));
      
      //create checkboxes
      oilChange = new JCheckBox("Oil Change");
      lubeJob = new JCheckBox("Lube Job");
      radiatorFlush = new JCheckBox("Radiator Flush");
      transmissionFlush = new JCheckBox("Transmission Flush");
      inspection = new JCheckBox("Inspection");
      mufflerReplacement = new JCheckBox("Muffler Replacement");
      tireRotation = new JCheckBox("Tire Rotation");
      
      //adding the check boxes to the panel
      add(oilChange);
      add(lubeJob);
      add(radiatorFlush);
      add(transmissionFlush);
      add(inspection);
      add(mufflerReplacement);
      add(tireRotation);
   }
   
   public double getJobCost(){
      double jobCost = 0.0;
      
      if(oilChange.isSelected()){
         jobCost += OIL_CHANGE;
      } if(lubeJob.isSelected()) {
         jobCost += LUBE_JOB;
      } if(radiatorFlush.isSelected()){
         jobCost += RADIATOR_FLUSH;
      } if(transmissionFlush.isSelected()){
         jobCost += TRANSMISSION_FLUSH;
      } if(inspection.isSelected()){
         jobCost += INSPECTION;
      } if(mufflerReplacement.isSelected()){
         jobCost += MUFFLER_REPLACEMENT;
      } if(tireRotation.isSelected()){
         jobCost += TIRE_ROTATION;
      }
      
      return jobCost;
   }
}