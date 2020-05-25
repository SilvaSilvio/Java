package StringS;

public class StringBuilderTest {

	public static void main(String[] args) {
		long inicio = System.currentTimeMillis();
		StringBuilder ab = new StringBuilder(18);
		//ab.append("Meu malvado favorito");
		ab.append("Teste");
		System.out.println(ab.reverse());
		System.out.println(ab.deleteCharAt(2 ));
		
		
		long fim = System.currentTimeMillis();
	
		
		System.out.println("Tempo gasto é :  "+ (fim - inicio)+ " ms");
	
	
	}

}
