package exercicios1906;

public class TresMatrizes {

	public static void main(String[] args) {
		int numInt [][] = new int [3][4];
		double numRac [][] = new double [3][3];
		char letra [][] = {{'A', 'B', 'C', 'D', 'E'}, {'F', 'G', 'H', 'I', 'J'}, {'K', 'L', 'M', 'N', 'O'}, {'P', 'Q', 'R', 'S', 'T'}};

		for (int l=0; l<3; l++) {
			for (int c=0; c<4; c++) {
				numInt [l][c] = (int)Math.round(Math.random()*100);
			}
		}
		for (int l=0; l<3; l++) {
			for (int c=0; c<3; c++) {
				numRac [l][c] = (double)(Math.random()*100);
			}
		}
		
		for(char[] letras:letra) {
			for (char coluna:letras) {
				System.out.print(coluna + "\t");
			}
			System.out.println();
		}
		System.out.println();
		for(int[] num:numInt) {
			for (int coluna:num) {
				System.out.print(coluna + "\t");
			}
			System.out.println();
		}
		System.out.println();
		for(double[] numR:numRac) {
			for (double coluna:numR) {
				System.out.print(coluna + "\t");
			}
			System.out.println();
		}
	}

}
