import java.util.Scanner;

import customexceptions.clasePassword_ej5;

public class mainEj5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("¿Cuantas contraseñas quieres generar?");
		int cantidadContraseñasArray = sc.nextInt();
		boolean contraseñasFuertes[] = new boolean[cantidadContraseñasArray];

		System.out.println("Indica la longitud de las contraseñas.");
		int longitudContraseñasArray = sc.nextInt();

		for (int i = 0; i < cantidadContraseñasArray; i++) {
			clasePassword_ej5 generarContraseña = new clasePassword_ej5(longitudContraseñasArray);
			String contraseñaGenerada = generarContraseña.getContraseña();

			System.out.println("Contraseña generada " + (i + 1) + ": " + contraseñaGenerada);

			// Verificar si la contraseña es fuerte y almacenar el resultado en el array
			contraseñasFuertes[i] = generarContraseña.esFuerte();
		}

		// Imprimir el resultado de contraseñas fuertes
		System.out.println("\nResultado de contraseñas fuertes:");
		for (int i = 0; i < cantidadContraseñasArray; i++) {
			System.out.println("Contraseña " + (i + 1) + ": " + (contraseñasFuertes[i] ? "Fuerte" : "No fuerte"));
		}
	}

}
