
package mvcnomina4am;

import java.io.*;
public class vista {
    public static void main(String[] args)throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        controlador con = new controlador();
        // Variables
            int opcion=1;
            while (opcion >= 1 && opcion <= 6) {
                System.out.println("Empresa XYZ");
                System.out.println("Nomina de Empleados");
                System.out.println("Seleccione tarea a realizar:");
                System.out.println("1. Ingresar Empleado");
                System.out.println("2. Buscar Empleado");
                System.out.println("3. Modificar Empleado");
                System.out.println("4. Eliminar Empleado");
                System.out.println("5. Ver Base de Datos de Empleados");
                System.out.println("6. Salir");
                System.out.println("Digite la Opción:");
                opcion = Integer.parseInt(br.readLine());
                
                switch (opcion) {
                    case 1:                         
                        modelo mod = new modelo();
                        String nombre, cedula;
                        double salario, prestamos, auxilio_transporte, sueldo;
                        int dias, hed, hen, hef;
                        //cargar datos usando nuevo
                        System.out.println("Digite la Cedula de Ciudadania del Empleado");
                        cedula = br.readLine();
                        mod.setCedula(cedula);
                        System.out.println("Digite el nombre del Empleado");
                        nombre = br.readLine();
                        mod.setNombre(nombre);
                        System.out.println("Digite el salario del Empleado");
                        salario = Double.parseDouble(br.readLine());
                        mod.setSalario(salario);
                        System.out.println("Digite los dias laborados por el Empleado");
                        dias = Integer.parseInt(br.readLine());
                        mod.setDias(dias);
                        System.out.println("Digite el numero de horas extras diurnas");
                        hed = Integer.parseInt(br.readLine());
                        mod.setHed(hed);
                        System.out.println("Digite el numero de horas extras nocturnas");
                        hen = Integer.parseInt(br.readLine());
                        mod.setHen(hen);
                        System.out.println("Digite el numero de horas extras festivas");
                        hef = Integer.parseInt(br.readLine());
                        mod.setHef(hef);
                        System.out.println("Digite el valor de los prestamos generados por el empleado");
                        prestamos = Double.parseDouble(br.readLine());
                        if (salario <= salario *2)
                            auxilio_transporte = 106454 / 30 * dias;
                        else
                            auxilio_transporte = 0;
                        mod.setAuxilio_transporte(auxilio_transporte);
                        sueldo = salario / 30 * dias;
                        mod.setSueldo(sueldo);
                        con.insertarEmpleado(mod);
                        break;
                        
                        case 2:                         
                        System.out.println("Buscar Empleado");
                        //BUSCAR por correo institucional
                        System.out.println("Ingresar Cedula de Ciudadania:");
                        String buscar = br.readLine();
                        modelo encontrado = con.obtenerEmpleado(buscar);
                        if (encontrado != null) {
                            System.out.println("Información del empleado");
                            System.out.println("Cedula:" + encontrado.getCedula());
                            System.out.println("Nombre:" + encontrado.getNombre());
                            System.out.println("Salario:" + encontrado.getSalario());
                            System.out.println("Dias:" + encontrado.getDias());
                            System.out.println("Horas Extras Diurnas:" + encontrado.getHed());
                            System.out.println("Horas Extras Nocturnas:" + encontrado.getHen());
                            System.out.println("Horas Extras Festivas:" + encontrado.getHef());
                            System.out.println("Prestamos:" + encontrado.getPrestamos());
                            System.out.println("Prestamos:" + encontrado.getAuxilio_transporte());
                            System.out.println("Prestamos:" + encontrado.getSueldo());
                            
                            
                        } else {
                            System.out.println("Empleado no encontrado");
                        }
                        break;
                        
                        case 3:
                        //MODIFICAR
                        System.out.println("Modificar Empleado");
                        modelo actualizar = new modelo();
                        System.out.println("Ingresar Cedula de Ciudadania:");
                        buscar = br.readLine();
                        actualizar = con.obtenerEmpleado(buscar);
                        System.out.println("Ingresar nombre del empleado");
                        actualizar.setNombre(br.readLine());
                        System.out.println("Ingresar Salario del Empleado:");
                        actualizar.setSalario(Double.parseDouble(br.readLine()));
                        System.out.println("Ingresar dias laborados:");
                        actualizar.setDias(Integer.parseInt(br.readLine()));
                        System.out.println("Ingresar Horas Extras Diurnas:");
                        actualizar.setHed(Integer.parseInt(br.readLine()));
                        System.out.println("Ingresar Horas Extras Nocturnas:");
                        actualizar.setHen(Integer.parseInt(br.readLine()));
                        System.out.println("Ingresar Ingresar Horas Extras Festivas:");
                        actualizar.setHef(Integer.parseInt(br.readLine()));
                        System.out.println("Ingresar Los Prestamos:");
                        actualizar.setPrestamos(Double.parseDouble(br.readLine()));
                        con.actualizarEmpleado(actualizar);
                    break;
                        case 4:
                        //ELIMINAR
                        System.out.println("Eliminar empleado");
                        System.out.println("Digite la Cedula de Ciudadnia:");
                        buscar = br.readLine();
                        modelo emp = con.obtenerEmpleado(buscar);
                        con.eliminarEmpleado(emp);
                        System.out.println("Se eliminó el empleado");
                        
                    break;
        
                    
                    case 5:
                            System.out.println("El directorio de los empleados");
                            System.out.println(con.imprimirEmpleado());
                        //});
                        break;
                    

                    case 6:
                        //SALIR
                        System.out.println("Hasta Pronto");
                        System.exit(0);
                    
                    default:
                        System.out.println("Opcion no valida");
                }
        
        
        
        }
        
    }
    
}
