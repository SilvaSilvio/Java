package Array;

public class Array {

	public static void main(String[] args) {
		int[] idade = new int[5] ;
		String[] nome = new String[5];
		
		nome[0] = "Silvio";
		nome[1] = "Sergio";
		nome[2] = "Darkson";
		nome[3] = "Severiano";
		nome[4] = "Dadimar";
		
		
		System.out.println(nome[0]);
		
		for (String nomes : nome) {
			System.out.println( nomes  );
		}
		
		
		
		idade[0] = 2;
		idade[2] = 3;
		
		for (int i : idade) {
			System.out.println(i);
		}
		
		
		
	}

}
