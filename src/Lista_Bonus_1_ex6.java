import java.util.Scanner;

public class Lista_Bonus_1_ex6 
{
    //6 – Uma loja oferece um desconto de 3% aos clientes que tiverem o cupom “DIADEFESTA”. Faça um programa onde o funcionário digite o valor a compra e um cupom, informando o valor final a ser pago.

    public static void main(String[] args) 
    {
        Scanner leitor = new Scanner(System.in);

        String cupom = "", desconto = "DIADAFESTA";
        double compra, res, desc;

        System.out.println("Programa que calcula desconto via cupom na compra da loja.");

        System.out.println("Digite o valor total da compra:");
        compra = leitor.nextDouble();

        System.out.println("Digite o cupom de desconto:");
        cupom = leitor.next();

        if (cupom.equalsIgnoreCase(desconto))
        {
            desc = compra * 0.03;
            System.out.println("O valor total do desconto aplicado foi de 3%: R$ " + desc);

            res = compra * 0.97;
            System.out.println("O valor final a ser pago será: R$ " + res);
        }
        else
        {
            System.out.println("O cupom informado não existe.");
            System.out.println("O valor final a ser pago será: R$ " + compra);
        }

        leitor.close();
    }    
}
