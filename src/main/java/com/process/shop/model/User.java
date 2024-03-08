package com.process.shop.model;

import lombok.*;
import org.springframework.stereotype.Service;

import java.util.Date;
@Service
@Data
public class User {
    private String fullName;
    private Date birthDay;
    private String identificationType;
    private String identification;
    private String phoneNumber;
    private String email;
    private String password;
    private String address;
}
