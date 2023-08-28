package phenriqued.com.github.SpringSecurityTest.controllers;


import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import phenriqued.com.github.SpringSecurityTest.domain.Product.ProductRequestDTO;
import phenriqued.com.github.SpringSecurityTest.services.ProductService;

@Controller
@RequestMapping("product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public ResponseEntity getAllProducts(){
        return ResponseEntity.ok().body(productService.findAllProducts());
    }

    @PostMapping
    public ResponseEntity postProduct(@RequestBody @Valid ProductRequestDTO product){
        productService.saveProduct(product);
        return ResponseEntity.ok().build();
    }


}
