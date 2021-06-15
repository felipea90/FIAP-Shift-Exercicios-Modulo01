import java.util.Scanner;

public class Lista_Bonus_1_ex3 
{
    //3 – Solicite ao usuário a digitação de 2 números inteiros, nas variáveis A e B. Sem usar uma terceira variável, troque os valores de A e B entre si.

    public static void main(String[] args) 
    {
        Scanner leitor = new Scanner(System.in);

        int a, b;

        System.out.println("Programa que troca os valores digitados entre A e B.");

        System.out.println("Digite o valor de A:");
        a = leitor.nextInt(); //5

        System.out.println("Digite o valor de B:");
        b = leitor.nextInt(); //6

        a = a + b; //a = 5 + 6 = 11
        b = a - b; //b = 11 - 6 = 5
        a = a - b; //a = 11 - 5 = 6

        System.out.println("Agora o valor de A será " + a + " e o valor de B será " + b);

        leitor.close();
    }
}
