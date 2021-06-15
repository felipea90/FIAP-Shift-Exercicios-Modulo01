import java.util.Scanner;

public class Lista_Bonus_1_ex4 
{
    //4 – Um robô de combate só deve ativar sua arma principal quando o inimigo está a menos de 70cm de distância. Faça um programa onde o usuário informe a distância do inimigo e sejam exibidas as mensagens “ATIVADO” ou “DESATIVADO” dependendo do status da arma.
    public static void main(String[] args) 
    {
        Scanner leitor = new Scanner(System.in);

        int distancia;

        System.out.println("Programa para Matar os inimigos dependendo da distância.");

        System.out.println("Informe a distância do inimigo em centímetros (CM):");
        distancia = leitor.nextInt();

        if (distancia < 70)
        {
            System.out.println("Armamento ATIVADO.");
        }
        else
        {
            System.out.println("Armamento DESATIVADO.");
        }

        leitor.close();
    }   
}
