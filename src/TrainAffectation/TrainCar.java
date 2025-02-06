package TrainAffectation;

public class TrainCar {

    private double baseWeight;
    private TrainCar frontCar;
    private TrainCar backCar;

    // Constructor
    public TrainCar(double baseWeight, TrainCar frontCar, TrainCar backCar){
        this.baseWeight = baseWeight;
        this.frontCar = frontCar;
        this.backCar = backCar;
    }

    public double getWeight(){
      return baseWeight;
    }

    public String toString() {
        return  "";
    }

}



