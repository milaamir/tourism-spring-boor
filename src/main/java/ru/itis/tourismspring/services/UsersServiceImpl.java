package ru.itis.tourismspring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itis.tourismspring.models.User;
import ru.itis.tourismspring.repositiries.UserRepository;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public void banById(Long id) {
        User user = userRepository.getOne(id);
        if (!user.isAdmin()) {
            user.setState(User.State.BANNED);
            userRepository.save(user);
        }
    }

    @Override
    public void unbanById(Long id) {
        User user = userRepository.getOne(id);
        if (!user.isAdmin()) {
            user.setState(User.State.ACTIVE);
            userRepository.save(user);
        }
    }

}
