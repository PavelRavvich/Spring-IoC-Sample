CREATE DATABASE spring;

CREATE TABLE IF NOT EXISTS items (
    id SERIAL NOT NULL ,
    description VARCHAR(20),
    PRIMARY KEY (id)
);