package ejercicioComplejos;

public class ComplejoUtil {
	public static Complejo sumar(Complejo valorA, Complejo valorB){
		Complejo resultado = null;
		float parteReal = 0;
		float parteImaginaria = 0;
		
		parteReal = valorA.getParteReal() + valorB.getParteReal();
		
		parteImaginaria = valorA.getParteImaginaria() + valorB.getParteImaginaria();
		
		resultado = new Complejo(parteReal, parteImaginaria);
		
		return resultado;
	}
	
	public static Complejo restar(Complejo valorA, Complejo valorB){
		Complejo resultado = null;
		float parteReal = 0;
		float parteImaginaria = 0;
		
		parteReal = valorA.getParteReal() - valorB.getParteReal();
		
		parteImaginaria = valorA.getParteImaginaria() - valorB.getParteImaginaria();
		
		resultado = new Complejo(parteReal, parteImaginaria);
		
		return resultado;
	}
	
	public static void imprimirComplejo(Complejo valorDato){
		System.out.println("El Numero Complejo es: " + valorDato);
		valorDato.imprimir();
	}
}
