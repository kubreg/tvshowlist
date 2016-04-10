package ru.lovkov.tvshowlist.service;

import ru.lovkov.tvshowlist.model.Serial;
import ru.lovkov.tvshowlist.model.UserSerial;
import ru.lovkov.tvshowlist.util.exception.NotFoundException;

import java.util.Collection;

/**
 * Created by kubreg on 07.04.2016.
 */
public interface UserSerialService {
    UserSerial get(int id, int ownerId);

    void delete(int id, int ownerId);

    Collection<UserSerial> getAll(int ownerId);

    Collection<UserSerial> getWatch(int ownerId);

    Collection<UserSerial> getWish(int ownerId);

    Collection<UserSerial> getViewed(int ownerId);

    Collection<UserSerial> getDefaultList(int ownerId); // watch and wish

    UserSerial save(UserSerial userSerial, Serial serial, int ownerId);

    UserSerial update(UserSerial userSerial, int ownerId);
}
