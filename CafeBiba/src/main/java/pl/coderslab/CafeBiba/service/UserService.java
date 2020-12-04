package pl.coderslab.CafeBiba.service;

import pl.coderslab.CafeBiba.entity.User;

import java.util.List;

public interface UserService {
    void save(User user);
    User findById(Long id);
    boolean deleteById(Long id);
    List<User> findAll();

}
