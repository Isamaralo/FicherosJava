package edu.femxa.val.ficheros.registro;

public class PrincipalRegistro {
	
	public static void main(String[] args) {
		int opcion = 0;
		String nombre = null;
		String password = null;
		String pwd_confirmada = null;
		
		do
		{
			EntradaSalida.mostrarMenu();
			try {
				opcion = EntradaSalida.pedirOpcion();
				switch (opcion){
				case 1:
					nombre = EntradaSalida.pedirNombre();
					password = EntradaSalida.pedirPassword();
					pwd_confirmada = EntradaSalida.pedirPassword();
					
					if(password.equals(pwd_confirmada))
					{
						if(Registro.registrarse(nombre, password))
							System.out.println("Se ha registrado correctamente en el sistema.\n");
						else
							System.out.println("Error: Ya está registrado en el sistema.\n");
					}
					else
						System.out.println("Error: las contraseñas no coinciden.\n");
					break;
				case 2:
					int intentos = 0;
					do
					{
						if(intentos > 0)
							System.out.println("Inténtalo de nuevo: ");
						nombre = EntradaSalida.pedirNombre();
						password = EntradaSalida.pedirPassword();
						if(Registro.acceder(nombre, password))
							System.out.println("Ha accedido al sistema.\n");
						else
						{
							System.out.println("Error al acceder al sistema.\n");
							intentos++;
						}
					}
					while(intentos < 3);
					if(intentos == 3)
					{
						System.out.println("Has superados los 3 intentos de acceder al sistema.\n");
						System.exit(1);
					}
					break;
				default:
					break;
				}
			} catch (Exception e) {
				System.out.println("Ha introducido un carácter incorrecto.\n");
			}			
		}
		while(opcion!=3);
	}

}
