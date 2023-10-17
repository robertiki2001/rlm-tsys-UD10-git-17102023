package customexceptions;
import customexceptions.Exception_ej3_par;
import customexceptions.Exception_ej3_impar;

public class Exceptions_ej3_verifica_numero {
	public static void verificarNumero(int numero) throws Exception_ej3_par, Exception_ej3_impar {
        if (numero % 2 == 0) {
            throw new Exception_ej3_par(numero);
        } else {
            throw new Exception_ej3_impar(numero);
        }
    }

}
