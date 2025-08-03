import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Please enter your name: ");
        GreetUser("");


        int principal = 0;
        float annual_rate = 0;
        int years = 0;

        principal = (int) ReadNumber("Enter your principal: ", 10000, 1_000_000);
        years = (int) ReadNumber("Enter your pay period (in years): ", 1, 30);

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Please enter your annual interest rate (in percentages): ");

            if (sc.hasNextFloat()) {
                annual_rate = sc.nextFloat();
                System.out.println("Annual Interest: " + annual_rate + "%");
                if (annual_rate > 0 && annual_rate <= 30)
                    break; // valid input, breaking loop
                else
                    System.out.println("Interest rate must be between 0%-30%.");

            } else {
                System.out.println("Please enter a float value (x.y)");
                sc.next();
            }
        }

        double mortgage = CalculateMortgage(principal, annual_rate, years);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);

        System.out.println("MORTGAGE\n--------");
        System.out.println("Your monthly payment is: " + mortgageFormatted);
        System.out.println("Do you want to see your payment schedule?(y/n) ");

        Scanner ans = new Scanner(System.in);
        String answer = ans.nextLine().toLowerCase();
        if (answer.startsWith("y")) {
            CalculateBalance(principal, annual_rate, years);
        } else System.out.println("Thank you for using our service!");
    }

    public static double CalculateMortgage(int principal, float annual_rate, int years) {

        int period = years * 12;
        float monthly_rate = annual_rate / 100 / 12;


        return principal * ((monthly_rate * Math.pow(1 + monthly_rate, period)) /
                (Math.pow(1 + monthly_rate, period) - 1));
    }

    public static void GreetUser(String userName) {
        Scanner sc = new Scanner(System.in);
        userName = sc.nextLine();
        System.out.println("Hello " + userName);
    }

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

    public static void CalculateBalance(int principal, float annual_rate, int years) {
        System.out.println("PAYMENT SCHEDULE\n---------------");

        float monthly_rate = annual_rate / 100 / 12;

        for (int month = 1; month <= years * 12; month++) {
            double balance = principal * ((Math.pow(1 + monthly_rate, years * 12) - Math.pow(1 + monthly_rate, month)) /
                    (Math.pow(1 + monthly_rate, years * 12) - 1));
            String balanceFormatted = NumberFormat.getCurrencyInstance().format(balance);
            System.out.println("Month " + month + ": " + balanceFormatted);
        }
    }
}
