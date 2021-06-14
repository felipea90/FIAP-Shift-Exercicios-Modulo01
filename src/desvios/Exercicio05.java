package desvios;

import java.util.Scanner;

public class Exercicio05 {
/*Um drone de limpeza de ruas deve escolher carregar sempre o lixo de menor peso. Entre os pesos de 3 lixos informados pelo usu�rio, um programa deve indicar qual deles deve ser carregado pelo drone. */
	public static void main(String[] args) {
		//Para solicitarmos que o usu�rio digite um dado pelo teclado, ser� necess�rio criarmos um Scanner. A linha abaixo cria um Scanner chamado "leitor" (lembre-se que a linha import java.util.Scanner; deve estar presente no in�cio desse arquivo)
		Scanner leitor = new Scanner(System.in);
		
		//Para recebermos a o peso dos tr�s lixos, vamos criar tr�s vari�veis do tipo double, que suporta n�meros com casas decimais
		double lixoA, lixoB, lixoC;
		
		//Para orientar o usu�rio, podemos exibir mensagens atrav�s do comando System.out.println, colocando entre par�nteses uma mensagem de texto
		System.out.println("Esse programa simula um drone de limpeza urbana");
		System.out.println("Por favor, informe o peso do primeiro lixo: ");
		
		//Devemos utilizar o Scanner para ler a entrada do usu�rio e armazenar essa entrada na vari�vel lixoA. Como lixoA � do tipo double, o scanner deve usar o m�todo nextDouble()
		lixoA = leitor.nextDouble();
		
		System.out.println("Por favor, informe o peso do segundo lixo: ");
		lixoB = leitor.nextDouble();
		
		System.out.println("Por favor, informe o peso do terceiro lixo: ");
		lixoC = leitor.nextDouble();
		
		
		//Para avaliarmos qual dos lixos devem ser recolhidos, precisamos verificar qual deles tem o menor peso. Para isso precisaremos comparar o peso de cada lixo com os demais. A condi��o lixoA < lixoB && lixoA < lixoC, por exemplo, retorna verdadeiro apenas quando o lixoA for mais leve que o liboB e, simultaneamente, mais leve que o lixoC
		if (lixoA<lixoB && lixoA<lixoC) {
			//Parte verdadeira do if. Ser� executada caso o lixo A seja o mais leve
			System.out.println("O primeiro lixo informado, pesando " + lixoA + "kg � o mais leve e ser� recolhido pelo drone");
		}else {
			//Caso o primeiro teste seja falso, iniciaremos um segundo teste, para verificar se o segundo lixo � o mais leve
			if (lixoB<lixoA && lixoB<lixoC) {
				//Parte verdadeira do 2� if. Ser� executada caso o lixoB seja o mais leve
				System.out.println("O segundo lixo informado, pesando " + lixoB + "kg � o mais leve e ser� recolhido pelo drone");
			}else {
				//Caso o segundo teste seja falso, temos 2 alternativas: ou afirmamos que o lixoC � o mais leve ou criamos um terceiro if para verificar se o terceiro lixo � o mais leve ou se houve empate
				if(lixoC<lixoA && lixoC<lixoB) {
					//Parte verdadeira do 3� if. Ser� executada caso o lixoC seja o mais leve
					System.out.println("O terceiro lixo informado, pesando " + lixoC + "kg � o mais leve e ser� recolhido pelo drone");
				}else {
					//Caso nenhum dos testes tenha sido verdadeiro, exibiremos uma mensagem informando que houve empate
					System.out.println("Existem res�duos com pesos iguais. Enviando mensagem para a equipe t�cnica.");
				}
			}
		}
		leitor.close();
		
	}

}
