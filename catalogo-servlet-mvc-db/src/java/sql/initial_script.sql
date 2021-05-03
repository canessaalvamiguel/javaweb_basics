/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Zod
 * Created: May 2, 2021
 */
/*TO CREATE A JAVA DB*/
CREATE TABLE productos(
    id INT NOT NULL GENERATED ALWAYS AS IDENTITY,
    nombre VARCHAR(50),
    precio INT,
    cantidad INT,
    PRIMARY KEY (id)
);
INSERT INTO productos (nombre, precio, cantidad) VALUES ('Panasonic  Pantalla LCD', 259990 , 20 );
INSERT INTO productos (nombre, precio, cantidad) VALUES ('Sony  Cámara digital DSC-W320B', 123490 , 12 );
INSERT INTO productos (nombre, precio, cantidad) VALUES ('Apple  iPod shuffle', 1499990 , 25);
INSERT INTO productos (nombre, precio, cantidad) VALUES ('Sony  Notebook Z110', 37990 , 10 );
INSERT INTO productos (nombre, precio, cantidad) VALUES ('Hewlett Packard  Multifuncional F2280', 69990 , 7 );
INSERT INTO productos (nombre, precio, cantidad) VALUES ('Bianchi  Bicicleta Aro 26', 69990 , 5 );
INSERT INTO productos (nombre, precio, cantidad) VALUES ('Mica  Cómoda 5 Cajones', 299990 , 20 );

