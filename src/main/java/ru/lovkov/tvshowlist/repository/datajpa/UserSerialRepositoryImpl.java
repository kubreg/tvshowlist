package ru.lovkov.tvshowlist.repository.datajpa;

import org.springframework.transaction.annotation.Transactional;
import ru.lovkov.tvshowlist.model.Serial;
import ru.lovkov.tvshowlist.model.User;
import ru.lovkov.tvshowlist.model.UserSerial;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by kubreg on 11.04.2016.
 */
public class UserSerialRepositoryImpl implements UserSerialRepositoryCustom {

    @PersistenceContext
    private transient EntityManager entityManager;

    @Override
    @Transactional
    public UserSerial save(UserSerial userSerial, Serial serial, int id) {
        if (serial != null) {
            userSerial.setOwner(entityManager.getReference(User.class, id));
            userSerial.setSerial(serial);

            entityManager.persist(userSerial);

            return userSerial;
        } else {
            return entityManager.merge(userSerial);
        }
    }
}
