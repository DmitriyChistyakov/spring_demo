package homework2;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
@Scope("prototype")
public class Cart {

    private final ProductRepository productRepository;
    private final List<ProductRepository> products;

    public Cart(ProductRepository productRepository) {
        products = new ArrayList<ProductRepository>();
        this.productRepository = productRepository;

    }

    @Override
    public String toString() {
        return "Cart { \n" +
                "products - " + products +
                "\n}";
    }

    public void addProductById(Integer id) {

    }

    public void deleteProductById (Integer id) {

    }
}
