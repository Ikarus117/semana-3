import javax.swing.JOptionPane;

public class Exer2
{
   public static void main (String [] args){
      
      int numero;
         
         numero = Integer.parseInt(JOptionPane.showInputDialog ("Digite o Numero"));
         
         JOptionPane.showMessageDialog(null,"O valor do Numero Digitado: " + numero );
   }
}