package ru.lovkov.tvshowlist;

import ru.lovkov.tvshowlist.matcher.ModelMatcher;
import ru.lovkov.tvshowlist.model.CurrentSerial;

import static ru.lovkov.tvshowlist.model.BaseEntity.START_SEQ;

/**
 * Created by kubreg on 05.04.2016.
 */
public class CurrentSerialTestData {
    public static final ModelMatcher<CurrentSerial, String> MATCHER = new ModelMatcher<>(CurrentSerial::toString);

    public static final int CURRENT1_ID = START_SEQ+2;
    public static final int ADMIN_CURRENT_ID = START_SEQ+7;

    public static final CurrentSerial CURRENT1 = new CurrentSerial(CURRENT1_ID, 1, 15, true, false, 0);
    public static final CurrentSerial CURRENT2 = new CurrentSerial(CURRENT1_ID+1, 2, 5, true, false, 0);
    public static final CurrentSerial CURRENT3 = new CurrentSerial(CURRENT1_ID+2, 0, 0, false, true, 0);
    public static final CurrentSerial CURRENT4 = new CurrentSerial(CURRENT1_ID+3, 0, 0, false, false, 5);
    public static final CurrentSerial CURRENT5 = new CurrentSerial(CURRENT1_ID+4, 0, 0, false, false, 7);

    public static final CurrentSerial ADMIN_CURRENT1 = new CurrentSerial(ADMIN_CURRENT_ID, 3, 11, true, false, 0);
    public static final CurrentSerial ADMIN_CURRENT2 = new CurrentSerial(ADMIN_CURRENT_ID+1, 0, 0, false, true, 0);
    public static final CurrentSerial ADMIN_CURRENT3 = new CurrentSerial(ADMIN_CURRENT_ID+2, 0, 0, false, false, 8);
}
