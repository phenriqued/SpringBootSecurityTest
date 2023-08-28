package phenriqued.com.github.SpringSecurityTest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import phenriqued.com.github.SpringSecurityTest.domain.Product.ProductEntity;
import phenriqued.com.github.SpringSecurityTest.domain.Product.ProductRequestDTO;
import phenriqued.com.github.SpringSecurityTest.domain.Product.ProductResponseDTO;
import phenriqued.com.github.SpringSecurityTest.repositories.ProductRepository;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<ProductResponseDTO> findAllProducts(){
        return productRepository.findAll().stream().map(ProductResponseDTO::new).toList();
    }

    public void saveProduct(ProductRequestDTO product){
        ProductEntity newProduct = new ProductEntity(product);
        productRepository.save(newProduct);
    }

}
