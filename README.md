# Moview Project

## Introducción
Disfruta de una experiencia única bajo las estrellas con nuestras películas de estreno y un menú de snacks irresistibles. Reserva tu lugar ahora y vive la magia del cine al aire libre desde la comodidad de tu auto.

## Instalación
### Para descargar el código fuente de Moview, sigue estos pasos:
1. Abre una terminal o línea de comandos en tu sistema.
2. Ubicarse en el escritorio.
3. Crear una carpeta llamada Proyecto.
4. Entrar a la carpeta recientemente creada.
5. Clonar el repositorio moview.
6. Ubicarse en la carpeta de la aplicación web.

```sh
cd %USERPROFILE%\Desktop || cd %USERPROFILE%\OneDrive\Desktop
mkdir Proyecto
cd Proyecto   
git clone https://github.com/Geraldow/moview.git
cd moview
```


## Flujo de trabajo
### Para enviar actualizaciones y creaciones de archivos al repositorio remoto, deben seguir estos pasos:
1. Ejecutar cmd en la barra de navegación desde la carpeta del proyecto.
2. Configurar su nombre y correo electrónico de Git de manera global o no para los registros de auditoría.
4. Ubicarse en la rama 'feature'.
6. Las nuevas ramas serán creadas desde 'feature' dependiendo de las asignaciones de cada desarrollador.
7. Crear archivos para el proyecto.
8. Visualizar los archivos disponibles.
9. Seleccionar las funcionalidades aptas.
10. Comentar los archivos elegidos.
11. Enviar los archivos al repositorio remoto.
12. Visualizar los cambios recientes desde el GitHub.

### Ejemplo

```sh
git config --global user.name "<nombre>"
git config --global user.email "<correo_electrónico>"
git switch feature
git status
git add MoviewApplication.java
git commit
git push
git log -n 10
```


## Tecnologías utilizadas
Lenguajes: 
  - HTML
  - CSS
  - Java
  - SQL
    
Framework:
  - Spring Boot
  - Tailwind CSS
  - Thymeleaf

Plugins:
  - Atom Material Icons
  - File Watchers
  - Lombok


# Base de Datos
- [https://pastebin.com/03kSqZyk]


## Equipo 
- Geraldo Fair Jaramillo Florida [71992956@certus.edu.pe]
- Alessandro Miguel Arias Marquina [76287712@certus.edu.pe]
- Dayne Fiorella Ruiz Fernandez [73987271@certus.edu.pe]
- Lucas Elias Condori Tito [75910485@certus.edu.pe]
- Luis Piero Revolledo Grados [63229235@certus.edu.oe]
