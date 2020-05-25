package ARRAY;

public class ExemploArray {

	public static void main(String[] args) {
int[] numeros = new int[10];

numeros[1] = 4;
numeros[7] = 900;
numeros[2] =100;

for(int n : numeros) {
	System.out.print(n + " |");
}

for(int i = 0; i < numeros.length; i++ ) {
	System.out.printf("Números[%d] = %d\n", i, numeros[i]);
}

	}

}
