package ejemplos.guillermoNavarro.entradaSalida;

import javax.swing.JOptionPane;

public class EjemploEntradaSalida {

	public static void main(String[] args) {
	int sum1 = Integer.parseInt(JOptionPane.showInputDialog("Escriba un dato: "));
	int sum2 = Integer.parseInt(JOptionPane.showInputDialog("Escriba un dato: "));
	int sum3 = sum1 + sum2;	

		
	JOptionPane.showMessageDialog(null, "El resultado es: " + sum3, null, JOptionPane.PLAIN_MESSAGE);
	}

}
