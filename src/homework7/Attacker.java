package homework7;

public class Attacker {
    private boolean gun;

    public Attacker(boolean gun) {
        this.gun = true;
    }

    public boolean hasGun() {
        return this.gun = true;
    }

    public void shoot() {
        System.out.println("Attacker shoot");
    }

    public void notShoot(){
        System.out.println("Attacker doesn't shoot");
    }

}
