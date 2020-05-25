package Tokens;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class passatempo {

	public static void main(String[] args) {
		String str = "amor, paixao, saudade, mãe, irmão, pai";
		String[] tokins = str.split(",");
		for(String array : tokins) {
			System.out.println(array.trim());
		}
		Scanner scan = new Scanner("Sexo loucura hahaha perdão");
		while(scan.hasNext()) {
			System.out.println(scan.next().trim());
		}
		Pattern pattern = Pattern.compile(str);
		String qualquercoisa = "amor";
		Matcher matcher = pattern.matcher(qualquercoisa);
		System.out.println("O valor encontrado está na numero: ");
		while(matcher.find())
			System.out.println(matcher.start() + " " + matcher.group());
	}

}
