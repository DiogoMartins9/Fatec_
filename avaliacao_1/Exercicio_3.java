import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        float valor1 = input.nextFloat();

        System.out.print("Digite o segundo valor: ");
        float valor2 = input.nextFloat();

        float media = (valor1 + valor2) / 2;

        System.out.printf("A média entre os dois valores é: %.2f%n", media);
    }
}
