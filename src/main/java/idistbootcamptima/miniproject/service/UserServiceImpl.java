package idistbootcamptima.miniproject.service;

import idistbootcamptima.miniproject.model.dao.User;
import idistbootcamptima.miniproject.model.repo.UserRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j //logging
public class UserServiceImpl implements UserService {
//UserDetailsService
    private final UserRepo userRepo;


    @Override
    public User saveUser(User user) {
        log.info("Saving new user {} to the database", user.getName());
        return userRepo.save(user);
    }

    @Override
    public User getUser(String username) {
        log.info("Fetching user {}", username);
        return userRepo.findByUsername(username);
    }

    @Override
    public List<User> getUsers() {
        log.info("Fetching all users");
        return userRepo.findAll();
    }

    public List<User> getAllUsers() {
        log.info("Fetching all users {}", getUsers());
        return userRepo.findAll();
    }


//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        //logic to get the user from database
//
//        log.info("load user by username");
//        return new org.springframework.security.core.userdetails.User("user","password", new ArrayList<>());
    }

