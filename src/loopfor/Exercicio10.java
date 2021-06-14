package loopfor;

import java.util.Scanner;

public class Exercicio10 {
/*Antes da pandemia, o rod�zio na cidade de S�o Paulo foi motivo de confus�o em uma empresa: muitos dos 150 colaboradores est�o se atrasando e alegando que o problema foi o hor�rio do rod�zio. Cansado disso, um dos diretores da empresa solicitou um programa que receba o NOME de cada um dos funcion�rios, o SETOR desses profissionais e o meio de transporte usado (CARRO ou �NIBUS).
Caso o profissional use um CARRO para ir at� a empresa, deve ser solicitada a digita��o do �ltimo d�gito num�rico da placa do carro e a mensagem exibida deve ser: �Seu dia de rod�zio � � seguida do dia de rod�zio.
Caso o profissional use um �NIBUS para ir at� a empresa, deve ser exibida a mensagem �rod�zio n�o se aplica�.*/
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		//Para receber os dados digitados pelo usu�rio, precisaremos criar uma vari�vel do tipo String chamada nome e outra do tipo String chamada setor. 
		String nome, setor;
		//Para o meio de transporte, podemos optar por criar uma vari�vel String, supondo que o usu�rio digite CARRO ou �NIBUS ou uma vari�vel do tipo int, se quisermos que ele digite 1 para carro e 2 para onibus. Ser� necess�rio criar tamb�m uma vari�vel para armazenar o �ltimo d�gito da placa.
		int meioDeTransporte, placa;
		
		//O programa pede que a digita��o seja feita para 150 funcion�rios, portanto criaremos um loop que execute 150 vezes
		for(int i=1;i<=150;i++) {
			//Para cada execu��o desse loop devemos, primeiro, solicitar o nome e o setor do funcion�rio
			System.out.println("Por favor, informe o nome do " + i + "� funcion�rio");
			nome = leitor.next();
			System.out.println("Por favor, informe o setor do " + i + "� funcion�rio");
			setor = leitor.next();
			
			//Agora precisamos solicitar o meio de transporte
			System.out.println("Digite 1 se o funcion�rio utiliza o CARRO e 2 se o funcion�rio utiliza �NIBUS");
			meioDeTransporte = leitor.nextInt();
			
			//Antes de solicitar a placa, precisamos verificar qual o meio de transporte escolhido. Isso pode ser feito atrav�s de um if ou de um switch. Optaremos aqui pelo if para que esse exerc�cio contenha os exemplos das duas estruturas
			if(meioDeTransporte == 1) {
				//Caso o funcion�rio utilize o carro, precisamos solicitar a placa do mesmo e verificar em qual dia da semana ela se encaixa.
				System.out.println("Por favor, informe o �ltimo d�gito da placa do carro do funcion�rio");
				placa = leitor.nextInt();
				
				//Para verificar a placa, optaremos pelo switch para que o exerc�cio contenha os dois exemplos das estruturas
				switch(placa) {
				case 1: //N�o vamos colocar nenhuma instru��o no case 1, nem o break, pois queremos que as mesmas instru��es do case 2 sejam aplicadas caso a placa seja 1 tamb�m
				case 2:
					System.out.println("Aten��o, " + nome + " do setor "+ setor + ", seu dia de rod�zio � segunda-feira");
					break;
				case 3:
				case 4:
					System.out.println("Aten��o, " + nome + " do setor "+ setor + ", seu dia de rod�zio � ter�a-feira");
					break;
				case 5:
				case 6:
					System.out.println("Aten��o, " + nome + " do setor "+ setor + ", seu dia de rod�zio � quarta-feira");
					break;
				case 7:
				case 8:
					System.out.println("Aten��o, " + nome + " do setor "+ setor + ", seu dia de rod�zio � quinta-feira");
					break;
				case 9:
				case 0:
					System.out.println("Aten��o, " + nome + " do setor "+ setor + ", seu dia de rod�zio � sexta-feira");
					break;
				}
			}else {
				//Caso o funcion�rio n�o tenha escolhido a op��o 1, vamos verificar se escolheu a op��o 2
				if (meioDeTransporte ==2) {
					//Caso a escolha tenha sido a op��o dois, exibiremos a mensagem referente ao transporte de onibus
					System.out.println("Aten��o, " + nome + " do setor "+ setor + ", o rod�zio municipal n�o se aplica ao transporte de onibus");
					
				}else {
					//Caso a escolha n�o tenha sido 1 ou 2, exibiremos uma mensagem de erro
					System.out.println("Meio de transporte inv�lido");
				}
			}
		}
		leitor.close();

	}

}
