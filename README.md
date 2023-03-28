# 💻 PORTFOLIO WEB | ARGENTINA PROGRAMA

## 📍 OBJETIVO DEL PROYECTO
El objetivo de este proyecto es crear un portafolio web que muestre mis datos personales, proyectos, estudios cursados, experiencia laboral y mis conocimientos de las tecnologías. La idea es que, además de servirme para aplicar lo aprendido en este curso, pueda publicar el portfolio web y usarlo como carta de presentación en el mercado laboral.
  
    

## ARQUITECTURA Y DISEÑO DE LA APLICACIÓN
La aplicación se basa en una arquitectura distribuida y cuenta con un diseño de interfaz de usuario intuitivo que facilita la navegación y la presentación de información clara. Además, se implementa una base de datos para almacenar los datos y se utiliza las API's necesarias para proveer información a través de internet.


## 💻 BACK END 
Este repositorio contiene la capa back-end de mi portafolio de mi trabajo final para #YoProgramo.

## 🎨 FRONT END
Puedes ver el repositorio del front-end en el siguiente enlace: https://github.com/AraceliW/Portafolio-FrontEnd


## 💡 DIAGRAMA ENTIDAD-RELACION
En este diagrama se muestra la estructura de la base de datos utilizada en mi proyecto, incluyendo las tablas, relaciones y atributos de cada entidad.
![texto alternativo](https://drive.google.com/uc?export=download&id=1UhZzhM0GeXvlESCACB5X1tVVfejbTFyb)



## 📋 REQUISITOS PREVIOS
- Java Development Kit (JDK) 17.0.6 instalado en el sistema.
- Maven instalado en el sistema para gestionar las dependencias y construir el proyecto.
- MySQL instalado en el sistema como base de datos para la persistencia de los datos.
- Para facilitar el manejo de la base de datos MySQL, se recomienda tener instalado el software de gestión de bases de datos XAMPP, que incluye phpMyAdmin. Este permitirá administrar de forma más cómoda y visual las tablas y datos almacenados en la base de datos.
- Es necesario contar con una conexión funcional a la base de datos a través de XAMPP y phpMyAdmin antes de ejecutar la aplicación. Asegúrate de configurar correctamente las credenciales de acceso a la base de datos en el archivo 'application.properties' ubicado en la ruta 'src/main/resources/'

## PRUEBAS RECOMENDADAS
Las pruebas se realizaron utilizando Postman para garantizar la funcionalidad y seguridad de la aplicación


## 🔍 TECNOLOGIAS USADAS
API Rest creada utilizando las tecnologías Java + Spring Boot bajo el modelo MVC para la lógica y MySQL para persistencia de datos. Entre ellas:
Tecnologías utilizadas:
- Java Development Kit (JDK) 17.0.6
- Maven 3.9.0
- Spring Boot 3.0.4
- Spring Data JPA (versión específica instalada a través de Spring Initializr)
- Spring Web (versión específica instalada a través de Spring Initializr)
- Spring Security (versión específica instalada a través de Spring Initializr)
- JSON Web Token 0.9.1 (versión específica instalada a través de Maven Repository)
- MySQL Connector/J (versión específica instalada a través de Spring Initializr)
- Lombok (versión específica instalada a través de Spring Initializr)
- Apache Commons Lang 3
- JAXB 2.3.0
- Activation 1.1.1

Nota: Todas las versiones de las tecnologías utilizadas corresponden a la fecha de marzo de 2023. Algunas versiones fueron instaladas a través de Spring Initializr por lo que no se especifican en el archivo pom.xml.


## 🔧 FUNCIONALIDADES
- Registro y autenticación de usuarios: el sistema permite que los usuarios se registren y autentiquen en la plataforma para acceder a su perfil y a funcionalidades específicas.
- Gestión de información personal: el usuario puede agregar, editar y eliminar información sobre sí mismo en su perfil, como su nombre completo, foto de perfil, correo electrónico, número de teléfono, ubicación, entre otros.
- Gestión de experiencia laboral: el usuario puede agregar, editar y eliminar información sobre su experiencia laboral en su perfil, incluyendo empresa, cargo, descripción, fecha de inicio y finalización, etc.
- Gestión de estudios: el usuario puede agregar, editar y eliminar información sobre sus estudios y certificaciones en su perfil, incluyendo nivel de estudios, institución, fecha de inicio y finalización, etc.
- Gestión de habilidades: el usuario puede agregar, editar y eliminar sus habilidades en su perfil, indicando su nivel de dominio en cada una de ellas. Además, puede agregar nuevas habilidades que haya adquirido a lo largo del tiempo.
- Gestión de proyectos: el usuario puede agregar, editar y eliminar proyectos en su perfil, incluyendo información como título, descripción, imágenes, tecnologías utilizadas, etc.
- Visualización de perfil: los visitantes del sitio pueden ver la información pública del perfil del usuario, incluyendo proyectos, estudios, experiencia laboral, habilidades, etc.



## 🚀 INSTRUCCIONES DE USO 🚀
- Clona este repositorio: 
    `git clone https://github.com/AraceliW/Portafolio-BackEnd`
- Instala las dependencias de maven: 
    `mvn install`
- Configurar el archivo `application.properties` de la ruta `src/main/resources/`
- Ejecutar la app iniciando el archivo `PortfolioApplication.Java`



### 🚧 ESTADO
Actualmente, este proyecto se encuentra en proceso de desarrollo y se irá actualizando conforme se agreguen nuevas funcionalidades y mejoras. 🔜




