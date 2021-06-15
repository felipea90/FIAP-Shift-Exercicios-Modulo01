import java.util.Scanner;

public class Lista_Bonus_1_ex2
{
    //2 – Sabendo que cada hora dura 60 minutos e que cada minuto dura 60 segundos, solicite ao usuário que digite o tempo de um filme em minutos e informe a duração desse filme em horas e em segundos.
    public static void main(String[] args) 
	{
		Scanner leitor = new Scanner(System.in);

        int minutos, segundos;
        double horas;

        System.out.println("Programa que recebe o filme em Minutos e devolve o tempo em Segundos e Horas.");

        System.out.println("Digite o tempo do filme em minutos:");
        minutos = leitor.nextInt();

        segundos = minutos * 60;
        horas = minutos / 60;

        System.out.println("O filme de " + minutos + " minutos tem " + segundos + " segundos.");

        System.out.println("O filme de " + minutos + " minutos tem " + horas + " horas.");

        leitor.close();
    }
}
