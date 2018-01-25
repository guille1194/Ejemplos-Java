package ejemplos.guillermoNavarro.condiciones;

import javax.swing.JOptionPane;

public class InstruccionTryCatch {

	public static void main(String[] args) {
		try{
			Integer.parseInt(JOptionPane.showInputDialog("Escriba un dato: "));
		}
		catch (Exception e){
			JOptionPane.showMessageDialog(null, "No se detecto un entero ", null, JOptionPane.PLAIN_MESSAGE);	

		}
		finally{
			JOptionPane.showMessageDialog(null, "Cierre de programa ", null, JOptionPane.PLAIN_MESSAGE);	
		}
	}

}
