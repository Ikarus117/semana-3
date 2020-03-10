import javax.swing.JOptionPane;

public class Exer4{
   
   public static void main(String [] args){
   
      int peso;
      int kg;
      
      peso = Integer.parseInt (JOptionPane.showInputDialog ("Digite seu Peso"));
      kg = Integer.parseInt (JOptionPane.showInputDialog ("Digite as Kilogramas"));
      
      JOptionPane.showMessageDialog(null, "O peso informado foi: " + peso + "," + kg + " kilogramas");
   
   }

}