/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author Hernán Misael
 */
public class Habitacion {  
    long id_habitacion;
    /*diferente a id, porque puede cambiar la numeración, o existir mismo número
    en diferentes pisos*/
    int numero;
    int piso;
    String tematica;
    /*de acuerdo al tipo, al hacer consultas se procesa la cantidad de personas
    Single 1, Doble 2, Triple 3 y Multiple 1,2,3,4 ó + personas*/  
    String tipo;
    double precio;
}
