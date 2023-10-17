package customexceptions;

import java.util.Random;

public class clasePassword_ej5 {
	
	//Atributos
    private int longitud;
    private String contraseña;
    private boolean fuerte;
    
    //Constructor por defecto
    public clasePassword_ej5() 
    {
        this.longitud = 8;
        generarContraseña();
    }
    
   //Constructor para generar una contraseña aleatorio de con la longitud que nosotros queramos
    public clasePassword_ej5(int longitud) 
    {
        this.longitud = longitud;
        generarContraseña();
    }
    //Genera una contraseña con valores alfanumericos aleatorios
    public void generarContraseña() 
    {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < longitud; i++) 
        {
            int index = random.nextInt(caracteres.length());
            char caracter = caracteres.charAt(index);
            builder.append(caracter);
        }

        contraseña = builder.toString();
    }

    public String getContraseña() 
    {
        return contraseña;
    }

    public int getLongitud()
    {
        return longitud;
    }
    
    public void setLongitud() {
        this.longitud = longitud;
    }
    
    public boolean esFuerte() {
        int mayusculas = 0;
        int minusculas = 0;
        int numeros = 0;

        for (char caracter : contraseña.toCharArray()) {
            if (Character.isUpperCase(caracter)) {
                mayusculas++;
            } else if (Character.isLowerCase(caracter)) {
                minusculas++;
            } else if (Character.isDigit(caracter)) {
                numeros++;
            }
        }

        return (mayusculas > 2) && (minusculas > 1) && (numeros > 5);
    }



}
