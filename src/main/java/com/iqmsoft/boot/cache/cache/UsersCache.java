package com.iqmsoft.boot.cache.cache;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import com.iqmsoft.boot.cache.model.Users;
import com.iqmsoft.boot.cache.repository.UsersRepository;

@Component
public class UsersCache {

    @Autowired
    UsersRepository usersRepository;

    @Cacheable(value = "usersCache", key = "#name")
    public Users getUser(String name) {
        System.out.println("Retrieving from Database for name: " + name);
        return usersRepository.findByName(name);
    }
    
    @Cacheable(value = "usersCache")
    public List<Users> getAll() {
        System.out.println("Retrieving All from Database");
        return usersRepository.findAll();
    }
    
}
