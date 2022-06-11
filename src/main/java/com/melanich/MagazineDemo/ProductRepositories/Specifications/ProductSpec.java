package com.melanich.MagazineDemo.ProductRepositories.Specifications;

import com.melanich.MagazineDemo.Entities.Product;
import org.springframework.data.jpa.domain.Specification;

import java.math.BigDecimal;

public class ProductSpec {

    public static Specification<Product> titleContains(String word) {
        return (Specification<Product>) (root,criteriaQuery,criteriaBuilder) -> criteriaBuilder.like(root.get("title"),"%"+word+"%");
    }

    public static Specification<Product> priceGreaterThenOrEq(BigDecimal price) {
        return (Specification<Product>) (root,criteriaQuery,criteriaBuilder) -> {
            return criteriaBuilder.greaterThanOrEqualTo(root.get("price"),price);
        };
    }

    public static Specification<Product> priceLesserThenOrEq(BigDecimal price) {
        return (Specification<Product>) (root,criteriaQuery,criteriaBuilder) -> {
            return criteriaBuilder.lessThanOrEqualTo(root.get("price"),price);
        };
    }
}
