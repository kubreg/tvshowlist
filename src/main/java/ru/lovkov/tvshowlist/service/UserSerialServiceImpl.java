package ru.lovkov.tvshowlist.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.lovkov.tvshowlist.model.Serial;
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
    public UserSerial get(int id, int ownerId) throws NotFoundException {
        return repository.get(id, ownerId);
    }

    @Override
    public void delete(int id, int ownerId) throws NotFoundException {
        repository.delete(id, ownerId);
    }

    @Override
    public Collection<UserSerial> getAll(int ownerId) {
        return repository.getAll(ownerId);
    }

    @Override
    public Collection<UserSerial> getWatch(int ownerId) {
        return repository.getWatch(ownerId);
    }

    @Override
    public Collection<UserSerial> getWish(int ownerId) {
        return repository.getWish(ownerId);
    }

    @Override
    public Collection<UserSerial> getViewed(int ownerId) {
        return repository.getViewed(ownerId);
    }

    @Override
    public Collection<UserSerial> getDefaultList(int ownerId) {
        return repository.getDefaultList(ownerId);
    }

    @Override
    public UserSerial save(UserSerial userSerial, Serial serial, int ownerId) {
        return repository.save(userSerial, serial, ownerId);
    }

    @Override
    public UserSerial update(UserSerial userSerial, int ownerId) {
        return repository.save(userSerial, null, ownerId);
    }
}
