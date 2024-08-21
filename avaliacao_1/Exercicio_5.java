import java.util.Scanner;

public class Exercicio_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o raio da base da lata (em metros): ");
        double raio = input.nextDouble();

        System.out.print("Digite a altura da lata (em metros): ");
        double altura = input.nextDouble();

        double pi = 3.14159;
        double volume = pi * Math.pow(raio, 2) * altura;

        System.out.printf("O volume da lata de óleo é: %.2f metros cúbicos%n", volume);
    }
}
