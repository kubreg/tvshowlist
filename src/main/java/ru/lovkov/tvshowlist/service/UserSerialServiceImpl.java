package ru.lovkov.tvshowlist.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ru.lovkov.tvshowlist.model.UserSerial;
import ru.lovkov.tvshowlist.repository.UserSerialRepository;
import ru.lovkov.tvshowlist.util.exception.NotFoundException;

import java.util.Collection;

/**
 * Created by kubreg on 07.04.2016.
 */
@Service
public class UserSerialServiceImpl implements UserSerialService {

    @Autowired
    private UserSerialRepository repository;

    @Override
    public UserSerial get(int id) throws NotFoundException {
        return repository.findOne(id);
    }

    @Override
    public void delete(int id) throws NotFoundException {
        repository.delete(id);
    }

    @Override
    public Collection<UserSerial> getAll() {
        return null;
    }

    @Override
    public Collection<UserSerial> getWatch() {
        return null;
    }

    @Override
    public Collection<UserSerial> getWish() {
        return null;
    }

    @Override
    public Collection<UserSerial> getWatched() {
        return null;
    }

    @Override
    public UserSerial save(UserSerial userSerial) {
        return repository.save(userSerial);
    }
}
