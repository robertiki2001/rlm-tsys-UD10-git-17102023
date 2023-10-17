package customexceptions;

public class Exception_ej3_impar extends Exception{
	private int numero;

    public Exception_ej3_impar(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

}
