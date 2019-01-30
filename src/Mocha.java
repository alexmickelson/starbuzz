public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
        description = getDescription() + " Mocha";
    }

    @Override
    public String getDescription() {
        return beverage.getDescription();
    }

    @Override
    public double cost() {
        return .2 + beverage.cost();
    }

    @Override
    public void print() {
        System.out.println(description + " $" + cost());
    }
}
