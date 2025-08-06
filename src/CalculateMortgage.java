import java.text.NumberFormat;

public class CalculateMortgage {
    private int principal = 0;
    private float annual_rate = 0;
    private int years = 0;

    public CalculateMortgage(int principal, float annual_rate, int years) {
        this.principal = principal;
        this.annual_rate = annual_rate;
        this.years = years;
    }

    public double calculateMortgage() {

        int period = years * 12;
        float monthly_rate = annual_rate / 100 / 12;


        return principal * ((monthly_rate * Math.pow(1 + monthly_rate, period)) /
                (Math.pow(1 + monthly_rate, period) - 1));
    }

    public double calculateBalance() {
        System.out.println("PAYMENT SCHEDULE\n---------------");

        float monthly_rate = annual_rate / 100 / 12;
        double balance = 0;
        for (int month = 1; month <= years * 12; month++) {
            balance = principal * ((Math.pow(1 + monthly_rate, years * 12) - Math.pow(1 + monthly_rate, month)) /
                    (Math.pow(1 + monthly_rate, years * 12) - 1));
            String balanceFormatted = NumberFormat.getCurrencyInstance().format(balance);
            System.out.println("Month " + month + ": " + balanceFormatted);

        }
        return balance;
    }
}
