package ru.lovkov.tvshowlist.util.exception;

/**
 * Created by kubreg on 07.04.2016.
 */
public class NotFoundException extends RuntimeException {
    public NotFoundException(String message) {
        super(message);
    }
}
