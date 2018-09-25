/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sebitex.oficial;

import java.util.Scanner;

/**
 *
 * @author jose
 */
public class Test {
        public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        Personal trabajador=null;
        
        for (int i = 0; i < 8; i++) {
            System.out.println("Ingrese nombre, estatus (E :empleado u O:obrero)y sueldo final por linea");
            trabajador = new Personal();
            trabajador.setNomTrab(tec.next());
            trabajador.setEstatus(tec.next());
            trabajador.setSueldoBase(tec.nextDouble());
            System.out.println("Nombre trabajador: "+trabajador.getNomTrab());
            System.out.println("Estatus : "+trabajador.getEstatus());
            System.out.println("Sueldo base:  "+trabajador.getSueldoBase());
            System.out.println("Sueldo final: "+trabajador.sueldoFinal()); 
        }
            try {
                System.out.println("Maximo sueldo Estatus E: "+trabajador.maximo_sueldoFinal("E"));
        System.out.println("Maximo sueldo Estatus O: "+trabajador.maximo_sueldoFinal("O"));
        System.out.println("Minimo sueldo Estatus E: "+trabajador.minimo_sueldoFinal("E"));
        System.out.println("Minimo sueldo Estatus O: "+trabajador.minimo_sueldoFinal("O")); 
            } catch (Exception e) {
                System.out.println("No es posible mostrar datos");
            }
       
        
        
       //System.out.format("Maximo sueldo final (Estatus E)",2);
        
        
    }

}
