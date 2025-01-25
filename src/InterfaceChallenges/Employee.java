package InterfaceChallenges;

public class Employee extends Payable {
    private double salary;

    // Constructor
    public Employee(double salary) {
        this.salary = salary;
    }


    @Override
    public double calculatePay() {
        return this.salary;
    }


    public double getSalary() {
        return salary;
    }
}

