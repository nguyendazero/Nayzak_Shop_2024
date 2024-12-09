package com.nayzak_shop.ecommerce_service.repository;

import com.nayzak_shop.ecommerce_service.model.CollectionProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CollectionProductRepository extends JpaRepository<CollectionProduct, Long> {
}
