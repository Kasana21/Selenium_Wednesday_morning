package Day03;

public class SalaryCalculator {
    public static void main(String[] args) {
        double hourlyRate = 50;
        int weeklyHours = 45;
        double stateTaxRate = 0.06;
        double federalTaxRate = 0.26;
        int weeksWorked = 52;
        double grossPay = weeksWorked * hourlyRate * weeklyHours;
        double stateTax = grossPay * stateTaxRate;
        double federalTax = grossPay * federalTaxRate;
        double totalTax = stateTax + federalTax;
        double netIncome = grossPay - totalTax;


        System.out.println("Gross pay is: $" + grossPay);
        System.out.println("Federal tax is: $" + federalTax);
        System.out.println("State tax is: $" + stateTax);
        System.out.println("Total tax is: $" + totalTax);
        System.out.println("Net income is: $" + netIncome);
    }
}
