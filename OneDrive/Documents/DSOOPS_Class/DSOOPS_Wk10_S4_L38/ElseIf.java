package DSOOPS_Wk10_S4_L38;
import java.util.Scanner;

public class ElseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        char op = sc.next().charAt(0);

        // if-else
        if (op == '+') {
            System.out.println(a + b);
        } else if (op == '-') {
            System.out.println(a - b);
        } else if (op == '*') {
            System.out.println(a * b);
        } else if (op == '/') {
            if (b != 0)
                System.out.println(a / b);
            else
                System.out.println("Cannot divide by zero");
        } else {
            System.out.println("Invalid operation");
        }

        // switch
        switch (op) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                if (b != 0)
                    System.out.println(a / b);
                else
                    System.out.println("Cannot divide by zero");
                break;
            default:
                System.out.println("Invalid operation");
        }
        sc.close();

    }
}
