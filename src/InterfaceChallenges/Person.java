package InterfaceChallenges;

public class Person extends IWeightable {
    private double weight;

    public Person(double weight) {
        this.weight = weight;
    }

    @Override
    public double getWeight() {
        return this.weight;
    }

}