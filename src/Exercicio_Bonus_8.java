import java.util.Scanner;

public class Exercicio_Bonus_8 
{
    /*
    5. Calcular e apresentar o valor do volume de uma lata de óleo, utilizando fórmula: V = 3.14159 * R * R * A, em que as variáveis: V, R e A representam respectivamente o volume, o raio e a altura.
    Vamos declarar as variáveis V, R e A como double e definir um valor qualquer para as variáveis de altura e de raio. Agora vamos escrever a fórmula, conforme dita no enunciado e, em seguida, exibir na tela uma mensagem contendo o resultado do volume encontrado.
    */
    public static void main(String[] args) 
    {
        Scanner leitor = new Scanner(System.in);
        
        double V, R, A;

        System.out.println("Programa que calcula o Volume de uma lata de óleo.");

        System.out.println("Por favor entre com os dados.");

        System.out.println("Raio da lata (metros):");
        R = leitor.nextDouble();

        System.out.println("Altura da lata (metros):");
        A = leitor.nextDouble();

        V = 3.14159 * R * R * A;
        
        System.out.println("O Volume total da lata de óleo é de " + V + " m³");

        leitor.close();
    }
}
