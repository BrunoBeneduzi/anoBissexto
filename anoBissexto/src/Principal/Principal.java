package Principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean verifica = false;
		int ano;

		do {

			System.out.print("Digite o ano -> ");
			ano = sc.nextInt();
			if(String.valueOf(ano).length() == 4) verifica = false;//converte de int para uma String
			else { 
				verifica = true; 
				System.out.println("o ano deve conter 4 digitos");

			}
		}while(verifica);

		if((ano % 4 == 0) || (ano % 100 == 0 && ano % 400 == 0)){
			System.out.println("o ano "+ano+" é bissexto");
		}
		else System.out.println("o ano "+ano+" não é bissexto");
	}

}