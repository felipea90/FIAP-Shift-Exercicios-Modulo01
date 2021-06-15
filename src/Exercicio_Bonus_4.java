import java.util.Scanner;

public class Exercicio_Bonus_4 
{
    /*
    1. Escreva um programa que, com base em uma temperatura em graus celsius, a converta e exiba em Kelvin (K), Réaumur (Re), Rankine (Ra) e Fahrenheit (F), seguindo as fórmulas: F = C * 1.8 + 32; K = C + 273.15; Re = C * 0.8; Ra = C * 1.8 + 32 + 459.67
    */
    public static void main(String[] args) 
    {
        Scanner leitor = new Scanner(System.in);

        double fahrenheit, celsius, kelvin, reaumur, rankine;

        System.out.println("Programa de conversão de temperatura.");

        System.out.println("Informe o valor da temperatura em graus Celsius:");
        celsius = leitor.nextDouble();

        fahrenheit = celsius * 1.8 + 32;
        kelvin = celsius + 273.15;
        reaumur = celsius * 0.8;
        rankine = celsius * 1.8 + 32 + 459.67;

        System.out.println("A temperatura em Fahrenheit (F): " + fahrenheit);
        System.out.println("A temperatura em Kelvin (K): " + kelvin);
        System.out.println("A temperatura em Reamur (Re): " + reaumur);
        System.out.println("A temperatura em Rankine (Ra): " + rankine);

        leitor.close();
    }    
}
