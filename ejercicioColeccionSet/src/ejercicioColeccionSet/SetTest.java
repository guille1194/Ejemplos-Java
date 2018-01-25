package ejercicioColeccionSet;

import java.util.HashSet;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Pais> paises = null;
		Pais dato = null;
		
		paises = new HashSet<Pais>();
		
		for(int i=0; i<10; i++) {
			dato = new Pais();
			dato.setIdPais(i);
			dato.setNombre("Pais " + i);
			
			paises.add(dato);
		}
		
		System.out.println("#######################");
		// Imprimir la coleccion
		for(Pais datoPais: paises) {
			System.out.println(datoPais);
		}
		
		System.out.println("Set: " + paises);
		System.out.println("#######################");
		
		// Contains
		if(paises.contains(1)) {
			System.out.println("Si tiene el pais 1");
		} else {
			System.out.println("No tiene el pais 1");
		}
		
		System.out.println("Elementos en el Set: " + paises.size());
		
		paises.clear();
		
		if(paises.isEmpty()) {
			System.out.println("Esta Vacio el set");
		}
		
		System.out.println("Set: " + paises);
	}

}
