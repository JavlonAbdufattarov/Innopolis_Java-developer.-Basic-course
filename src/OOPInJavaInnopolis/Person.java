package OOPInJavaInnopolis;

import java.util.ArrayList;
import java.util.List;

public class Person {



    private static String name;
    private int money;
    private  List<Product> arrayProduct;
    Person (String name,int money){
        setName(name);
        setMoney(money);
        arrayProduct = new ArrayList<>();
    }

    public void setName(String name) {
        if (name.length() < 3){
            System.out.println("Ther is no symbols for name pleas try again and name shuld be more than 3 symbols");
        }
        else {
            this.name = name;
        }
    }

    public void setMoney(int money) {
        int MINMONEY = 0;
        if (money < MINMONEY){
            System.out.println("Money should be non-negative");
        }
        else {
            this.money = money;
        }
    }

    public void addProduct(Product product){
        if (money-product.getCost()<0){
            System.out.println(" ");
        }
        else {
            this.arrayProduct.add(product);
            setMoney(money-product.getCost());
        }

    }
    public List<Product> getArrayProduct(){
        return arrayProduct;
    }

    public static String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }
    public String ListProduvt(){
        String s = " ";
        for (int i = 0; i <arrayProduct.size() ; i++) {
             s = s +" " + arrayProduct.get(i).toString();
        }
        return s;
    }
    @Override
    public String toString() {
        String s = getName() + " " + getMoney() + " " + ListProduvt();
        return s;
    }
}
