package basicos;

import java.util.Scanner;

public class Exercicio03 {
/*Solicite ao usu�rio a digita��o de 2 n�meros inteiros, nas vari�veis A e B. Sem usar uma terceira vari�vel, troque os valores de A e B entre si.*/
	public static void main(String[] args) {
		//Para solicitarmos que o usu�rio digite um dado pelo teclado, ser� necess�rio criarmos um Scanner. A linha abaixo cria um Scanner chamado "leitor" (lembre-se que a linha import java.util.Scanner; deve estar presente no in�cio desse arquivo)
		Scanner leitor = new Scanner(System.in);
		//Para recebermos os valores das vari�veis A e B, duas vari�veos do tipo int, que guarda n�meros inteiros. 
		int a, b;
		
		//Para orientar o usu�rio, podemos exibir mensagens atrav�s do comando System.out.println, colocando entre par�nteses uma mensagem de texto
		System.out.println("Receber� 2 valores num�ricos e inverter� entre si as vari�veis que armazenam esses valores ");
		System.out.println("Por favor, digite um n�mero inteiro para ser armazenado na vari�vel A: ");
		
		//Devemos utilizar o Scanner para ler a entrada do usu�rio e armazenar essa entrada na vari�vel a. Como a � do tipo int, o scanner deve usar o m�todo nextInt()
		a = leitor.nextInt();
		
		System.out.println("Por favor, digite um n�mero inteiro para ser armazenado na vari�vel B: ");
		b = leitor.nextInt();
		
		
		//Para realizarmos a invers�o sem a ajuda de outras vari�veis, podemos utilizar a matem�tica. Basta somarmos as duas vari�veis e armazenarmos o resultado na vari�vel A (dessa forma, o n�mero armazenado nessa vari�vel representar� a soma das duas). 
		a = a + b;
		//Na sequ�ncia devemos armazenar na vari�vel B o resultado da subtra��o entre a nova vari�vel A (que cont�m a soma dos dois) e o valor da vari�vel B. Dessa maneira, o que restar� na vari�vel B � o valor original da vari�vel A
		b = a - b;
		//Por fim, armazenamos na vari�vel A a subtra��o entre o valor atual da vari�vel A (que ainda cont�m a soma dos dois valores) e o valor atual da vari�vel B(que, agora, cont�m o valor original da vari�vel A). O que restar�, portanto, � o valor original da vari�vel B
		a = a - b;
		
		//Nos resta apenas exibir os valores invertidos
		System.out.println("Agora a vari�vel A cont�m o valor: " + a);
		System.out.println("Agora a vari�vel B cont�m o valor: " + b);
	
		leitor.close();
	}

}
