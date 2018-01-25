package tectijuana.ejemplos.metodos;

public class Utilerias {
	public static boolean esNumero(String valorCadena) {
		boolean bandera = true;
		
		try{
			Integer.parseInt(valorCadena);
		}
		catch (NumberFormatException e){
			System.out.println("{Utilerias.esNumero} Error: " + e);
			bandera = false;
		} finally {
			System.out.println("{Utilerias.esNumero} La cadena " + valorCadena + " es numero " + bandera);
		}
		return bandera;
	}
}
