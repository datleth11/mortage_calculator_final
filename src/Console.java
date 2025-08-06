import java.util.Scanner;

public class Console {
    public static double ReadNumber(String prompt, double min, double max) {
        Scanner sc = new Scanner(System.in);
        double value;
        while (true) {
            System.out.print(prompt);
            value = sc.nextDouble();

            if (value >= min && value <= max) {
                break;
            } else {
                System.out.println("Enter a value between " + min + "-" + max);
                sc.next();
            }
        }
        return value;
    }

    public static void GreetUser(String userName) {
        Scanner sc = new Scanner(System.in);
        userName = sc.nextLine();
        System.out.println("Hello " + userName);
    }
}
