import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Please enter your name: ");
        Console.GreetUser("");

        int principal = (int) Console.ReadNumber("Enter your principal: ", 10000, 1_000_000);
        int years = (int) Console.ReadNumber("Enter your pay period (in years): ", 1, 30);
        float annual_rate = (float) Console.ReadNumber("Enter your annual interest rate (in percentages): ", 0, 30);

        var calculator = new CalculateMortgage(principal, annual_rate, years);
        new MortgageReport(calculator).printMortgage();
        new MortgageReport(calculator).printSchedule();


    }

}
