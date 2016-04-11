package ru.lovkov.tvshowlist.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import ru.lovkov.tvshowlist.model.User;

import java.util.Arrays;
import java.util.Collections;

import static ru.lovkov.tvshowlist.UserTestData.*;

/**
 * Created by kubreg on 12.04.2016.
 */
public class UserServiceTest extends AbstractServiceTest {

    @Autowired
    private UserService service;

    @Test
    public void testSave() {
        User user = getCreated();
        service.save(user);

        MATCHER.assertCollectionEquals(Arrays.asList(USER, ADMIN, user), service.getAll());
    }

    @Test
    public void testGet() {
        MATCHER.assertEquals(USER, service.get(USER_ID));
    }

    @Test
    public void testDelete() {
        service.delete(USER_ID);

        MATCHER.assertCollectionEquals(Collections.singletonList(ADMIN), service.getAll());
    }

    @Test
    public void testGetAll() {
        MATCHER.assertCollectionEquals(Arrays.asList(USER, ADMIN), service.getAll());
    }
}
