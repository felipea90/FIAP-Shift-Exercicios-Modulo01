import java.util.Scanner;

public class Lista_Bonus_2_ex7 
{
	
	//7 � No parque Valter Dino World, os clientes podem ter a chance de passar uma noite no castelo da princesa Javarella.
	
	// Para isso, devem acertar quantos feij�es est�o em um jarro (1238). Fa�a um programa que solicite a digita��o da quantidade de feij�es at� que um cliente acerte.


	public static void main(String[] args) 
	{
		
		Scanner leitor = new Scanner(System.in);
		
		int feijoes;
		
		System.out.println("Programa de sorteio do castelo da princesa\n");
		
		System.out.println("Acerte a quantidade de feij�es no Jarro\n");
		
		System.out.println("Digite o n�mero de feij�es:");
		feijoes = leitor.nextInt();
		
			while (feijoes != 1238)
			{
				System.out.println("Voc� errou!\nDigite o n�mero de feij�es:");
				feijoes = leitor.nextInt();
			}
			
			System.out.println("Voc� acertou!\nHaviam 1238 feij�es.\nBusque seu cupom na cabana do Dino!");
				
		
		leitor.close();

	}

}
