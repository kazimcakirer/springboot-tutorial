package com.kazim.datajpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kazim.datajpa.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
