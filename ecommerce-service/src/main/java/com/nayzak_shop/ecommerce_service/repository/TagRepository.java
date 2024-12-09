package com.nayzak_shop.ecommerce_service.repository;

import com.nayzak_shop.ecommerce_service.model.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<Tag, Long> {
}
