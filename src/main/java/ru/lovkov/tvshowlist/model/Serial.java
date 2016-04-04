package ru.lovkov.tvshowlist.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by kubreg on 05.04.2016.
 */
@Entity
@Table(name = "serials", uniqueConstraints = {@UniqueConstraint(columnNames = "id", name = "serials_unique_id_idx")})
public class Serial {

    @Column(name = "id", nullable = false, unique = true)
    @NotNull
    protected int id;

    @Column(name = "title", nullable = false)
    @NotEmpty
    protected String title;

    @Column(name = "actors", nullable = false)
    @NotEmpty
    protected String actors;

    @Column(name = "description", nullable = false)
    @NotEmpty
    protected String description;

    @Column(name = "kp_rating", nullable = false)
    protected long kpRating;

    @Column(name = "imdb_rating", nullable = false)
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

    @Override
    public String toString() {
        return "Serial{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", actors='" + actors + '\'' +
                ", description='" + description + '\'' +
                ", kpRating=" + kpRating +
                ", imdbRating=" + imdbRating +
                '}';
    }
}
