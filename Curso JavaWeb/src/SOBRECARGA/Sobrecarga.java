package SOBRECARGA;

public class Sobrecarga {
	public static void imprimir(byte b) {
		System.out.printf("\nEste método BYTE: %D", b);
	}
	
	public static void imprimir(short s) {
		System.out.printf("\n Este método recebe SHORT %d", s);
	}
	public static void imprimir(int i) {
		System.out.printf("\n Este método recebe INT: %d", i);
	}
	public static void imprimir(long l) {
		System.out.printf("\n Este método recebe LONG %d", l);
	}
	public static void imprimir(float f) {
		System.out.printf("\n Este médoto recebe FLOAT %f", f);
	}
	public static void imprimir(double d) {
		System.out.printf("\n Este médoto recebe DOUBLE %f", d);
	}
	public static void imprimir(String s) {
		System.out.printf("\n Este médoto recebe STRING %s", s);
	}
	
	

	public static void main(String[] args) {
			imprimir(1);
			imprimir(1.0);
			imprimir(1.0f);
			imprimir(1L);
			imprimir("Teste");
			
	}

}
