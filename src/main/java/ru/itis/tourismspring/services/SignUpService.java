package ru.itis.tourismspring.services;

import ru.itis.tourismspring.dto.UserForm;
import ru.itis.tourismspring.models.User;

public interface SignUpService {

    void signUp(UserForm form);

    User getUserById(Long userId);

}
