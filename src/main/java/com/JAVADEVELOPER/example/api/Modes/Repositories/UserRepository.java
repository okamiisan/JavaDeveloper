package com.JAVADEVELOPER.example.api.Modes.Repositories;

import com.JAVADEVELOPER.example.api.Modes.Entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    Boolean existsByEmail(String email);
    List<UserEntity> findAllByNameAndSurname(String name, String surname);
}