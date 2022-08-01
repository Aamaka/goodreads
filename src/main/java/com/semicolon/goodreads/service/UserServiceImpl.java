package com.semicolon.goodreads.service;
import com.semicolon.goodreads.dtos.AccountCreation;
import com.semicolon.goodreads.dtos.UserDto;
import com.semicolon.goodreads.models.User;
import com.semicolon.goodreads.repositories.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    private UserRepository userRepository;
    private ModelMapper modelMapper;


    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
        modelMapper = new ModelMapper();
    }

    @Override
    public UserDto createUser(AccountCreation accountCreation) {
        User user = User.builder()
                .firstname(accountCreation.getFirstname())
                .lastname(accountCreation.getLastname())
                .email(accountCreation.getEmail())
                .password(accountCreation.getPassword())
                .build();
        User saved = userRepository.save(user);

        return modelMapper.map(saved, UserDto.class);
    }

}
