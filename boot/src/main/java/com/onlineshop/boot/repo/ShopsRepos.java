package com.onlineshop.boot.repo;

import com.onlineshop.boot.entity.Shops;
import org.springframework.data.repository.CrudRepository;

public interface ShopsRepos extends CrudRepository<Shops, Long> {
}
