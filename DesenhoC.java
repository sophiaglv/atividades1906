package exercicios1906;

public class DesenhoC {

	public static void main(String[] args) {
		for (int l=0; l<5; l++) {
			for (int c=0; c<5; c++) {
				if (l == 2 || c == 2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
