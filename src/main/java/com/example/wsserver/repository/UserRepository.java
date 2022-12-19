package com.example.wsserver.repository;

import com.example.wsserver.entity.user;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<user,Integer> {

}
