package org.africa.semicolon.Services;

import org.africa.semicolon.Data.Models.Book;
import org.africa.semicolon.Data.Models.User;
import org.africa.semicolon.Dtos.Requests.BuyBookRequset;
import org.africa.semicolon.Dtos.Requests.LoginRequest;
import org.africa.semicolon.Dtos.Requests.LogoutRequest;
import org.africa.semicolon.Dtos.Requests.RegisterUserRequest;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User Login(LoginRequest loginRequest);
    Void Logout(LogoutRequest logoutRequest);
    User Register(RegisterUserRequest registerUserRequest);
    Book BuyBook(BuyBookRequset buyBookRequset);






}
