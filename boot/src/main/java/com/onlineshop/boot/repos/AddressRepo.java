package com.onlineshop.boot.repos;


import com.onlineshop.boot.entities.AddressEntity;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepo extends CrudRepository<AddressEntity, Long> {
}
