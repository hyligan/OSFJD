package com.onlineshop.boot.repos;


import com.onlineshop.boot.entities.AuthEntity;
import org.springframework.data.repository.CrudRepository;

public interface AuthRepo extends CrudRepository<AuthEntity, Long> {
}
