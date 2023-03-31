package app.reddot.controller;

import app.reddot.model.AppUser;
import app.reddot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class AppUserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/register")
    public String registerUser(@RequestBody AppUser user) {
        AppUser existingUser = userRepository.findByUsername(user.getUsername());
        if (existingUser != null) {
            return "User already exists";
        }
        userRepository.save(user);
        return "User registered successfully";
    }

    @PostMapping("/login")
    public String loginUser(@RequestBody AppUser user) {
        AppUser existingUser = userRepository.findByUsername(user.getUsername());
        if (existingUser == null || !existingUser.getPassword().equals(user.getPassword())) {
            return "Invalid username or password";
        }
        return "Login successful";
    }

    //CREATES NEW USERS ========= & ========= ADDS THEM TO DATABASE
    @PostMapping("/users")
    public AppUser createUser(@RequestBody AppUser user) {
        return userRepository.save(user);
    }
}
