package InterfaceChallenges;

public class Player extends IShootable {
    private int health;

    public Player(int health) {
        this.health = health;
    }


    @Override
    public void onHit(int damage) {
        this.health -= damage;
        System.out.println("Player hit! Health is now: " + health);
    }


    public int getHealth() {
        return health;
    }
}

