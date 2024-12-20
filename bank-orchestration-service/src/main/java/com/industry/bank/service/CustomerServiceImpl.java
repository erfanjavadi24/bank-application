package com.industry.bank.service;

import com.industry.bank.api.dto.customer.CreateCorporateCustomerRequestDto;
import com.industry.bank.api.dto.customer.CreateGeneralCustomerResponseDto;
import com.industry.bank.api.dto.customer.CreateRealCustomerRequestDto;
import com.industry.bank.service.api.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CreateGeneralCustomerResponseDto createRealCustomer(CreateRealCustomerRequestDto realCustomerRequestDto) {
        return null;
    }

    @Override
    public CreateGeneralCustomerResponseDto createCorporateCustomer(CreateCorporateCustomerRequestDto corporateCustomerRequestDto) {
        return null;
    }
}
