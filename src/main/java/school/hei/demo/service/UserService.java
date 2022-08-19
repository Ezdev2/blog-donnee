package school.hei.demo.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import school.hei.demo.model.User;
import school.hei.demo.repository.UserRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {
    @Autowired
    private final UserRepository userRepository;

    public List<User> getUsers(){
        return userRepository.findAll();
    };
}
