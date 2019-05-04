/*
Opdracht 5 SQL SELECT UPDATE
*/

/* Database schilderkunst */

/* 
Vraag 1
Hoeveel verschillende eigenaars zijn er voor schilderijen van James Ensor?
*/
-- methode 1
SELECT count(*) AS Aantal,
       e.Eigenaar
FROM Schilderij s, Artiest a, Eigenaar e
WHERE 
    s.Artiest = a.A_ID
    AND s.Eigenaar = e.Eigenaar
    AND a.Voornaam = 'James'
    AND a.Naam = 'Ensor'
GROUP BY  e.Eigenaar;

-- methode 2
SELECT count(*) AS Aantal,
       e.Eigenaar
FROM Schilderij s
INNER JOIN Eigenaar e
    ON s.Eigenaar = e.Eigenaar
INNER JOIN Artiest a
    ON s.Artiest = a.A_ID
WHERE 
    (SELECT a.Voornaam || ' ' || a.Naam AS artiest) = 'James Ensor'
GROUP BY  e.Eigenaar;


/* Database werkverdeling */

/*
Vraag 1
Geef alle programmeurs en DBA’s uit Gent en Brussel (naam, salaris, vestgingsnaam) met een salaris tussen de 2000 en 4000EUR
*/

-- methode 1
SELECT w.wnaam AS Naam,
       w.salaris AS Salaris,
       v.vnaam AS Vestiging
FROM Werknemer w, Vestiging v, Functie f
WHERE 
    w.fnaam = f.fnaam
    AND w.vnaam = v.vnaam
    AND (f.fnaam = 'PROGRAMMEUR' OR f.fnaam = 'DBA')
    AND (v.plaats = 'GENT' OR v.plaats = 'BRUSSEL')
    AND w.salaris BETWEEN 2000 AND 4000;
        
-- methode 2
SELECT Werknemer.wnaam,
       Werknemer.salaris,
       Vestiging.vnaam
FROM Werknemer
INNER JOIN Functie
    ON Werknemer.fnaam = Functie.fnaam
INNER JOIN Vestiging
    ON Werknemer.vnaam = Vestiging.vnaam
WHERE 
    (Functie.fnaam = 'PROGRAMMEUR' OR Functie.fnaam = 'DBA')
    AND (Vestiging.plaats = 'GENT' OR Vestiging.plaats = 'BRUSSEL')
    AND Werknemer.salaris BETWEEN 2000 AND 4000;

/*
Vraag 2
Geef naam, salaris,functienaam en het nummer van zijn vervanger voor alle analisten, technici,DBA’s en programmeurs
*/

SELECT w.wnaam AS Naam,
       w.salaris AS Salaris,
       w.fnaam AS Functie,
       v.vervanger AS 'Nummer Vervanger'
FROM Werknemer w 
LEFT OUTER JOIN Vervanging v
    ON w.wnr = v.wnr
INNER JOIN Functie f
    ON w.fnaam = f.fnaam
WHERE f.fnaam IN('ANALIST', 'TECHNICUS', 'DBA', 'PROGRAMMEUR');

/*
Vraag 3
De directeur wil een overzicht van de som van de totale maandelijkse loonkost en dit per vestiging.
*/

SELECT sum(Werknemer.salaris) AS Totaal,
       Vestiging.plaats AS Vestiging
FROM Werknemer
INNER JOIN Vestiging
    ON Werknemer.vnaam = Vestiging.vnaam
GROUP BY Vestiging.plaats;

/*
Vraag 4
Geef alle werknemers van de vestigingen in Antwerpen 3% opslag, voor zover hun salaris niet meer dan 3500 EUR bedraagt.
*/

UPDATE Werknemer 
SET salaris = salaris * 1.03
WHERE 
    (SELECT salaris
    FROM Werknemer
    INNER JOIN Vestiging
        ON Werknemer.vnaam = Vestiging.vnaam
    WHERE Vestiging.plaats = 'ANTWERPEN'
        AND Werknemer.salaris <= 3500);

/*
Vraag 5
Geef de vestiging met de hoogste bezetting aan werknemers.
*/

SELECT count(Werknemer.wnr) AS Totaal,
       Vestiging.plaats AS Vestiging
FROM Werknemer
INNER JOIN Vestiging
    ON Werknemer.vnaam = Vestiging.vnaam
GROUP BY Vestiging.plaats
ORDER BY count(Werknemer.wnr) DESC 
LIMIT 1;

/*
Vraag 6
Geef de branche waar de werknemers gemiddeld het meest verdienen.
*/

SELECT AVG(Werknemer.salaris) AS 'Gemiddeld Salaris', 
       Vestiging.branche AS Branche
FROM Werknemer
INNER JOIN Vestiging
    ON Werknemer.vnaam = Vestiging.vnaam
GROUP BY Vestiging.branche
ORDER BY AVG(Werknemer.salaris) DESC 
LIMIT 1;

/*
Vraag 7
Geef per vestiging de werknemer die het minst verdient. Geef de kolom met de laagste salaris de naam ‘Laagste’.
*/

SELECT min(Werknemer.salaris) AS Laagste,
       Vestiging.plaats
FROM Werknemer
INNER JOIN Vestiging
    ON Werknemer.vnaam = Vestiging.vnaam
GROUP BY Vestiging.plaats
ORDER BY min(Werknemer.salaris) ASC;