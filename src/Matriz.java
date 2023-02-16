
public class Matriz {

	public static void main(String[] args) {
		
		for(int fila = 0; fila <= 10; fila++) {	
			for (int columna = 0; columna < fila; columna++) {
				if (columna > fila) {
					break; //esto es para romper el ciclo
					//y para que imprima los numeros 
					// de la condicion que tengo escrita arriba solo borro todo el if con el break
					}
				System.out.print("*");
				System.out.print(" "); //esto para ordenar en espacios 
			}
			System.out.println();
		}
		
	}
		
}
