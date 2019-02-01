public class StarbuzzCoffee {
    public static void main (String args[]){
        Beverage beverage = new Espresso();

        beverage.print();
        beverage.printFrame();


        beverage = new Mocha(beverage);
        beverage.print();
        beverage.printFrame();

        beverage = new Mocha(beverage);

        beverage.print();
        beverage.printFrame();


    }
}