package ejercicioColeccionList;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Pais> paises = null;
		List<Integer> ids = null;
		Pais dato = null;
		
		paises = new ArrayList<Pais>();
		//paises = new Vector<Pais>();
		
		ids = new Vector<Integer>();
		
		for(int i=0; i<10; i++) {
			dato = new Pais();
			dato.setIdPais(i);
			dato.setNombre("Pais " + i);
			
			paises.add(dato);
			ids.add(i);
		}
		
		System.out.println("#######################");
		// Imprimir la coleccion
		for(Pais datoPais: paises) {
			System.out.println(datoPais);
		}
		
		System.out.println("List: " + paises);
		System.out.println("#######################");
		
		// Contains
		if(ids.contains(1)) {
			dato = paises.get(1);
			System.out.println("Si tiene el pais 1: " + dato);
		} else {
			System.out.println("No tiene el pais 1");
		}
		
		System.out.println("Elementos en el List: " + paises.size());
		
		System.out.println("- - - - - - - - - - - - - - - - ");
		
		if(ids.contains(22)){
			dato = paises.get(22);
			System.out.println("Si existe 22: " + dato);
		} else {
			System.out.println("No tengo el Pais 22.");
		}
		/*paises.clear();
		
		if(paises.isEmpty()) {
			System.out.println("Esta Vacio el set");
		}*/
		
		// Elemento 9
		dato = paises.get(9);
		System.out.println("Elemento 9: " + dato);
		
	}

}
