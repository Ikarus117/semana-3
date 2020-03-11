import javax.swing.JOptionPane;

public class TamanhoStrings {

public static void main (String [] args){

   String stg1;
   String stg2;
   String stg3;
   
   stg1 = JOptionPane.showInputDialog("Primeira Frase");
   stg2 = JOptionPane.showInputDialog("Segunda Frase");
   stg3 = JOptionPane.showInputDialog("Terceira Frase");
   int numero = stg1.length() + stg2.length() + stg3.length();
   
   JOptionPane.showMessageDialog(null, "O Tamanho e: " + numero);
}
}