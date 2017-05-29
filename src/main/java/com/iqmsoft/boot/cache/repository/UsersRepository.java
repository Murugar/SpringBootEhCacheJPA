package com.iqmsoft.boot.cache.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iqmsoft.boot.cache.model.Users;

public interface UsersRepository extends JpaRepository<Users, Long> {
    Users findByName(String name);
}
