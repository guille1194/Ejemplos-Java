package ejemplos.guillermoNavarro.condiciones;

import javax.swing.JOptionPane;

public class InstruccionSwitch {

	public static void main(String[] args) {
	    String calif = JOptionPane.showInputDialog("Escriba una calificacion: ");
		
	    switch(calif){
	      case "A":
	        System.out.println ("Tu calificacion es 10");
	        break;
	      case "M":
	        System.out.println ("Tu calificacion es 9");
	        break;
	      case "B":
	        System.out.println ("Tu calificacion es 8");
	        break;
	      case "R":
	        System.out.println ("Tu calificacion es 7");
	        break;
	      case "S":
	        System.out.println ("Tu calificacion es 6");
	        break;
	      case "N":
	        System.out.println ("Tu calificacion es 5");
	        break;
	      default:
	        System.out.println ("Esa calificacion no existe");
	        break;
	    }
	}

}
