import java.util.ArrayList;
import java.util.List;

public class Order {
    private int id;
    private List<Product> products;
    private double total;

    public Order(int id) {
        this.id = id;
        this.products = new ArrayList<>();
        this.total = 0.0;
    }

    public int getId() {
        return id;
    }

    public List<Product> getProducts() {
        return products;
    }

    public double getTotal() {
        return total;
    }

    public void addProduct(Product product) {
        products.add(product);
        total += product.getPrice();
    }
}