package ie.atu.sample.service;

import ie.atu.sample.model.Product;
import ie.atu.sample.repository.ProductRepo;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;


@Service
public class ProductService {
    private final  ProductRepo productRepo;

    public ProductService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }
    public List<Product> getAll() {
        return productRepo.findAll();
    }
    public Product create(Product product) {
        return productRepo.save(product);
    }
    public List <Product> getByMaxPrice(BigDecimal maxPrice) {
        return productRepo.findByMaxPrice(maxPrice);
    }
}
