import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Testeaa {

	public static void main(String[] args) {
		File file = new File("A.txt");
		
		try {
		BufferedWriter bw = new BufferedWriter(new FileWriter(file));
		BufferedReader br = new BufferedReader(new FileReader(file));
		bw.write("Minha vida");
		bw.newLine();
		bw.write("minhas vidasdfas df");
		bw.close();
		String s = null;
		//char[] entrada = char[100];
		while((s = br.readLine()) != null) {
			System.out.println(s);
		}
		br.close();
			
		}catch(IOException e ) {
			e.printStackTrace();
		}
	}

}
