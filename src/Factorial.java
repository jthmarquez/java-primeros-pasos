
//Ahora crea una nueva clase, escribe un for que comience una variable n (número actual) 
//como 1 y factorial (resultado total) como 1. ¡Haz su ciclo entre 1 y 10 y calcula el resultado!

public class Factorial {

	    public static void main(String[] args) {
	        int factorial = 1;
	        for (int i = 1; i < 11; i++) {
	            factorial *= i;
	            System.out.println("Factorial de " + i + " = " + factorial);
	        }
	    }

	}
