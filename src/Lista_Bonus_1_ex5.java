import java.util.Scanner;

public class Lista_Bonus_1_ex5 
{
    //5 – Um drone de limpeza de ruas deve escolher carregar sempre o lixo de menor peso. Entre os pesos de 3 lixos informados pelo usuário, um programa deve indicar qual deles deve ser carregado pelo drone.
    public static void main(String[] args) 
    {
        Scanner leitor = new Scanner(System.in);

        double lixo1, lixo2, lixo3;
        int escolha;
        
        System.out.println("Programa Drone de Limpeza - Recolhe o lixo mais leve.");

        System.out.println("Informe o peso do lixo 1:");
        lixo1 = leitor.nextDouble();

        System.out.println("Informe o peso do lixo 2:");
        lixo2 = leitor.nextDouble();

        System.out.println("Informe o peso do lixo 3:");
        lixo3 = leitor.nextDouble();

        if (lixo1 < lixo2 && lixo1 < lixo3)
        {
            System.out.println("O primeiro lixo será levado pelo drone.");
        }
        else if (lixo2 < lixo1 && lixo2 < lixo3)
        {
            System.out.println("O segundo lixo será levado pelo drone.");
        }
        else if (lixo3 < lixo1 && lixo3 < lixo2)
        {
            System.out.println("O terceiro lixo será levado pelo drone.");
        }
        else if (lixo1 == lixo2 && lixo2 == lixo3)
        {
            System.out.println("Os três lixos tem o mesmo peso, escolha qual será recolhido:");

            System.out.println("1 - Primeiro Lixo\n2 - Segundo Lixo\n3 - Terceiro Lixo");
            escolha = leitor.nextInt();

            switch(escolha)
            {
            case 1:
            System.out.println("O primeiro lixo será recolhido");
            break;

            case 2:
            System.out.println("O segundo lixo será recolhido");
            break;

            case 3:
            System.out.println("O terceiro lixo será recolhido");
            break;

            default:
            System.out.println("Opção inválida.");
            break;
            }
        }

        leitor.close();
    }    
}
