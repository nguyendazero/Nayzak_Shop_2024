package com.nayzak_shop.ecommerce_service.repository;

import com.nayzak_shop.ecommerce_service.model.NotificationUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationUserRepository extends JpaRepository<NotificationUser, Long> {
}
