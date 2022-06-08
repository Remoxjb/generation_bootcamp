drop database mundo;

USE world;

SELECT 5 + 5 ;

SELECT * FROM country;

-- es para selecionar una columna en especifico pones backtips
SELECT `Name`, population FROM country ORDER BY population ASC; 

SELECT * FROM country WHERE `Name` = 'Mexico';

SELECT * FROM country WHERE population > 50000000 and population < 70000000 order by population;

-- between regresa datos dentro de un ranfo que nosotros especificamos
SELECT * FROM country WHERE population not between 50000000 and 70000000 order by population;

SELECT * FROM country WHERE continent = 'Asia' or continent = 'North America' or continent = 'Oceania' order by Continent;

SELECT * FROM country WHERE continent IN  ('Asia','North America', 'Oceania') order by continent;

SELECT `code`, `name`, region, continent, surfacearea, LifeExpectancy, GNP FROM country WHERE continent IN ('North America', 'Asia', 'Oceania') OR region IN ('Caribean', 'Central America') ORDER BY GNP ASC;

-- buscar un patron especifico
-- '_' especificamos un solo caracter
-- '%' busque cualquier caracteres
SELECT * FROM country WHERE `Name` LIKE '%and'; 
SELECT * FROM country WHERE `Name` LIKE '%e__a'; 

-- DISTINCT seleecionar los elementos distintos dentro de una lista de valores repetidos
SELECT DISTINCT continent FROM country;