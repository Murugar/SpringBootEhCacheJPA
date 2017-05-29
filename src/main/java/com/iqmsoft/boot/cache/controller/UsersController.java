package com.iqmsoft.boot.cache.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iqmsoft.boot.cache.cache.UsersCache;
import com.iqmsoft.boot.cache.model.Users;

@RestController
@RequestMapping(value = "/rest/users")
public class UsersController {

    @Autowired
    UsersCache usersCache;

    @GetMapping(value = "/{name}")
    public Users getUser(@PathVariable final String name) {
    	
    	Users u = usersCache.getUser(name);
    	
    	System.out.println("Get Mapping " + u);
    	
        return u;
    }
    
    @GetMapping
    public List<Users> getUser() {
    	
    	List<Users> u = usersCache.getAll();
    	
    	System.out.println("Get Mapping " + u);
    	
        return u;
    }
    
}
