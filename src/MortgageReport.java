import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageReport {

    public MortgageReport(CalculateMortgage calculator) {
        this.calculator = calculator;
    }

    private CalculateMortgage calculator;

    public void printMortgage() {
        double mortgage = calculator.calculateMortgage();
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);

        System.out.println("MORTGAGE\n--------");
        System.out.println("Your monthly payment is: " + mortgageFormatted);

    }

    public void printSchedule() {
        System.out.println("Do you want to see your payment schedule?(y/n) ");
        Scanner ans = new Scanner(System.in);
        String answer = ans.nextLine().toLowerCase();
        if (answer.startsWith("y")) {
            calculator.calculateBalance();
        } else System.out.println("Thank you for using our service!");
    }
}
