import java.util.Scanner;

public class Exercicio_Bonus_3 
{

	// 3. Suponha que você esteja fazendo um concurso público.
	
	// Cada candidato ao cargo terá direito a uma pontuação em função da sua titulação, anos de experiência e idade.
	
	// Baseado na tabela abaixo, faça um programa que leia o nome do candidato, sua titulação, tempo de experiência e idade.
	
	// O algoritmo deverá então calcular e imprimir o nome do candidato e sua pontuação final. 
	
	// Além disso, se o candidato possuir menos de 40 anos de idade, terá direito a mais 100 pontos.
	
	// Caso contrário, perderá 50 pontos.
	
	public static void main(String[] args) 
	{
		
		Scanner leitor = new Scanner(System.in);
		
		int idade, pontuacao, escolha, xp;
		String nome = "";
		
		System.out.println("Programa que calcula a pontuação do concurso público.\n");
		
		System.out.println("Digite seu Nome:");
		nome = leitor.next();
		
		System.out.println("Digite sua idade:");
		idade = leitor.nextInt();
		
		System.out.println("Escolha a sua Titulação:\n1 - 2º Grau\n2 - Graduação\n3 - Pós Graduação");
		escolha = leitor.nextInt();
		
		if (escolha == 1) 
		{
			
			if (idade > 40) 
			{
				pontuacao = 0;
				System.out.println(nome + " sua pontuação total será de: " + pontuacao + " pontos"); 
			}
			else 
			{
				pontuacao = 150;
				System.out.println(nome + " sua pontuação total será de: " + pontuacao + " pontos"); 
			}
		}
		else if (escolha == 2) 
		{
			
			System.out.println("Escolha quantos Anos de Experiência:\n1 - Até 4 anos\n2 - Acima de 4 anos");
			xp = leitor.nextInt();
			
			if (xp == 1) 
			{
				
				if (idade > 40) 
				{
					
					pontuacao = 20;
					System.out.println(nome + " sua pontuação total será de: " + pontuacao + " pontos"); 
				}
				else 
				{
					
					pontuacao = 170;
					System.out.println(nome + " sua pontuação total será de: " + pontuacao + " pontos"); 
				}
			
			}
			else 
			{
				
				if (idade > 40) 
				{
					
					pontuacao = 40;
					System.out.println(nome + " sua pontuação total será de: " + pontuacao + " pontos"); 
				}
				else 
				{
					
					pontuacao = 190;
					System.out.println(nome + " sua pontuação total será de: " + pontuacao + " pontos"); 
				}
			}
		}
		else if (escolha == 3)
		{
			System.out.println("Escolha quantos Anos de Experiência:\n1 - Até 4 anos\n2 - De 4 a 6 anos\n3 - Mais de 6 anos");
			xp = leitor.nextInt();
			
			if (xp == 1) 
			{
				if (idade > 40) 
				{
					pontuacao = 50;
					System.out.println(nome + " sua pontuação total será de: " + pontuacao + " pontos"); 
				}
				else 
				{
					pontuacao = 200;
					System.out.println(nome + " sua pontuação total será de: " + pontuacao + " pontos"); 
				}
			}
			else if (xp == 2)
			{
				if (idade > 40) 
				{
					pontuacao = 70;
					System.out.println(nome + " sua pontuação total será de: " + pontuacao + " pontos"); 
				}
				else 
				{
					pontuacao = 220;
					System.out.println(nome + " sua pontuação total será de: " + pontuacao + " pontos"); 
				}
			}
			else 
			{
				if (idade > 40) 
				{
					pontuacao = 100;
					System.out.println(nome + " sua pontuação total será de: " + pontuacao + " pontos"); 
				}
				else 
				{
					pontuacao = 250;
					System.out.println(nome + " sua pontuação total será de: " + pontuacao + " pontos"); 
				}
			}
		}
		else
		{
			System.out.println("Opção inválida.");
		}
		
		leitor.close();
	}
}