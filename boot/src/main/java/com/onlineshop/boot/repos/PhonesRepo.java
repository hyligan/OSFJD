package com.onlineshop.boot.repos;


import com.onlineshop.boot.entities.PhonesEntity;
import org.springframework.data.repository.CrudRepository;

public interface PhonesRepo extends CrudRepository<PhonesEntity, Long> {
}
