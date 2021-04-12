CREATE TABLE movies (
id INT NOT NULL,
title VARCHAR2(20) NOT NULL,
release_date DATE,
duration NUMBER,
score NUMBER
);

/

CREATE TABLE genres (
id INT NOT NULL,
name VARCHAR2(20) NOT NULL
);

/

CREATE TABLE junction (
id_movies INT NOT NULL,
id_genres INT NOT NULL
);

/