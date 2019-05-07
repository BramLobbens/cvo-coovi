/*
Opdracht 5 SQL SELECT UPDATE
*/

/* Database schilderkunst */

/* 
Vraag 1
Hoeveel verschillende eigenaars zijn er voor schilderijen van James Ensor?
*/

select count(distinct s.Eigenaar) as UniqueEigenaar
  from Schilderij as s
  join Eigenaar as e
    on s.Eigenaar = e.Eigenaar
  join Artiest as a
    on s.Artiest = a.A_ID
 where (
           select a.Voornaam || ' ' || a.Naam
       ) = 'James Ensor'
;
-- Ter controle toon eigenaars met aantal James Ensor schilderijen
select count(*) as Aantal
     , e.Eigenaar
  from Schilderij as s
  join Eigenaar as e
    on s.Eigenaar = e.Eigenaar
  join Artiest a
    on s.Artiest = a.A_ID
 where (
           select a.Voornaam || ' ' || a.Naam
       ) = 'James Ensor'
 group by e.Eigenaar
;

/* Database werkverdeling */

/*
Vraag 1
Geef alle programmeurs en DBA’s uit Gent en Brussel (naam, salaris, vestgingsnaam) met een salaris tussen de 2000 en 4000EUR
*/

select w.wnaam as Naam
     , w.salaris as Salaris
     , v.vnaam as Plaats
  from Werknemer as w
  join Functie as f
    on w.fnaam = f.fnaam
  join Vestiging as v
    on w.vnaam = v.vnaam
 where f.fnaam in ('PROGRAMMEUR', 'DBA')
   and v.plaats in ('GENT', 'BRUSSEL')
   and w.salaris between 2000 and 4000
;

/*
Vraag 2
Geef naam, salaris,functienaam en het nummer van zijn vervanger voor alle analisten, technici,DBA’s en programmeurs
*/

select w.wnaam as Naam
     , w.salaris as Salaris
     , w.fnaam as Functie
     , v.vervanger as NummerVervanger
  from Werknemer as w
  join Functie as f
    on w.fnaam = f.fnaam
  left join Vervanging v
    on w.wnr = v.wnr
 where f.fnaam in ('ANALIST', 'TECHNICUS', 'DBA', 'PROGRAMMEUR')
;

/*
Vraag 3
De directeur wil een overzicht van de som van de totale maandelijkse loonkost en dit per vestiging.
*/

select sum(w.salaris) as Totaal
     , v.plaats as Vestiging
  from Werknemer as w
  join Vestiging as v
    on w.vnaam = v.vnaam
 group by v.plaats
;

/*
Vraag 4
Geef alle werknemers van de vestigingen in Antwerpen 3% opslag, voor zover hun salaris niet meer dan 3500 EUR bedraagt.
*/

update Werknemer
   set salaris = salaris * 1.03
 where (
           select salaris
             from Werknemer as w
             join Vestiging as v
               on w.vnaam = v.vnaam
            where v.plaats = 'ANTWERPEN'
              and w.salaris <= 3500 
       )
;

/*
Vraag 5
Geef de vestiging met de hoogste bezetting aan werknemers.
*/

select count(w.wnr) as Totaal
     , v.plaats as Vestiging
  from Werknemer as w
  join Vestiging as v
    on w.vnaam = v.vnaam
 group by Vestiging
 order by Totaal desc
 limit 1
;

/*
Vraag 6
Geef de branche waar de werknemers gemiddeld het meest verdienen.
*/

select avg(w.salaris) as GemiddeldSalaris
     , v.branche as Branche
  from Werknemer as w
  join Vestiging as v
    on w.vnaam = v.vnaam
 group by Branche
 order by GemiddeldSalaris desc
 limit 1
;

/*
Vraag 7
Geef per vestiging de werknemer die het minst verdient. Geef de kolom met de laagste salaris de naam ‘Laagste’.
*/

select min(w.salaris) as Laagste
     , v.plaats as Plaats
  from Werknemer as w
  join Vestiging as v
    on w.vnaam = v.vnaam
 group by Plaats
 order by Laagste
;
