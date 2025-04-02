package solid.ISP;

public class InterfaceSegregationPrinciple {

    public static void main(String[] args) {
        Workable dev = new Developer();
        Eatable humanDev = new Developer();
        Workable robot = new Robot();

        dev.work();
        humanDev.eat();
        robot.work();

    }


}
// 1️⃣ Separate interfaces
interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

// 2️⃣ Developer implements both Workable and Eatable
class Developer implements Workable, Eatable {
    @Override
    public void work() {
        System.out.println("Developer is coding...");
    }

    @Override
    public void eat() {
        System.out.println("Developer is having lunch.");
    }
}

// 3️⃣ Robot only implements Workable (does not eat)
class Robot implements Workable {
    @Override
    public void work() {
        System.out.println("Robot is working...");
    }
}