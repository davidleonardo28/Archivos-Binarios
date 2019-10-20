package Modelo;

import Vista.PanelEntrada;

//Representa el mundo del problema: las clases y métodos que describen el problema 
//Pueden reemplazar el nombre de la clase "Mundo" por el que necesiten.

public class Mundo {

	Persistencia BD;//se asocia a Mundo para que éste pueda interactuar con la data de Persistencia.
PanelEntrada PaE;

	public Mundo() {
		// TODO Auto-generated constructor stub
		BD = new Persistencia();
		PaE = new PanelEntrada();
	}
		

	public Persistencia getBD() {
		return BD;
	}

	public void setBD(Persistencia bD) {
		BD = bD;
	}


	public PanelEntrada getPaE() {
		return PaE;
	}


	public void setPaE(PanelEntrada paE) {
		PaE = paE;
	}
	
	
	
}
