package com.websystem.authentication;

public interface SecurityService {

    String findLoggedInUsername();

    void autoLogin(String username, String password);
}
