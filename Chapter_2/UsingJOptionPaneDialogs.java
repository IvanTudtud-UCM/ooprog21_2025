import javax.swing.JOptionPane;

public class UsingJOptionPaneDialogs {

   public static void main (String[] args){
   
      for (int i = 1; ; i++){
      
      String name = JOptionPane.showInputDialog("What is your name?");
      
      if (name == null || name.isEmpty()){
         JOptionPane.showMessageDialog(null, "Please input your name!");
      break;
      }
      
      int response = JOptionPane.showConfirmDialog(null, "Is your name " + name + "?", "Confirm", JOptionPane.YES_NO_OPTION);
      
      if (response == JOptionPane.YES_OPTION){
         JOptionPane.showMessageDialog(null, "Hello, " + name + "!");
      break;
      }
      
      }
   }
}
