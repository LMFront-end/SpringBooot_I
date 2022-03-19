package co.com.linadev.springboot_1crud.controller;

import co.com.linadev.springboot_1crud.model.Product;
import co.com.linadev.springboot_1crud.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    // get product by id (Float)
    // localhost:8080/api/product/findById/{id}
    @GetMapping("/findById/{id}")
    public Optional<Product> getProductById(@PathVariable Integer id){
        return productService.getProductById(id);
    }

    // get product by id (String)
    // localhost:8080/api/product/findProductId/{id}
    @GetMapping("/findProductId/{id}")
    public Product findByProductId(@PathVariable String id){
        return productService.findByProductId(id);
    }

    //find by productName
    // localhost:8080/api/product/findByName/{name}
    @GetMapping("/findByName/{name}")
    public List<Product> findAllByProductName(@PathVariable String name){
        return productService.findAllByProductName(name);
    }

    // filter prices higher than
    // localhost:8080/api/product/priceGreaterThan/{price}
    @GetMapping("/priceGreaterThan/{price}")
    public List<Product> findAllByProductPriceGreaterThan(@PathVariable Float price){
        return productService.findAllByProductPriceGreaterThan(price);
    }

    // filter prices below
    // localhost:8080/api/product/priceLessThan/{price}
    @GetMapping("/priceLessThan/{price}")
    public List<Product> findAllByProductPriceLessThan(@PathVariable Float price){
        return productService.findAllByProductPriceLessThan(price);
    }

    // filter prices equal to
    // localhost:8080/api/product/findByPrice/{price}
    @GetMapping("/findByPrice/{price}")
    public List<Product> findAllByProductPrice(@PathVariable Float price){
        return productService.findAllByProductPrice(price);
    }

    


}
