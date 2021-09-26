package ocp.generics.beverage;


import java.util.ArrayList;
import java.util.List;


public class Box<T extends Beverage> {

    private List<T> content = new ArrayList<>();

    public void add(T t) {
        this.content.add(t);

        System.out.println("Added a " + t.getClass().getSimpleName() + " with alc. " + t.getAlcoholPercentage());
    }

    public T getElementAtIndex(int index) {
        return this.content.get(index);
    }

    public void showContents(){
        for( T t: content){
            System.out.println(t.toString());
        }
    }
}
