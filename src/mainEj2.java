import customexceptions.MyCustomException;

public class mainEj2 {

    public static void main(String[] args) {
        try {
            System.out.println("Comenzando el programa.");

            // Crear un objeto de la excepción personalizada y lanzarla
            throw new MyCustomException("Esto es una excepción personalizada.");
        } catch (MyCustomException e) {
            // Capturar y manejar la excepción personalizada
            System.out.println("Se capturó una excepción personalizada: " + e.getMessage());
        } finally {
            System.out.println("El programa ha terminado.");
        }
    }
}
