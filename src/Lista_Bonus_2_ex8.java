import java.util.Scanner;

public class Lista_Bonus_2_ex8 {

	// 8 � Um professor quer saber quantos alunos de uma sala de 5 tiveram nota maior do que a m�dia. Fa�a um programa onde o professor informe a m�dia e as notas de cada um dos 5 alunos e, ao final, seja exibido quantos alunos tiveram nota superior � m�dia e quantos tiveram nota inferior � m�dia.
	
	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		
		
		double media, nota;
		int contador=0, abaixo=0, acima=0;
		
		System.out.println("Programa que calcula a quantidade de alunos acima e abaixo da m�dia");
		
		System.out.println("Professor, entre com a média de corte:");
		media = leitor.nextDouble();
		
		while (contador < 5)
		{
			System.out.println("Digite a nota do aluno");
			nota = leitor.nextDouble();
			
			if (nota < media) {
				abaixo = abaixo + 1;
			}
			else {
				acima = acima + 1;
			}
			
			contador = contador + 1;
		}
		
		System.out.println("A quantidade de alunos acima da média " + media + " é de: " + acima);
		
		System.out.println("A quantidade de alunos abaixo da média " + media + " é de: " + abaixo);
		
		leitor.close();

	}

}
