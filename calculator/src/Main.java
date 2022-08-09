import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        int n1, n2, selection;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please select an operation: \n 1-Sum \n 2-Sub \n 3-Multiplication \n 4- divide\n: ");
        selection = scanner.nextInt();

        System.out.println("Enter first number: ");
        n1 = scanner.nextInt();

        System.out.println("Enter second number: ");
        n2 = scanner.nextInt();

        switch (selection) {
            case 1 -> System.out.println("Result is: " + (n1 + n2));
            case 2 -> System.out.println("Result is: " + (n1 - n2));
            case 3 -> System.out.println("Result is: " + (n1 * n2));
            case 4 -> System.out.println("Result is: " + (n1 / n2));
        }
    }
}
