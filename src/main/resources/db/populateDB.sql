DELETE FROM current_serials;
DELETE FROM serials;
DELETE FROM users;
ALTER SEQUENCE global_seq RESTART WITH 100000;

INSERT INTO users (name, email, password)
VALUES ('User', 'user@yandex.ru', 'password');

INSERT INTO users (name, email, password)
VALUES ('Admin', 'admin@gmail.com', 'admin');

INSERT INTO serials (id, title, actors, description, kp_rating, imdb_rating) VALUES
  (1, 'Homeland', 'Tony Kapoor, Lisa Berns', 'Blah-blah-blah', 7.5, 8.0),
  (2, 'Card House', 'Kevin Spacy, Tora Bjernsen', 'Blah-blah-blah', 9.5, 9.0);

INSERT INTO current_serials (user_id, serial_id, current_season, current_series, watched, wished) VALUES
  (100000, 1, 2, 15, true, false),
  (100000, 2, 1, 5, true, false),
  (100001, 1, 1, 6, true, false),
  (100001, 2, 2, 11, true, false);
