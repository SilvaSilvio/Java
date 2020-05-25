import java.util.Locale;
import java.util.Scanner;

public class TESTE {
public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner scan = new Scanner(System.in);
	double pi = 3.14159;
	//double area = pi * Math.pow(raio, raio);
	double R, A; 
    
	float a = 9;
	float x = (float) Math.sqrt(a);
	System.out.println(x);
	
	//System.out.println("informe qual a área");
	//raio = scan.nextDouble();
	
	    R = scan.nextDouble();

	    A = pi * R * R;

	    System.out.printf("A=%.4f%n", A);

		scan.close();
	}
}
