package ru.lovkov.tvshowlist.service;

import ru.lovkov.tvshowlist.model.UserSerial;
import ru.lovkov.tvshowlist.util.exception.NotFoundException;

import java.util.Collection;

/**
 * Created by kubreg on 07.04.2016.
 */
public interface UserSerialService {
    UserSerial get(int id) throws NotFoundException;

    void delete(int id) throws NotFoundException;

    Collection<UserSerial> getAll();

    Collection<UserSerial> getWatch();

    Collection<UserSerial> getWish();

    Collection<UserSerial> getWatched();

    UserSerial save(UserSerial userSerial);
}
