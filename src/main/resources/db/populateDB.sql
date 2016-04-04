DELETE FROM current_serials;
DELETE FROM serials;
DELETE FROM users;
ALTER SEQUENCE global_seq RESTART WITH 100000;

INSERT INTO users (name, email, password) VALUES
  ('User', 'user@yandex.ru', 'password'),
  ('Admin', 'admin@gmail.com', 'admin');

INSERT INTO serials (id, title, actors, description, kp_rating, imdb_rating) VALUES
  (1, 'Homeland', 'Tony Kapoor, Lisa Berns', 'Blah-blah-blah', 7.5, 8.0),
  (2, 'Card House', 'Kevin Spacy, Tora Bjernsen', 'Blah-blah-blah', 9.5, 9.0),
  (3, 'Rosewood', 'Tom Hardy', 'dddddddddd', 7.0, 6.0),
  (4, 'Lucifer', 'Nina Moretz, Kai Loren', 'detective', 7.5, 6.8),
  (5, 'Suits', 'Jay Abrams, Harvey Spectr', 'advocats', 8.5, 9.0),
  (6, 'Doctor Who', 'John Smith, Mike Newton', 'adventures', 9.5, 9.5);

INSERT INTO current_serials (user_id, serial_id, current_season, current_series, watched, wished, rating) VALUES
  (100000, 1, 1, 15, true, false, 0),
  (100000, 3, 2, 5, true, false, 0),
  (100000, 2, 0, 0, false, true, 0),
  (100000, 4, 0, 0, false, false, 5),
  (100000, 6, 5, 0, false, false, 7),
  (100001, 5, 3, 11, true, false, 0),
  (100001, 4, 0, 0, false, true, 0),
  (100001, 6, 0, 0, false, false, 8);
