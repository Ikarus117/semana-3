import javax.swing.JOptionPane;

public class Exer3{
   public static void main (String [] args){
      
      int dia;
      int mes;
      int ano;
      
      dia = Integer.parseInt (JOptionPane.showInputDialog("Digite o Dia"));
      mes = Integer.parseInt (JOptionPane.showInputDialog("Digite o Mes"));
      ano = Integer.parseInt (JOptionPane.showInputDialog("Digite o Ano"));
      
      JOptionPane.showMessageDialog (null, dia + " / " + mes + " / " + ano);
   }
}