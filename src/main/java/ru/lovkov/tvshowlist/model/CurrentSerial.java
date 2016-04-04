package ru.lovkov.tvshowlist.model;

import org.hibernate.validator.constraints.Range;

import javax.persistence.*;

/**
 * Created by kubreg on 05.04.2016.
 */
@Entity
@Table(name = "current_serials", uniqueConstraints = {@UniqueConstraint(columnNames = {"user_id", "serial_id"}, name = "current_serials_unique_serial_id_user_id_idx")})
public class CurrentSerial extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    protected User owner;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "serial_id", nullable = false)
    protected Serial serial;

    @Column(name = "current_season", nullable = false)
    protected int currentSeason;

    @Column(name = "current_series", nullable = false)
    protected int currentSeries;

    @Column(name = "watched", nullable = false)
    protected boolean watched;

    @Column(name = "wished", nullable = false)
    protected boolean wished;

    @Column(name = "rating", nullable = false)
    protected int rating;

    public CurrentSerial() {
    }

    public CurrentSerial(int currentSeason, int currentSeries, boolean watched, boolean wished, int rating) {
        this(null, currentSeason, currentSeries, watched, wished, rating);
    }

    public CurrentSerial(Integer id, int currentSeason, int currentSeries, boolean watched, boolean wished, int rating) {
        super(id);
        this.currentSeason = currentSeason;
        this.currentSeries = currentSeries;
        this.watched = watched;
        this.wished = wished;
        this.rating = rating;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
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

    @Override
    public String toString() {
        return "CurrentSerial{" +
                "owner=" + owner +
                ", serial=" + serial +
                ", currentSeason=" + currentSeason +
                ", currentSeries=" + currentSeries +
                ", watched=" + watched +
                ", wished=" + wished +
                ", rating=" + rating +
                '}';
    }
}
