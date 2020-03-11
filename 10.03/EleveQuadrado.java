import javax.swing.JOptionPane;
public class EleveQuadrado{

   public static void main (String [] args){
   
      
      double base = 0;
      
      base = Double.parseDouble(JOptionPane.showInputDialog ("Digite um numero"));
      
      base = Math.pow(base,2);
        
      JOptionPane.showMessageDialog(null, "O NUmero e: " + base );
      
   }
}