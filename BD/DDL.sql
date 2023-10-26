CREATE TABLE `equipos` (
  `nombre` varchar(40) NOT NULL,
  `ciudad` varchar(45) NOT NULL,
  `conferencia` varchar(45) NOT NULL,
  `division` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`nombre`),
  UNIQUE KEY `nombre_UNIQUE` (`nombre`)
) ;

CREATE TABLE `jugadores` (
  `dni` int NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `edad` int NOT NULL,
  `posicion` varchar(45) NOT NULL,
  `puntos_anotados` int NOT NULL,
  `altura` int DEFAULT '170',
  `idequipo` varchar(45) NOT NULL,
  PRIMARY KEY (`dni`),
  UNIQUE KEY `dni_UNIQUE` (`dni`),
  KEY `idequipo_fk_idx` (`idequipo`),
  CONSTRAINT `idequipo_fk` FOREIGN KEY (`idequipo`) REFERENCES `equipos` (`nombre`) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE `partidos` (
  `idpartidos` int NOT NULL,
  `estadio` varchar(45) NOT NULL,
  `ciudad` varchar(45) NOT NULL,
  `fecha` date NOT NULL,
  PRIMARY KEY (`idpartidos`)
);


CREATE TABLE `jugadores_partidos` (
  `idjugadores_partidos` int NOT NULL AUTO_INCREMENT,
  `idjugadoresfk` int NOT NULL,
  `idpartidosfk` int NOT NULL,
  PRIMARY KEY (`idjugadores_partidos`),
  KEY `jugadores_fk_idx` (`idjugadoresfk`),
  KEY `partidos_fk_idx` (`idpartidosfk`),
  CONSTRAINT `jugadores_fk` FOREIGN KEY (`idjugadoresfk`) REFERENCES `jugadores` (`dni`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `partidos_fk` FOREIGN KEY (`idpartidosfk`) REFERENCES `partidos` (`idpartidos`) ON DELETE CASCADE ON UPDATE CASCADE
);