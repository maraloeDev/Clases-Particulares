package Examen5Sockets.Ejercicio1;

public class Mensaje {
	
	private int numero;

	public Mensaje(int numero) {
		super();
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return  ""+numero;
	}
	
	
	
}
