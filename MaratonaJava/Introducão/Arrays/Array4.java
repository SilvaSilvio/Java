package Arrays;

public class Array4 {

	public static void main(String[] args) {
		int [][] dias = new int[2][2];
		dias[0][0] = 30;
		dias[0][1] = 32;
		dias[1][0] = 12;
		dias[1][1] = 13;
		
		/*for( int i= 0; i < dias.length; i++) {
		//System.out.println(dias[i]);
			for (int j = 0; j < dias[i].length; j++) {
				System.out.println(dias[i][j]);
		
			}			
		}*/
		
		for (int[] ref: dias) {
			for (int dia : ref){
				System.out.println(dia);
			}
		}
	}

}
