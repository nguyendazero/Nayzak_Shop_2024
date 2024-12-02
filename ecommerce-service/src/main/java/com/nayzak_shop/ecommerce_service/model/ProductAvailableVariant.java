package com.nayzak_shop.ecommerce_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "products_available_variants")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductAvailableVariant extends BaseEntity{
}
