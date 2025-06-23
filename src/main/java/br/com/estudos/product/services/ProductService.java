package br.com.estudos.product.services;

import br.com.estudos.product.entities.Product;
import br.com.estudos.product.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public List<Product> list() {
        return repository.findAll();
    }

    public Product get(Long id) {
        return repository.findById(id).orElseThrow();
    }

    public Product create(Product p) {
        return repository.save(p);
    }

    public Product update(Long id, Product p) {
        Product old = get(id);
        old.setName(p.getName());
        old.setPrice(p.getPrice());
        old.setStock(p.getStock());
        return repository.save(old);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
