package phenriqued.com.github.SpringSecurityTest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import phenriqued.com.github.SpringSecurityTest.domain.Product.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, String> {
}
