import java.util.Scanner;

public class principal {

	public static void main(String... args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o primeiro número:");
		int numero1 = scan.nextInt();
		System.out.println("Digite o segundo número:");
		int numero2 = scan.nextInt();
		int result = numero1 + numero2;
		System.out.println("O valor da soma entre ambos os número é: " + result);
	}

}
