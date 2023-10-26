# TBTB_entrega
🧑🏻‍💻
## Introducción 
Te presentaré dos repositorios. En uno encontrarás una aplicación construida en Angular que consume la API https://jsonplaceholder.typicode.com/users. Contempla dos maneras de renderizado: una tabla y una lista de tarjetas, ambas con diseño adaptable o responsive.
En el segundo repositorio encontrarás una API creada en Spring (Java) que cuenta con una conexión a una base de datos MySQL, así como la instalación de Swagger para la documentación de la API en (http://localhost:8080/api/swagger-ui/index.html#/) "dependiendo del puerto y el lugar puede variar".
Por último, encontrarás la carpeta "db" donde hallarás los scripts tanto DDL como DML para crear las conexiones de las bases de datos y el posterior llenado de las mismas. Además, dentro de esta misma carpeta, encontrarás otros scripts que se solicitaron para recuperar información sobre las tablas y relaciones creadas anteriormente.

##  Bases de Datos (Mysql) :
Como mencioné anteriormente, en la raíz del repositorio se encuentra la carpeta "DB". Por favor, ingresa a ella para acceder a los archivos DDL, DML y scripts, los cuales estarán en formato .txt y se encontrarán en la primera carpeta. La base de datos se compone de las tablas "jugadores", "equipos", "partidos" y la tabla pivote "jugadores_partidos". Cuenta con relaciones de uno a muchos y muchos a muchos, como se solicitó.

![image](https://github.com/leagut/TBTB_entrega/assets/81929427/67b6313c-64e7-48bb-8e69-30c18132a929)

los scripts tando dml como ddl estan prganizados para que se ejecuten de arriba hacia abajo para que no muestren problemas al momento de ejecutar!

![image](https://github.com/leagut/TBTB_entrega/assets/81929427/21cf1669-3818-4cfd-a1a1-d4aee482b5ef)


## API 

### Entorno (IDE)
- Intellij IDEA
  
### Tecnologías Utilizadas y Necesarias:
- Spring Boot 3.1.5
- JDK 17
- Gradel  

### Dependencias
- Spring Web
- Swagger
- MySQL Driver
- Spring Data JPA
- Lombok


- la api cuenta con los metodos (GET, POST, PUT, DELETE).
- en : http://localhost:8080/api/swagger-ui/index.html#/  pueden realizar las validaciones del crud una vez este corriendo la api de manera local
- se utilizo jpa para la creacion de la tabla equipos desde  la api
  
-   ![image](https://github.com/leagut/TBTB_entrega/assets/81929427/9169ed80-228d-4df6-95d7-c753cff78b99)
-   ![image](https://github.com/leagut/TBTB_entrega/assets/81929427/a0272724-98e7-4c33-8a0f-994fd4a408ae)
-   ![image](https://github.com/leagut/TBTB_entrega/assets/81929427/f9fb7f1d-5ac0-4e0c-9570-b60f31c2c580)
-   ![image](https://github.com/leagut/TBTB_entrega/assets/81929427/92ed7ca7-7218-402c-82a9-e3c5257dfd5a)
-   ![image](https://github.com/leagut/TBTB_entrega/assets/81929427/d50003b7-e512-4de5-a355-5c496fa63d14)

Por favor, ten en cuenta que mi clave primaria (PK) es el nombre del equipo, y es con este nombre con el que deben realizarse las peticiones previas. Por ejemplo, en una solicitud PATCH, el nombre del equipo no se incluirá en la URL; simplemente enviaremos el objeto completo y la API buscará internamente el nombre del equipo en el objeto y lo actualizará automáticamente.
![image](https://github.com/leagut/TBTB_entrega/assets/81929427/4170fda6-88fa-4402-a7c4-8d1241ec9fd6)


Para evitar posibles errores, este pequeño manual servirá como guía una vez que hayas clonado el repositorio:

![image](https://github.com/leagut/TBTB_entrega/assets/81929427/307e2429-652c-4f3c-988b-133088287898)

![image](https://github.com/leagut/TBTB_entrega/assets/81929427/72e5408a-e813-427d-9ff3-c3de8c531a96)

![image](https://github.com/leagut/TBTB_entrega/assets/81929427/c394e073-352b-44c2-9126-4b6a88dc527f)

![image](https://github.com/leagut/TBTB_entrega/assets/81929427/5582af31-390b-46c7-be6f-f93809851b8b)

![image](https://github.com/leagut/TBTB_entrega/assets/81929427/bcc932ac-e1e3-406d-96e4-f403fa9c0bbb)

![image](https://github.com/leagut/TBTB_entrega/assets/81929427/01654ea4-1d99-4f79-a2e7-1c96469a1566)

Una vez clonado y seguido este paso (algunas veces  no se necesitaria seleccionar el metodo Main) y despues de colocar la informacion de la db en los properties:
nombre de la db la contraseña y el usuario ya se podria echar a andar la api.

![image](https://github.com/leagut/TBTB_entrega/assets/81929427/211697b2-49fa-4d3a-ae6d-ba2cb6c4881e)



##Aplicación Web
Esta aplicación consume la API de usuarios https://jsonplaceholder.typicode.com/users y la renderiza en dos vistas , una en una tabla y la otra en unas cards.
la app tiene responsive design y un filtro en cada una de las vistas para poder encontrar la informaicion de la api con respecto al nombre de los usuarios 

para un uso mas rapido adjunto deploy en versel :
https://tbtb-prueba.vercel.app/table


### Tecnologías Utilizadas
- Angular CLI: 16.2.2
- Node: 16.15.0
- npm: '9.1.3'
- Bootstrap 5


si gustan clonar el repo:
1) el primer paso luedo de la clonacion seria correr el npm i
2) ejecutar el ng serve , te mostrara la url local y la puedes abrir









