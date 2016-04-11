package ru.lovkov.tvshowlist;

import ru.lovkov.tvshowlist.matcher.ModelMatcher;
import ru.lovkov.tvshowlist.model.Serial;

import java.util.Arrays;
import java.util.List;

/**
 * Created by kubreg on 05.04.2016.
 */
public class SerialTestData {
    public static final ModelMatcher<Serial, String> MATCHER = new ModelMatcher<>(Serial::toString);

    public static final int SERIAL1_ID = 1;

    public static final Serial SERIAL1 = new Serial(SERIAL1_ID, "Homeland", "Tony Kapoor, Lisa Berns", "Blah-blah-blah", 16, 5, 7.5, 8.0);
    public static final Serial SERIAL2 = new Serial(SERIAL1_ID+1, "Card House", "Kevin Spacy, Tora Bjernsen", "Blah-blah-blah", 22, 5, 9.5, 9.0);
    public static final Serial SERIAL3 = new Serial(SERIAL1_ID+2, "Rosewood", "Tom Hardy", "dddddddddd", 22, 1, 7.0, 6.0);
    public static final Serial SERIAL4 = new Serial(SERIAL1_ID+3, "Lucifer", "Nina Moretz, Kai Loren", "detective", 22, 1, 7.5, 6.8);
    public static final Serial SERIAL5 = new Serial(SERIAL1_ID+4, "Suits", "Jay Abrams, Harvey Spectr", "advocats", 22, 5, 8.5, 9.0);
    public static final Serial SERIAL6 = new Serial(SERIAL1_ID+5, "Doctor Who", "John Smith, Mike Newton", "adventures", 16, 20, 9.5, 9.5);

    public static final List<Serial> SERIALS = Arrays.asList(SERIAL2, SERIAL3, SERIAL4, SERIAL5, SERIAL6);

    public static Serial getCreated() {
        return new Serial(10, "Batman vs. Superman", "Ben Afflec, Tom Hardy", "DC Comics", 1, 1, 7.0, 6.5);
    }

    public static Serial getUpdated() {
        return new Serial(SERIAL1_ID, "Homeland", "Tony Kapoor, Lisa Berns", "Blah-blah-blah", 16, 6, 8.5, 8.0);
    }
}
