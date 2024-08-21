import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius: ");
        float temperaturaCelsius = input.nextFloat();

        float temperaturaFahrenheit = (9 * temperaturaCelsius + 160) / 5;

        System.out.printf("A temperatura em graus Fahrenheit é: %.2f%n", temperaturaFahrenheit);
    }
}
