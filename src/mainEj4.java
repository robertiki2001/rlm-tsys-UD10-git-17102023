import java.util.Scanner;

import customexceptions.Exception_ej4;
import customexceptions.Exception_ej4_calculos;

public class mainEj4 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("---- CALCULADORA SIMPLE ----\n");

            double num1 = obtenerNumeroValido(scanner, "Ingrese el primer número: ");
            double num2 = obtenerNumeroValido(scanner, "Ingrese el segundo número: ");

            Exception_ej4_calculos calculadora = new Exception_ej4_calculos();

            try {//Llamamos los metodos para hacer los calculos y ver si hay mensajes de excepciones
                double result = calculadora.suma(num1, num2);
                System.out.println("Suma: " + result);

                result = calculadora.resta(num1, num2);
                System.out.println("Resta: " + result);

                result = calculadora.multiplicacion(num1, num2);
                System.out.println("Multiplicación: " + result);

                result = calculadora.division(num1, num2);
                System.out.println("División: " + result);

                result = calculadora.potencia(num1, num2);
                System.out.println("Potencia: " + result);

                result = calculadora.raizCuadrada(num1);
                System.out.println("Raíz Cuadrada de " + num1 + ": " + result);

                result = calculadora.raizCubica(num2);
                System.out.println("Raíz Cúbica de " + num2 + ": " + result);

            } catch (Exception_ej4 e) {
                System.err.println("Error: " + e.getMessage());
            }
        } catch (Exception ex) {
            System.err.println("Error al leer la entrada: " + ex.getMessage());
        }
    }

    private static double obtenerNumeroValido(Scanner scanner, String mensaje) {
        double numero = 0.0;
        boolean numeroValido = false;

        while (!numeroValido) {
            System.out.print(mensaje);

            if (scanner.hasNextDouble()) {
                numero = scanner.nextDouble();
                numeroValido = true;
            } else {
                System.out.println("Error: Debe ingresar un número válido.");
                scanner.next(); // Limpia la entrada incorrecta.
            }
        }

        return numero;
    }

}
