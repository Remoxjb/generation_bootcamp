USE sakila;

SELECT * FROM sakila.payment;

-- COUNT () contar los elementos o las celdas de una columna
-- AS nos permite darle un alias a un nombre temporal a la columna
SELECT COUNT(*) AS cantidad_filas FROM payment;

SELECT COUNT(*) AS cantidad_filas FROM payment WHERE staff_id = 1;

SELECT COUNT(DISTINCT customer_id) FROM payment;

-- contar filas de la tabla world.country

SELECT COUNT(*) FROM world.country;

-- SUM() realiza una suma de los valores de una columna
SELECT SUM(amount) AS total FROM payment WHERE staff_id = 2;


-- Saber cual es el cliente que gasto mas en rentas
-- GROUP BY agrupa filas que tienen los mismo valores cada uno de los valores sin repetir
-- Normalmente se usa en conjunto con COUNT(), AVG(), SUM() 
SELECT customer_id,SUM(amount) AS cliente_mas_osioso FROM payment group by customer_id ORDER BY sum(amount) DESC;
-- manu
SELECT customer_id, SUM(amount) AS total FROM payment GROUP BY customer_id;

-- victor
SELECT SUM(amount), customer_id from payment GROUP BY customer_id ORDER BY amount;

-- ricardo
SELECT customer_id, sum(amount) from payment group by customer_id order by SUM(amount);

-- mijhail
SELECT SUM(amount), customer_id from payment GROUP BY customer_id ORDER BY sum(amount) DESC;

SELECT customer_id FROM payment GROUP BY customer_id;


-- AVG() nos permite obtener un promedio de cantidades en una columna
SELECT AVG(amount) AS promedio FROM payment WHERE customer_id = 248;
