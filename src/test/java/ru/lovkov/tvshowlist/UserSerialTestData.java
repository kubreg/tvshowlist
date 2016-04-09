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

    public static final int SERIAL_ID = START_SEQ+2;
    public static final int ADMIN_SERIAL_ID = START_SEQ+7;

    public static final UserSerial USER_SERIAL1 = new UserSerial(SERIAL_ID, 1, 15, true, false, 0);
    public static final UserSerial USER_SERIAL2 = new UserSerial(SERIAL_ID +1, 2, 5, true, false, 0);
    public static final UserSerial USER_SERIAL3 = new UserSerial(SERIAL_ID +2, 0, 0, false, true, 0);
    public static final UserSerial USER_SERIAL4 = new UserSerial(SERIAL_ID +3, 0, 0, false, false, 5);
    public static final UserSerial USER_SERIAL5 = new UserSerial(SERIAL_ID +4, 5, 0, false, false, 7);

    public static final UserSerial ADMIN_SERIAL1 = new UserSerial(ADMIN_SERIAL_ID, 3, 11, true, false, 0);
    public static final UserSerial ADMIN_SERIAL2 = new UserSerial(ADMIN_SERIAL_ID +1, 0, 0, false, true, 0);
    public static final UserSerial ADMIN_SERIAL3 = new UserSerial(ADMIN_SERIAL_ID +2, 0, 0, false, false, 8);

    public static final List<UserSerial> USER_ALL_SERIALS = Arrays.asList(USER_SERIAL1, USER_SERIAL2, USER_SERIAL3, USER_SERIAL4, USER_SERIAL5);
    public static final List<UserSerial> USER_CURRENT_SERIALS = Arrays.asList(USER_SERIAL1, USER_SERIAL2);
    public static final List<UserSerial> USER_WATCHED_SERIALS = Arrays.asList(USER_SERIAL5, USER_SERIAL4);

    public static final List<UserSerial> ADMIN_CURRENT_SERIALS = Arrays.asList(ADMIN_SERIAL1, ADMIN_SERIAL2);

    public static UserSerial getCreated() {
        return new UserSerial(null, 1, 22, true, false, 0);
    }

    public static UserSerial getUpdated() {
        return new UserSerial(SERIAL_ID, 1, 16, true, false, 0);
    }
}
