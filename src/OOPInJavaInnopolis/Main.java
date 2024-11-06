package OOPInJavaInnopolis;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person Javlon = new Person("Женя " , 0);

        Product a = new Product("Ice cream",200 );

        Javlon.addProduct(a);
        String string = Javlon.toString();
        System.out.println(string);
    }
}
