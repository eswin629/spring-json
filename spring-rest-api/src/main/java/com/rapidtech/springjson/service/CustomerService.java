package com.rapidtech.springjson.service;

import com.rapidtech.springjson.model.CustomerModel;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    List<CustomerModel> getAll();
    Optional<CustomerModel> save(CustomerModel model);
}
