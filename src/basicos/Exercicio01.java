package basicos;

import java.util.Scanner;

public class Exercicio01 {
/*� Para um ano de nascimento fornecido pelo usu�rio, informe a idade que ele ter� no
dia 31 de dezembro de 2021.
 * */
	public static void main(String[] args) {
		//Para solicitarmos que o usu�rio digite um dado pelo teclado, ser� necess�rio criarmos um Scanner. A linha abaixo cria um Scanner chamado "leitor" (lembre-se que a linha import java.util.Scanner; deve estar presente no in�cio desse arquivo)
		Scanner leitor = new Scanner(System.in);
		//Para recebermos o ano de nascimento, criaremos uma vari�vel do tipo int, que guarda n�meros inteiros
		int anoNascimento;
		//Para armazenarmos o resultado do c�lculo da idade do usu�rio, criaremos outra vari�vel do tipo int
		int idade;
		
		//Para orientar o usu�rio, podemos exibir mensagens atrav�s do comando System.out.println, colocando entre par�nteses uma mensagem de texto
		System.out.println("Esse programa calcula que idade voc� ter� ao final do ano de 2021");
		System.out.println("Por favor, insira o seu ano de nascimento: ");
		
		//Devemos utilizar o Scanner para ler a entrada do usu�rio e armazenar essa entrada na vari�vel anoNascimento. Como anoNascimento � do tipo int, o scanner deve usar o m�todo nextInt()
		anoNascimento = leitor.nextInt();
		
		//Para realizarmos opera��es matem�ticas utilizamos os operadores + (soma), - (subtra��o), / (divis�o) e * (multiplica��o)
		idade = 2021 - anoNascimento;
		
		//Podemos exibir o conte�do da vari�vel idade ao utilizarmos um System.out.println. Como queremos exibir o conte�do da vari�vel e n�o seu nome, ela n�o deve estar entre aspas
		System.out.println("Ao final de 2021 voc� ter� " + idade + " anos!");
		
		//Ao final, � importante fechar o scanner e liberar esse recurso:
		leitor.close();
		
	}

}
