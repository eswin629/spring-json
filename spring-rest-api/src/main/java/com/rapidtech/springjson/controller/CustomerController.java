package com.rapidtech.springjson.controller;

import com.rapidtech.springjson.model.CustomerModel;
import com.rapidtech.springjson.model.ResponseModel;
import com.rapidtech.springjson.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
@RequestMapping("/customers")
@RestController
public class CustomerController {
    private CustomerService service;

    @Autowired
    public CustomerController(CustomerService service) {
        this.service = service;
    }

//    @GetMapping
//    public ResponseEntity<Object> get(){
//        List<CutomerModel> result = service.getAll();
//        return ResponseEntity.ok().body(
//                new ResponseModel(200,"SUCCESS", result)
//        );
//    }

//    @GetMapping("/{id}")
//    public ResponseEntity<Object> getById(@PathVariable("id") Integer id){
//        Optional<ProductModel> result = service.getById(id);
//        return ResponseEntity.ok().body(
//                new ResponseModel(200,"SUCCESS", result)
//        );
//    }

//    @PostMapping
//    public ResponseEntity<Object> saveCustomer(@RequestBody CustomerModel request){
//        return ResponseEntity.ok().body(request);
//    }
    @PostMapping()
    public ResponseEntity<Object> saveCustomer(@RequestBody CustomerModel request){
        Optional<CustomerModel> result = service.save(request);
        return ResponseEntity.ok().body(
                new ResponseModel(200,"SUCCESS", result)
        );
    }
}

