package ejemploMuchosAMuchos;

import java.io.Serializable;

public class idGasCombu implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9051291661312919140L;
	private Gasolinera gas;
	private Combustible combu;
	
	
	public idGasCombu() {
		// TODO Auto-generated constructor stub
	}


	public Gasolinera getGas() {
		return gas;
	}


	public void setGas(Gasolinera gas) {
		this.gas = gas;
	}


	public Combustible getCombu() {
		return combu;
	}


	public void setCombu(Combustible combu) {
		this.combu = combu;
	}

}
