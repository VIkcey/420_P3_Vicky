package InterfaceChallenges;

public class Trap extends IShootable {
    private boolean isDisarmed;

    public Trap() {
        this.isDisarmed = false;
    }


    @Override
    public void onHit(int damage) {
        if (!isDisarmed) {
            isDisarmed = true;
            System.out.println("Trap hit! The trap is now disarmed.");
        } else {
            System.out.println("Trap is already disarmed.");
        }
    }


    public boolean isDisarmed() {
        return isDisarmed;
    }
}
