package Tokens;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner("1 beuga 100 oi");
		while(scanner.hasNext())
			System.out.println(scanner.next());
	}

}
