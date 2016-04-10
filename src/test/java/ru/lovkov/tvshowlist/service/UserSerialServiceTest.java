package ru.lovkov.tvshowlist.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import ru.lovkov.tvshowlist.model.UserSerial;

import java.util.Arrays;
import java.util.Collections;

import static ru.lovkov.tvshowlist.SerialTestData.SERIAL1;
import static ru.lovkov.tvshowlist.UserSerialTestData.*;
import static ru.lovkov.tvshowlist.UserTestData.USER_ID;
import static ru.lovkov.tvshowlist.SerialTestData.SERIAL5;
import static ru.lovkov.tvshowlist.UserTestData.USER;

/**
 * Created by kubreg on 07.04.2016.
 */

public class UserSerialServiceTest extends AbstractServiceTest {

    @Autowired
    private UserSerialService service;

    @Test
    public void testSave() {
        UserSerial serial = getCreated();
        service.save(serial, SERIAL5, USER_ID);

        MATCHER.assertCollectionEquals(Arrays.asList(serial, USER_SERIAL3), service.getWish(USER_ID));
    }

    @Test
    public void testUpdate() {
        UserSerial serial = getUpdated();
        serial.setOwner(USER);
        serial.setSerial(SERIAL1);
        service.save(serial, null, USER_ID);

        MATCHER.assertEquals(serial, service.get(serial.getId(), USER_ID));
    }

    @Test
    public void testGet() {
        UserSerial ref = service.get(SERIAL_ID, USER_ID);
        MATCHER.assertEquals(ref, USER_SERIAL1);
    }

    @Test
    public void testDelete() {
        service.delete(SERIAL_ID, USER_ID);
        MATCHER.assertCollectionEquals(service.getAll(USER_ID), Arrays.asList(USER_SERIAL2, USER_SERIAL3, USER_SERIAL4, USER_SERIAL5));
    }

    @Test
    public void testGetAll() {
        MATCHER.assertCollectionEquals(USER_ALL_SERIALS, service.getAll(USER_ID));
    }

    @Test
    public void testGetWatch() {
        MATCHER.assertCollectionEquals(USER_CURRENT_SERIALS, service.getWatch(USER_ID));
    }

    @Test
    public void testGetWish() {
        MATCHER.assertCollectionEquals(Collections.singletonList(USER_SERIAL3), service.getWish(USER_ID));
    }

    @Test
    public void testGetViewed() {
        MATCHER.assertCollectionEquals(USER_WATCHED_SERIALS, service.getViewed(USER_ID));
    }

    @Test
    public void testGetDefaultList() {
        MATCHER.assertCollectionEquals(Arrays.asList(USER_SERIAL1, USER_SERIAL2, USER_SERIAL3), service.getDefaultList(USER_ID));
    }
}
