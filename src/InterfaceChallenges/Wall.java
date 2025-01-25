package InterfaceChallenges;

public class Wall extends IShootable {
    private int durability;

    public Wall(int durability) {
        this.durability = durability;
    }

    @Override
    public void onHit(int damage) {
        this.durability -= damage;
        System.out.println("Wall hit! Durability is now: " + durability);
    }

    public int getDurability() {
        return durability;
    }
}
