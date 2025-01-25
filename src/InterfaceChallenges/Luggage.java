package InterfaceChallenges;

public class Luggage extends IWeightable {
    private double weight;

    public Luggage(double weight) {
        this.weight = weight;
    }

    @Override
    public double getWeight() {
        return this.weight;
    }
}


