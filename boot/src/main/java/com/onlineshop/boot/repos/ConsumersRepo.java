package com.onlineshop.boot.repos;


import com.onlineshop.boot.entities.ConsumersEntity;
import org.springframework.data.repository.CrudRepository;

public interface ConsumersRepo extends CrudRepository<ConsumersEntity, Long> {
}
