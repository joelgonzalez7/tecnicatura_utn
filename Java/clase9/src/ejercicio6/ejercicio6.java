import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de dinero que tiene Guillermo: ");
        double guillermo = scanner.nextDouble();

        double luis = guillermo / 2;
        double juan = (guillermo + luis) / 2;

        double total = guillermo + luis + juan;

        System.out.println("La cantidad total de dinero entre los tres es: $" + total);

        scanner.close();
    }
}
