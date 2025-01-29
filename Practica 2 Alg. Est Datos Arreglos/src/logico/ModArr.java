package logico;

import java.util.Scanner;

public class ModArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		 int longitudArray;
		 String[]caracteres;
        
        // Leer secuencia de elementos separados por espacios
		
		do {
	        System.out.println("Ingrese la secuencia de elementos (separados por espacios): ");
	        String textoIngresado = scan.nextLine();
	        
	        caracteres = textoIngresado.split(" ");
	        
	       longitudArray = caracteres.length;
	        
		}while (longitudArray % 2 != 0);
        
        System.out.println("Ingrese el valor de T: ");
        int valorT; 
        if (scan.hasNextInt()) { // Evita problemas con entradas inválidas
            valorT = scan.nextInt();
        } else {
            System.out.println("Error: Ingrese un número entero válido.");
            scan.close();
            return;
        }
        scan.nextLine(); // Limpia buffer
        
        
        modificarArreglo(caracteres, longitudArray, valorT);
        System.out.println("Resultado: ");
        imprimirArreglo(caracteres);
        
        
        scan.close(); 
	}
	
	public static void modificarArreglo(String[] arreglo, int cantdatos, int valorT) {
		
	    int mitad = cantdatos / 2;
	    int indM1 = 0; 
	    int indM2 = mitad - 1;  
	    int indM3 = mitad; 
	    int indM4 = cantdatos - 1;  

	    for (int i = 1; i <= valorT; i++) {
	        if (i % 2 == 0) {
	            rotar(arreglo, indM3, indM4);
	        } else {
	            rotar(arreglo, indM1, indM2);
	        }
	    }
	}
	
	private static void rotar(String[] arreglo, int a, int b) {
		// TODO Auto-generated method stub
		
		String ultimoelemento = arreglo[b];
		
		
		  for (int i = b; i > a; i--) {
		      arreglo[i] = arreglo[i - 1];
		  }
		
		  arreglo[a] = ultimoelemento;
		
	}

	public static void imprimirArreglo(String[] arreglo) {
	    for (int i = 0; i < arreglo.length; i++) {
	    	
	        System.out.print(arreglo[i] + " "); 
	    }
	    System.out.println();
	}
}
