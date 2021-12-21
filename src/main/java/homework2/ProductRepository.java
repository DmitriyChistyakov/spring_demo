package homework2;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class ProductRepository {

    private List<Product> productList;

    @PostConstruct
    public void init() {
        productList = List.of(
                new Product(1, "Kiwi", 90.5d),
                new Product(2, "Orange", 40.5),
                new Product(3, "Apple", 44.5),
                new Product(4, "Penelope", 99.5),
                new Product(5, "Egg", 100.5),
                new Product(6, "Chocolate", 57.5),
                new Product(7, "Potato", 87.5)
        );
    }

    public Optional<Product> findProductById (Integer id) {
        return productList.stream().filter(product -> Objects.equals(product.getId(), id)).findFirst();
    }
}
