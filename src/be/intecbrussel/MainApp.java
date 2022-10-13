package be.intecbrussel;

public class MainApp {

    public static void main(String[] args) {


        Coffee coffee1 = new Coffee("arabica");
        Coffee coffee2 = new Coffee("robusta");
        Coffee coffee3 = new Coffee("arabica", true);
        Coffee coffee4 = new Coffee("arabica", true, true);
        Coffee coffee5 = new Coffee();


        System.out.println("coffee1 is of type " + coffee1.getCoffeeType() + ", temperature " + coffee1.getTemperature());
        System.out.println("1 hour later");
        coffee1.setTemperature(40);
        System.out.println("coffee1 is of type " + coffee1.getCoffeeType() + ", temperature " + coffee1.getTemperature());

        System.out.println("coffee1 is of type " + coffee2.getCoffeeType() + ", temperature " + coffee2.getTemperature());
        System.out.println("coffee1 is of type " + coffee3.getCoffeeType() + ", temperature " + coffee3.getTemperature());
        System.out.println("coffee1 is of type " + coffee4.getCoffeeType() + ", temperature " + coffee4.getTemperature());
        System.out.println("coffee1 is of type " + coffee5.getCoffeeType() + ", temperature " + coffee5.getTemperature());

        /*System.out.println("coffeetype1 & temperature = your " + coffee1.getCoffeeType() +
              " is now " + coffee1.getTemperature() + " degrees celsius," +
                " It's time to buy a new one"); */


        System.out.println("coffee created: " + Coffee.getCoffeeCount());
        System.out.println("coffee created: " + coffee2.getCoffeeCount());
        System.out.println(Coffee.getCoffeeCount());

        System.out.println("black coffee created: " + Coffee.getBlackCoffeeCount());
        System.out.println("coffee romano created: " + Coffee.getCoffeeRomanoCount());
        System.out.println("Irish coffee created: " + Coffee.getIrishCoffeeCount());

        coffee1.sip();


    }
}