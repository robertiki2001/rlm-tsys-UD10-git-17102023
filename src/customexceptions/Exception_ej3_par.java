package customexceptions;

public class Exception_ej3_par extends Exception{

    private int numero;

    public Exception_ej3_par(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }
}
