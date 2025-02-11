package strategy;

public class DuckMain {
    public static void main(String[] args) {
        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.performQuack();

        modelDuck.setQuackBehavior(new RealQuackBehavior());
        modelDuck.performQuack();
    }
}
