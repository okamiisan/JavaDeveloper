package com.JAVADEVELOPER.example.api.Modes.Mappers;

import com.JAVADEVELOPER.example.api.Modes.Dtos.UserAddDTO;
import com.JAVADEVELOPER.example.api.Modes.Dtos.UserReadDTO;
import com.JAVADEVELOPER.example.api.Modes.Entities.UserEntity;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    public UserReadDTO userEntityToUserReadDTO(UserEntity userEntity) {
        UserReadDTO userReadDTO = new UserReadDTO();
        userReadDTO.setId(userEntity.getId());
        userReadDTO.setName(userEntity.getName());
        userReadDTO.setSurname(userEntity.getSurname());
        userReadDTO.setEmail(userEntity.getEmail());
        return userReadDTO;
    }

    public UserEntity userAddDTOToUserEntity(UserAddDTO userAddDTO) {
        UserEntity userEntity = new UserEntity();
        userEntity.setName(userAddDTO.getName());
        userEntity.setSurname(userAddDTO.getSurname());
        userEntity.setEmail(userAddDTO.getEmail());
        userEntity.setPassword(userAddDTO.getPassword());
        return userEntity;
    }
}
