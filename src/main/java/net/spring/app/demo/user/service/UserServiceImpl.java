package net.spring.app.demo.user.service;

import lombok.RequiredArgsConstructor;
import net.spring.app.demo.user.entity.User;
import net.spring.app.demo.user.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }
    public List<User> findAllByName(String name){
        return userRepository.findAllByName(name);
    }
}
