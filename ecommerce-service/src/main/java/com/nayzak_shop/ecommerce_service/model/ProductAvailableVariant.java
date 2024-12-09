package com.nayzak_shop.ecommerce_service.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@Entity
@Table(name = "product_available_variants")
public class ProductAvailableVariant extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "stock", nullable = false)
    private long stock;

    @Lob
    @Column(name = "hight_lighted_image", nullable = false)
    private String hightLightedImage;

    @ManyToOne
    @JoinColumn(name = "discount")
    private Discount discount;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    @OneToMany(mappedBy = "productAvailableVariant")
    private List<ProductVariant> productVariants = new ArrayList<>();

}
