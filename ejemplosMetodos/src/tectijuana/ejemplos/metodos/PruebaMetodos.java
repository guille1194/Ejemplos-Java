package tectijuana.ejemplos.metodos;

public class PruebaMetodos {

	public static void main(String[] args) {
		
		AreaTriangulo util = new AreaTriangulo();
		util.areaTriangulo(3, 1);
		
		boolean esNumero = Utilerias.esNumero("1");
		System.out.println("Prueba esNumero1 " + esNumero);
		esNumero = Utilerias.esNumero("Juan");
		
		
	}

}
