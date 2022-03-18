package co.com.linadev.springboot_1crud.controller;

import co.com.linadev.springboot_1crud.model.Product;
import co.com.linadev.springboot_1crud.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/product")
public class ProductController {

    /*
     * GET -> Consultar
     * POST -> Crear
     * PUT -> Modificar
     * DELETE -> Eliminar
     * */

    private final ProductService productService;

    // List product
    // localhost:8080/api/product/products
    @GetMapping("/products")
    public List<Product> listProduct(){
        return productService.listProducts();
    }

    // new product
    // localhost:8080/api/product/createProduct
    @PostMapping("/createProduct")
    public Product newProduct(@RequestBody Product product){
        return productService.saveProduct(product);
    }

    // get product by id
}
