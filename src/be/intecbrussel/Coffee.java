package be.intecbrussel;

public class Coffee {


    private int temperature;
    private String coffeeType;
    private static int coffeeCount = 0;
    private static int blackCoffeeCount = 0;
    private static int coffeeRomanoCount = 0;
    private static int irishCoffeeCount = 0;


    public Coffee() {
        this("arabica"); //constructor chaining
    }
    public Coffee(String beans){
        System.out.println("black coffee created");
        temperature = 80;
        coffeeType = "Black coffee";
        coffeeCount++;
        blackCoffeeCount++;
    }

    public Coffee(String beans, boolean lemon) {
        System.out.println("coffee romano created");
        temperature = 75;
        coffeeType = "coffee romano";
        coffeeCount++;
        coffeeRomanoCount++;
    }

    public Coffee(String beans, boolean whiskey, boolean cream) {
        System.out.println("Irish coffee created");
        temperature = 60;
        coffeeType = "Irish coffee";
        coffeeCount++;
        irishCoffeeCount++;
    }


    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public String getCoffeeType() {
        return coffeeType;
    }

    public static int getCoffeeCount() {
        return coffeeCount;
    }

    public static int getBlackCoffeeCount() {
        return blackCoffeeCount;
    }

    public static int getCoffeeRomanoCount() {
        return coffeeRomanoCount;
    }

    public static int getIrishCoffeeCount() {
        return irishCoffeeCount;
    }

    public void sip() {
        System.out.println("Mmmm");
    }
}
