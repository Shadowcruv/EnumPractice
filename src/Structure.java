import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Structure{
    public static enum Fruit {APPLE, BANANA, ORANGE}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your favourite fruit" + "(APPLE, BANANA, ORANGE)");
        String fruitname = scanner.next();
        Structure.Fruit fruit = Fruit.valueOf(fruitname);
        System.out.print(fruit + " is my best fruit");

    }
}