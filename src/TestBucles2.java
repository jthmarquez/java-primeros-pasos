
//Podemos mejorar nuestro código, para eso necesitamos hacer las modificaciones
//Eliminamos el if y cambiamos los criterios del for interno para (columna <= fila // restantes del For)

public class TestBucles2 {

	    public static void main(String[] args) {

	        for (int fila = 0; fila < 10; fila++) {
	            for(int columna = 0; columna < 10; columna++) {
	                if (columna > fila) {
	                    break;
	                }
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	    }

	}
