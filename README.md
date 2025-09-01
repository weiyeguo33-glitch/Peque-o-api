# API de Gestión de Usuarios  

Esta es una pequeña aplicación desarrollada en **Java** que expone una API REST para la gestión de usuarios.  
El objetivo del proyecto es practicar el desarrollo backend y reforzar conocimientos en programación con Java.  

---

##  Tecnologías utilizadas
- **Java** (Spring Boot / Spring MVC)  
- **MySQL** (para la persistencia de datos)  
- **Maven** (gestor de dependencias)  
- **Git/GitHub** (control de versiones)  

---

## Funcionalidades principales
- Crear usuarios (POST)  
- Listar usuarios (GET)  
- Consultar usuario por ID (GET)  
- Actualizar usuario (PUT)  
- Eliminar usuario (DELETE)  

---

## Estructura del proyecto
src/
└── main/
├── java/
│ └── com.ejemplo.usuario/
│ ├── controller/
│ ├── model/
│ └── repository/
└── resources/
└── application.properties

##  Configuración
1. Clonar el repositorio:  
   ```bash
   git clone https://github.com/tuusuario/nombre-repo.git
   cd nombre-repo
Crear la base de datos en MySQL y ejecutar el archivo schema.sql incluido.

Configurar application.properties con tus credenciales de MySQL:
spring.datasource.url=jdbc:mysql://localhost:3306/usuarios_db
spring.datasource.username=
spring.datasource.password=
 Endpoints principales

POST /usuarios → Crear un nuevo usuario

GET /usuarios → Listar todos los usuarios

GET /usuarios/{id} → Obtener usuario por ID

PUT /usuarios/{id} → Actualizar usuario

DELETE /usuarios/{id} → Eliminar usuario

