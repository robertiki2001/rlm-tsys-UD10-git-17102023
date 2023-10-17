package customexceptions;

public class Exceptions_ej1 extends Exception{
	
	private int codigoException;
	 
	//Constructor de clase
	public Exceptions_ej1(int codigoException) 
	{
		super();
		this.codigoException = codigoException;
	}
	 
	public Exceptions_ej1() 
	{
		super();
	}

	@Override
	public String getMessage() {
		
		String mensaje = "";
		
		switch (codigoException) {
		case 1:
			mensaje="El numero introducido es mayor. Intentalo de nuevo con otro numero:";
			break;
		case 2:
			mensaje="El numero introducido es menor. Intentalo de nuevo con otro numero:";
			break;
		default:
			break;
		}
		return mensaje;
	}
	
	

}
