package desvios;

import java.util.Scanner;

public class Exercicio04 {
/*Um rob� de combate s� deve ativar sua arma principal quando o inimigo est� a menos de 70cm de dist�ncia. Fa�a um programa onde o usu�rio informe a dist�ncia do inimigo e sejam exibidas as mensagens �ATIVADO� ou �DESATIVADO� dependendo do status da arma.
*/
	public static void main(String[] args) {
		//Para solicitarmos que o usu�rio digite um dado pelo teclado, ser� necess�rio criarmos um Scanner. A linha abaixo cria um Scanner chamado "leitor" (lembre-se que a linha import java.util.Scanner; deve estar presente no in�cio desse arquivo)
		Scanner leitor = new Scanner(System.in);
		//Para recebermos a dist�ncia do inimigo, vamos criar uma vari�vel do tipo double, que suporta n�meros com casas decimais
		double distancia;
		
		
		//Para orientar o usu�rio, podemos exibir mensagens atrav�s do comando System.out.println, colocando entre par�nteses uma mensagem de texto
		System.out.println("Esse programa simula um rob� de combate");
		System.out.println("Por favor, informe a dist�ncia, em cm, do inimigo: ");
		
		//Devemos utilizar o Scanner para ler a entrada do usu�rio e armazenar essa entrada na vari�vel distancia. Como distancia � do tipo double, o scanner deve usar o m�todo nextDouble()
		distancia = leitor.nextDouble();
		
		
		//Para avaliarmos se as armas do rob� devem ser ativadas ou n�o, precisamos avaliar se a dist�ncia � menor do que 70. Para avaliar essa condi��o, utilizaremos um if composto.
		if (distancia<70) {
			//Essa � a parte do if que ser� executada caso a condi��o seja verdadeira, ou seja, caso a dist�ncia seja menor do que 70
			System.out.println("ATIVADO");
		}else {
			//Essa � a parte do if que ser� executada caso a condi��o seja falsa, ou seja, caso a dist�ncia N�O SEJA menor do que 70
			System.out.println("DESATIVADO");

		}
		leitor.close();

	}

}
