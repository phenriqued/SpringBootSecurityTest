package phenriqued.com.github.SpringSecurityTest.domain.Product;

import java.math.BigDecimal;

public record ProductResponseDTO (String id, String name, BigDecimal price){
    public ProductResponseDTO(ProductEntity product){
        this(product.getId(), product.getName(), product.getPrice());
    }

}
