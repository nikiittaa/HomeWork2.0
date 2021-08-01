package homework7;

public class Karate extends BodyGuard {

    @Override
    protected void shoot(BodyGuard bodyGuard) {
        System.out.println(bodyGuard.toString() + " shoot");
    }

    @Override
    public String toString() {
        return "Karate";
    }

    protected void notShoot(BodyGuard bodyGuard){
        System.out.println(bodyGuard.toString() + " beats");
    }

}
