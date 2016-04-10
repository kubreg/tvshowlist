package ru.lovkov.tvshowlist.service;

import ru.lovkov.tvshowlist.model.Serial;

import java.util.Collection;

/**
 * Created by kubreg on 05.04.2016.
 */
public interface SerialService {

    Serial save(Serial serial);

    Serial get(int id);

    void delete(int id);

    Collection<Serial> getAll();

    Serial findByTitle(String title);
}
