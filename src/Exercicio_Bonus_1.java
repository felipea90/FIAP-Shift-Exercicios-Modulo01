import java.util.Scanner;

public class Exercicio_Bonus_1 {

	//1. Escrever um algoritmo para determinar o consumo m�dio de um autom�vel sendo fornecida a dist�ncia total percorrida pelo autom�vel e o total de combust�vel gasto. 
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		double distanciaPercorrida, combustivelGasto, consumoMedio;
		
		System.out.println("Programa que calcula o consumo m�dio de combust�vel de um autom�vel em Quil�metros por litro.");
		
		System.out.println("Informe a dist�ncia percorrida em quil�metros (KM):");
		distanciaPercorrida = leitor.nextDouble();
		
		System.out.println("Informe a quantidade de combust�vel gasto em litros:");
		combustivelGasto = leitor.nextDouble();
		
		consumoMedio = distanciaPercorrida / combustivelGasto;
		
		System.out.println("O consumo m�dio deste autom�vel foi: " + consumoMedio + " KM/L");
		
		leitor.close();

	}

}
