package desvios;

import java.util.Scanner;

public class Exercicio06 {
/*Uma loja oferece um desconto de 3% aos clientes que tiverem o cupom �DIADEFESTA�. Fa�a um programa onde o funcion�rio digite o valor da compra e um cupom, informando o valor final a ser pago.*/
	public static void main(String[] args) {
		//Para solicitarmos que o usu�rio digite um dado pelo teclado, ser� necess�rio criarmos um Scanner. A linha abaixo cria um Scanner chamado "leitor" (lembre-se que a linha import java.util.Scanner; deve estar presente no in�cio desse arquivo)
		Scanner leitor = new Scanner(System.in);
		
		//Para recebermos o valor total da compra, vamos criar uma vari�vel double, que armazena valores com casas decimais. Criaremos tamb�m uma vari�vel chamada valorFinal para armazenarmos o valor com o desconto
		double totalCompra, valorFinal;
		
		//Para recebermos o cupom de desconto, vamos criar uma vari�vel String, que armazena valores de texto
		String cupom;
		
		//Para orientar o usu�rio, podemos exibir mensagens atrav�s do comando System.out.println, colocando entre par�nteses uma mensagem de texto
		System.out.println("Sistema de vendas da JavaShop");
		System.out.println("Por favor, informe o total da compra do cliente: ");
		
		//Devemos utilizar o Scanner para ler a entrada do usu�rio e armazenar essa entrada na vari�vel totalCompra. Como totalCompra � do tipo double, o scanner deve usar o m�todo nextDouble()
		totalCompra = leitor.nextDouble();
		
		System.out.println("Por favor, informe o cupom do desconto do cliente: ");
		//Devemos utilizar o Scanner para ler a entrada do usu�rio e armazenar essa entrada na vari�vel cupom. Como cupom � do tipo String, o scanner deve usar o m�todo next()
		cupom = leitor.next();
		
		//Agora � preciso validar se o usu�rio digitou o cupom correto. Utilizaremos um if com a condi��o cupom.equals("DIADEFESTA") para verificarmos se o usu�rio digitou o cupom "DIADEFESTA"
		if (cupom.equals("DIADEFESTA")) {
			//Essa � a parte do if que ser� executada caso a condi��o seja verdadeira, ou seja, caso a vari�vel cupom contenha o texto DIADEFESTA
			valorFinal = totalCompra * 0.97; //0.97 corresponde a tr�s por cento de desconto, uma vez que multiplicar por 1 � o mesmo que considerar 100% (totalidade) de algo
		}else {
			//Essa � a parte do if que ser� executada caso a condi��o seja falsa, ou seja, caso a vari�vel cupom n�o contenha o texto DIADEFESTA
			valorFinal = totalCompra;
		}
		
		System.out.println("Com o uso do cupom " + cupom + ", sua compra que tinha o valor de R$" + totalCompra + " agora tem o valor final de R$" + valorFinal);
		
		leitor.close();


	}

}
