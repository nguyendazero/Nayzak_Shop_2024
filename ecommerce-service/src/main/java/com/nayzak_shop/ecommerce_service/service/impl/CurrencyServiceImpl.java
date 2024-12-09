package com.nayzak_shop.ecommerce_service.service.impl;

import com.nayzak_shop.ecommerce_service.dto.APICustomize;
import com.nayzak_shop.ecommerce_service.dto.response.ItsRctCurrencyResponse;
import com.nayzak_shop.ecommerce_service.enums.ApiError;
import com.nayzak_shop.ecommerce_service.model.Currency;
import com.nayzak_shop.ecommerce_service.repository.CurrencyRepository;
import com.nayzak_shop.ecommerce_service.service.CurrencyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CurrencyServiceImpl implements CurrencyService {

    private final CurrencyRepository currencyRepository;

    @Override
    public APICustomize<List<ItsRctCurrencyResponse>> currencies() {
        List<Currency> currencies = currencyRepository.findAll();
        List<ItsRctCurrencyResponse> currencyResponses = currencies.stream()
                .map(currency -> new ItsRctCurrencyResponse(
                        currency.getCode(),
                        currency.getName(),
                        currency.getRegion(),
                        currency.getCreatedAt(),
                        currency.getUpdatedAt()
                )).toList();
        return  new APICustomize<>(ApiError.OK.getCode(), ApiError.OK.getMessage(), currencyResponses);
    }
}
