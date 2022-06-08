-- Borrar

SELECT * FROM mascotita;

-- borrar una fila
DELETE FROM mascotita WHERE mascotA_ID=6;

-- borrar una columna borra sin preguntar nada
ALTER TABLE mascotita DROP COLUMN raza;

-- borrar una tabla
DROP TABLE mascotita;

-- borrar la base de datos
DROP DATABASE familia;