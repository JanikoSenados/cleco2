package com.csb.appadvc2122.dto;

import com.csb.appadvc2122.model.User;

import java.util.Collections;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UserDTO {

    private Long id;

    private String fullName;

    private String userName;

    private String emailAddress;


    public UserDTO() {}

    public UserDTO(Long id, String fullName, String userName, String emailAddress) {
        this.id = id;
        this.fullName = fullName;
        this.userName = userName;
        this.emailAddress = emailAddress;
    }

    public UserDTO(User user) {
        this.id = user.getId();
        this.fullName = user.getFullName();
        this.userName = user.getUserName();
        this.emailAddress = user.getEmailAddress();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String firstName) {
        this.fullName = fullName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }


}
