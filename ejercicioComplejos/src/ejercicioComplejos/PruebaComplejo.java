package ejercicioComplejos;

public class PruebaComplejo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complejo primerComplejo = null;
		Complejo segundoComplejo = null;
		
		primerComplejo = new Complejo(5, 3);
		primerComplejo.imprimir();
		
		segundoComplejo = new Complejo();
		segundoComplejo.imprimir();

		
		Complejo suma = ComplejoUtil.sumar(primerComplejo, segundoComplejo);
		ComplejoUtil.imprimirComplejo(suma);
		
		Complejo resta = ComplejoUtil.restar(primerComplejo, segundoComplejo);
		ComplejoUtil.imprimirComplejo(resta);
	}

}
