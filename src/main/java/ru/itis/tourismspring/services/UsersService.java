package ru.itis.tourismspring.services;


import ru.itis.tourismspring.models.User;

import java.util.List;

public interface UsersService {
    List<User> getAllUsers();

    void unbanById(Long id);

    void banById(Long id);
}
