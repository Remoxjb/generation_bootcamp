USE tienda;

-- JOINS nos permiten combinar datos de distntas tablas

-- INNER JOIN union interna
-- solamente nos trae las filas donde hay valores validos
-- Omite las filas donde hay NULL
SELECT
categoria.nombre AS categoria,
producto.nombre AS producto
FROM producto
INNER JOIN categoria ON categoria.idCategoria = producto.idCategoria;

USE sakila;

select 
p.idProducto as clave,
p.nombre AS producto,
p.idCategoria,
c.nombre AS categoria 
from producto p
inner join categoria c
on p.idCategoria = c.idCategoria
order by clave;

-- direcriones de cada pais
/*
address - addrees / city_id
city - city_id/city/country_id
country - country/country_id
*/
SELECT
country.country_id as ID_Pais,
country.country AS Pais,
city.city_id AS ID_Ciudad,
city.city AS Ciudad,
address.address AS Direccion
FROM country
INNER JOIN city ON city.country_id = country.country_id
INNER JOIN address ON address.city_id = city.city_id;

SELECT
country.country_id as ID_Pais,
country.country AS Pais,
city.city_id AS ID_Ciudad,
city.city AS Ciudad,
address.address AS Direccion
FROM city
INNER JOIN country ON country.country_id = city.country_id
INNER JOIN address ON address.city_id = city.city_id;

SELECT * FROM tienda.cliente;

-- LEFT JOIN
-- Siempre incluye las filas que hay en la primer tabla valor NULL 
SELECT 
cliente.nombre AS Nombre,
factura.idFactura
FROM cliente
left join factura on cliente.idCliente = factura.idCliente
order by nombre;

-- Rigth JOIN
-- siempre incluye las filas que estan a la derecha
SELECT 
cliente.nombre AS Nombre,
factura.idFactura
FROM cliente
right join factura on cliente.idCliente = factura.idCliente
order by idFactura;