package solid.LSP;

public class LiskovSubstitutionPrinciple {
    public static void main(String[] args) {
        EngineVehicle car = new Car();
        Movable bicycle = new Bicycle();
        car.StartEngine();
        car.move();
        bicycle.move();
    }


}

interface Movable{
    void move();
}
interface EngineVehicle extends Movable {
 void StartEngine();
}

class  Car implements EngineVehicle {



    @Override
    public void StartEngine() {
        System.out.println("Car engine started!");
    }


    @Override
    public void move() {
        System.out.println("Car is moving...");
    }
}
class Bicycle implements Movable{


    @Override
    public void move() {
        System.out.println("Bicycle is moving...");
    }
}