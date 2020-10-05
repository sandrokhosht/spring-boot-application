package com.example.springbootstarterparent.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springbootstarterparent.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
