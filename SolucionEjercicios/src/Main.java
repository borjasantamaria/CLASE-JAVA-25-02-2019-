
public class Main {

	public static void main(String[] args) {
		
		
		String cadena = "ZYWXVUTSRQPONMLKJIHGFEDCBA";
		
		for(int i = 0 ; i < cadena.length(); i++){
			
			
			//subtring devuelve de dentro de la cadena desde la posicion que le indiques hasta el final
			String segundaCadena = cadena.substring(i);
		
			System.out.println(segundaCadena);
			
		}
		
		//OBJETO DE TIPO Strin Builder
		
		StringBuilder builder=new StringBuilder(cadena);
		
		//String cadenaInvertida = builder.reverse().toString();
		
		
		System.out.println("CADENA DADA LA VUELTA");
		
		//toString convierte lo que quieras en String
		
		System.out.println(builder.reverse().toString());
		
		
		
		
		//******EJERCICIO SIGUIENTE********
		
		
		
		
		//sacar por consola el dominio y el usuario por separado
		
		System.out.println("Ejercicio roman");

		desencriptar();
		
	}
	
	//metodo
	
	public static void desencriptar() {
		
		String correoEncript = "tsyupryk.roman.lyubomyrovych@gmail.com";
		
		String[] substring1 = correoEncript.split("@");
		
		String dominio1 = substring1[1];
		
		System.out.println("El dominio es:"+dominio1);
		
		//ponemos \\ para obviar los caracteres especiales 
		
		String[] substring2 = substring1[0].split("\\.");
		
		String nombre = substring2[1];
		
		System.out.println("El nombre es: "+nombre);
		
		String apellido1 = substring2[0];
		
		System.out.println("El primer apellido es: "+apellido1);
		
		String apellido2 = substring2[2];
		
		System.out.println("El segundo apellido es: "+apellido2);

	}
	

}
