package com.onlineshop.boot.endpoints;

import com.onlineshop.boot.entity.Shops;
import com.onlineshop.boot.repo.ShopsRepos;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestEndpoint {
    private ShopsRepos shopsRepos;

    public RestEndpoint(ShopsRepos shopsRepos) {
        this.shopsRepos = shopsRepos;
    }

    @GetMapping("/shop")
    public Iterable<Shops> getShops(){
        return shopsRepos.findAll();
    }
}
