package estrutura_repetiição;

import java.util.Locale;
import java.util.Scanner;

public class ex2_coordenadas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe as coordendas de x e y:");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		while (x != 0 && y != 0) {
			if(x > 0 && y > 0) {
				System.out.println("Primeiro");
			}
			else if (x < 0 && y > 0) {
				System.out.println("Segundo");
			}
			else if(x < 0 && y < 0){
				System.out.println("Terceiro");
			}
			else {
				System.out.println("Quarto");
			}
			System.out.println("Informe as coordendas de x e y:");
			x = sc.nextDouble();
			y = sc.nextDouble();
		}
		sc.close();
	}

}
