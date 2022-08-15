CREATE TABLE characters
(
    ID         SERIAL PRIMARY KEY,
    FIRST_NAME VARCHAR(255) NOT NULL,
    LAST_NAME  VARCHAR(255) NOT NULL
);

INSERT INTO characters (FIRST_NAME, LAST_NAME)
VALUES ('Eddard', 'Stark'),
       ('Jaime', 'Lannister'),
       ('Margaery', 'Tyrell'),
       ('Tommen', 'Baratheon'),
       ('Ramsay', 'Bolton'),
       ('Arya', 'Stark'),
       ('Tyrion', 'Lannister'),
       ('Tywin', 'Lannister'),
       ('Daenerys', 'Targaryen');
