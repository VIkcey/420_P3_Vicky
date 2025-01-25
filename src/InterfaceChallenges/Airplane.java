package InterfaceChallenges;

import java.util.ArrayList;
import java.util.List;


public class Airplane {

    private List<IWeightable> items;

    public Airplane() {
        this.items = new ArrayList<>();
    }

    public void addItem(IWeightable item) {
        this.items.add(item);
    }

    public double getTotalWeight() {
        double totalWeight = 0.0;
        for (IWeightable item : items) {
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }

    public void printTotalWeight() {
        System.out.println("Total Weight of Airplane: " + getTotalWeight() + " kg");
    }

}
