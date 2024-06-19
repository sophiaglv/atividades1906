package exercicios1906;

public class DesenhoB {

	public static void main(String[] args) {
		char matrizB[][] = new char [4][4];

		for (int l=0; l<=3; l++) {
			for (int c=3; c>=0; c--) {
				if(l+c==3) {
					matrizB[l][c] = '*';
				}
				else {
					matrizB[l][c] = ' ';
				}
			}
		}
		for (char[]l:matrizB) {
			for (char coluna:l) {
				System.out.print(coluna + "\t");
			}
			System.out.println();
		}
	}

}
