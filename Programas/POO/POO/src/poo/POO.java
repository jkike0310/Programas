/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author enriq
 */
import java.util.Scanner;
public class POO {

    /**
     * @param args the command line arguments
     */
     
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre, matricula, telefono;
        int edad;
        double calificacionfinal = 0; 
        double cal1;
        double promedio;
        System.out.println("El programa registra a un alumno y obtiene su calificacion");
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el nombre del alumno: ");
        nombre = s.next();
        System.out.println("Ingrese la matricula del alumno: ");
        matricula = s.next();
        
        System.out.println("Ingrese el telefono del alumno: ");
        telefono = s.next();
        System.out.println("Ingrese la edad del alumno: ");
        edad = s.nextInt();
        
        
        
        for(int x=0; x<3; x++){
            System.out.println("Ingrese la calificacion " + x);
            cal1 = s.nextDouble();
            calificacionfinal += cal1;
        }
        
        promedio = calificacionfinal/3;
        
        Alumno al = new Alumno(nombre, matricula, telefono, edad, promedio);
        //Alumno al = new Alumno(nombre, matricula, telefono, edad, promedio);
        System.out.println("El alumno "+al.getNombre() +" tiene los siguientes datos:\n\n");
        System.out.println("Matricula: "+al.getMatricula());
        
        System.out.println("Telefono: "+al.getTelefono());
        System.out.println("Edad: "+al.getEdad()+"\n\n");
        System.out.println("Promedio: "+al.getPromedio());
        
        
        
    }
   
    
}
