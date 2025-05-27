import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o primeiro número inteiro: ");
            int num1 = scanner.nextInt();

            System.out.print("Digite o segundo número inteiro: ");
            int num2 = scanner.nextInt();

            if (num1 < 0 || num2 < 0) {
                throw new NumeroNegativo("Números negativos não são permitidos: " +
                        (num1 < 0 ? num1 : "") + (num2 < 0 ? " e " + num2 : ""));
            }

            Calculadora calc = new Calculadora(num1, num2);
            System.out.println("Soma: " + calc.somar());
            System.out.println("Subtração: " + calc.subtrair());
            System.out.println("Multiplicação: " + calc.multiplicar());

            try {
                System.out.println("Divisão: " + calc.dividir());
            } catch (ArithmeticException e) {
                System.out.println("Exceção na divisão: " + e.getMessage());
            }

        } catch (NumeroNegativo e) {
            System.out.println("Exceção de número negativo: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Por favor, digite apenas números inteiros.");
        } finally {
            scanner.close();
        }
    }
}

