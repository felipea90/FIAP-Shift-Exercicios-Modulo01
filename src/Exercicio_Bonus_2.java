import java.util.Scanner;

public class Exercicio_Bonus_2 {

	//2. Faça um algoritmo que calcule o valor da conta de luz de uma pessoa.
	//Sabe-se que o cálculo da conta de luz segue a tabela abaixo: 
	
	// Tipo de Cliente Valor do KW/h 
	
	// 1 (Residência) 0,60 
	// 2 (Comércio) 0,48 
	// 3 (Indústria) 1,29
	
	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		
		double residencia=0.60, comercio=0.48, industria=1.29;
		double kwh, consumo;
		int escolha;
		
		System.out.println("Programa para cálculo da conta de Luz\n");
		
		System.out.println("Informe o consumo total de KW/h:");
		consumo = leitor.nextDouble();
		
		System.out.println("Escolha o tipo de estabelecimento:\n");
		
		System.out.println("1 - Residência\n2 - Comércio\n3 - Indústria");
		escolha = leitor.nextInt();
		
		if (escolha == 1) {
			
			kwh = consumo * residencia;
			System.out.println("O consumo total de Luz da sua Residência é:\n" + "R$ " + kwh);
		}
		else if (escolha == 2) {
			
			kwh = consumo * comercio;
			System.out.println("O consumo total de Luz do seu Comércio é:\n" + "R$ "  + kwh);
		}
		else if (escolha == 3) {
			
			kwh = consumo * industria;
			System.out.println("O consumo total de Luz da sua Indústria é:\n" + "R$ "  + kwh);
		}
		else {
			
			System.out.println("A opção escolhida está inválida!");
		}
		
		leitor.close();

	}

}
