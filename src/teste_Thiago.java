import java.util.Scanner;

public class teste_Thiago 
{	
public static void main(String[] args) 
    {
    Scanner leitor = new Scanner (System.in);

    int sexo=0, mulheres=0, homens=0, quantidade=0;

    double altura, maiorAltura=0, menorAltura=0, mediaAlturaHomens=0, totalAlturaHomens=0;

    System.out.println("Este programa irá receber uma lista contendo a altura e o sexo de algumas pessoas. Com base na lista, o programa irá informar a maior e a menor altura do grupo, a media da altura dos homens e o numero de mulheres");

    System.out.println("Favor digitar a quantidade de pessoas nesta lista");
    quantidade = leitor.nextInt();

    for (int i = 0; i < quantidade; i++)
        {
            System.out.println("Por favor digite 1 para informar se é uma mulher ou 2 se é um homem");
            sexo  =  leitor.nextInt();

            System.out.println("Por favor informe a altura");
            altura = leitor.nextDouble();

            if (sexo == 1)
            {
                mulheres++;
            }
            else if(sexo ==2)
            {
                homens++;
                totalAlturaHomens = totalAlturaHomens + altura;
            }
            else
            {
                System.out.println("Digite uma opção válida");
            }
            if (altura> maiorAltura)
            {
                maiorAltura = altura;
            }
            else if(altura<menorAltura)
            {
                menorAltura = altura;
            }
        }
            mediaAlturaHomens = totalAlturaHomens / homens;

        System.out.println("A maior altura é de " + maiorAltura + "cm e a menor altura é " + menorAltura + " cm");
        System.out.println("A média de altura do grupo de homens é " + mediaAlturaHomens + "cm");
        System.out.println("O total de mulheres do grupo é de " + mulheres + " mulheres");
        
        leitor.close();
    }
}