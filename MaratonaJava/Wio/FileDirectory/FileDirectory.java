package FileDirectory;

import java.io.File;
import java.io.IOException;

public class FileDirectory {

	public static void main(String[] args)  {
		File file = new File("Folder121211");
		try {
		file.createNewFile();
		boolean mkdir = file.mkdir();
		System.out.println("diretório criado? " + mkdir);
	}
		catch(IOException e) {
		e.printStackTrace();
		}
	}

}
