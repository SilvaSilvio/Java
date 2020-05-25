package Wio;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest {

	public static void main(String[] args) {
		// file.exists() = verifica se um arquivo já existe.
		// file.delete() = Se um arquivo existe é deletado.
		// file.canRead() = Verifica se um arquivo pode ser lido.

		File file = new File("text.txt");
		try {
			boolean newFile = file.createNewFile();
			System.out.println(newFile);
			boolean exists = file.exists();
			System.out.println(file.canRead());
			System.out.println("Path: " + file.getPath());
			// Path == extensão;
			System.out.println(file.getAbsolutePath());
			// saber o local onde o veiculo está armazenadado
			System.out.println("É um diretório? " + file.isDirectory());
			// saber se o arquivo é um diretório
			System.out.println("É um arquivo oculto?: " + file.isHidden());
			// Saber se é um arquivo oculto.
			System.out.println(new Date(file.lastModified()));
			// Horário em que o arquivo foi modificado.
			if (exists) {
				// System.out.println("Arquivo Deletado? : " + file.delete());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
