package ru.lovkov.tvshowlist.model;

import java.util.List;

/**
 * Created by kubreg on 05.04.2016.
 */
public class User extends BaseEntity {

    protected String name;

    protected String password;

    protected String email;

    protected boolean enabled;

    protected List<CurrentSerial> serials;

    public User() {
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
}
