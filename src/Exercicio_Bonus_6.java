import java.util.Scanner;

public class Exercicio_Bonus_6 
{
    /*
    3. Criar um programa que calcule a média de salários de uma empresa, pedindo ao usuário a grade de funcionários e os salários, e devolvendo a média salarial.
    */
    public static void main(String[] args) 
    {
        Scanner leitor = new Scanner(System.in);
        
        double salario, soma=0, media;
        int func;

        System.out.println("Programa para cálculo da média de salário da empresa.");

        System.out.println("Informe a quantidade de funcionários:");
        func = leitor.nextInt();

        for (int i = 0; i < func; i++)
        {
            System.out.println("Informe o salário do funcionário");
            salario = leitor.nextDouble();

            soma = salario + soma;
        }

        media = soma / func;

        System.out.println("A Média salarial da empresa é: \nR$ " + media);

        leitor.close();
    }    
}
