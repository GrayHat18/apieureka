# Servicio Descubridor Eureka

## Descripción
Un servicio eureka descubridor es un componente clave en una arquitectura de microservicios que proporciona capacidades de registrar y descubrir microservicios levantados. 
Esta instancia del servidor Eureka registra los microservicioes al inicio y les permite descubrirse con otros de forma dinámica con facilidad, balanceando las cargas en la
arquitectura.

## Caracteristicas
- Servicio de Registro: Cada microservicio puede registrar su instancia en este servidor Eureka.
- Servicio de Descubrimiento: Se habilita desde el lado del cliente el servicio descubierto, para el balanceo de carga.
- Resiliencia: Este servidor Eureka está incorporado con un mecanismo propio de construcción para protegerse contra fallos inesperado.

### Prerrequisitos
Para lograr ejecutar este servicio necesitar tener instalado en tu máquina local lo siguiente:
- JDK 17
- Maven 3.6 o superior

### Instalación
Para obtener este repositorio en tu entorno local de desarrollo, tienes que:
1. Clonar este repositorio
```sh
git clone https://github.com/GrayHat18/apieureka.git
```

# Contribuir
Para contribuir con el desarrollo y/o mejoras a este servicio, se tienen las siguientes consideraciones:
1. Solamente realizar pull request al branch `develop`
2. Respetar el trabajo de otros colaboradores, considerando apoyo y/o mejoras en el código fuente mediante comentarios

Y seguir los siguientes pasos:
 - Hacer un fork del repositorio
 - Clonar tu fork realizado a tu entorno local
 - Crear una nueva feature a partir del branch `develop`
 - Hacer los cambios con los que desees colaborar
 - Realizar un commit de tus cambios y push hacia tu repositorio forkeado
 - Crear un pull request desde tu fork al branch `develop` del repositorio original

# Contacto
Ante cualquier duda o consulta detallada respecto al desarrollo y funcionamiento de este servicio, por favor comunicarse con `GrayHat` en los siguientes canales de comunicación:
`fabian.hernan95@gmail.com` o al instagram `@grayhat18`.

