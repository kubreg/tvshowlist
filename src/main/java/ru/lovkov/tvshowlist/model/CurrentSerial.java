package ru.lovkov.tvshowlist.model;

/**
 * Created by kubreg on 05.04.2016.
 */
public class CurrentSerial extends BaseEntity {

    protected User owner;

    protected int serialId;

    protected Serial serial;

    protected int currentSeason;

    protected int currentSeries;

    protected boolean watched;

    protected boolean wished;

    protected int rating;

    public CurrentSerial() {
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public int getSerialId() {
        return serialId;
    }

    public void setSerialId(int serialId) {
        this.serialId = serialId;
    }

    public Serial getSerial() {
        return serial;
    }

    public void setSerial(Serial serial) {
        this.serial = serial;
    }

    public int getCurrentSeason() {
        return currentSeason;
    }

    public void setCurrentSeason(int currentSeason) {
        this.currentSeason = currentSeason;
    }

    public int getCurrentSeries() {
        return currentSeries;
    }

    public void setCurrentSeries(int currentSeries) {
        this.currentSeries = currentSeries;
    }

    public boolean isWatched() {
        return watched;
    }

    public void setWatched(boolean watched) {
        this.watched = watched;
    }

    public boolean isWished() {
        return wished;
    }

    public void setWished(boolean wished) {
        this.wished = wished;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
