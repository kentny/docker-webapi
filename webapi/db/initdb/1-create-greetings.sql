CREATE TABLE greetings (
    id SERIAL,
    lang VARCHAR(255) NOT NULL,
    text VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
);