package com.websystem.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserDto {

    @NotNull
    @Size(min = 1, message = "{Size.userDto.firstName}")
    private String name;

    @NotNull
    @Size(min = 1, message = "{Size.userDto.lastName}")
    private String userName;

    @NotNull
    @Size(min = 1, message = "{Size.userDto.lastName}")
    private String lastName;

    private String password;

    private Integer role;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(final Integer role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }


    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("UserDto [name=")
                .append(name)
                .append(", userName=")
                .append(userName)
                .append(", lastName")
                .append(lastName)
                .append(", role=")
                .append(role).append("]");
        return builder.toString();
    }

}
