package teste;

public class teste1 {

	static void Fat (int n, int aux, int i) {
		
		if (i == 0 || i == 1) {
			System.out.println("O fatorial de n e " + aux);
		}
		else {
			Fat (n, aux*i, i-1);
		}
	}
	
	public static void main(String entrda[]) {
		Fat (5, 1, 5);
	}

}
