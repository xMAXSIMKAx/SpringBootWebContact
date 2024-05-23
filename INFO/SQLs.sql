

CREATE DATABASE demo_db;




CREATE TABLE IF NOT EXISTS party
( id INTEGER NOT NULL AUTO_INCREMENT,
  image VARCHAR(255) NOT NULL,
  name VARCHAR(255) NOT NULL,
  description VARCHAR(255) NOT NULL,
  PRIMARY KEY (id)
);


INSERT INTO
	party (image, name, description)
VALUES
	('22.jpg', 'Azure beach', 'Good drinks, Nice party.'),
	('11.jpg', 'Sunny Club', 'Great food, amazing feels .'),
	('33.jpg', 'Fish farm', 'Very interesting vibe.');


