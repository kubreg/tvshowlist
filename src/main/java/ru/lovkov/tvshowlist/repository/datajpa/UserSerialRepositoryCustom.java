package ru.lovkov.tvshowlist.repository.datajpa;

import ru.lovkov.tvshowlist.model.Serial;
import ru.lovkov.tvshowlist.model.UserSerial;

/**
 * Created by kubreg on 11.04.2016.
 */
public interface UserSerialRepositoryCustom {
    UserSerial save(UserSerial userSerial, Serial serial, int id);
}
