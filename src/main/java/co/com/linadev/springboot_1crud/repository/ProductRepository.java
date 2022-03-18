package co.com.linadev.springboot_1crud.repository;

import co.com.linadev.springboot_1crud.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
