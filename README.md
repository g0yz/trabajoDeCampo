

Recontra Puto el que lee


# Configuración del Proyecto

## Java / JDK
- **Versión:** 17.0.12 LTS  
- **Fecha de lanzamiento:** 2024-07-16

## Spring Boot
- **Puerto de la aplicación:** [http://localhost:8081]

## Frontend
- **Puerto de la aplicación:** [http://localhost:3000]

## Base de datos PostgreSQL
- **Nombre de la DB:** grupo7_db  
- **Contraseña:** 8080  

- **Puerto de la aplicación:** [http://localhost:5432]


## Dependencias pom

    <dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>

		<dependency>
			<groupId>org.postgresql</groupId>
			<artifactId>postgresql</artifactId>
		</dependency>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-security</artifactId>
		</dependency>


## plugins pom

			<plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
			</plugin>

