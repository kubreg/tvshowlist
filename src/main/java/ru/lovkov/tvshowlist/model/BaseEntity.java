package ru.lovkov.tvshowlist.model;

/**
 * Created by kubreg on 05.04.2016.
 */
public class BaseEntity {
    public static final int START_SEQ = 100000;

    protected int id;

    public BaseEntity() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
