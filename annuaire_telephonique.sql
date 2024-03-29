CREATE TABLE annuaire (
    id INT(11) AUTO_INCREMENT,
    num VARCHAR(20),
    nom VARCHAR(30) NOT NULL,
    adresse varchar(100) NOT NULL,
    PRIMARY KEY (id, num)
);
