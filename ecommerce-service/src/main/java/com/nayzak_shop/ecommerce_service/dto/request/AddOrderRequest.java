package com.nayzak_shop.ecommerce_service.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddOrderRequest {
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String streetAddress;
    private String zipCode;
    private String shippingMethod;
    private long countryId;
    private long cityId;
    private long stateId;
    private long paymentMethodId;

}
