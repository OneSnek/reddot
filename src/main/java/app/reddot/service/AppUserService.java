package app.reddot.service;

import app.reddot.controller.RegistrationRequest;

import app.reddot.model.AppUser;
import app.reddot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//@Service
//public class AppUserService {
//    public String register(RegistrationRequest request) {
//        return "works";
//    }
//}

@Service
public class AppUserService {

    @Autowired
    private UserRepository userRepository;

    @Transactional
    public void saveUser(AppUser user) {
        userRepository.save(user);
    }
}