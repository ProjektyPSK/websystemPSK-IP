package com.websystem.services;

public interface SecurityService {

    String findLoggedInUsername();

    void autoLogin(String username, String password);
}
