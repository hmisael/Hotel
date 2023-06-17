/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Logica.Empleado;
import java.util.List;

/**
 *
 * @author Hernán Misael
 */
public class ControladoraPersistencia {
     EmpleadoJpaController empJPA = new EmpleadoJpaController();
    
    public List<Empleado> traerEmpleados(){
        return empJPA.findEmpleadoEntities();
    }

    public void crearEmpleado(Empleado emp) {
        empJPA.create(emp);
    }
    
}
