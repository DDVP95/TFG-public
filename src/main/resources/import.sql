/*/* Insert into UserRol */
-- User with Admin role
INSERT INTO `proyectotfg`.`userroles` (`user_id`, `rol_id`) VALUES (1, 1);

-- User with Guest role
INSERT INTO `proyectotfg`.`userroles` (`user_id`, `rol_id`) VALUES (1, 2);

/* Insert into User */

INSERT INTO `proyectotfg`.`users` (`id`, `username`, `password`, `enabled`) VALUES (1, 'Admin', 'master', true);
INSERT INTO `proyectotfg`.`users` (`id`, `username`, `password`, `enabled`) VALUES (2, 'Guest', 'guest', true);

/* Insert into Rol */

INSERT INTO `proyectotfg`.`roles` (`id`, `name`) VALUES (1, 'Admin');
INSERT INTO `proyectotfg`.`roles` (`id`, `name`) VALUES (2, 'Guest');
*/
/* Insert into Fincas */

INSERT INTO `u613094437_proyectotfg`.`fincas` (`idfinca`, `nombre`) VALUES (1, 'Finca-01');
INSERT INTO `proyectotfg`.`fincas` (`idfinca`, `nombre`) VALUES (2, 'Finca-02');
INSERT INTO `proyectotfg`.`fincas` (`idfinca`, `nombre`) VALUES (3, 'Finca-03');
INSERT INTO `proyectotfg`.`fincas` (`idfinca`, `nombre`) VALUES (4, 'Finca-04');
INSERT INTO `proyectotfg`.`fincas` (`idfinca`, `nombre`) VALUES (5, 'Finca-05');
INSERT INTO `proyectotfg`.`fincas` (`idfinca`, `nombre`) VALUES (6, 'Finca-06');
INSERT INTO `proyectotfg`.`fincas` (`idfinca`, `nombre`) VALUES (7, 'Finca-07');
INSERT INTO `proyectotfg`.`fincas` (`idfinca`, `nombre`) VALUES (8, 'Finca-08');
INSERT INTO `proyectotfg`.`fincas` (`idfinca`, `nombre`) VALUES (9, 'Finca-09');
INSERT INTO `proyectotfg`.`fincas` (`idfinca`, `nombre`) VALUES (10, 'Finca-10');
INSERT INTO `proyectotfg`.`fincas` (`idfinca`, `nombre`) VALUES (11, 'Finca-11');
INSERT INTO `proyectotfg`.`fincas` (`idfinca`, `nombre`) VALUES (12, 'Finca-12');
/* Insert into Variedad*/


INSERT INTO `proyectotfg`.`variedades` (`idvariedad`, `nombre`, `idfinca`) VALUES (1,'ARITZA', 1);
INSERT INTO `proyectotfg`.`variedades` (`idvariedad`, `nombre`, `idfinca`) VALUES (2, 'ERREZIL', 1);
INSERT INTO `proyectotfg`.`variedades` (`idvariedad`, `nombre`, `idfinca`) VALUES (3, 'GEZAMINA', 1);
INSERT INTO `proyectotfg`.`variedades` (`idvariedad`, `nombre`, `idfinca`) VALUES (4, 'GOIKOETXE', 1);
INSERT INTO `proyectotfg`.`variedades` (`idvariedad`, `nombre`, `idfinca`) VALUES (5, 'MANTTONI', 1);
INSERT INTO `proyectotfg`.`variedades` (`idvariedad`, `nombre`, `idfinca`) VALUES (6, 'MOKO', 2 );
INSERT INTO `proyectotfg`.`variedades` (`idvariedad`, `nombre`, `idfinca`) VALUES (7, 'MOZULUA', 4);
INSERT INTO `proyectotfg`.`variedades` (`idvariedad`, `nombre`, `idfinca`) VALUES (8, 'PATZOLUA',3 );
INSERT INTO `proyectotfg`.`variedades` (`idvariedad`, `nombre`, `idfinca`) VALUES (9, 'TXALAKA',3 );
INSERT INTO `proyectotfg`.`variedades` (`idvariedad`, `nombre`, `idfinca`) VALUES (10,'UDARE MARROI', 2);
INSERT INTO `proyectotfg`.`variedades` (`idvariedad`, `nombre`, `idfinca`) VALUES (11, 'URDIN SAGARRA', 2);
INSERT INTO `proyectotfg`.`variedades` (`idvariedad`, `nombre`, `idfinca`) VALUES (12, 'URTEBI HANDI', 2);
INSERT INTO `proyectotfg`.`variedades` (`idvariedad`, `nombre`, `idfinca`) VALUES (13, 'URTEBI TXIKI', 5);
INSERT INTO `proyectotfg`.`variedades` (`idvariedad`, `nombre`, `idfinca`) VALUES (14, 'VERDE AGRIA', 6);





/* Insert into Arbol */
/*Insert Arbol into Finca-01*/
INSERT INTO `proyectotfg`.`arboles` ( `fila`, `columna`,`idfinca`, `idvariedad`) VALUES (0, 0, 1, 1);
INSERT INTO `proyectotfg`.`arboles` ( `fila`, `columna`,`idfinca`, `idvariedad`) VALUES (0, 1, 1, 3);
INSERT INTO `proyectotfg`.`arboles` ( `fila`, `columna`,`idfinca`, `idvariedad`) VALUES (1, 1, 1, 3);
INSERT INTO `proyectotfg`.`arboles` ( `fila`, `columna`,`idfinca`, `idvariedad`) VALUES (1, 0, 1, 5);
INSERT INTO `proyectotfg`.`arboles` ( `fila`, `columna`,`idfinca`, `idvariedad`) VALUES (4, 2, 1, 6);
INSERT INTO `proyectotfg`.`arboles` ( `fila`, `columna`,`idfinca`, `idvariedad`) VALUES (5, 3, 1, 7);
INSERT INTO `proyectotfg`.`arboles` ( `fila`, `columna`,`idfinca`, `idvariedad`) VALUES (11, 0, 1, 1);
INSERT INTO `proyectotfg`.`arboles` ( `fila`, `columna`,`idfinca`, `idvariedad`) VALUES (11, 1, 1, 3);
INSERT INTO `proyectotfg`.`arboles` ( `fila`, `columna`,`idfinca`, `idvariedad`) VALUES (12, 1, 1, 3);
INSERT INTO `proyectotfg`.`arboles` ( `fila`, `columna`,`idfinca`, `idvariedad`) VALUES (21, 0, 1, 5);
INSERT INTO `proyectotfg`.`arboles` ( `fila`, `columna`,`idfinca`, `idvariedad`) VALUES (22, 2, 1, 6);
INSERT INTO `proyectotfg`.`arboles` ( `fila`, `columna`,`idfinca`, `idvariedad`) VALUES (23, 3, 1, 7);
INSERT INTO `proyectotfg`.`arboles` ( `fila`, `columna`,`idfinca`, `idvariedad`) VALUES (44, 0, 1, 1);
INSERT INTO `proyectotfg`.`arboles` ( `fila`, `columna`,`idfinca`, `idvariedad`) VALUES (43, 1, 1, 3);
INSERT INTO `proyectotfg`.`arboles` ( `fila`, `columna`,`idfinca`, `idvariedad`) VALUES (31, 1, 1, 3);
INSERT INTO `proyectotfg`.`arboles` ( `fila`, `columna`,`idfinca`, `idvariedad`) VALUES (13, 0, 1, 5);
INSERT INTO `proyectotfg`.`arboles` ( `fila`, `columna`,`idfinca`, `idvariedad`) VALUES (22, 11, 1, 6);
INSERT INTO `proyectotfg`.`arboles` ( `fila`, `columna`,`idfinca`, `idvariedad`) VALUES (5, 12, 1, 7);
INSERT INTO `proyectotfg`.`arboles` ( `fila`, `columna`,`idfinca`, `idvariedad`) VALUES (18, 7, 1, 1);
INSERT INTO `proyectotfg`.`arboles` ( `fila`, `columna`,`idfinca`, `idvariedad`) VALUES (12, 31, 1, 3);
INSERT INTO `proyectotfg`.`arboles` ( `fila`, `columna`,`idfinca`, `idvariedad`) VALUES (1, 33, 1, 3);
INSERT INTO `proyectotfg`.`arboles` ( `fila`, `columna`,`idfinca`, `idvariedad`) VALUES (45, 0, 1, 5);
INSERT INTO `proyectotfg`.`arboles` ( `fila`, `columna`,`idfinca`, `idvariedad`) VALUES (50, 2, 1, 6);
INSERT INTO `proyectotfg`.`arboles` ( `fila`, `columna`,`idfinca`, `idvariedad`) VALUES (40, 13, 1, 7);
INSERT INTO `proyectotfg`.`arboles` ( `fila`, `columna`,`idfinca`, `idvariedad`) VALUES (17, 12, 1, 1);

/*Insert Arbol into Finca-02*/
INSERT INTO `proyectotfg`.`arboles` ( `fila`, `columna`,`idfinca`, `idvariedad`) VALUES (0, 0, 2, 4);
INSERT INTO `proyectotfg`.`arboles` ( `fila`, `columna`,`idfinca`, `idvariedad`) VALUES (1, 2, 2, 4);
INSERT INTO `proyectotfg`.`arboles` ( `fila`, `columna`,`idfinca`, `idvariedad`) VALUES (3, 3, 2, 4);
INSERT INTO `proyectotfg`.`arboles` ( `fila`, `columna`,`idfinca`, `idvariedad`) VALUES (1, 2, 2, 4);
INSERT INTO `proyectotfg`.`arboles` ( `fila`, `columna`,`idfinca`, `idvariedad`) VALUES (0, 1, 2, 4);
/*Insert Arbol into Finca-03*/
INSERT INTO `proyectotfg`.`arboles` ( `fila`, `columna`,`idfinca`, `idvariedad`) VALUES (0, 2, 3, 2);
INSERT INTO `proyectotfg`.`arboles` ( `fila`, `columna`,`idfinca`, `idvariedad`) VALUES (0, 3, 3, 3);
INSERT INTO `proyectotfg`.`arboles` ( `fila`, `columna`,`idfinca`, `idvariedad`) VALUES (1, 1, 3, 5);
INSERT INTO `proyectotfg`.`arboles` ( `fila`, `columna`,`idfinca`, `idvariedad`) VALUES (2, 2, 3, 6);
INSERT INTO `proyectotfg`.`arboles` ( `fila`, `columna`,`idfinca`, `idvariedad`) VALUES (1, 2, 3, 10);
INSERT INTO `proyectotfg`.`arboles` ( `fila`, `columna`,`idfinca`, `idvariedad`) VALUES (3, 3, 3, 12);
INSERT INTO `proyectotfg`.`arboles` ( `fila`, `columna`,`idfinca`, `idvariedad`) VALUES (1, 2, 3, 13);
INSERT INTO `proyectotfg`.`arboles` ( `fila`, `columna`,`idfinca`, `idvariedad`) VALUES (0, 1, 3, 14);
/*Insert Arbol into Finca-04*/
INSERT INTO `proyectotfg`.`arboles` ( `fila`, `columna`,`idfinca`, `idvariedad`) VALUES (6, 2, 4, 5);
INSERT INTO `proyectotfg`.`arboles` ( `fila`, `columna`,`idfinca`, `idvariedad`) VALUES (0, 3, 4, 5);
INSERT INTO `proyectotfg`.`arboles` ( `fila`, `columna`,`idfinca`, `idvariedad`) VALUES (1, 1, 4, 5);
INSERT INTO `proyectotfg`.`arboles` ( `fila`, `columna`,`idfinca`, `idvariedad`) VALUES (2, 2, 4, 6);
INSERT INTO `proyectotfg`.`arboles` ( `fila`, `columna`,`idfinca`, `idvariedad`) VALUES (1, 2, 4, 6);
INSERT INTO `proyectotfg`.`arboles` ( `fila`, `columna`,`idfinca`, `idvariedad`) VALUES (3, 3, 4, 5);
INSERT INTO `proyectotfg`.`arboles` ( `fila`, `columna`,`idfinca`, `idvariedad`) VALUES (1, 2, 4, 5);
INSERT INTO `proyectotfg`.`arboles` ( `fila`, `columna`,`idfinca`, `idvariedad`) VALUES (0, 1, 4, 6);
/*Insert Arbol into Finca-05*/
INSERT INTO `proyectotfg`.`arboles` ( `fila`, `columna`,`idfinca`, `idvariedad`) VALUES (3, 2, 5, 4);
INSERT INTO `proyectotfg`.`arboles` ( `fila`, `columna`,`idfinca`, `idvariedad`) VALUES (0, 3, 5, 3);
INSERT INTO `proyectotfg`.`arboles` ( `fila`, `columna`,`idfinca`, `idvariedad`) VALUES (1, 1, 5, 2);
INSERT INTO `proyectotfg`.`arboles` ( `fila`, `columna`,`idfinca`, `idvariedad`) VALUES (2, 2, 5, 3);
INSERT INTO `proyectotfg`.`arboles` ( `fila`, `columna`,`idfinca`, `idvariedad`) VALUES (1, 2, 5, 3);
INSERT INTO `proyectotfg`.`arboles` ( `fila`, `columna`,`idfinca`, `idvariedad`) VALUES (3, 3, 5, 3);
INSERT INTO `proyectotfg`.`arboles` ( `fila`, `columna`,`idfinca`, `idvariedad`) VALUES (1, 2, 5, 3);
INSERT INTO `proyectotfg`.`arboles` ( `fila`, `columna`,`idfinca`, `idvariedad`) VALUES (0, 1, 5, 3);
/*Insert Arbol into Finca-06*/
INSERT INTO `proyectotfg`.`arboles` ( `fila`, `columna`,`idfinca`, `idvariedad`) VALUES (5, 2, 6, 2);
INSERT INTO `proyectotfg`.`arboles` ( `fila`, `columna`,`idfinca`, `idvariedad`) VALUES (0, 3, 6, 3);
INSERT INTO `proyectotfg`.`arboles` ( `fila`, `columna`,`idfinca`, `idvariedad`) VALUES (1, 1, 6, 5);
INSERT INTO `proyectotfg`.`arboles` ( `fila`, `columna`,`idfinca`, `idvariedad`) VALUES (2, 2, 6, 6);
INSERT INTO `proyectotfg`.`arboles` ( `fila`, `columna`,`idfinca`, `idvariedad`) VALUES (1, 2, 6, 10);
INSERT INTO `proyectotfg`.`arboles` ( `fila`, `columna`,`idfinca`, `idvariedad`) VALUES (3, 3, 6, 12);
INSERT INTO `proyectotfg`.`arboles` ( `fila`, `columna`,`idfinca`, `idvariedad`) VALUES (1, 2, 6, 13);
INSERT INTO `proyectotfg`.`arboles` ( `fila`, `columna`,`idfinca`, `idvariedad`) VALUES (0, 1, 6, 14);






/* Insert into Fotografia */

/* Insert into Fotografia */
INSERT INTO `proyectotfg`.`fotografias` (`idfotografia`, `idarbol` ,`image_Url`)VALUES (1, 1, 'https://t.ly/3VPhp');
INSERT INTO `proyectotfg`.`fotografias` (`idfotografia`, `idarbol`, `image_Url`) VALUES (2, 2, "https://t.ly/WYQx8");
INSERT INTO `proyectotfg`.`fotografias` (`idfotografia`, `idarbol` ,`image_Url`)VALUES (3, 3, 'https://www.petritegi.com/assets/img/productos/manzanas-txalaka.jpg');





/*Insert into ArbolTratamiento'*/
INSERT INTO `proyectotfg`.`arboltratamientos` (`idarboltratamiento`, `fecha`,`idarbol`, `idtratamiento`) VALUES (1, '2021/10/01', 1, 1);
INSERT INTO `proyectotfg`.`arboltratamientos` (`idarboltratamiento`, `fecha`,`idarbol`, `idtratamiento`) VALUES (2, '2023/07/01', 1, 2);
INSERT INTO `proyectotfg`.`arboltratamientos` (`idarboltratamiento`, `fecha`,`idarbol`, `idtratamiento`) VALUES (3, '2023/06/01', 1, 1);
INSERT INTO `proyectotfg`.`arboltratamientos` (`idarboltratamiento`, `fecha`,`idarbol`, `idtratamiento`) VALUES (4, '2022/01/01', 1, 3);
INSERT INTO `proyectotfg`.`arboltratamientos` (`idarboltratamiento`, `fecha`,`idarbol`, `idtratamiento`) VALUES (5, '2022/02/01', 1, 4);

/*Insert into TratamientoFinca*/
INSERT INTO `proyectotfg`.`tratamientofincas` (`idtratamientofinca`, `fecha`, `idtratamiento`, `idfinca` ) VALUES (1, '2019/10/01', 1, 1);
INSERT INTO `proyectotfg`.`tratamientofincas` (`idtratamientofinca`, `fecha`, `idtratamiento`, `idfinca` ) VALUES (2, '2013/10/01', 4, 2);
INSERT INTO `proyectotfg`.`tratamientofincas` (`idtratamientofinca`, `fecha`, `idtratamiento`, `idfinca` ) VALUES (3, '2011/10/01', 3, 3);
INSERT INTO `proyectotfg`.`tratamientofincas` (`idtratamientofinca`, `fecha`, `idtratamiento`, `idfinca` ) VALUES (4, '2021/10/01', 2, 1);

/*Insert into VariedadTratamientoFinca*/
INSERT INTO `proyectotfg`.`variedadtratamientofincas` (`idvariedadtratamientofinca`, `fecha`,`idvariedad`, `idfinca`, `idtratamiento` ) VALUES (1, '2019/10/01', 1, 1, 1);
INSERT INTO `proyectotfg`.`variedadtratamientofincas` (`idvariedadtratamientofinca`, `fecha`,`idvariedad`, `idfinca`, `idtratamiento` ) VALUES (2, '2017/10/01', 2, 1, 2);
INSERT INTO `proyectotfg`.`variedadtratamientofincas` (`idvariedadtratamientofinca`, `fecha`,`idvariedad`, `idfinca`, `idtratamiento` ) VALUES (3, '2014/10/01', 3, 1, 3);




/* Insert into Recoleccion*/
INSERT INTO `proyectotfg`.`recolecciones` (`idrecoleccion`, `fecha`, `idfinca`, `idvariedad`) VALUES (1, '2020/03/01', 1, 1);
INSERT INTO `proyectotfg`.`recolecciones` (`idrecoleccion`, `fecha`, `idfinca`, `idvariedad`) VALUES (2, '2021/06/02', 2, 1);
INSERT INTO `proyectotfg`.`recolecciones` (`idrecoleccion`, `fecha`, `idfinca`, `idvariedad`) VALUES (3, '2022/09/03', 3, 1);
INSERT INTO `proyectotfg`.`recolecciones` (`idrecoleccion`, `fecha`, `idfinca`, `idvariedad`) VALUES (4, '2020/03/01', 4, 1);
INSERT INTO `proyectotfg`.`recolecciones` (`idrecoleccion`, `fecha`, `idfinca`, `idvariedad`) VALUES (5, '2021/06/02', 5, 1);
INSERT INTO `proyectotfg`.`recolecciones` (`idrecoleccion`, `fecha`, `idfinca`, `idvariedad`) VALUES (6, '2022/09/03', 6, 1);




/* Insert into Reposicion*/

INSERT INTO `proyectotfg`.`reposiciones` (`idreposicion`, `fecha`, `idarbol`) VALUES (1, '2020/03/02', 1);
INSERT INTO `proyectotfg`.`reposiciones` (`idreposicion`, `fecha`, `idarbol`) VALUES (2, '2021/06/03', 1);
INSERT INTO `proyectotfg`.`reposiciones` (`idreposicion`, `fecha`, `idarbol`) VALUES (3, '2022/09/04', 1);
INSERT INTO `proyectotfg`.`reposiciones` (`idreposicion`, `fecha`, `idarbol`) VALUES (4, '2020/03/02', 1);
INSERT INTO `proyectotfg`.`reposiciones` (`idreposicion`, `fecha`, `idarbol`) VALUES (5, '2021/06/03', 1);
INSERT INTO `proyectotfg`.`reposiciones` (`idreposicion`, `fecha`, `idarbol`) VALUES (6, '2022/09/04', 1);

/* Insert into Tratamiento*/
INSERT INTO `proyectotfg`.`tratamientos` ( `nombre`, `fecha`) VALUES ("Protección invernal", '2020/03/01');
INSERT INTO `proyectotfg`.`tratamientos` (`nombre`, `fecha`) VALUES ("Control de malezas", '2020/03/01');
INSERT INTO `proyectotfg`.`tratamientos` ( `nombre`, `fecha`) VALUES ("Mulching", '2020/03/01');
INSERT INTO `proyectotfg`.`tratamientos` ( `nombre`, `fecha`) VALUES ("Prevención de enfermedades", '2020/03/01');
INSERT INTO `proyectotfg`.`tratamientos` (`nombre`, `fecha`) VALUES ("Control de plagas", '2020/03/01');
INSERT INTO `proyectotfg`.`tratamientos` (`nombre`, `fecha`) VALUES ("Riego adecuado", '2020/03/01');
INSERT INTO `proyectotfg`.`tratamientos` ( `nombre`, `fecha`) VALUES ("Fertilización", '2020/03/01');
INSERT INTO `proyectotfg`.`tratamientos` ( `nombre`, `fecha`) VALUES ("Poda regular", '2020/08/03');


