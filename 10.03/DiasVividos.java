import javax.swing.JOptionPane;

public class DiasVividos{

public static void main (String [] args ){

   int idade;
   idade = Integer.parseInt(JOptionPane.showInputDialog ("Digite a sua Idade"));
   
   idade = idade*360;
   JOptionPane.showMessageDialog(null, "Parabens, Voce esta vivo a: " + idade + " dias");

 }  

}