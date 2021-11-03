package estrutura_repetiição;

import java.util.Scanner;

public class ex1_senha {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a senha: ");
		int senha = sc.nextInt();
		
		while (senha != 2002) {
			System.out.println("Senha Invalida");
			System.out.print("Digite a senha novamente: ");
			senha = sc.nextInt();
		}
		System.out.println();
		System.out.println("Acesso Permitido");
		
		sc.close();
	}

}
