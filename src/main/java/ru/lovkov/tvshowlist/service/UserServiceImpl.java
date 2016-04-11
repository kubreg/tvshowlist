package ru.lovkov.tvshowlist.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.lovkov.tvshowlist.model.User;
import ru.lovkov.tvshowlist.repository.UserRepository;

import java.util.Collection;

/**
 * Created by kubreg on 12.04.2016.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public User save(User user) {
        return repository.save(user);
    }

    @Override
    public User get(int id) {
        return repository.findOne(id);
    }

    @Override
    public void delete(int id) {
        repository.delete(id);
    }

    @Override
    public Collection<User> getAll() {
        return repository.findAll();
    }
}
