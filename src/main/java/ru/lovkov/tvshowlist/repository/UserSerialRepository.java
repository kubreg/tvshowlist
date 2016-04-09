package ru.lovkov.tvshowlist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.lovkov.tvshowlist.model.UserSerial;

import java.util.List;

/**
 * Created by kubreg on 05.04.2016.
 */
@Transactional(readOnly = true)
public interface UserSerialRepository extends JpaRepository<UserSerial, Integer> {

    @Query("SELECT us FROM UserSerial us WHERE us.owner.id=?1")
    List<UserSerial> getAll(int ownerId);

    @Transactional
    @Modifying
    @Query("DELETE FROM UserSerial us WHERE us.id=?1 AND us.owner.id=?2")
    int delete(int id, int ownerId);

    @Query("SELECT us FROM UserSerial us WHERE us.id=?1 AND us.owner.id=?2")
    UserSerial get(int id, int ownerId);

    @Query("SELECT us FROM UserSerial us WHERE us.watched=true AND us.owner.id=?1 ORDER BY us.serial.title")
    List<UserSerial> getWatch(int ownerId);

    @Query("SELECT us FROM UserSerial us WHERE us.wished=true AND us.owner.id=?1 ORDER BY us.serial.title")
    List<UserSerial> getWish(int ownerId);

    @Query("SELECT us FROM UserSerial us WHERE us.watched=false AND us.wished=false AND us.owner.id=?1 ORDER BY us.rating DESC")
    List<UserSerial> getViewed(int ownerId);

    @Query("SELECT us FROM UserSerial us WHERE (us.watched=true OR us.wished=true) AND us.owner.id=?1 ORDER BY us.wished, us.serial.title")
    List<UserSerial> getDefaultList(int ownerId);
}
