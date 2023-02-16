package com.vincent.demo.springbootelk.repository;

import com.vincent.demo.springbootelk.entity.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends ElasticsearchRepository<Product, String> {

}
