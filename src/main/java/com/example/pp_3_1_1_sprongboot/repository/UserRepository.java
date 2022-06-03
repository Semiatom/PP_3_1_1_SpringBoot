package com.example.pp_3_1_1_sprongboot.repository;

import com.example.pp_3_1_1_sprongboot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
