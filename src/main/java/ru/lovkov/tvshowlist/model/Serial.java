package ru.lovkov.tvshowlist.model;

/**
 * Created by kubreg on 05.04.2016.
 */
public class Serial {

    protected int id;

    protected String title;

    protected String actors;

    protected String description;

    protected long kpRating;

    private long imdbRating;

    public Serial() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getKpRating() {
        return kpRating;
    }

    public void setKpRating(long kpRating) {
        this.kpRating = kpRating;
    }

    public long getImdbRating() {
        return imdbRating;
    }

    public void setImdbRating(long imdbRating) {
        this.imdbRating = imdbRating;
    }
}
