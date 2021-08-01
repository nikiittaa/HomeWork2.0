package homework7;

public class Jiujist extends BodyGuard{

    @Override
    protected void shoot(BodyGuard bodyGuard) {
        System.out.println(bodyGuard.toString() + " shoot" );
    }

    @Override
    public String toString() {
        return "Jiujist";
    }

    protected void notShoot(BodyGuard bodyGuard){
        System.out.println(bodyGuard.toString() + " beats");
    }
}
