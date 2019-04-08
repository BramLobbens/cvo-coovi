/*
Opdracht 4 - Oefening Database theater
*/

CREATE TABLE Stuk (
    stuknr INT,
    titel VARCHAR,
    soort VARCHAR,
    organisator VARCHAR,
    uitvoerder VARCHAR,
    duur INTERVAL,
    PRIMARY KEY(stuknr)
);
    
CREATE TABLE Klant (
    klantnr INT,
    naam VARCHAR,
    adres VARCHAR,
    PRIMARY KEY(klantnr)
);

CREATE TABLE Zone (
    naam VARCHAR,
    PRIMARY KEY(naam)
);
    
CREATE TABLE Plaats (
    plaatsnr INT,
    zonenaam VARCHAR,
    FOREIGN KEY(zonenaam) REFERENCES Zone (naam)
);
    
CREATE TABLE Voorstelling (
    datum DATE,
    beginuur TIME,
    stuknr INT,
    PRIMARY KEY(datum, beginuur),
    FOREIGN KEY(stuknr) REFERENCES Stuk (stuknr)
);
    
CREATE TABLE Tarief (
    datum DATE,
    beginuur TIME,
    zonenaam VARCHAR,
    prijs REAL,
    PRIMARY KEY(datum, beginuur, zonenaam),
    FOREIGN KEY(datum, beginuur) REFERENCES Voorstelling (datum, beginuur)
    FOREIGN KEY(zonenaam) REFERENCES Zone (naam)
);
    
CREATE TABLE Reservatie (
    datum DATE,
    beginuur TIME,
    klantnr INT,
    plaatsnr INT,
    betaald BOOLEAN,
    PRIMARY KEY(datum, beginuur, plaatsnr),
    FOREIGN KEY(datum, beginuur) REFERENCES Voorstelling (datum, beginuur),
    FOREIGN KEY(klantnr) REFERENCES Klant (klantnr),
    FOREIGN KEY(plaatsnr) REFERENCES Plaats (plaatsnr)
);
