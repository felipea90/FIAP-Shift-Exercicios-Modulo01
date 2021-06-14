package loopwhile;

import java.util.Scanner;

public class Exercicio7 {
/*No parque Valter Dino World, os clientes podem ter a chance de passar uma noite no castelo da princesa Javarella. Para isso, devem acertar quantos feij�es est�o em um jarro (1238). Fa�a um programa que solicite a digita��o da quantidade de feij�es at� que um cliente acerte.*/
	public static void main(String[] args) {
		//Para solicitarmos que o usu�rio digite um dado pelo teclado, ser� necess�rio criarmos um Scanner. A linha abaixo cria um Scanner chamado "leitor" (lembre-se que a linha import java.util.Scanner; deve estar presente no in�cio desse arquivo)
		Scanner leitor = new Scanner(System.in);
		//Para recebermos o n�mero de feij�es informados pelo usu�rio, devemos criar uma vari�vel do tipo int (n�meros inteiros). Essa vari�vel ser� usada em uma condi��o antes mesmo de o usu�rio digitar algo e, por essa raz�o, vamos inici�-la com o valor 0 (zero)
		int qtdeFeijoes = 0;
		
		//Nosso programa exige que o usu�rio digite uma nova quantidade at� acertar. Temos, portanto, uma REPETI��O que podemos solucionar com um loop While, estabelecendo como condi��o que a qtdeFeijoes seja diferente de 1238 para o loop rodar. Dessa forma, quando o usu�rio digitar 1238, o loop n�o ser� mais executado.
		while (qtdeFeijoes!=1238) {
			//Aqui devemos escrever o que deve ocorrer enquanto o usu�rio ainda n�o tiver digitado a senha 1238. No nosso caso, devemos solicitar que ele digite a quantidade
			System.out.println("Por favor, informe quantos feij�es est�o dentro do jarro: ");
			qtdeFeijoes = leitor.nextInt();
		}
		
		//Todas as instru��es a partir daqui s� ser�o executadas quando o loop for encerrado. Podemos incluir aqui nossa mensagem de parab�ns ao usu�rio
		System.out.println("Parab�ns! O jarro tinha exatamente 1238 feij�es! Voc� pode passar uma noite no castelo da Javarella!");
		
		leitor.close();

	}

}
