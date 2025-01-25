package InterfaceChallenges;

public class Bullet {

    private int damage;

    public Bullet(int damage) {
        this.damage = damage;
    }


    public void fire(IShootable target) {
        target.onHit(damage);
    }

}
