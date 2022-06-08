-- crear

-- crear una base de datos
-- CREATE DATABASE familia;
CREATE SCHEMA familia;

-- seleccionar base de datos
USE familia;

-- crear tabla de persona, ES NECESARIO PONER MINIMO UNA COLUMNA
-- no es necesario poner NOT NULL en la llave primaria
-- por defecto el valor asignado es NULL
-- debes especificar cual es la llave primaria
-- para agregar valores unicos se utiliza UNIQUE

CREATE TABLE persona (
persona_id int AUTO_INCREMENT,
nombre VARCHAR (255) NOT NULL,
correo VARCHAR (255) NOT NULL,
edad int NOT NULL,
estado VARCHAR (255) DEFAULT "Desconocido",
cumpleanios DATE,
PRIMARY KEY (persona_id),
CONSTRAINT correo_unico UNIQUE(correo)
);

USE familia;

-- insertar datos en una tabla
-- los datos de los valores tienen que ser en el orden indicado antes
INSERT INTO persona(nombre,correo,edad,estado,cumpleanios) values 
('Juan', 'juan@gmail.com', 30, 'Respiro', '1991-07-05'),
('Goku', 'goku@gmail.com', 35, 'Super sayayin', '1986-08-31');

-- error 1062: dato unico repetido no genera un ID
INSERT INTO persona(nombre,correo,edad,estado,cumpleanios) values
('Vegeta', 'goku@gmail.com', 36, 'Furioso', '1984-05-28');

-- error 1364: No llenar un dato NOT NULL
INSERT INTO persona (correo,edad,estado,cumpleanios) VALUES 
('vegeta@gmail.com', 36, 'Furioso','1984-05-28');

-- ingresar datos que no son necesarios
INSERT INTO persona(nombre,correo,edad,estado) VALUES
('Vegeta','vegeta@gmail.com', 36, 'Furioso');

-- ingresar dato con valor por defecto
INSERT INTO persona(nombre,correo,edad,cumpleanios) VALUES 
('Gohan','gohan@gmail.com', 18, '2004-03-15');

SELECT * FROM persona;

CREATE TABLE mascota(
mascota_id int AUTO_INCREMENT,
nombre VARCHAR (255) NOT NULL,
edad int NOT NULL,
FK1_persona int NOT NULL,
PRIMARY KEY (mascota_id),
FOREIGN KEY(FK1_persona) REFERENCES persona(persona_id)  
ON DELETE CASCADE
ON UPDATE CASCADE
);

SELECT * FROM mascota;

-- a una mascota crear una persona y asignar el id de la persona para la llave foranea
INSERT INTO mascota(nombre,edad,FK1_persona) VALUES 
('Zeus', 4,1);

INSERT INTO mascota (nombre,edad,FK1_persona) VALUES
('Copo', 1,1);

INSERT INTO mascota(nombre,edad,FK1_persona) VALUES
('Atom',4,2),
('Goliat',2,4);