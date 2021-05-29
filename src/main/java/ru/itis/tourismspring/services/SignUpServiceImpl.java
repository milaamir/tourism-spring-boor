package ru.itis.tourismspring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import ru.itis.tourismspring.dto.UserForm;
import ru.itis.tourismspring.models.User;
import ru.itis.tourismspring.repositiries.UserRepository;

@Component
public class SignUpServiceImpl implements SignUpService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder; //проерка совпадает ли пароль

    @Override
    public void signUp(UserForm form) {
        User newUser = User.builder()
                .firstName(form.getFirstName())
                .lastName(form.getLastName())
                .email(form.getEmail())
                .hashPassword(passwordEncoder.encode(form.getPassword()))
                .role(User.Role.USER)
                .state(User.State.ACTIVE)
                .build();
        userRepository.save(newUser);

    }

    @Override
    public User getUserById(Long userId) {
        return userRepository.findById(userId).orElseThrow(() -> new IllegalArgumentException("User not found"));
    }

}