DROP TABLE IF EXISTS user_serials;
DROP TABLE IF EXISTS serials;
DROP TABLE IF EXISTS users;

DROP SEQUENCE IF EXISTS global_seq;

CREATE SEQUENCE global_seq START 100000;

CREATE TABLE users
(
  id         INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
  name       VARCHAR NOT NULL,
  email      VARCHAR NOT NULL,
  password   VARCHAR NOT NULL,
  enabled    BOOL DEFAULT TRUE
);
CREATE UNIQUE INDEX users_unique_email_idx ON users (email);

CREATE TABLE serials
(
  id          INTEGER NOT NULL,
  title       VARCHAR NOT NULL,
  actors      VARCHAR NOT NULL,
  description VARCHAR NOT NULL,
  series      INTEGER NOT NULL,
  seasons     INTEGER NOT NULL,
  kp_rating   DOUBLE PRECISION NOT NULL,
  imdb_rating DOUBLE PRECISION NOT NULL
);
CREATE UNIQUE INDEX serials_unique_id_idx ON serials(id);

CREATE TABLE user_serials
(
  id               INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
  user_id          INTEGER NOT NULL,
  serial_id        INTEGER NOT NULL,
  current_season   INTEGER NOT NULL,
  current_series   INTEGER NOT NULL,
  watched          BOOL DEFAULT FALSE,
  wished           BOOL DEFAULT TRUE,
  rating           INTEGER DEFAULT 0,
  FOREIGN KEY (serial_id) REFERENCES serials (id) ON DELETE CASCADE,
  FOREIGN KEY (user_id) REFERENCES users (id) ON DELETE CASCADE
);
CREATE UNIQUE INDEX user_serials_unique_serial_id_user_id_idx ON user_serials(serial_id, user_id);