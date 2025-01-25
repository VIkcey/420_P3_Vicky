package InterfaceChallenges;

public class Cargo extends IWeightable {
    private double weight;

    public Cargo(double weight) {
        this.weight = weight;
    }

    @Override
    public double getWeight() {
        return this.weight;
    }
}
