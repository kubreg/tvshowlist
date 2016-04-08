package ru.lovkov.tvshowlist;

import ru.lovkov.tvshowlist.matcher.ModelMatcher;
import ru.lovkov.tvshowlist.model.UserSerial;

import java.util.Arrays;
import java.util.List;

import static ru.lovkov.tvshowlist.model.BaseEntity.START_SEQ;

/**
 * Created by kubreg on 05.04.2016.
 */
public class UserSerialTestData {
    public static final ModelMatcher<UserSerial, String> MATCHER = new ModelMatcher<>(UserSerial::toString);

    public static final int USER1_ID = START_SEQ+2;
    public static final int ADMIN_USER_ID = START_SEQ+7;

    public static final UserSerial USER1 = new UserSerial(USER1_ID, 1, 15, true, false, 0);
    public static final UserSerial USER2 = new UserSerial(USER1_ID+1, 2, 5, true, false, 0);
    public static final UserSerial USER3 = new UserSerial(USER1_ID+2, 0, 0, false, true, 0);
    public static final UserSerial USER4 = new UserSerial(USER1_ID+3, 0, 0, false, false, 5);
    public static final UserSerial USER5 = new UserSerial(USER1_ID+4, 0, 0, false, false, 7);

    public static final UserSerial ADMIN_USER1 = new UserSerial(ADMIN_USER_ID, 3, 11, true, false, 0);
    public static final UserSerial ADMIN_USER2 = new UserSerial(ADMIN_USER_ID+1, 0, 0, false, true, 0);
    public static final UserSerial ADMIN_USER3 = new UserSerial(ADMIN_USER_ID+2, 0, 0, false, false, 8);

    public static final List<UserSerial> USER_CURRENT_SERIALS = Arrays.asList(USER1, USER2);
    public static final List<UserSerial> USER_WATCHED_SERIALS = Arrays.asList(USER4, USER5);

    public static final List<UserSerial> ADMIN_CURRENT_SERIALS = Arrays.asList(ADMIN_USER1, ADMIN_USER2);

    public static UserSerial getCreated() {
        return new UserSerial(null, 1, 22, true, false, 0);
    }

    public static UserSerial getUpdated() {
        return new UserSerial(USER1_ID, 1, 16, true, false, 0);
    }
}
