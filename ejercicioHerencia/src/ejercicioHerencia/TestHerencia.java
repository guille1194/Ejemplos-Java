package ejercicioHerencia;

import java.util.Date;

public class TestHerencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto p1 = null;
		ProductoFresco p2 = null;
		ProductoRefrigerado p3 = null;
		ProductoCongelado p4 = null;
		
		p1 = new Producto();
		p1.setFechaCaducidad(new Date());
		p1.setNoLote(1);
		System.out.println(p1);
		System.out.println("##################");
		
		p2 = new ProductoFresco();
		p2.setFechaCaducidad(new Date());
		p2.setNoLote(1);
		p2.setFechaEncasado( new Date());
		p2.setPaisOrigen("Mexico");
		System.out.println(p2);
		System.out.println("##################");
		
		p3 = new ProductoRefrigerado();
		p3.setFechaCaducidad(new Date());
		p3.setNoLote(1);
		p3.setOrganismoSupervesion("SP1");
		System.out.println(p3);
		System.out.println("##################");
		
		p4 = new ProductoCongelado();
		p4.setFechaCaducidad(new Date());
		p4.setNoLote(1);
		p4.setTemperaturaRecomendada(34.5);
		System.out.println(p4);
		System.out.println("##################");
	}
}
