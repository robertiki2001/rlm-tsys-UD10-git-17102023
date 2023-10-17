import java.util.Random;

import customexceptions.Exception_ej3_par;
import customexceptions.Exceptions_ej3_verifica_numero;
import customexceptions.Exception_ej3_impar;

public class mainEj3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int numeroAleatorio = random.nextInt(1000) + 1; // Genera un número aleatorio entre 1 y 1000
		
		//Llamamos al metodo "verificarNumero" y nos recoje la excepcion para luego poner el mensaje que queramos
		try {
			Exceptions_ej3_verifica_numero.verificarNumero(numeroAleatorio);
		} catch (Exception_ej3_par e) {
			System.out.println("Generando numero aleatorio... \nEl número es par: " + e.getNumero());
		} catch (Exception_ej3_impar e) {
			System.out.println("Generando numero aleatorio...\nEl número es impar: " + e.getNumero());
		}
	}

}
