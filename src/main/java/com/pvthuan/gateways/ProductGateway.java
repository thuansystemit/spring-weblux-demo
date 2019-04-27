package com.pvthuan.gateways;

import com.pvthuan.domain.Product;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProductGateway {

    Mono<Product> save(Product product);

    Mono<Product> findByCode(String code);

    Mono<Void> deleteByCode(String code);

    Flux<Product> findAll();

}