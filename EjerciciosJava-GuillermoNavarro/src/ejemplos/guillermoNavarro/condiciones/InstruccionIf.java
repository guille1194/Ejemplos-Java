package ejemplos.guillermoNavarro.condiciones;

import javax.swing.JOptionPane;

public class InstruccionIf {

	public static void main(String[] args) {
		int sum1 = Integer.parseInt(JOptionPane.showInputDialog("Escriba un dato: "));
		int sum2 = Integer.parseInt(JOptionPane.showInputDialog("Escriba un dato: "));
		int sum3 = sum1 + sum2;	

		
		JOptionPane.showMessageDialog(null, "El resultado es: " + sum3, null, JOptionPane.PLAIN_MESSAGE);
		
		if (sum1 == 0 || sum2 == 0){
			JOptionPane.showMessageDialog(null, "El numero es igual a 0 ", null, JOptionPane.PLAIN_MESSAGE);	
		}
		
		if(sum1 > sum2){
			JOptionPane.showMessageDialog(null, "El primer numero es mayor al segundo ", null, JOptionPane.PLAIN_MESSAGE);	
		}
		else {
			JOptionPane.showMessageDialog(null, "El segundo numero es mayor al primero ", null, JOptionPane.PLAIN_MESSAGE);	
		}
		
		if(sum1 == sum2){
			JOptionPane.showMessageDialog(null, "Los dos numeros son iguales ", null, JOptionPane.PLAIN_MESSAGE);	
		}
		else if(sum1 > sum2){
			JOptionPane.showMessageDialog(null, "El primer numero es mayor al segundo ", null, JOptionPane.PLAIN_MESSAGE);	
		}
		else {
			JOptionPane.showMessageDialog(null, "El segundo numero es mayor al primero ", null, JOptionPane.PLAIN_MESSAGE);	
		}
		
		String test = (sum1 > sum2)? "el primero es mayor al segundo" : "el segundo es mayor al primero";
		JOptionPane.showMessageDialog(null, test, null, JOptionPane.PLAIN_MESSAGE);
		
	}

}
