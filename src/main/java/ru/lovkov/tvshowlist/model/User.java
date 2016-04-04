package ru.lovkov.tvshowlist.model;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.util.List;

/**
 * Created by kubreg on 05.04.2016.
 */
@Entity
@Table(name = "users", uniqueConstraints = {@UniqueConstraint(columnNames = "email", name = "users_unique_email_idx")})
public class User extends BaseEntity {

    @NotEmpty
    @Column(name = "name", nullable = false)
    protected String name;

    @Column(name = "password", nullable = false)
    @NotEmpty
    @Length(min = 5)
    protected String password;

    @Column(name = "email", nullable = false, unique = true)
    @Email
    @NotEmpty
    protected String email;

    @Column(name = "enabled", nullable = false)
    protected boolean enabled = true;

    @OneToMany(cascade = CascadeType.REMOVE, fetch = FetchType.LAZY, mappedBy = "owner")
    protected List<CurrentSerial> serials;

    public User() {
    }

    public User(Integer id, String name, String email, String password) {
        this(id, name, email, password, true);
    }

    public User(Integer id, String name, String email, String password, boolean enabled) {
        super(id);
        this.name = name;
        this.email = email;
        this.password = password;
        this.enabled = enabled;
    }

    public User(User u) {
        this(u.getId(), u.getName(), u.getEmail(), u.getPassword(), u.isEnabled());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public List<CurrentSerial> getSerials() {
        return serials;
    }

    public void setSerials(List<CurrentSerial> serials) {
        this.serials = serials;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", enabled=" + enabled +
                ", serials=" + serials +
                '}';
    }
}
