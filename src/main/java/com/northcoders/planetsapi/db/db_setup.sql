DROP DATABASE IF EXISTS solar_system;
CREATE DATABASE solar_system;

\c solar_system;

CREATE TABLE planets
(
    planet_id SERIAL PRIMARY KEY,
    name VARCHAR,
    distance_from_sun INT,
    planet_type VARCHAR,
    planet_size INT,
    length_of_year INT,
    orbital_circumference DECIMAL
);

CREATE TABLE moons
(
    moon_id SERIAL PRIMARY KEY,
    name VARCHAR,
    distance_from_planet INT,
    moon_size INT
);

CREATE TABLE planet_moons
(
    id SERIAL PRIMARY KEY,
    planet_id INT REFERENCES planets(planet_id),
    moon_id INT REFERENCES moons(moon_id)
);