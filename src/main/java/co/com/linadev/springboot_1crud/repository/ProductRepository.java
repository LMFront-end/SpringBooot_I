package co.com.linadev.springboot_1crud.repository;

import co.com.linadev.springboot_1crud.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    Product findByProductId(String id);

    // other method

    List<Product> findAllByProductNameContainingIgnoreCase(String name);
    List<Product> findAllByProductPriceGreaterThan(Integer price);
    List<Product> findAllByProductPriceLessThan(Integer price);
    List<Product> findAllByProductPrice(Integer price);

}
