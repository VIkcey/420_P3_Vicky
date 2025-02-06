package TrainAffectation;

public class PassengerCar {

    private int numberOfPassengers;
    private double averageWeightPerPassenger;

    private int price;
    private double tax;


    // Constructor
    public PassengerCar(int numberOfPassengers, double averageWeightPerPassenger) {
        this.numberOfPassengers = numberOfPassengers;
        this.averageWeightPerPassenger = averageWeightPerPassenger;
    }


    public double obtenirPourcent(int price, double tax) {
        double cal_tax = (price * tax / 100);
        double valWithTax =  (price + cal_tax);
        double getPourcentage = ((valWithTax - price) / price) * 100;
        return valWithTax;
    }

}





