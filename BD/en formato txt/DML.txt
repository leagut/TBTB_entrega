equipos:
INSERT INTO equipos VALUES ('Celtics','Boston','East','Atlantic');
INSERT INTO equipos VALUES ('Raptors','Toronto','East','Atlantic');
INSERT INTO equipos VALUES ('76ers','Philadelphia','East','Atlantic');
INSERT INTO equipos VALUES ('Nets','New Jersey','East','Atlantic');
INSERT INTO equipos VALUES ('Knicks','New York','East','Atlantic');
INSERT INTO equipos VALUES ('Pistons','Detroit','East','Central');
INSERT INTO equipos VALUES ('Cavaliers','Cleveland','East','Central');
INSERT INTO equipos VALUES ('Pacers','Indiana','East','Central');
INSERT INTO equipos VALUES ('Bulls','Chicago','East','Central');
INSERT INTO equipos VALUES ('Bucks','Milwaukee','East','Central');
INSERT INTO equipos VALUES ('Magic','Orlando','East','SouthEast');
INSERT INTO equipos VALUES ('Wizards','Washington','East','SouthEast');
INSERT INTO equipos VALUES ('Hawks','Atlanta','East','SouthEast');
INSERT INTO equipos VALUES ('Bobcats','Charlotte','East','SouthEast');
INSERT INTO equipos VALUES ('Heat','Miami','East','SouthEast');
INSERT INTO equipos VALUES ('Jazz','Utah','West','NorthWest');
INSERT INTO equipos VALUES ('Nuggets','Denver','West','NorthWest');
INSERT INTO equipos VALUES ('Trail Blazers','Portland','West','NorthWest');
INSERT INTO equipos VALUES ('Timberwolves','Minnesota','West','NorthWest');
INSERT INTO equipos VALUES ('Supersonics','Seattle','West','NorthWest');
INSERT INTO equipos VALUES ('Lakers','Los Angeles','West','Pacific');
INSERT INTO equipos VALUES ('Suns','Phoenix','West','Pacific');
INSERT INTO equipos VALUES ('Warriors','Golden State','West','Pacific');
INSERT INTO equipos VALUES ('Kings','Sacramento','West','Pacific');
INSERT INTO equipos VALUES ('Clippers','Los Angeles','West','Pacific');
INSERT INTO equipos VALUES ('Hornets','New Orleans','West','SouthWest');
INSERT INTO equipos VALUES ('Spurs','San Antonio','West','SouthWest');
INSERT INTO equipos VALUES ('Rockets','Houston','West','SouthWest');
INSERT INTO equipos VALUES ('Mavericks','Dallas','West','SouthWest');
INSERT INTO equipos VALUES ('Grizzlies','Memphis','West','SouthWest');

jugadores:
INSERT INTO jugadores VALUES (12345678, 'Carlos', 25, 'Delantero', 30, 198, 'Celtics');
INSERT INTO jugadores VALUES (98765432, 'Luis', 24, 'Centro', 29, 205, 'Raptors');
INSERT INTO jugadores VALUES (13579246, 'Juan', 26, 'Defensa', 31, 199, 'Nets');
INSERT INTO jugadores VALUES (86420971, 'María', 30, 'Delantero', 33, 192, 'Knicks');
INSERT INTO jugadores VALUES (24681357, 'Pedro', 27, 'Centro', 34, 206, 'Pistons');
INSERT INTO jugadores VALUES (78965413, 'Sofía', 29, 'Defensa', 32, 197, 'Cavaliers');
INSERT INTO jugadores VALUES (45612398, 'Eduardo', 28, 'Delantero', 33, 201, 'Pacers');
INSERT INTO jugadores VALUES (32165487, 'Laura', 26, 'Centro', 30, 200, 'Bulls');
INSERT INTO jugadores VALUES (23456789, 'Miguel', 27, 'Defensa', 31, 193, 'Bucks');
INSERT INTO jugadores VALUES (56789123, 'Ana', 29, 'Delantero', 34, 205, 'Magic');
INSERT INTO jugadores VALUES (78912345, 'Diego', 25, 'Centro', 32, 198, 'Wizards');
INSERT INTO jugadores VALUES (65432198, 'Isabel', 28, 'Defensa', 30, 194, 'Hawks');
INSERT INTO jugadores VALUES (45678901, 'Fernando', 30, 'Delantero', 33, 197, 'Bobcats');
INSERT INTO jugadores VALUES (32198765, 'Elena', 26, 'Centro', 31, 199, 'Heat');
INSERT INTO jugadores VALUES (98765012, 'Roberto', 27, 'Defensa', 32, 196, 'Jazz');
INSERT INTO jugadores VALUES (12349876, 'Carmen', 28, 'Delantero', 34, 201, 'Lakers');
INSERT INTO jugadores VALUES (87651234, 'Antonio', 29, 'Centro', 31, 203, 'Spurs');
INSERT INTO jugadores VALUES (76543210, 'Luisa', 25, 'Defensa', 30, 195, 'Mavericks');

partidos:
INSERT INTO partidos VALUES (45128,'estadio','ciudad','0000-00-00');
INSERT INTO partidos VALUES (123456, 'Camp Nou', 'Barcelona', '2023-01-15');
INSERT INTO partidos VALUES (234567, 'Old Trafford', 'Manchester', '2023-02-20');
INSERT INTO partidos VALUES (345678, 'Santiago Bernabéu', 'Madrid', '2023-03-25');
INSERT INTO partidos VALUES (456789, 'Anfield', 'Liverpool', '2023-04-10');
INSERT INTO partidos VALUES (567890, 'Allianz Arena', 'Múnich', '2023-05-05');
INSERT INTO partidos VALUES (678901, 'San Siro', 'Milán', '2023-06-12');
INSERT INTO partidos VALUES (789012, 'Parc des Princes', 'París', '2023-07-18');
INSERT INTO partidos VALUES (890123, 'Wembley Stadium', 'Londres', '2023-08-22');
INSERT INTO partidos VALUES (901234, 'Estadio da Luz', 'Lisboa', '2023-09-30');
INSERT INTO partidos VALUES (123789, 'Signal Iduna Park', 'Dortmund', '2023-10-08');
INSERT INTO partidos VALUES (234890, 'Stadio Olimpico', 'Roma', '2023-11-12');
INSERT INTO partidos VALUES (345901, 'Estadio do Dragão', 'Oporto', '2023-12-25');
INSERT INTO partidos VALUES (456012, 'Johan Cruyff Arena', 'Ámsterdam', '2023-02-14');
INSERT INTO partidos VALUES (567123, 'Estadio José Alvalade', 'Lisboa', '2023-03-10');
INSERT INTO partidos VALUES (678234, 'Estadio Georgios Karaiskakis', 'Atenas', '2023-04-15');
INSERT INTO partidos VALUES (789345, 'Estadio Vodafone Park', 'Estambul', '2023-05-20');
INSERT INTO partidos VALUES (890456, 'Stadion Letná', 'Praga', '2023-06-30');
INSERT INTO partidos VALUES (901567, 'Estadio Ramón Sánchez Pizjuán', 'Sevilla', '2023-07-05');
INSERT INTO partidos VALUES (123678, 'Estadio de la Cerámica', 'Villarreal', '2023-08-10');
INSERT INTO partidos VALUES (234789, 'Estadio José Zorrilla', 'Valladolid', '2023-09-15');


jugadores_partidos:
INSERT INTO jugadores_partidos (idjugadoresfk, idpartidosfk) VALUES
(12345678, 123456),
(12349876, 123456),
(13579246, 123456),
(23456789, 123456),
(24681357, 123456),
(32165487, 123456),
(32198765, 123456),
(12345678, 123456),
(12349876, 123456),
(13579246, 123456),
(23456789, 123456),
(24681357, 123456),
(32165487, 123456),
(32198765, 123456),
(23456789, 123456),
(23456789, 123456),
(32165487, 123456),
(32165487, 123456),
(23456789, 123456),
(12349876, 123456);
