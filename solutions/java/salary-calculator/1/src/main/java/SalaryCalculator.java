public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        boolean expr = daysSkipped <= 4;
        return expr ? 1.0 : 0.85;
    }

    public int bonusMultiplier(int productsSold) {
        boolean expr = productsSold >= 20;
        return expr ? 13 : 10;
    }

    public double bonusForProductsSold(int productsSold) {
        return productsSold * bonusMultiplier(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double salary = (1000 * salaryMultiplier(daysSkipped) + bonusForProductsSold(productsSold));
        boolean expr = salary > 2000;
        return expr ? 2000 : salary;
    } 
}
