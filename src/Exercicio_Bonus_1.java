import java.util.Scanner;

public class Exercicio_Bonus_1 {

	//1. Escrever um algoritmo para determinar o consumo médio de um automóvel sendo fornecida a distância total percorrida pelo automóvel e o total de combustível gasto. 
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		double distanciaPercorrida, combustivelGasto, consumoMedio;
		
		System.out.println("Programa que calcula o consumo médio de combustível de um automóvel em Quilômetros por litro.");
		
		System.out.println("Informe a distância percorrida em quilômetros (KM):");
		distanciaPercorrida = leitor.nextDouble();
		
		System.out.println("Informe a quantidade de combustível gasto em litros:");
		combustivelGasto = leitor.nextDouble();
		
		consumoMedio = distanciaPercorrida / combustivelGasto;
		
		System.out.println("O consumo médio deste automóvel foi: " + consumoMedio + " KM/L");
		
		leitor.close();

	}

}
