package InterfaceChallenges;

public class Freelancer extends Payable {
    private double hoursWorked;
    private double hourlyRate;

    // Constructor
    public Freelancer(double hoursWorked, double hourlyRate) {
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }


    @Override
    public double calculatePay() {
        return this.hoursWorked * this.hourlyRate;
    }


    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }


}
