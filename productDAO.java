import java.util.ArrayList;
import java.util.List;

public class ProductDAO {
    private List<Product> products;

    public ProductDAO() {
        this.products = new ArrayList<>();
        // initialize products list with sample data
        products.add(new Product(1, "Product 1", "Description 1", 10.99, 10));
        products.add(new Product(2, "Product 2", "Description 2", 9.99, 20));
        products.add(new Product(3, "Product 3", "Description 3", 12.99, 5));
    }

    public List<Product> getAllProducts() {
        return products;
    }

    public Product getProduct(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    public void updateProductQuantity(int id, int quantity) {
        Product product = getProduct(id);
        if (product != null) {
            product.setQuantity(quantity);
        }
    }
}