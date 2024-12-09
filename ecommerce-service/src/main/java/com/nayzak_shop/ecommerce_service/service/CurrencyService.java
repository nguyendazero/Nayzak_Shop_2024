package com.nayzak_shop.ecommerce_service.service;

import com.nayzak_shop.ecommerce_service.dto.APICustomize;
import com.nayzak_shop.ecommerce_service.dto.response.ItsRctCurrencyResponse;

import java.util.List;

public interface CurrencyService {
    public APICustomize<List<ItsRctCurrencyResponse>> currencies();
}
