package com.rapidtech.springjson.controller;

import com.rapidtech.springjson.model.CustomerRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/customers")
@RestController
public class CustomerController {

//    @GetMapping
//    public ResponseEntity<Object> get(){
//////        List<ProductModel> result = service.getAll();
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

    @PostMapping
    public ResponseEntity<Object> saveCustomer(@RequestBody CustomerRequest request){
        return ResponseEntity.ok().body(request);
    }
}
