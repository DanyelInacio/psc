import java.util.Scanner;

public class OlaMundo {
    public static void main(String args[]) {
        Scanner teclado = new Scanner (System.in);
        int num1, num2, result;
        System.out.println("informe o primeiro numero ");
        num1 = teclado.nextInt();
        System.out.println("informe o segundo numero ");
        num2 = teclado.nextInt();

        result = num1 + num2;

        System.out.println("Resultado: " + result);
        System.exit(0);
    }
}