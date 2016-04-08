package ru.lovkov.tvshowlist.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ru.lovkov.tvshowlist.model.UserSerial;
import ru.lovkov.tvshowlist.repository.UserSerialRepository;

import static org.slf4j.LoggerFactory.getLogger;
import static ru.lovkov.tvshowlist.UserSerialTestData.*;

/**
 * Created by kubreg on 07.04.2016.
 */
@ContextConfiguration({
        "classpath:spring/spring-app.xml",
        "classpath:spring/spring-db.xml"
})
@RunWith(SpringJUnit4ClassRunner.class)
@Sql(scripts = "classpath:db/populateDB.sql", config = @SqlConfig(encoding = "UTF-8"))
public class UserSerialServiceTest {
    private static final Logger LOG = getLogger(UserSerialServiceTest.class);

    @Autowired
    private UserSerialService service;

    @Test
    public void testGet() {
        LOG.info("Test get: {}", USER1_ID);

        UserSerial ref = service.get(USER1_ID);
        MATCHER.assertEquals(ref, USER1);
    }
}
