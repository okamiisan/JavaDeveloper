package com.JAVADEVELOPER.example.api.Service;

import com.JAVADEVELOPER.example.api.Modes.Domain.UserAddDTO;
import com.JAVADEVELOPER.example.api.Modes.Domain.UserReadDTO;
import com.JAVADEVELOPER.example.api.Modes.Mappers.UserMapper;
import com.JAVADEVELOPER.example.api.Modes.Repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserService(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    public List<UserReadDTO> findAll() {
        return userRepository
                .findAll()
                .stream()
                .map(userMapper::userEntityToUserReadDTO)
                .collect(Collectors.toList());
    }

    public UserReadDTO add(UserAddDTO userAddDTO) {
        return userMapper.userEntityToUserReadDTO(
                userRepository.save(userMapper.userAddDTOToUserEntity(userAddDTO))
        );

    }
}
