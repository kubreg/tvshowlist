package ru.lovkov.tvshowlist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.lovkov.tvshowlist.model.UserSerial;

import java.util.List;

/**
 * Created by kubreg on 05.04.2016.
 */
public interface UserSerialRepository extends JpaRepository<UserSerial, Integer> {
    List<UserSerial> findByWatchedAndWishedOrderByWatched(boolean watched, boolean wished);

    List<UserSerial> findByWatchedOrderBySerialTitle(boolean watched);

    List<UserSerial> findByWishedOrderBySerialTitle(boolean wished);

    List<UserSerial> findByWatchedOrderByRating(boolean watched);
}
