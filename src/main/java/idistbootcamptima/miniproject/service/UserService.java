package idistbootcamptima.miniproject.service;

import idistbootcamptima.miniproject.model.dao.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    User getUser(String username);
    List<User> getUsers(); //get all users
}
