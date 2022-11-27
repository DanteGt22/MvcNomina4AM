
package mvcnomina4am;

import java.util.ArrayList;
import java.util.List;

public class controlador {
    List<modelo> empleados;

    // Llenar la lista
    public controlador() {
        empleados = new ArrayList<>();
    }
     public void insertarEmpleado(modelo empleado) {
        empleados.add(empleado);
        System.out.println("Se agregó el estudiante");
    }
    public List<modelo> imprimirEmpleado(){
        return empleados;        
    }
    public modelo obtenerEmpleado(String cedula) {
        for (modelo empleado : empleados) {
            if (empleado.getCedula().equals(cedula)) {
                return empleado;
            }
        }
        return null;
    }
    public void actualizarEmpleado(modelo empleado) {
        int i = 0;
        while (i < empleados.size()) {
            if (empleados.get(i).getCedula().equals(empleado.getCedula())) {
                empleados.set(i, empleado);
                System.out.println("Se modificó el estudiante");
                break;
            }
            i++;
        }
    }
    public void eliminarEmpleado(modelo estudiante) {
        empleados.remove(estudiante);
        } 
}