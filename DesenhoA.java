package exercicios1906;

public class DesenhoA {

	public static void main(String[] args) {
		char matrizA[][] = new char [4][4];

		for (int l=0; l<4; l++) {
			for (int c=3; c>=0; c--) {
				if (l+c <= 3) {
					matrizA[l][c] = '*';
				}
				else {
					matrizA[l][c] = ' ';
				}
			}
		}
		for(char[] num:matrizA) {
			for (char coluna:num) {
				System.out.print(coluna + "\t");
			}
			System.out.println();
		}
	}

}
