package com.iqmsoft.boot.cache.loader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.iqmsoft.boot.cache.model.Users;
import com.iqmsoft.boot.cache.repository.UsersRepository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Component
public class Loader {

    @Autowired
    UsersRepository usersRepository;

    @PostConstruct
    public void load() {
        List<Users> usersList = getList();
        usersRepository.save(usersList);
    }

    private List<Users> getList() {
        List<Users> usersList = new LinkedList<>();
        usersList.add(new Users("Test1", "Tech",123L));
        usersList.add(new Users("Test2", "Tech",13L));
        usersList.add(new Users("Test3", "Tech",143L));
        usersList.add(new Users("Test4", "Tech",153L));
        usersList.add(new Users("Test5", "Tech",163L));
        usersList.add(new Users("Test6", "Tech",173L));
        
        return usersList;
    }
}
