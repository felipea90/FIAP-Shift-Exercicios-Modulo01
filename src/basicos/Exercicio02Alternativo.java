package basicos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio02Alternativo {
/*Sabendo que cada hora dura 60 minutos e que cada minuto dura 60 segundos,
solicite ao usu?rio que digite o tempo de um filme em minutos e informe a dura??o
desse filme em horas e em segundos.*/
	public static void main(String[] args) {
		//Para solicitarmos que o usu?rio digite um dado pelo teclado, ser? necess?rio criarmos um Scanner. A linha abaixo cria um Scanner chamado "leitor" (lembre-se que a linha import java.util.Scanner; deve estar presente no in?cio desse arquivo)
		Scanner leitor = new Scanner(System.in);
		
		//Agora precisamos criar as vari?veis para armazenarmos o tempo do filme em minutos (ser? digitado pelo usu?rio), em horas (ser? calculado pelo programa) e em segundos. O c?lculo em horas pode gerar um n?mero com casas decimais, por conta da divis?o. Ent?o criaremos as vari?veis para minutos e segundos como do tipo int e a vari?vel para as horas como do tipo double.
		int minutos, segundos;
		double horas;
		
		//Para orientar o usu?rio, podemos exibir mensagens atrav?s do comando System.out.println, colocando entre par?nteses uma mensagem de texto
		System.out.println("Esse programa recebe a dura??o de um filme em minutos e exibe a convers?o para horas e para segundos");
		System.out.println("Por favor, informe a dura??o do filme em minutos");
		
		//Para armazenarmos em uma vari?vel a dura??o que o usu?rio digitar, devemos usar o Scanner. Como estamos tratando de n?meros inteiros, o Scanner deve usar o m?todo nextInt()
		minutos = leitor.nextInt();
		
		//A convers?o de minutos para segundos ? feita multiplicando os minutos por 60
		segundos = minutos * 60;
		
		//A convers?o de minutos para horas ? feita dividindo os minutos por 60. Se fizermos a divis?o por 60, o java entender? que o resultado deve ser um n?mero inteiro. Para garantirmos que o resultado seja um double, colocamos um .0 ao lado do 60 para que ele seja considerado um n?mero com casas decimais
		horas = minutos / 60.0;
		
		//Para exibirmos o resultado final dos segundos, podemos utilizar o System.out.println(), colocando o nome da vari?vel segundos fora das aspas para que seu conte?do seja exibido
		System.out.println("A dura??o desse filme ? de " + segundos + " segundos");

		
	
		//Para exibirmos nosso resultado considerando apenas 2 casas decimais, podemos utilizar o DecimalFormat (? necess?rio importar java.text.DecimalFormat;). Com ele podemos definir a formata??o do n?mero desejado. Indicando #.00, por exemplo, todos os n?meros da parte inteira ser?o exibidos, mas apenas dois n?meros da parte decimal
		DecimalFormat formatador = new DecimalFormat("#.00");

		//por fim, usamos nosso formatador de n?meros para a vari?vel Horas, escrevendo o nome que demos para ele (formatador) e usando o m?todo .format(), indicando a vari?vel entre par?nteses
		System.out.println("A dura??o desse filme ? de " + formatador.format(horas) + " horas");
		
		
		leitor.close();

	}

}
