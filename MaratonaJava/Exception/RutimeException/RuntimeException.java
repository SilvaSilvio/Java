package RutimeException;

public class RuntimeException {
public static void main(String... args) {
	divisao(10, 0);
}
public static void divisao(int num1, int num2) {
	if (num2 == 0) {
		throw new IllegalArgumentException("Passe um valor diferente de zero");
	}
	int result = num1 / num2;
	System.out.println(result);
}
}
