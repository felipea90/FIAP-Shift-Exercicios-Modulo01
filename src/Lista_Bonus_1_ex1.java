import java.util.Scanner;

public class Lista_Bonus_1_ex1 
{
	//1 - Para um ano de nascimento fornecido pelo usuário, informe a idade que ele terá no dia 31 de dezembro de 2021.
	public static void main(String[] args) 
	{
		
		Scanner leitor = new Scanner(System.in);
		
		int anoNascimento, res;

		System.out.println("Programa que calcula a idade no final do ano de 2021.");

		System.out.println("Digite o seu ano de nascimento:");
		anoNascimento = leitor.nextInt();

		if (anoNascimento > 2021)
		{
			System.out.println("O ano informado é maior do que o Ano atual.");
		}
		else
		{
			res = 2021 - anoNascimento;

			System.out.println("Ao final do ano de 2021 você terá " + res + " anos.");
		}
	
		leitor.close();

	}
}