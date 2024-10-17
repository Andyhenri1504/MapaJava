import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numero;

        System.out.println("Digite um número: ");
        numero = leitura.nextInt();

       
        boolean isPrimo = true;

        if (numero <= 1) {
            isPrimo = false; 
            for (int i = 2; i <= numero / 2; i++) {
                if (numero % i == 0) {
                    isPrimo = false;
                    break;
                }
            }
        }

        if (isPrimo) {
            System.out.println("O número é primo.");
        } else {
            System.out.println("O número não é primo.");
        }
    }
}
