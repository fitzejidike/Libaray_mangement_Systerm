package org.africa.semicolon.Services;

import org.africa.semicolon.Data.Models.Book;
import org.africa.semicolon.Data.Models.User;
import org.africa.semicolon.Data.Repositories.UserRepo;
import org.africa.semicolon.Dtos.Requests.BuyBookRequset;
import org.africa.semicolon.Dtos.Requests.LoginRequest;
import org.africa.semicolon.Dtos.Requests.LogoutRequest;
import org.africa.semicolon.Dtos.Requests.RegisterUserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Service;
//@Service
//public class UserServiceImpl implements UserService {
//    @Autowired
//    private UserRepo userRepo;

//    @Override
//    public User Login(LoginRequest loginRequest) {
//        User user = new User();
//        user.setUsername(loginRequest.getUserName());
//        user.setPassword(loginRequest.getPassword());
//        userService.Login(loginRequest);
//        userRepo.save(user);
//        return user;
//    }
//
//    @Override
//    public Void Logout(LogoutRequest logoutRequest) {
//        User user = new User();
//        user.setUsername(logoutRequest.getUserName());
//        userService.Logout(logoutRequest);
//        userRepo.save(user);
//        return null;
//    }
//
//    @Override
//    public User Register(RegisterUserRequest registerUserRequest) {
//        User foe =new User();
//        foe.setUsername(registerUserRequest.getUserName());
//        foe.setAddress(registerUserRequest.getAddress());
//        foe.setPassword(registerUserRequest.getPassword());
//        foe.setNumber(registerUserRequest.getNumber());
//        userRepo.save(foe);
//        return foe;
//    }
//
//    @Override
//    public Book BuyBook(BuyBookRequset buyBookRequset) {
//
//        return null;
//    }
//}
