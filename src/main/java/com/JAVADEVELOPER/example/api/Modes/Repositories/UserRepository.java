package com.JAVADEVELOPER.example.api.Modes.Repositories;

import com.JAVADEVELOPER.example.api.Modes.Entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository <UserEntity, Integer>{
}
