package Arrays;

public class Array5 {

	public static void main(String[] args) {
	int[][] dias = new int[3][];
	
	dias[0] = new int[] {3,4};
	dias[1] = new int[]{1, 2, 3};
	dias[2] = new int[4];
	
for (int[] ref: dias) {
	for(int dia : ref) {
		System.out.println(dia);
	}
	System.out.println("");
}

	System.out.println("_____________");
	int[][] mamae = {{1,2,3},{4,2,6},{7,8,0}};
	for( int i = 0; i < mamae.length; i++) {
	for ( int j = 0; j < mamae[i].length; j++) {
		if(i==j)
		System.out.println(mamae[i][j]);
	}
	}

	}
}
