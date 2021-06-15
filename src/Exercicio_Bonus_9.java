import java.util.Scanner;

public class Exercicio_Bonus_9 
{
    /*
    6. Escreva um programa para determinar a quantidade de cavalos necessários para se levantar uma massa de m quilogramas a uma altura de h metros em t segundos. Considere cavalos = (m * h / t) / 745,6999
    */
    public static void main(String[] args) 
    {
        Scanner leitor = new Scanner(System.in);

        double m, h, t, cavalos;

        System.out.println("Programa que calcula a quantidade de cavalos necessários para se levantar uma massa a uma altura em segundos.\n");

        System.out.println("Informe a massa em KG:");
        m = leitor.nextDouble();

        System.out.println("Informe a altura em metros:");
        h = leitor.nextDouble();

        System.out.println("Informe o tempo em segundos:");
        t = leitor.nextDouble();

        cavalos = (m * h / t) / 745.6999;

        System.out.println("A potência necessário será de " + cavalos + " cavalos.");

        leitor.close();
    }    
}
