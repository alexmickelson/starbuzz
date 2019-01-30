public class StarbuzzCoffee {
    public static void main (String args[]){
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());



        Beverage beverage2 = new HouseBlend();
        beverage2.print();
        beverage2.frame();

        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2.print();


        beverage.frame();
        beverage2.frame();
    }
}
