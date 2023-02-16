package com.vincent.demo.springbootelk.controller;

import com.vincent.demo.springbootelk.entity.Product;
import com.vincent.demo.springbootelk.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("data")
public class ProductController {

  private final ProductRepository productRepository;

  @PostMapping("createProduct")
  public Product createProduct(Product product) {
    return productRepository.save(product);
  }

  @PatchMapping("updateProduct")
  public Product updateProduct(Product product) {
    return productRepository.save(product);
  }

  @GetMapping("getProduct")
  public Product getProduct(String id) {
    return productRepository.findById(id).orElseThrow(() -> new RuntimeException("ID: " + id));
  }

  @DeleteMapping("deleteProduct")
  public String deleteProduct(String id) {
    productRepository.deleteById(id);
    return "OK";
  }
}
