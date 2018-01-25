package ejercicioColeccionMap;

import java.util.Enumeration;
import java.util.Hashtable;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Map<Integer, Pais> paises = null;
		Hashtable<Integer, Pais> paises = null;
		Pais dato = null;
		//Set<Integer> llaves = null;
		Enumeration<Integer> llaves = null;
		Integer indice = null;
		
		paises = new Hashtable<Integer, Pais>();
		//paises = new HashMap<Integer, Pais>();
		
		for(int i=0; i<10; i++) {
			dato = new Pais();
			dato.setIdPais(i);
			dato.setNombre("Pais " + i);
			
			paises.put(i, dato);
		}
		
		System.out.println("#######################");
		llaves = paises.keys();
		
		// Imprimir la coleccion
		/*for(Integer idPais: llaves) {
			dato = paises.get(idPais);
			System.out.println(dato);
		}*/
		
		while(llaves.hasMoreElements()){
			indice = llaves.nextElement();
			System.out.println("Llave de la enumeracion: " + indice);
			dato = paises.get(indice);
			System.out.println(dato);
		}
		
		System.out.println("#######################");
		System.out.println("Map: " + paises);
		
		paises.clear();
		
		//if(paises.contains(1))
		// paises.isEmpty();
		
		
	}

}
