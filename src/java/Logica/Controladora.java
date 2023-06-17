/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Persistencia.ControladoraPersistencia;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Hernán Misael
 */
public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public boolean verificarUsuario(String usuario, String contra){
        List<Empleado> listaEmpleados = controlPersis.traerEmpleados();
        
        if (listaEmpleados!= null){
            for (Empleado empleado: listaEmpleados){
                if (empleado.getUser().equals(usuario) && empleado.getContrasenia().equals(contra)){
                    //si encuentra el Usuario, termina ejecución devolviento true
                    return true;
                }                
            }    
        }
        //si no encontró Usuario en el bucle for, devuelve false 
        return false;
    }

    public void crearEmpleado(int dni, String nombre, String apellido, 
            Date fecha_nac, String direccion, String usuario, String pass, String cargo){
    
        Empleado empleado = new Empleado();
        
        empleado.setNombre(nombre);
        empleado.setApellido(apellido);
        empleado.setFecha_nac(fecha_nac);
        empleado.setDireccion(direccion);
        empleado.setUser(usuario);
        empleado.setContrasenia(pass);
        empleado.setCargo(cargo);
        
        controlPersis.crearEmpleado(empleado);
    }
    
    
    
}
