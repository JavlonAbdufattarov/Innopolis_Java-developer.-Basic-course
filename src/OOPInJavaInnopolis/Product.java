package OOPInJavaInnopolis;

public class Product {
    private  String product;
    private  int Cost;

    public Product(String product,int cost){
        setCost(cost);
        setProduct(product);
    }
    public void setProduct(String product) {
        this.product = product;
    }

    public void setCost(int cost) {
        Cost = cost;
    }

    public  String getProduct() {
        return product;
    }

    public int getCost() {
        return Cost;
    }

    @Override
    public String toString() {
        return product+" "+Cost;
    }
}
