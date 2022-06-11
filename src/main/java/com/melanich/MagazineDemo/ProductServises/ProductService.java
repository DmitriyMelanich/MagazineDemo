package com.melanich.MagazineDemo.ProductServises;


import com.melanich.MagazineDemo.Entities.Product;
import com.melanich.MagazineDemo.ProductRepositories.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;


@Service
public class ProductService {

    private ProductRepo productRepo;

    @Autowired
    public void setProductRepo(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    public Page<Product> getProductsWithPagingAndFiltering(Specification<Product> specification, Pageable pageable) {
        return productRepo.findAll(specification, pageable);
    }

    public Product getById(Long id) {
        return productRepo.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        productRepo.deleteById(id);
    }

    public void saveOrUpdate(Product product) {
        productRepo.save(product);
    }

}
