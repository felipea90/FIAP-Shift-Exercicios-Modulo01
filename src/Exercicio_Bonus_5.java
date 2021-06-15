import java.util.Scanner;

public class Exercicio_Bonus_5 
{
    /*
    2. Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino) de 10 pessoas. Fazer um algoritmo que calcule e escreva:
        a. a maior e a menor altura do grupo;
        b. média de altura dos homens;
        c. o número de mulheres.
    */
    public static void main(String[] args) 
    {
        Scanner leitor = new Scanner(System.in);

            int sexo, qtdMulheres=0, qtdHomens=0;
            float altura, somaAltura=0, mediaAlturaHomens=0, maiorAltura=0, menorAltura=0;

            for (int i=0; i<10; i++) 
            {

                System.out.print("Escolha o sexo da pessoa (1-Mulher, 2-Homem): ");
                sexo = leitor.nextInt();

                System.out.print("Digite a altura: ");
                altura = leitor.nextFloat();

                if (sexo == 1) 
                {
                    qtdMulheres++;
                } 
                else if (sexo == 2) 
                {
                    qtdHomens++;
                    somaAltura = somaAltura + altura;
                } 
                else 
                {
                    System.out.println("Opção sexo inválido!");
                }

                if (altura > maiorAltura) 
                {
                    maiorAltura = altura;
                } 
                else if (menorAltura < altura) //Tem Bug no cálculo da menor altura, vai precisar armazenar em array e fazer comparação.
                {
                    menorAltura = altura;
                }
            }
            mediaAlturaHomens = somaAltura / qtdHomens;
    
            System.out.println("A maior altura do grupo é de " + maiorAltura + " m, e a menor é de " + menorAltura + " m");
            System.out.println("A média de altura dos homens é " + mediaAlturaHomens + " m");
            System.out.println("O número de mulheres é " + qtdMulheres);

        leitor.close();
    } 
}
