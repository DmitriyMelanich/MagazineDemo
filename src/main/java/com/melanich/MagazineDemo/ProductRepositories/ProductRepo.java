package com.melanich.MagazineDemo.ProductRepositories;

import com.melanich.MagazineDemo.Entities.Product;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends PagingAndSortingRepository<Product,Long>, JpaSpecificationExecutor<Product> {
}
