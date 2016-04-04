package ru.lovkov.tvshowlist;

import ru.lovkov.tvshowlist.matcher.ModelMatcher;
import ru.lovkov.tvshowlist.model.User;

import java.util.Objects;

import static ru.lovkov.tvshowlist.model.BaseEntity.START_SEQ;
/**
 * Created by kubreg on 05.04.2016.
 */
public class UserTestData {
    public static final ModelMatcher<User, TestUser> MATCHER = new ModelMatcher<>(u -> ((u instanceof TestUser) ? (TestUser) u : new TestUser(u)));

    public static final int USER_ID = START_SEQ;
    public static final int ADMIN_ID = START_SEQ + 1;

    public static final User USER = new User(USER_ID, "User", "user@yandex.ru", "password");
    public static final User ADMIN = new User(ADMIN_ID, "Admin", "admin@gmail.com", "admin");

    public static class TestUser extends User {
        public TestUser(User u) {
            this(u.getId(), u.getName(), u.getEmail(), u.getPassword(), u.isEnabled());
        }

        public TestUser(String name, String email, String password) {
            this(null, name, email, password, true);
        }

        public TestUser(Integer id, String name, String email, String password, boolean enaibled) {
            super(id, name, email, password, enaibled);
        }

        @Override
        public String toString() {
            return super.toString();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            TestUser that = (TestUser) o;
            return Objects.equals(this.password, that.password)
                    && Objects.equals(this.id, that.id)
                    && Objects.equals(this.name, that.name)
                    && Objects.equals(this.email, that.email)
                    && Objects.equals(this.enabled, that.enabled);
        }
    }
}
