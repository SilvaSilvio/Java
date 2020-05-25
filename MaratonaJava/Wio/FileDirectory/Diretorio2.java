package FileDirectory;

import java.io.File;

public class Diretorio2 {

	public static void main(String[] args) {
File file = new File("Folder1");
boolean mkdir = file.mkdir();
System.out.println("Diretório criado? " + mkdir);
	}

}
