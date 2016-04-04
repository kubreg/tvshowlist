package ru.lovkov.tvshowlist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.lovkov.tvshowlist.model.CurrentSerial;

/**
 * Created by kubreg on 05.04.2016.
 */
@Repository
public interface CurrentSerialRepository extends JpaRepository<CurrentSerial, Integer> {
}
