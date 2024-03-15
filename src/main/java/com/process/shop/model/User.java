package com.process.shop.model;

import com.process.shop.model.enums.DocumentType;
import lombok.*;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Data
@Builder
public class User {
    private String fullName;
    private Date birthDay;
    private DocumentType identificationType;
    private String document;
    private String phoneNumber;
    private String email;
    private String password;
    private List<Address> address;

}
