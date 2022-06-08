-- actualizar

-- agregar una columna
ALTER TABLE mascota ADD COLUMN especie VARCHAR(255) NOT NULL;

-- agregar una columna en una posicion especifica
ALTER TABLE mascota ADD COLUMN raza VARCHAR (255) AFTER FK1_persona;

-- midificar las caracteristicas de una columna se tiene que ver se se pueden cambiar 
ALTER TABLE mascota MODIFY edad int;

-- no podemos cambiar el nombre de una columna
ALTER TABLE mascota CHANGE COLUMN edad edadP int NOT NULL;

-- renombrar la tabla
ALTER TABLE mascota RENAME mascotita;

SELECT * FROM mascotita;

-- Acturalizar datos de una fila 
-- forma correcta
UPDATE mascotita SET especie= 'Perro' WHERE mascota_id= 1;

UPDATE mascotita SET especie= 'Perro', edad= 2 Where mascota_id= 2;

-- error 1175: no puedes actualizar si no se selecciona la llave primaria
UPDATE mascotita SET especie = 'Perro' WHERE nombre = 'Zeus';


UPDATE mascotita SET raza = 'Husky' WHERE mascota_id= 1;
UPDATE mascotita SET raza = 'Chihuahua' WHERE mascota_id= 2;