package ru.lovkov.tvshowlist.service;

import ru.lovkov.tvshowlist.model.User;

import java.util.Collection;

/**
 * Created by kubreg on 05.04.2016.
 */
public interface UserService {
    User save(User user);

    User get(int id);

    void delete(int id);

    Collection<User> getAll();
}
