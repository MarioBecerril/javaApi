
# 💊 API Inventarios - Spring Boot

`api-inventarios` es una API RESTful desarrollada con **Spring Boot** para gestionar farmacias, medicamentos y ventas. Ideal para sistemas de gestión de inventarios.

## 📦 Repositorio

🔗 [GitHub - MarioBecerril/javaApi](https://github.com/MarioBecerril/javaApi)

---

## 🚀 Características Principales

- 📚 **API RESTful completa** para la gestión de farmacias, medicamentos y ventas.
- 🔒 **Preparada para Seguridad** mediante **Spring Security**.
- 🛠️ **Persistencia** con JPA y conexión a base de datos **MySQL**.
- ⚙️ **Arquitectura limpia** basada en controladores, servicios y repositorios.
- 🧰 **Lombok** para reducción de código repetitivo (getters, setters, etc.).

---

## 🧾 Requisitos Previos

Antes de ejecutar el proyecto, asegúrate de tener instalado:

- Java 17 o superior
- Apache Maven
- MySQL Server

---

## 📦 Dependencias Utilizadas

- **Spring Boot Starter Web**  
- **Spring Boot Starter Data JPA**  
- **Spring Boot Starter Security**  
- **MySQL Connector/J**  
- **Lombok**

---

## 🛠️ Instalación y Ejecución

### Paso 1: Clonar el Repositorio

```bash
git clone https://github.com/MarioBecerril/javaApi.git
cd javaApi
```

### Paso 2: Configurar la Base de Datos MySQL

1. Crea una base de datos llamada `inventarios`.
2. Edita el archivo `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/inventarios
spring.datasource.username=TU_USUARIO
spring.datasource.password=TU_CONTRASEÑA
spring.jpa.hibernate.ddl-auto=update
```

### Paso 3: Compilar y Ejecutar

```bash
mvn clean install
mvn spring-boot:run
```

---

## 🔗 Endpoints Disponibles

Estos endpoints aceptan y devuelven datos en formato JSON.

### Farmacias

- `GET /api/farmacias` - Listar todas las farmacias  
- `GET /api/farmacias/{id}` - Obtener farmacia por ID  
- `POST /api/farmacias` - Crear nueva farmacia  
- `PUT /api/farmacias/{id}` - Actualizar farmacia existente  
- `DELETE /api/farmacias/{id}` - Eliminar farmacia  

### Medicamentos y Ventas

Rutas similares disponibles para:  
`/api/medicamentos` y `/api/ventas`

---

## 🧪 Pruebas

Usa herramientas como **Postman** o **Insomnia** para consumir los endpoints localmente.

---
