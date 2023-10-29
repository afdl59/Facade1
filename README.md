# Enunciado Actividad Patrón Facade (fachada)

Crear un sistema empleando el patrón Facade que permita interactuar con un sistema complejo de domótica. El sistema complejo, por ejemplo, permite dividir el hogar en zonas (habitaciones) y gestionar multitud de dispositivos diferentes (electrodomésticos, luces...).

## Contexto de la entrega

En esta actividad implementamos el patrón Facade a través de simular una Domotica, esta aplicación es capaz de gestionar de manera automatica otros subsistemas que pertenecen al hogar, nosotros decidimos representarlo con 4 conjuntos:

* ClimateControl: Permite regular la temperatura de las habitaciones.
* MusicSystem: Un sistema de audio puede tener multiples aparatos conectados, pero independientes segun su proposito.
* SecurityService: Para nuestro caso lo representamos por medio de camaras de seguridad, sin embargo, un servicio de seguridad tambien puede tener alarmas, sensores, vallas, etc...
* Lighting: La ilumicacion del hogar pude contar con varios sectores cada uno con diferentes tipos de iluminacion que se necesite gestionar, para este subsistema tambien creamos el subsistema *Ligths*, con fin de mostrar un poco de lo que podria contener.

Ya expliacados, cada uno de estos subsistemas cuenta con un nivel propio de complejidad y lo que buscamos es poder realizar la gestion de cada uno de ellos de forma simplificada, y por eso aplicamos el patron Facade. Por ejemplo, si cada mañana se necesita apagar todas las luces de la casa, regular la calefaccion y cambiar la configuración de seguridad, no es necesario realizar cada una de estas acciones por separado ya que esta aplicación nos permite hacerlo con un solo metodo.  

## Para correr el programa, ejecutar desde la carpeta src

```bash
javac TestFacade.java
java TestFacade
```

## Equipo

* Alejandro Figari De Leonardo
* Olivia Araceli Morales Quezada
