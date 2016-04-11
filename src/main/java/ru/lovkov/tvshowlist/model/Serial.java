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

    @Id
    @Column(name = "id", nullable = false, unique = true)
    @NotNull
    protected Integer id;

    @Column(name = "title", nullable = false)
    @NotEmpty
    protected String title;

    @Column(name = "actors", nullable = false)
    @NotEmpty
    protected String actors;

    @Column(name = "description", nullable = false)
    @NotEmpty
    protected String description;

    @Column(name = "series", nullable = false)
    protected Integer series;

    @Column(name = "seasons", nullable = false)
    protected Integer seasons;

    @Column(name = "kp_rating", nullable = false)
    protected Double kpRating;

    @Column(name = "imdb_rating", nullable = false)
    private Double imdbRating;

    public Serial() {
    }

    public Serial(Integer id, String title, String actors, String description, Integer series, Integer seasons, Double kpRating, Double imdbRating) {
        this.id = id;
        this.title = title;
        this.actors = actors;
        this.description = description;
        this.series = series;
        this.seasons = seasons;
        this.kpRating = kpRating;
        this.imdbRating = imdbRating;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Integer getSeries() {
        return series;
    }

    public void setSeries(Integer series) {
        this.series = series;
    }

    public Integer getSeasons() {
        return seasons;
    }

    public void setSeasons(Integer seasons) {
        this.seasons = seasons;
    }

    public Double getKpRating() {
        return kpRating;
    }

    public void setKpRating(Double kpRating) {
        this.kpRating = kpRating;
    }

    public Double getImdbRating() {
        return imdbRating;
    }

    public void setImdbRating(Double imdbRating) {
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
