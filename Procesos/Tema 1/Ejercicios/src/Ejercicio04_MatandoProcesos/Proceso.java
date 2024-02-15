package Ejercicio04_MatandoProcesos;

public class Proceso implements Runnable {

	private int contador;
	@Override
	public void run() {
		
		while(true) {
			
			contador++;
			if(contador % 500000 == 0) {
			
			System.out.println("El nombre es " + hilo.getName() 
			+ " con un contador de " + contador);	
		}
		}
		
	}
	
	Thread hilo;
	
	public Proceso(String nombre, ThreadGroup grupo) {
	this.hilo = new Thread(grupo, this, nombre);
	
	}

}
