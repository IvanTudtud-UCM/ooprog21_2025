public class Employee {
    private int employeeNumber;
    private double payRate;
    private static final int maxEmpNum = 9999;
    private static final double maxRate = 60.00;
    private static final double otRate = 1.5;

    public Employee(int employeeNumber, double payRate) {
        
        if (employeeNumber > maxEmpNum) {
            this.employeeNumber = maxEmpNum;
        }
        else {
            this.employeeNumber = employeeNumber;
        }
        if (payRate > maxRate) {
            this.payRate = maxRate;
        }
        else{
            this.payRate = payRate;
        }
    }

    public double calculateRegularPay(double hoursWorked) {
        double regularHours = Math.min(40, hoursWorked);
        return regularHours * payRate;
    }

    public double calculateOvertimePay(double hoursWorked) {
        double overtimeHours = Math.max(0, hoursWorked - 40);
        return overtimeHours * payRate * otRate;
    }
}
