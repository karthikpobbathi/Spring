package com.capgemini.SpringBootWithJpa.controller;

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.RequestBody;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;  
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.SpringBootWithJpa.model.UserRecord;
import com.capgemini.SpringBootWithJpa.service.UserService;

import java.util.List;
import java.util.Optional;  
  
@RestController  
public class UserController {  
    @Autowired  
    private UserService userService;   
    @RequestMapping("/")  
    public List<UserRecord> getAllUser(){  
        return userService.getAllUsers();  
    }     

    @RequestMapping(value="/add-user", method=RequestMethod.POST)  
    public void addUser(@RequestBody UserRecord userRecord){  
        userService.addUser(userRecord);  
    }  
  @RequestMapping(value="/user/{id}", method=RequestMethod.GET)  
    public Optional<UserRecord> updateUser(@PathVariable String id){  
        return userService.getUser(id);  
    } 
  @RequestMapping(value="/user/{id}", method=RequestMethod.DELETE)  
  public void deleteUser(@PathVariable String id){  
      userService.delete(id);  
  } 
}  
