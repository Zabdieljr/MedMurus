package com.bezahive.symplifica.controller;

import com.bezahive.symplifica.model.User;
import com.bezahive.symplifica.repository.UserRepository;
import com.bezahive.symplifica.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class UserController {

    private final UserRepository userRepository;
    // service
    @Autowired
    private UserService userService;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping("/user")
    public String welcome(){
        return "MedMurus User REST API";
    }

    // add/register User
    @PostMapping("/user/add")
    public String addUser(@RequestBody User user){
        userService.addUser(user);
        return "User registered Successfully..";
    }

    // getUserById
    @RequestMapping("/user/{id}")
    public User getUserById(@PathVariable("id") long id){
        return userService.getUserById(id);
    }

    // getUsers
    @RequestMapping("/users")
    public List<User> getUsers(){
        return userService.getUsers();
    }

    // updateUser
    @PutMapping("/user")
    public User updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }

    // deleteUserById
    @DeleteMapping("/user/{id}")
    public String deleteUser(@PathVariable("id") long id){
        userService.deleteUser(id);
        return "User Deleted";
    }
    @GetMapping("/byEmail/{email}")
    public User getUserByEmail(@PathVariable String email) {

        return userRepository.findByEmail(email);
    }

    @GetMapping("/byUsername/{username}")
    public User getUserByUserName(@PathVariable String username) {
        return userRepository.findByUsername(username);
    }
}
