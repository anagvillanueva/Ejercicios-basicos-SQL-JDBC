create database if not exists proyecto; -- Crea la BD proyecto si no existe
use proyecto; -- Usar la BD ejemplo 
drop table if exists clientes; -- Elimina la tabla clientes si existe 

CREATE TABLE `clientes` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `primer_nombre` varchar(64) DEFAULT NULL,
  `ap_paterno` varchar(64) DEFAULT NULL,
  `ap_materno` varchar(64) DEFAULT NULL,
  `email` varchar(64) DEFAULT NULL,
  `saldo` DECIMAL(10,2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

INSERT INTO `clientes` (`id`,`primer_nombre`,`ap_paterno`,`ap_materno`,`email`,`saldo`) VALUES (1,'Maria','Gutierrez','Cruz','mar.doe@platzi.com', 55000.00);
INSERT INTO `clientes` (`id`,`primer_nombre`,`ap_paterno`,`ap_materno`,`email`,`saldo`) VALUES (2,'Enrique','Hernandez','Rojas','enrique_h@platzi.com', 75800.00);
INSERT INTO`clientes` (`id`,`primer_nombre`,`ap_paterno`,`ap_materno`,`email`,`saldo`) VALUES (3,'Freddy','Vega','Cervantes','fredy@platzi.com', 170000.00);

INSERT INTO `clientes` (`id`,`primer_nombre`,`ap_paterno`,`ap_materno`,`email`,`saldo`) VALUES (4,'Diego','Lechuga','Pimentel','dieguito@platzi.com', 320000.00);
INSERT INTO `clientes` (`id`,`primer_nombre`,`ap_paterno`,`ap_materno`,`email`,`saldo`) VALUES (5,'Emilio','Peñaloza','Morales','emmi@platzi.com', 75000.00);
INSERT INTO `clientes` (`id`,`primer_nombre`,`ap_paterno`,`ap_materno`,`email`,`saldo`) VALUES (6,'Fernanda','Siordia','Torres','fer.st@platzi.com', 700000.00);

INSERT INTO `clientes` (`id`,`primer_nombre`,`ap_paterno`,`ap_materno`,`email`,`saldo`) VALUES (7,'Adams','Serrano','Feria','adams45@platzi.com', 50040.00);
INSERT INTO `clientes` (`id`,`primer_nombre`,`ap_paterno`,`ap_materno`,`email`,`saldo`) VALUES (8,'Mariela','Lopez','Gutierrez','mariela_lop@platzi.com', 57800.00);
INSERT INTO `clientes` (`id`,`primer_nombre`,`ap_paterno`,`ap_materno`,`email`,`saldo`) VALUES (9,'Thomas','Villanueva','Narciso','thommy@platzi.com', 81000.00);

INSERT INTO `clientes` (`id`,`primer_nombre`,`ap_paterno`,`ap_materno`,`email`,`saldo`)VALUES (10,'Marco','Zamudio','Guerrero','zam.guerr@platzi.com', 4500.00);
INSERT INTO `clientes` (`id`,`primer_nombre`,`ap_paterno`,`ap_materno`,`email`,`saldo`) VALUES (11,'Juan','Velasco','Merino','juanfeliz@platzi.com', 6000.00);
INSERT INTO `clientes` (`id`,`primer_nombre`,`ap_paterno`,`ap_materno`,`email`,`saldo`) VALUES (12,'Leonardo','Garcia','Natal','loe.gar78@platzi.com', 1200.00);

