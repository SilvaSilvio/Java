package Buffered;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ComArray {

	public static void main(String[] args) {
		File file = new File("projeto4.txt");
		try {
			FileWriter fw = new FileWriter(file);
			FileReader fr = new FileReader(file);
			fw.write("Teste");
			fw.flush();
			fw.close();
			char[] in = new char[30];
			int size = fr.read(in);
			System.out.println(size);
			for (char c : in) {
				System.out.print(c);
			}
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
