import java.util.Scanner;

public class Lista_Bonus_for_ex10 
{

		//EX 10 � Antes da pandemia, o rod�zio na cidade de S�o Paulo foi motivo  de  confus�o  em  uma  empresa:  muitos  dos  150  colaboradores   est�o   se   atrasando   e   alegando   que   o   problema  foi  o  hor�rio  do  rod�zio. 
		
		//Cansado  disso,  um  dos  diretores  da  empresa  solicitou  um  programa  que  receba  o  NOME   de   cada   um   dos   funcion�rios,   o   SETOR   desses   profissionais e o meio de transporte usado (CARRO ou �NIBUS). 
		
		//Caso o profissional use um CARRO para ir at� a empresa, deve ser solicitada a digita��o do �ltimo d�gito num�rico da placa do carro e a mensagem exibida deve ser: �Seu dia de rod�zio � � seguida do dia de rod�zio. 
		
		//Caso o profissional use um �NIBUS para ir at� a empresa, deve ser exibida a mensagem �rod�zio n�o se aplica�. 
		
		public static void main(String[] args) 
		{
			
			Scanner leitor = new Scanner(System.in);
			
			String nome = "", setor = "";
			int escolha, placa, func;
			
			System.out.println("Informar quantidade de Funcionários existem na empresa:");
			func = leitor.nextInt();
			
			for (int i = 0; i < func; i++)
			{
				System.out.println("Qual seu nome?");
				nome = leitor.next();
				
				System.out.println("Qual o seu setor?");
				setor = leitor.next();
				
				System.out.println("Informe o meio de Transporte.\n1 - Carro\n2 - Ônibus");
				escolha = leitor.nextInt();
				
				if (escolha == 1)
				{
					System.out.println("Informe o final da placa do carro:");
					placa = leitor.nextInt();
					
					if (placa == 1 || placa == 2) 
					{
						System.out.println("Seu dia de rodízio é SEGUNDA-FEIRA");
					}
					else if (placa == 3 || placa == 4) 
					{
						System.out.println("Seu dia de rodízio é TERÇA-FEIRA");
					}
					else if (placa == 5 || placa == 6) 
					{
						System.out.println("Seu dia de rodízio é QUARTA-FEIRA");
					}
					else if (placa == 7 || placa == 8) 
					{
						System.out.println("Seu dia de rodízio é QUINTA-FEIRA");
					}
					else if (placa == 9 || placa == 0) 
					{
						System.out.println("Seu dia de rodízio é SEXTA-FEIRA");
					}
				}
				else if (escolha == 2)
				{
					System.out.println("Rodízio não se aplica.");
				}
				else
				{
					System.out.println("Opção Inválida!");
				}
			}
			
			leitor.close();
			
		}

	}
