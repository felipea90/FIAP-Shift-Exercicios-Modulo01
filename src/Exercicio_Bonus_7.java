import java.util.Scanner;

public class Exercicio_Bonus_7 
{
    /*
    4. Uma parede em formato retangular, cuja altura é hp (altura da parede) e a largura lp (largura da parede) precisa ser coberta por azulejos também retangulares. O azulejo retangular tem dimensões ha (altura do azulejo) e la (largura do azulejo). Escreva um programa que leia as quatro medidas hp, lp, ha e la, calcule e imprima quanto azulejos com as medidas dadas são necessários para cobrir a parede dada.
    */
    public static void main(String[] args) 
    {
        Scanner leitor = new Scanner(System.in);

        double hp, lp, ha, la, mediaP, mediaA, total;

        System.out.println("Programa que calcula a quantidade de azulejos para cobrir a parede.");

        System.out.println("Informe as medidas da parede.\n");
        
        System.out.println("Altura da Parede:");
        hp = leitor.nextDouble();

        System.out.println("Largura da Parede:");
        lp = leitor.nextDouble();

        mediaP = hp * lp;

        System.out.println("Informe as medidas do azulejo.\n");

        System.out.println("Altura do Azulejo:");
        ha = leitor.nextDouble();

        System.out.println("Largura do Azulejo:");
        la = leitor.nextDouble();

        mediaA = ha * la;

        total = mediaP / mediaA;

        System.out.println("A quantidade total de azulejos para cobrir a parede será de " + total);

        leitor.close();
    }    
}
