package phenriqued.com.github.SpringSecurityTest.domain.Product;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Table(name = "tb_product")
@Getter
@NoArgsConstructor @AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class ProductEntity {

    private String id;
    private String name;
    private BigDecimal price;


}
