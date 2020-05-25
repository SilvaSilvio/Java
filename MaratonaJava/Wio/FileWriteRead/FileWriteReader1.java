package FileWriteRead;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteReader1 {

	public static void main(String[] args) {
		File file = new File("text.txt");
		try {
			FileWriter fw = new FileWriter(file);
			FileReader fr = new FileReader(file);
			fw.write("How oftern do you Speak English?");
			fw.flush();
			char[] in = new char[200];
			int size = fr.read(in);
			System.out.println("Tamanho: " + size);
			for (char c : in)
				System.out.print(c);
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
