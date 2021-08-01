package homework7;

public class StartAttack {
    private final boolean HAS_GUN = false;

    private static Attacker attackerGun = new Attacker(true);
    private static Attacker attackerNotGun = new Attacker(false);

    public static void main(String[] args) {
        StartAttack startAttack = new StartAttack();

        BodyGuard boxer = new Boxer();
        startAttack.setBodyGuard(boxer);

        BodyGuard karate = new Karate();
        startAttack.setBodyGuard(karate);

        BodyGuard jiujist = new Jiujist();
        startAttack.setBodyGuard(jiujist);

    }

    private void setBodyGuard(BodyGuard bodyGuard){
        if (HAS_GUN == true) {
            bodyGuard.saveClientLife(attackerGun, bodyGuard);
        }else{
            bodyGuard.saveClientLife(attackerNotGun, bodyGuard);
        }
    }
}
