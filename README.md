# Demo de Aplicación Spring Boot

Este proyecto es una demostración de una aplicación Spring Boot que proporciona servicios RESTful para administrar ciudades y personas.

## Funciones Disponibles

### Obtener Ciudad por Código

- **URL:** `/ciudades/{codigo}`
- **Método:** `GET`
- **Descripción:** Obtiene una ciudad por su código de Dane.
- **Parámetros de la URL:** `codigo` - Código de Dane de la ciudad.
- **Respuesta Exitosa:** Devuelve la ciudad correspondiente al código de Dane proporcionado.
- **Respuesta de Error:** Devuelve un mensaje de error si la ciudad no se encuentra.

### Obtener Todas las Ciudades

- **URL:** `/ciudades`
- **Método:** `GET`
- **Descripción:** Obtiene todas las ciudades registradas en el sistema.
- **Respuesta Exitosa:** Devuelve una lista de todas las ciudades registradas.

### Agregar una Ciudad

- **URL:** `/ciudades`
- **Método:** `POST`
- **Descripción:** Agrega una nueva ciudad al sistema.
- **Cuerpo de la Solicitud:** Objeto JSON representando la ciudad a agregar.
- **Respuesta Exitosa:** Devuelve un mensaje de confirmación después de agregar la ciudad.

### Obtener Persona por Nombre

- **URL:** `/personas/{nombre}`
- **Método:** `GET`
- **Descripción:** Obtiene una persona por su nombre.
- **Parámetros de la URL:** `nombre` - Nombre de la persona.
- **Respuesta Exitosa:** Devuelve la persona correspondiente al nombre proporcionado.
- **Respuesta de Error:** Devuelve un mensaje de error si la persona no se encuentra.

### Obtener Todas las Personas

- **URL:** `/personas`
- **Método:** `GET`
- **Descripción:** Obtiene todas las personas registradas en el sistema.
- **Respuesta Exitosa:** Devuelve una lista de todas las personas registradas.

### Agregar una Persona

- **URL:** `/personas`
- **Método:** `POST`
- **Descripción:** Agrega una nueva persona al sistema.
- **Cuerpo de la Solicitud:** Objeto JSON representando la persona a agregar.
- **Respuesta Exitosa:** Devuelve un mensaje de confirmación después de agregar la persona.

### Obtener Personas Nacidas en una Ciudad

- **URL:** `/personas/nacidas-en/{ciudad}`
- **Método:** `GET`
- **Descripción:** Obtiene todas las personas nacidas en una ciudad específica.
- **Parámetros de la URL:** `ciudad` - Nombre de la ciudad.
- **Respuesta Exitosa:** Devuelve una lista de personas nacidas en la ciudad especificada.

### Agregar Persona por URL

- **URL:** `/personas/{nombre}/{apellido}/{fecha}/{ciudad}/{numero}/{cliente}`
- **Método:** `POST`
- **Descripción:** Agrega una nueva persona al sistema utilizando parámetros en la URL.
- **Parámetros de la URL:** `nombre`, `apellido`, `fecha`, `ciudad`, `numero`, `cliente` - Datos de la persona.
- **Respuesta Exitosa:** Devuelve un mensaje de confirmación después de agregar la persona.

## Cómo Probar las Funciones

Puedes probar las funciones utilizando herramientas como Postman o cURL para enviar solicitudes HTTP a los endpoints correspondientes. A continuación, se muestran algunos ejemplos:

- **Obtener Todas las Ciudades:** Envía una solicitud GET a `/ciudades` para obtener todas las ciudades registradas.
- **Agregar una Persona:** Envía una solicitud POST a `/personas` con un objeto JSON representando la persona que deseas agregar.
- **Obtener Persona por Nombre:** Envía una solicitud GET a `/personas/{nombre}` para obtener una persona por su nombre.


