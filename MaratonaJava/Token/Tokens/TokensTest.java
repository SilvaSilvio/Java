package Tokens;

public class TokensTest {

	public static void main(String[] args) {
		String str = " Silvio, Sérgio, Darkson, Severiano, Dadimar";
		String[] tokens = str.split(",");
		for(String array : tokens)
			System.out.println(array.trim());
	
	}

}
