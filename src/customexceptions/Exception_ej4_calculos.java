package customexceptions;
import customexceptions.Exception_ej4;


public class Exception_ej4_calculos {
	
	//Metodos para hacer los calculos con los mensajes de excepcion
	
	public double suma(double a, double b) {
        return a + b;
    }

    public double resta(double a, double b) {
        return a - b;
    }

    public double multiplicacion(double a, double b) {
        return a * b;
    }

    public double division(double a, double b) {
        if (b == 0) {
            throw new Exception_ej4("El denominador no puede ser cero.");
        }
        return a / b;
    }

    public double potencia(double base, double exponent) {
        if (base < 0 && exponent % 1 != 0) {
            throw new Exception_ej4("Para calcular la potencia introduce un numero positivo.");
        }
        return Math.pow(base, exponent);
    }

    public double raizCuadrada(double number) {
        if (number < 0) {
            throw new Exception_ej4("Para calcular la raiz quadrada introduce un numero positivo.");
        }
        return Math.sqrt(number);
    }

    public double raizCubica(double number) {
        if (number < 0) {
            throw new Exception_ej4("Para calcular la raiz cubica introduce un numero positivo.");
        }
        return Math.cbrt(number);
    }

}
