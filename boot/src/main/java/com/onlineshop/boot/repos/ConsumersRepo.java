package com.onlineshop.boot.repos;


import com.onlineshop.boot.entities.ConsumersEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ConsumersRepo extends CrudRepository<ConsumersEntity, Long> {
    @Query("select p from ConsumersEntity join AddressEntity" +
            " join ")
    ConsumersEntity getByConsumerId(Long id);
}
