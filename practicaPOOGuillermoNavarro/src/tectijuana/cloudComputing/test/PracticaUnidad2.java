package tectijuana.cloudComputing.test;

import java.util.Hashtable;
import java.util.List;
import java.util.Set;

import tectijuana.cloudComputing.Utilerias;
import tectijuana.cloudComputing.estructuras.Entrenador;
import tectijuana.cloudComputing.estructuras.Futbolista;
import tectijuana.cloudComputing.estructuras.Masajista;

public class PracticaUnidad2 {
	
	private static int Cantidad_Personas = 3;
	
	public static void main(String[] args) {
	
		Set<Entrenador> entrenadores = null;
		Set<Futbolista> futbolistas = null;
		Set<Masajista> masajistas = null;
		
		
		entrenadores = Utilerias.cargarEntrenadores(Cantidad_Personas);
		futbolistas = Utilerias.cargarFutbolistas(Cantidad_Personas);
		masajistas = Utilerias.cargarMasajistas(Cantidad_Personas);
		
		Hashtable<String, Object> seleccion = new Hashtable<String, Object>();
		
		for (Entrenador entrenador: entrenadores) {
			seleccion.put(entrenador.getNombre(), entrenador);
		}
		for (Futbolista futbolista: futbolistas) {
			seleccion.put(futbolista.getNombre(), futbolista);
		}
		for (Masajista masajista: masajistas) {
			seleccion.put(masajista.getNombre(), masajista);
		}
		
		String llaveGrabada = "";
		
		System.out.println("Lista de llaves en la tabla.");
		List<String> llavesTabla = Utilerias.obtenerLlavesTablaString(seleccion);
		for (String llave: llavesTabla) {
		System.out.println(llave.toString());
		
		llaveGrabada = llave;
	}
		System.out.println();
		
		System.out.println("Elemento a obtener con llave: " + llaveGrabada.toString());
		Object elemento = Utilerias.obtenerElementoTabla(seleccion, llaveGrabada);
		if(elemento != null)
			System.out.println("El valor del elemento con llave " + llaveGrabada + " es " + elemento.toString());
		System.out.println();
		
		String llave = "Perengano";
		elemento = Utilerias.obtenerElementoTabla(seleccion, llave);
		if(elemento != null)
			System.out.println("El valor del elemento con llave " + llaveGrabada + " es " + elemento.toString());
		
		System.out.println("\nDespliegue completo de la tabla:");
		Utilerias.imprimirTabla(seleccion);
	}
}