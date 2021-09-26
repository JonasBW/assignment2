package ocp.generics.beverage;

public class Application {

    public static void main(String[] args) {

        Box box = new Box();
        box.add(new Wine("Chateau Margaux", 14.1));
        box.add(new Wine("South African", 45));
        box.add(new Wine("Israeli", 29));

        // Make Box a generic class so that you can add beers OR Wines:
        // i.e.
         Box<Beer> beerBox = new Box<>();
         beerBox.add( new Beer("Asmara Beer", 25));
         beerBox.add( new Beer("Heineken Beer", 40));
         beerBox.add( new Beer("Corona Beer", 18));
        // add multiple beers
        // Do the same for Wines

        // Also try
//        and add beers AND wines in the same box
        Box<Beverage> beverageBox = new Box<>();
        beverageBox.add(new Beverage(35));
        beverageBox.add(new Beverage(25));

        box.showContents();
    }
}
