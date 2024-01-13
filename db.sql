CREATE DATABASE API;

CREATE TABLE Commande (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nom VARCHAR(255) NOT NULL,
    client_id INT,
    FOREIGN KEY (client_id) REFERENCES Client(id)
);


CREATE TABLE VENDEUR (
    ID integer primary key not null AUTO_INCREMENT,
    NOM varchar(50),
    PRENOM varchar(50),
    EMAIL varchar(50)
);

CREATE TABLE Adresse (
    id INT PRIMARY KEY AUTO_INCREMENT,
    rue VARCHAR(255) NOT NULL,
    codePostal VARCHAR(20) NOT NULL,
    client_id INT,
    FOREIGN KEY (client_id) REFERENCES Client(id)
);

CREATE TABLE Commande (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nom VARCHAR(255) NOT NULL
);

CREATE TABLE Fournisseur (
    id INT PRIMARY KEY AUTO_INCREMENT,
    numtel INT NOT NULL,
    nom VARCHAR(255) NOT NULL
);

CREATE TABLE Produit (
    id INT PRIMARY KEY AUTO_INCREMENT,
    NomProduit VARCHAR(255) NOT NULL,
    prix INT NOT NULL,
    commande_id INT,
    FOREIGN KEY (commande_id) REFERENCES Commande(id)
);


