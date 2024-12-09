package com.nayzak_shop.ecommerce_service.controller;

import com.nayzak_shop.ecommerce_service.dto.APICustomize;
import com.nayzak_shop.ecommerce_service.dto.response.ItsRctCurrencyResponse;
import com.nayzak_shop.ecommerce_service.enums.ApiError;
import com.nayzak_shop.ecommerce_service.service.CurrencyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Validated
@RequiredArgsConstructor
@RequestMapping("/api/ecommerce")
public class CurrencyController {
    private final CurrencyService currencyService;

    @GetMapping("/public/currency/currencies")
    public ResponseEntity<?> currencies(){
        APICustomize<List<ItsRctCurrencyResponse>> response = currencyService.currencies();
        return ResponseEntity.status(Integer.parseInt(response.getStatusCode())).body(response);
    }

    @GetMapping("/admin/currency/hello")
    public ResponseEntity<?> helloAdmin(){
        String response = "hello admin currency";
        return ResponseEntity.ok(response);
    }

}
