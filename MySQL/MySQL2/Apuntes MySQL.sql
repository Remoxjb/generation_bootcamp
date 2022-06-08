CREATE DATABASE generation_bootcamp;

USE generation_bootcamp;

CREATE TABLE cohorte12(cohorte12_id int NOT NULL auto_increment, alumno_id int NOT NULL, PRIMARY KEY(cohorte12_id));

-- Este es un comentario de una linea

/*
Comentarios de mas 
de una line
*/
INSERT INTO `generation_bootcamp`.`cohorte12` (`alumno_id`) VALUES (123);
INSERT INTO `generation_bootcamp`.`cohorte12` (`alumno_id`) VALUES (40);

ALTER TABLE `generation_bootcamp`.`cohorte12` 
ADD COLUMN `instructor_id` INT NOT NULL AFTER `alumno_id`,
ADD COLUMN `numero_alumnos` INT NOT NULL AFTER `instructor_id`,
ADD COLUMN `horario` CHAR(10) NOT NULL AFTER `numero_alumnos`,
ADD COLUMN `tipo_sesiones` VARCHAR(255) NOT NULL AFTER `horario`,
ADD COLUMN `ciudad` VARCHAR(225) NOT NULL AFTER `tipo_sesiones`;