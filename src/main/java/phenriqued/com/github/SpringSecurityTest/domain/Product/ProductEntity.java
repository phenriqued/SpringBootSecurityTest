package phenriqued.com.github.SpringSecurityTest.domain.Product;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Table(name = "tb_product")
@Entity
@Getter
@NoArgsConstructor @AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class ProductEntity {

    @Id
    @GeneratedValue (strategy = GenerationType.UUID)
    private String id;
    private String name;
    private BigDecimal price;

    public ProductEntity(ProductRequestDTO data) {
        this.name = data.name();
        this.price = data.price();
    }
}
