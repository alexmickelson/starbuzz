public class StarbuzzCoffee {
    public static void main (String args[]){
        Beverage beverage = new Espresso();

        beverage.print();

        beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);

        beverage.print();
        beverage.frame();


    }
}
