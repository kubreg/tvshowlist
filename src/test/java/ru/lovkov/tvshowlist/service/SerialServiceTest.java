package ru.lovkov.tvshowlist.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import ru.lovkov.tvshowlist.model.Serial;

import static ru.lovkov.tvshowlist.SerialTestData.*;

/**
 * Created by kubreg on 11.04.2016.
 */
public class SerialServiceTest extends AbstractServiceTest {

    @Autowired
    private SerialService service;

    @Test
    public void testSave() {
        Serial serial = getCreated();
        service.save(serial);

        MATCHER.assertEquals(serial, service.findByTitle(serial.getTitle()));
    }

    @Test
    public void testUpdate() {
        Serial serial = getUpdated();
        service.save(serial);

        MATCHER.assertEquals(serial, service.get(serial.getId()));
    }

    @Test
    public void testGet() {
        MATCHER.assertEquals(SERIAL1, service.get(SERIAL1_ID));
    }

    @Test
    public void testDelete() {
        service.delete(SERIAL1_ID);

        MATCHER.assertCollectionEquals(SERIALS, service.getAll());
    }

    @Test
    public void testFindByTitle() {
        MATCHER.assertEquals(SERIAL2, service.findByTitle("Card House"));
    }
}
