package ru.lovkov.tvshowlist.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.lovkov.tvshowlist.model.Serial;
import ru.lovkov.tvshowlist.repository.SerialRepository;

import java.util.Collection;

/**
 * Created by kubreg on 11.04.2016.
 */
@Service
public class SerialServiceImpl implements SerialService {

    @Autowired
    private SerialRepository repository;

    @Override
    public Serial save(Serial serial) {
        return repository.save(serial);
    }

    @Override
    public Serial get(int id) {
        return repository.findOne(id);
    }

    @Override
    public void delete(int id) {
        repository.delete(id);
    }

    @Override
    public Collection<Serial> getAll() {
        return repository.findAll();
    }

    @Override
    public Serial findByTitle(String title) {
        return repository.findByTitle(title);
    }
}
