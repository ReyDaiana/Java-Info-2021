/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject7;

import java.util.Scanner;

/**
 *
 * @author Daiana
 */
public class Main {
    public static void main(String[] args) { 
       Scanner teclado = new Scanner (System.in); 
        String name;

       System.out.println("Ingrese su nombre");
       name = teclado.nextLine();
       
       System.out.println("Hola " + name);
    }
    
}
