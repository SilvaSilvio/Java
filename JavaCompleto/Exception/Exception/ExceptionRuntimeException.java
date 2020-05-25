package Exception;

public class ExceptionRuntimeException {
public static void main(String[] args) {
	int a = 10/0;
	int b =  0;
	
	if(b != 0) {
		int c = a / b;
		System.out.println(c);
	}
		
	
	System.out.println(a);
}
}
