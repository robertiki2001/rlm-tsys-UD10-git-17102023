import java.util.Random;
import java.util.Scanner;

import customexceptions.Exceptions_ej1;

public class mainEj1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		Random r = new Random();
		int numeroAleatorio = r.nextInt(500) + 1;

		System.out.println("Adivina el número aleatorio (entre 1 y 500):");

		boolean acierto = false;
		int intentos = 0;

		while (!acierto) {

			try {

				int intentoUsuario = sc.nextInt();
				intentos++;

				// Comparamos el numero introducido con el generado aleatoriamente
				if (intentoUsuario > numeroAleatorio) {
					throw new Exceptions_ej1(1);
				} else if (intentoUsuario < numeroAleatorio) {
					throw new Exceptions_ej1(2);
				} else {
					System.out.println(
							"ENHORABUENA! Has acertado el número " + numeroAleatorio + " en " + intentos + " intentos.");
					acierto = true;
				}

				// Verificamos que nos pasen un numero por teclado
			} catch (Exception e) {
				if (e instanceof Exceptions_ej1) {
					System.out.println(e.getMessage());
				} else if (e instanceof java.util.InputMismatchException) {
					System.out.println("Por favor, ingresa un número válido.");
				}

			}
		}
	}
}
