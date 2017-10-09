/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_3;

import java.util.Scanner;

/**
 *
 * @author dperezlojo
 */
public class Boletin2_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
       float dolares, euros, cambio;
    System.out.println("teclea euros: ");
    euros=sc.nextFloat();
    System.out.println("tecela cambio: ");
    cambio=sc.nextFloat();
    dolares=euros*cambio;
    System.out.println(euros +" euros son " + dolares + " dolares");
    
    
    
    
    }
    
}
