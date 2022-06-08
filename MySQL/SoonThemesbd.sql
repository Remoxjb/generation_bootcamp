CREATE DATABASE soonthemesdb;
USE soonthemesdb;
CREATE table usuarioCreador(
ID int auto_increment,
nombre varchar(150)not null,
apellido varchar(150) not null,
nombreDeUsuario varchar(150) not null,
email varchar(150) not null unique,
contrasenia text not null,
primary key(ID)
);

create table producto(
ID int auto_increment,
ID_usuarioCreador int not null,
nombre varchar(150) not null,
categoria varchar (150) not null,
costo decimal (5,2) not null,
fechaDeCreacion date not null,
secciones varchar (250) not null,
formularios varchar(250) not null,
stock boolean not null,
tienda boolean not null,
galeria boolean not null,
primary key (ID),
foreign key (ID_usuarioCreador) references usuariocreador(ID)
);

create table usuario(
ID int auto_increment,
nombre varchar(150) not null,
apellido varchar(150) not null,
nombreUsuario varchar(150) not null,
email varchar(150) not null unique,
contrasenia text not null,
primary key (ID)
);

CREATE TABLE recibocompra(
	ID int AUTO_INCREMENT,
    fecha DATE NOT NULL,
    ID_usuario int NOT NULL,
    ID_producto int NOT NULL,
    PRIMARY KEY (ID),
    FOREIGN KEY (ID_usuario) REFERENCES usuario(ID),
    FOREIGN KEY (ID_producto) REFERENCES producto(ID)
);

insert into usuarioCreador( nombre, apellido, nombreDeUsuario, email, contrasenia) values 
('Marco Aurelio', 'Campos', 'marquiCam', 'aurelie.marquie@outlook.com', 'marco12345');

insert into usuarioCreador( nombre, apellido, nombreDeUsuario, email, contrasenia) values 
('Alejandro', 'Andrade', 'AleRangel', 'ale.andrade.rangel@gmail.com', 'ale123456');

insert into usuarioCreador( nombre, apellido, nombreDeUsuario, email, contrasenia) values 
('Juan', 'Badillo', 'remoxJB', 'juan.badillo.v@gmail.com', 'jb123456');

insert into usuarioCreador( nombre, apellido, nombreDeUsuario, email, contrasenia) values
('Alexander', 'Tovar', 'Alex024', 'alexander.tovar@gmail.com', 'aleX9803' );

insert into usuarioCreador( nombre, apellido, nombreDeUsuario, email, contrasenia) values
('Daniel', 'Perez', 'DansPrz', 'danielprz.098@gmail.com', 'dan1234567' );

insert into usuarioCreador( nombre, apellido, nombreDeUsuario, email, contrasenia) values
('Eduardo', 'Delafe', 'MrCreative', 'defaultemail@gmail.com', 'mka%$W_<joos' );

insert into producto(ID_usuarioCreador,nombre,categoria,costo,fechaDeCreacion,secciones,formularios,stock,tienda,galeria) values 
(6,'Ulala Chulada', 'Nuevos', 500.00, '2022-05-25', '5','3',false,false,false);

insert into producto(ID_usuarioCreador,nombre,categoria,costo,fechaDeCreacion,secciones,formularios,stock,tienda,galeria) values 
(1,'Primer Tema','Blog', 100.00, '2022-06-02','5','3',false,false,false),
(6, 'Ulala Chulada','Nuevos', 500.00,'2022-05--25','5','3',false,false,false),
(3,'De lo mejor', 'Populares', 300.00, '2022-05-30', '4','2',false,false,false),
(2,'Hogar', 'Diseño', 600.00, '2022-06-01', '3','1',false,false,false),
(4,'Tienda', 'E-commerce', 800.00, '2022-03-22', '7','4',false,false,false),
(5,'Home', 'Inicio', 700.00, '2022-04-15', '4','1',false,false,false),
(1,'Moda', 'Populares', 500.00, '2022-01-06', '5','3',false,false,false),
(3,'Menú', 'E-commerce', 700.00, '2022-05-15', '8','1',false,false,false),
(2,'Tecnología', 'Diseño', 550.00, '2022-02-10', '9','2',false,false,false),
(6,'Arquitectura', 'Blog', 900.00, '2022-03-30', '3','1',false,false,false)
;

insert into usuario(nombre, apellido, nombreUsuario, email, contrasenia) values
('Arturo', 'Gonzalez', 'Artur1020', 'arturo.gon@hotmail.com', 'delfin1410'),
('Mario', 'Hernandez', '1510Mar', 'marrrr9867@hotmail.com', 'KSXNA55'),
('Carlos', 'Sanchez', 'pick675', 'carl3456@hotmail.com', 'bjbHB5'),
('Ana', 'Vargas', 'nena3410', '343ana324@hotmail.com', '151fdvbadsv'),
('Gerardo', 'Huerta', 'geral_23', 'ger_90@hotmail.com', 'gerardohuerta65'),
('Sofia', 'Alvarez', 'sof15po', '34_jnjndj@hotmail.com', 'alvarez345_'),
('Maria', 'Contreras', 'aski9810', '333_maria@hotmail.com', 'marl_90'),
('Santiago', 'Ferra', 'santtttt1234', 'santiferra_89@hotmail.com', 'dvqew$%%'),
('Alexa', 'Salazar', 'lexxxxx98', 'alex4567_0@hotmail.com', 'E###4edfe'),
('Fernando', 'Diaz', 'ferchito_09876', 'fercho_90@hotmail.com', 'vdedv#"#$');

-- datos para tabla recibocompraproducto

insert into recibocompra(fecha, ID_usuario, ID_producto) values
('2022-01-25', '4', '5'),
('2022-05-30', '6', '4'),
('2022-03-10', '7', '3'),
('2022-04-09', '2', '10'),
('2021-07-05', '9', '7'),
('2021-10-24', '4', '5'),
('2021-09-15', '3', '1'),
('2021-08-29', '10', '8'),
('2021-02-06', '1', '1'),
('2021-01-01', '4', '2');

-- JOIN
SELECT
usuario.nombre,
usuario.ID as usuario_ID,
recibocompra.ID as recibo_ID,
producto.nombre as Nombre_Diseño,
producto.costo
FROM usuario
inner join recibocompra on recibocompra.ID = usuario.ID
inner join producto on producto.ID = recibocompra.ID;
