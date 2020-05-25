package FileWriteRead;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteReadTest {

	public static void main(String[] args) {
		File file = new File("Arquivo2.txt");
		try {
			FileWriter fv = new FileWriter(file);
			fv.write("Escrevendo uma mensagem no arquivo. \n");
			fv.flush();
			fv.close();

			// Lendo o conteudo de um arquivo
			FileReader fr = new FileReader(file);
			char[] in = new char[300];
			int size = fr.read(in);
			System.out.println("Tamanho: " + size);
			for (char c : in) {
				System.out.print(c);
			}
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
