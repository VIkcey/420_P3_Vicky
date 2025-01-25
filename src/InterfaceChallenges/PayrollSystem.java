package InterfaceChallenges;

import java.util.ArrayList;
import java.util.List;

public class PayrollSystem {
    private final List<Payable> employees;

    // Constructor
    public PayrollSystem() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Payable employee) {
        this.employees.add(employee);
    }

    public void calculateTotalPayroll() {
        double totalPayroll = 0.0;
        for (Payable employee : employees) {
            totalPayroll += employee.calculatePay();
        }
        System.out.println("Total Payroll: $" + totalPayroll);
    }
}

