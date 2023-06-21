package com.onlineshop.boot.endpoints;

import com.onlineshop.boot.entities.ConsumersEntity;
import com.onlineshop.boot.models.ConsumersDto;
import com.onlineshop.boot.repos.ConsumersRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class RestEndpoint {
    private ConsumersRepo consumersRepo;

    public RestEndpoint(ConsumersRepo consumersRepo) {
        this.consumersRepo = consumersRepo;
    }

    @GetMapping("/")
    public Iterable<ConsumersEntity> get(){
        return consumersRepo.findAll();
    }

    @GetMapping("/{id}")
    public ConsumersEntity get(@PathVariable("id") ConsumersEntity entity){
        return entity;
    }
    @PostMapping("/")
    public ConsumersEntity create(@RequestBody ConsumersDto dto){
        ConsumersEntity consumersEntity = new ConsumersEntity();
        BeanUtils.copyProperties(dto,consumersEntity);
        return consumersRepo.save(consumersEntity);
    }

    @PutMapping("/{id}")
    public ConsumersEntity create(@RequestBody ConsumersDto dto, @PathVariable("id") ConsumersEntity entity){
        BeanUtils.copyProperties(dto,entity);
        return consumersRepo.save(entity);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") ConsumersEntity entity){
        consumersRepo.delete(entity);
    }

}
