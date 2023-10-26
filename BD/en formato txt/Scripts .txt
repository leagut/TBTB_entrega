Implementación de dos o más consultas donde se ejecute las cláusulas:


INNER JOIN:
1)
detalles de los jugadores que participaron en un partido en un estadio específico:
SELECT jugadores.nombre,jugadores.edad,jugadores.dni , partidos.estadio
FROM jugadores
INNER JOIN jugadores_partidos ON jugadores.dni = jugadores_partidos.idjugadoresfk
INNER JOIN partidos ON jugadores_partidos.idpartidosfk = partidos.idpartidos
WHERE partidos.estadio = 'Camp Nou';
2)
muestra todos los jugadores y la información de su equipo:
SELECT jugadores.*, equipos.*
FROM jugadores
INNER JOIN equipos ON jugadores.idequipo = equipos.nombre;


LEFT JOIN:
1)
muestra todos los equipos y la cantidad de jugadores que tienen:
SELECT equipos.nombre, COUNT(jugadores.idequipo) AS cantidad_jugadores
FROM equipos
LEFT JOIN jugadores ON equipos.nombre = jugadores.idequipo
GROUP BY equipos.nombre;
2)
muestrra los equipos que tienen jugadores y los que no los mostrara en null
SELECT equipos.nombre AS nombre_equipo, jugadores.nombre AS nombre_jugador
FROM equipos
LEFT JOIN jugadores ON equipos.nombre = jugadores.idequipo;

UNION :
1)
scrip que combina nombres de jugadores de dos equipos diferentes en un solo lugar
SELECT nombre AS nombre_jugador
FROM jugadores
WHERE idequipo = 'Nets'
UNION
SELECT nombre AS nombre_jugador
FROM jugadores
WHERE idequipo = 'Lakers';


2) scrip que combina nombres de jugadores de dos equipos diferentes en un solo lugar pero que sean mayor de algun numero  en la 
edad:
SELECT nombre  AS nombre_jugador
FROM jugadores
WHERE idequipo = 'Nets' AND edad > 25
UNION
SELECT nombre AS nombre_jugador
FROM jugadores
WHERE idequipo = 'Mavericks' AND edad > 19;


CASE :
1) para clasificar jugadores según su edad:
SELECT nombre, edad,
  CASE
    WHEN edad < 25 THEN 'Joven'
    WHEN edad >= 25 AND edad <= 30 THEN 'Adulto Joven'
    ELSE 'Adulto'
  END AS clasificacion_edad
FROM jugadores;

2)  calcula el promedio de puntos anotados por jugador
SELECT nombre,
  CASE
    WHEN COUNT(*) = 0 THEN 0
    ELSE SUM(puntos_anotados) / COUNT(*)
  END AS promedio_puntos_anotados
FROM jugadores
GROUP BY nombre;
