package ie.atu.sample.repository;

import ie.atu.sample.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;
@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {

    @Query("""
        SELECT p
        FROM Product p
        WHERE p.price <= :maxPrice
        ORDER BY p.price DESC
        """)
    List<Product> findByMaxPrice(@Param("maxPrice") BigDecimal maxPrice);

}
