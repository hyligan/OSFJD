package com.onlineshop.boot.repos;


import com.onlineshop.boot.entities.EmailsEntity;
import org.springframework.data.repository.CrudRepository;

public interface EmailsRepo extends CrudRepository<EmailsEntity, Long> {
}
