package com.onlineshop.boot.repos;


import com.onlineshop.boot.entities.OrdersEntity;
import org.springframework.data.repository.CrudRepository;

public interface OrdersRepo extends CrudRepository<OrdersEntity, Long> {
}
