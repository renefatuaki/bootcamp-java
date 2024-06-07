package elfa;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Owner rene = new Owner("René", 32, "Berlin");
        Species bigCat = new Species("Big cat", new BigDecimal("4500"));
        Species bird = new Species("Bird", new BigDecimal("50"));


        Animal lion = new Animal(1, "Lion", "Big cat", 15, rene, bigCat);
        Animal tiger = new Animal(2, "Lion", "Big cat", 10, rene, bigCat);
        Animal papagai = new Animal(3, "Papagai", "Bird", 15, rene, bird);

        System.out.println(lion);
        System.out.println(tiger.animal());
        System.out.println(papagai.equals(tiger));
    }
}