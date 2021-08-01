package homework7;

public class Boxer extends BodyGuard{

    @Override
    protected void shoot(BodyGuard bodyGuard) {
        System.out.println(bodyGuard.toString() + " shoot" );
    }

    @Override
    public String toString() {
        return "Boxer";
    }

    protected void notShoot(BodyGuard bodyGuard){
        System.out.println(bodyGuard.toString() + " beats");
    }
}
