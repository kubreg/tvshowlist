package ru.lovkov.tvshowlist;

import ru.lovkov.tvshowlist.model.BaseEntity;

/**
 * Created by kubreg on 13.04.2016.
 */
public class LoggedUser {
    private LoggedUser() {
    }

    private static int id = BaseEntity.START_SEQ;

    public static int id() {
        return id;
    }

    public static void setId(int id) {
        LoggedUser.id = id;
    }
}