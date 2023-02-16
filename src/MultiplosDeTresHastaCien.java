
//Usa un bucle for para imprimir todos los múltiplos de 3, entre 1 y 100.

//Consejo: Hay dos formas tradicionales de resolver este problema. 
//Una es hacer el for y usar el número% 3 para encontrar el residuo de dividir un número entre 3 
//(el operador % se llama módulo). Si el residuo es cero, es divisible por 3.

public class MultiplosDeTresHastaCien {

	    public static void main (String[] args) {
	        for (int i = 1; i < 100; i++ ){
	            if (i % 3 == 0)    {
	                System.out.println(i);
	            }
	        }
	    }

	}

