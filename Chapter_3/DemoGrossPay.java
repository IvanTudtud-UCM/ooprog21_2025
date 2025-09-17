   import javax.swing.*;
   
      public class DemoGrossPay {
      
         public static void main (String[] args){
         
            String input1 = JOptionPane.showInputDialog("Enter Worked Hours: ");
            double inputHours1 = Double.parseDouble(input1);
            
            String input2 = JOptionPane.showInputDialog("Enter Worked Hours: ");
            double inputHours2 = Double.parseDouble(input2);
            
            String input3 = JOptionPane.showInputDialog("Enter Worked Hours: ");
            double inputHours3 = Double.parseDouble(input3);
                  
            calculateGross(inputHours1);
            calculateGross(inputHours2);
            calculateGross(inputHours3);
         }
         
         static void calculateGross(double hour){
       
            double hourlyRate = 22.75;
            double grossPay = hour * hourlyRate;
            
            System.out.printf("%s hours at $%s per hour is $%s\n", hour, hourlyRate, grossPay);
            
         }
      }
