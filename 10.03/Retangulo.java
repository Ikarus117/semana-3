import javax.swing.JOptionPane;

public class Retangulo{
public static void main (String [] args) {

   double base = 0;
   double altura = 0;
   double area= 0;
   
   base = Double.parseDouble(JOptionPane.showInputDialog("Digite a Base"));
   altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a Altura"));
   area= base*altura;
   JOptionPane.showMessageDialog (null, "A Area do Retangulo e: " + area + "m^2");
   
}

}