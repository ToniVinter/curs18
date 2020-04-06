package ro.fasttrackit.generic;

import ro.fasttrackit.curs18.Recursive;

public class Main {
    public static void main(String[] args) {
        simpleBox();
        genericBox();
        displayBox();
    }

    private static void displayBox(){
        DisplayBox<Person> boxCuString = new DisplayBox<>(new Person("Maria"));
        DisplayBox<Laptop> boxCuLaptop = new DisplayBox<>(new Laptop());

        System.out.println(boxCuString.displayItem());
        System.out.println(boxCuLaptop.displayItem());
    }

    private static void genericBox(){
        GenericBox<String> boxCuString = new GenericBox<>("item");
        GenericBox<Integer> boxCuInt = new GenericBox<>(1);
        GenericBox<Recursive> boxCuRecursiv = new GenericBox<>(new Recursive());

        String stringDinBox = boxCuString.getItem();
        Integer intDinBox = boxCuInt.getItem();
        Recursive recursiveDinBox = boxCuRecursiv.getItem();

        System.out.println(stringDinBox);
        System.out.println(intDinBox);
        System.out.println(recursiveDinBox);
    }

    private static void simpleBox() {
        var boxCuString = new Box("salut");
        var bocCuIntreg = new Box(1);
        var boxCuRecursiv = new Box(new Recursive());

        Object stringDinBox = boxCuString.getItem();
        Object intregDinBox = bocCuIntreg.getItem();
        Object recrsivDinBox = boxCuRecursiv.getItem();

        System.out.println(stringDinBox);
        System.out.println(intregDinBox);
        System.out.println(recrsivDinBox);
    }
}
