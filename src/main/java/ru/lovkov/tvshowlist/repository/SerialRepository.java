package ru.lovkov.tvshowlist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;
import ru.lovkov.tvshowlist.model.Serial;

/**
 * Created by kubreg on 05.04.2016.
 */
@Transactional(readOnly = true)
public interface SerialRepository extends JpaRepository<Serial, Integer> {

    Serial findByTitle(String title);
}
