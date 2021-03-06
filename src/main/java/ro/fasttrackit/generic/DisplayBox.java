package ro.fasttrackit.generic;

public class DisplayBox<T extends Displayable> {
    private final  T item;

    public DisplayBox(final T item){
        this.item = item;
    }

    public  String displayItem(){
        return item.display();
    }
}
