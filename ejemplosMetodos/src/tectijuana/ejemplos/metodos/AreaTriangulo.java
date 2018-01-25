package tectijuana.ejemplos.metodos;

public class AreaTriangulo {

	// Procedure
	public void areaTriangulo(int valorBase, int valorAltura) {
		double  area = 0.0;
		int mult = 0;
		
		mult = this.multiplicacion(valorBase, valorAltura);
		
		area = this.division(mult, 2);
		
		System.out.println("El area del triangulo con base " + valorBase + " y Altura " + valorAltura);
		
		System.out.println("El resultado es: " + area);
	}
	
	private int multiplicacion (int valor1, int valor2){
		int mult = 0;
		
		mult = valor1 * valor2;
		
		return mult;
	}
	
	private double division (double valor1, double valor2){
		double div = 0.0;
		
		div = valor1 / valor2;
		
		return div;
	}

}
