-- LEER 

-- muestra las bases de datos que tenemos
SHOW DATABASES;

-- seleccionar la base de datos a usar
USE sakila;

-- leer los datos de una tabla
SELECT * FROM actor;
SELECT * FROM city;

-- leer partes de una tabla
SELECT city_id, city FROM city;

-- READ LO CHIDORI

-- limitar la cantidad de datos
SELECT * FROM actor LIMIT 10;

-- Ordenar los datos dependiendo de una columna ASCENDENTE ASC
SELECT * FROM city ORDER BY city ASC;

-- Ordenar los datos dependiendo de una columna de forma descendiente
SELECT * FROM city ORDER BY country_id DESC;


/*
Operadores de comparacion

	Igual 			=
	Distinto		!=
    Mayor 			>
    Menor			<
    Mayor o igual 	>=
    Menor o igual	<=
    Como			LIKE
*/
SELECT * FROM city WHERE city = 'Cuman';
SELECT * FROM actor WHERE first_name = 'Penelope';

SELECT * FROM actor WHERE first_name != 'Penelope';

SELECT * FROM actor WHERE actor_id >50;

SELECT * FROM actor WHERE actor_id <100;

SELECT * FROM actor WHERE actor_id >=50;

SELECT * FROM actor WHERE actor_id <=100;

SELECT * FROM actor WHERE first_name LIKE 'Penelope';

-- se utiliza para realizar busqueda
-- seleciona de la tabla todas las personas que terminen su first_name con ope 
SELECT * FROM actor WHERE first_name LIKE '%ope';
SELECT * FROM actor WHERE first_name LIKE '%an';

-- Comodines
-- seleccionar de la tabla todas las persona cuyo first_name empiece con "an"
SELECT * FROM actor WHERE first_name LIKE 'an%';

-- Selecionar de la tabla a todas las personas cuyo first_name contengan "n" la mas utilizada
SELECT * FROM actor WHERE first_name LIKE '%nn%';

-- Seleccionar un patron
SELECT * FROM actor WHERE first_name LIKE '%a__e%';

-- NOT LIKE negado de otro
SELECT * FROM actor WHERE first_name NOT LIKE '%a__e%'; 


-- Uniendo todo
SELECT * FROM actor WHERE first_name LIKE '%nn%' ORDER BY last_name  ASC LIMIT 5;

/*
Operadores Lógicos
AND			Debe cumplir ambas condiciones
OR			Basta con que cumpla una de ellas

*/

SELECT * FROM actor WHERE actor_id > 50 AND first_name LIKE '%n%';

SELECT * FROM actor WHERE first_name LIKE '%n%' OR first_name LIKE '%m%';