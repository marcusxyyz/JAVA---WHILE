package estrutura_repetiição;

import java.util.Scanner;

public class ex3_Posto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int alco = 0, gas = 0, diesel = 0;
		
		System.out.println("Informe o combustivel de sua preferencia"
				+ " 1.Alcool 2.Gasolina 3.Diesel ou 4.Fim:");
		int	cod = sc.nextInt();
		
		while(cod != 4) {
			if (cod == 1) {
				alco += 1;
			}
			else if (cod == 2) {
				gas += 1;
			}
			else if (cod == 3) {
				diesel += 1;
			}
			else {
				System.out.println("Numero invalido informe um numero de 1 a 4");
			}
			System.out.println("Informe o combustivel de sua preferencia"
					+ " 1.Alcool 2.Gasolina 3.Diesel ou 4.Fim:");
			cod = sc.nextInt();
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool = " + alco);
		System.out.println("Gasoliina = " + gas);
		System.out.println("Diesel = " + diesel);
		
		sc.close();
	}

}
