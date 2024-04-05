package suadarshan.demo.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import suadarshan.demo.security.entity.User;
import suadarshan.demo.security.repository.UserRepository;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    }
}
