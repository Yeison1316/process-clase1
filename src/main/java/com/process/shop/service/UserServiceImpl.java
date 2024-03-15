package com.process.shop.service;

import com.process.shop.model.Address;
import com.process.shop.model.User;
import com.process.shop.model.enums.DocumentType;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Override
    public User createUser(User user) {
        return null;
    }

    @Override
    public User updateUser(User userUpdated, Long id) {
        return null;
    }

    @Override
    public User getUserById(Long id) {
        return User.builder()
                .fullName("Pepito Perez")
                .identificationType(DocumentType.CC)
                .document("123456789")
                .address(List.of(Address.builder()
                                .street("15")
                                .Avenue("10")
                                .PostalCode("50044")
                                .neighborhood("granja")
                        .build(),
                        Address.builder()
                                .street("20")
                                .Avenue("50")
                                .PostalCode("458633")
                                .neighborhood("Casa")
                                .build()
                        ))
                .build();
    }

    @Override
    public List<User> findAllUser() {
        return null;
    }
}
