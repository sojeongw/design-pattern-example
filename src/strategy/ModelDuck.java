package strategy;

public class ModelDuck extends  Duck{
    public ModelDuck() {
        flyBehavior = new FlyNoway();
        quackBehavior = new FakeQuackBehavior();
    }
}
