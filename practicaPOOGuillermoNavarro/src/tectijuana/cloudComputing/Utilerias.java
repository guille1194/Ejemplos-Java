package tectijuana.cloudComputing;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;

import tectijuana.cloudComputing.estructuras.*;

public class Utilerias {
	
	private static Integer Edad_Minima_Futbolista = 16;
	private static Integer Edad_Minima_Entrenador = 18;
	private static Integer Edad_Minima_Masajista = 18;
	
	public static Set<Futbolista> cargarFutbolistas (int elementos) {
		Set<Futbolista> futbolistas = null;
		
		futbolistas = new HashSet<Futbolista>();
		
		for(int i=0; i < elementos; i++) {
			Futbolista futbolista = new Futbolista();
			futbolista.setId(i);
			futbolista.setNombre("Futbolista " + i);
			futbolista.setApellidos("Apellido " + i);
			futbolista.setEdad(Edad_Minima_Futbolista + i);
			futbolista.setDemarcacion("Demarcacion " + i);
			futbolista.setDorsal(i);
			
			futbolistas.add(futbolista);
		}
		
		return futbolistas;		
	}
	
	public static Set<Entrenador> cargarEntrenadores (int elementos) {
		Set<Entrenador> entrenadores = null;

		entrenadores = new HashSet<Entrenador>();
		
		for(int i = 0; i < elementos; i++){
			Entrenador entrenador = new Entrenador();
			entrenador.setId(i);
			entrenador.setNombre("Entrenador " + i);
			entrenador.setApellidos("Apellido " + i);
			entrenador.setEdad(Edad_Minima_Entrenador + i);
			entrenador.setIdFederacion("Federacion " + i);
			
			entrenadores.add(entrenador);
		}
		
		return entrenadores;
	}	
	
	public static Set<Masajista> cargarMasajistas (int elementos) {
		Set<Masajista> masajistas = null;
		
		masajistas = new HashSet<Masajista>();
		
		for(int i = 0; i < elementos; i++){
			Masajista masajista = new Masajista();
			masajista.setId(i);
			masajista.setNombre("Masajista " + i);
			masajista.setApellidos("Apellido" + i);
			masajista.setEdad(Edad_Minima_Masajista + i);
			masajista.setTitulacion("Titulacion " + i);
			masajista.setAniosExperiencia(i);
			
			masajistas.add(masajista);
		}
		
		return masajistas;
	}
	
	public static List<Integer> obtenerLlavesTablaInteger(Hashtable<Integer, Object> tablaHash) {
		List<Integer> llaves = null;
		
		llaves = new ArrayList<Integer>();
		for (Integer llave: tablaHash.keySet()) {
			llaves.add(llave);
		}
		
		return llaves;
	}
	
	public static List<String> obtenerLlavesTablaString(Hashtable<String, Object> tablaHash) {
		List<String> llaves = null;
		
		llaves = new ArrayList<String>();
		for (String llave: tablaHash.keySet()) {
			llaves.add(llave);
		}
		
		return llaves;
		
	}
	
	public static Object obtenerElementoTabla(Hashtable<String, Object> tablaHash, String llaveBuscada) {
		
		Object elemento = null;
		
		try {
			boolean contieneLlave = tablaHash.containsKey(llaveBuscada);
			
			if (contieneLlave)
				elemento = tablaHash.get(llaveBuscada);
			else
				System.out.println("Llave " + llaveBuscada + " no encontrada");
		}
		
		catch(Exception e) {
			System.out.println("Llave " + llaveBuscada + " no encontrada");
		}
		return elemento;
	}
	
	public static void imprimirTabla(Hashtable <String, Object> tablaHash) {
		for (String llave: tablaHash.keySet()) {
			Object valor = tablaHash.get(llave);
			
			System.out.println("Llave " + llave + " valor " + valor.toString());
		}
	}
}
