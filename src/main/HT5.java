package main;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Map;
import models.Factory;

	public class HT5 {
		
		Factory factory = new Factory();
		Map<String, String> ourMap;
		
	public static void main(String[] args) {
			
		HT5 ht5 = new HT5();
		ht5.initialize();
				
	}
	
	public void initialize() {
	
		System.out.println("Bienvenido a la tienda virtual");
		Scanner entrada = new Scanner(System.in);
		String option = "";
				
		menu1();
		option = "" + entrada.nextLine();
		switch (option) {
		
			case "1":
				ourMap = factory.getDataStructure("hashMap");
				break;
			
			case "2":
				ourMap = factory.getDataStructure("TreeMap");	
				break;
			
			case "3":
				ourMap = factory.getDataStructure("LinkedMap");
				break;
			
			default:
				System.out.println("Por favor ingrese una opción válida. Se ha asignado como default un HashMap. Vuelva a correr el programa si no es la estructura que desea utilizar.");
				ourMap = factory.getDataStructure("hashMap");
		}
		
		String msg="";
		System.out.println("Leyendo archivo...");
		
		
		//The following code to read a text file was found at https://chuwiki.chuidiang.org/index.php?title=Lectura_y_Escritura_de_Ficheros_en_Java#:~:text=Podemos%20abrir%20un%20fichero%20de,y%20extraer%20campos%20de%20ella.
		//Some lines have been edited in order to read properly the text file requested and split the characters.
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;

		try {
		    // Apertura del fichero y creacion de BufferedReader para poder
		    // hacer una lectura comoda (disponer del metodo readLine()).
		    archivo = new File ("C:\\ListadoProducto.txt");
		    fr = new FileReader (archivo);
		    br = new BufferedReader(fr);
		    
		    System.out.println("Su archivo ha sido leído con éxito.");
		    System.out.println("");
		    System.out.println("Contenido encontrado: ");
		
		    // Lectura del fichero
		    String linea;
		    while((linea=br.readLine())!=null) {
		       System.out.println(linea);
		    	msg=linea;
		    	String[] parts = msg.split("\\|");
		    	
		    	//Prueba
		    	System.out.println(parts[0]);
		    	System.out.println(parts[1]);
		    	
		    	//Añadimos las categorías y productos
		    	ourMap.put(parts[0], parts[1]);
		    	
		    	
		    }
		    
		    String option2 = "";
			menu2();
			while (!option.equals("7")) {
				option2 = "" + entrada.nextLine();
				
				switch (option2) {
				
					case "1":
						System.out.println("¿A qué categoría deseas añadir el producto?");
						
						break;
					
					case "2":
						break;
					
					case "3":
						for (String key : ourMap.keySet()) {
				            System.out.println("Categoría: " + key + ", Producto: " + ourMap.get(key));
				        }
						break;
						
					case "7":
						System.out.println("Gracias por utilizar el programa.");
						break;
					
					default:
						System.out.println("Por favor ingrese una opción válida.");
						break;
				}
			}
		}
				    
				   

		 catch(Exception e){
			e.printStackTrace();
		    System.out.println("No se ha encontrado el archivo de texto");
		    System.out.println("Asegúrese de llamarlo ListadoProducto.txt en su disco C");
		 }finally{
		    // En el finally cerramos el fichero, para asegurarnos
		    // que se cierra tanto si todo va bien como si salta 
		    // una excepcion.
		    try{                    
		       if( null != fr ){   
		          fr.close();     
		       }                  
		    }catch (Exception e2){ 
		       e2.printStackTrace();
		    }
	
		 }	
		
	}
		
	
	public static void menu1() {
		System.out.println("Elige el tipo de estructura que deseas implementar en tu tienda");
		System.out.println("1. HashMap");
		System.out.println("2. TreeMap");
		System.out.println("3. LinkedMap");
	}
	
	public static void menu2() {
		System.out.println("¿Qué deseas realizar el día de hoy?");
		System.out.println("1. Agregar un producto a una categoría");
		System.out.println("2. Mostrar categoría según producto");
		System.out.println("3. Mostrar productos y categorías");
		System.out.println("4. Mostrar productos organizados por categoría");
		System.out.println("5. Productos y categorías existentes");
		System.out.println("6. Productos y categorías existentes por tipo");
		System.out.println("7. Salir");
	}
	
}
	
