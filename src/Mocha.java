

public class Mocha extends CondimentDecorator {


    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " Mocha";
    }

    @Override
    public double cost() {
        return .2 + beverage.cost();
    }

    @Override
    public void print() {
        System.out.println(getDescription() + " $" + cost());
    }
    
}
