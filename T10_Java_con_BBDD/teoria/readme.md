# Como usasr bases de datos 

Primero es necesario tener alguna aplicaciion para poder *ejecutar* Apache y MySql como `xampp`. Con esto podemos desde cargar o creart nuestras porpias vases de datos desde 
`localhost/phpmyadmin/`

## Como vincular Java con SQL

Para poder hacer esto se necesita un extension por lo que se tenen que crear un `proyecto maven`.<br>
Esta extensión se llama [mysql-connector-j]( https://mvnrepository.com/artifact/com.mysql/mysql-connector-j) y se deve de configurar en el pom quedando algo de siguiente estilo : <br>

````xml
 <dependencies>
        <dependency>
            <groupId>com.mysql</groupId>
            <artifactId>mysql-connector-j</artifactId>
            <version>9.2.0</version>
        </dependency>
    </dependencies>
````

