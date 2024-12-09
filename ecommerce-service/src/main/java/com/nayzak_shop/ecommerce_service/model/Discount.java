package com.nayzak_shop.ecommerce_service.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

@Entity
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@Table(name = "discount")
public class Discount extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "discount_value")
    private BigDecimal discountValue;

}
