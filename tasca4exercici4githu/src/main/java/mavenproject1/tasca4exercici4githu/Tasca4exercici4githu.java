/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package mavenproject1.tasca4exercici4githu;

import java.util.Scanner;

/**
 *
 * @author ainag
 */
public class Tasca4exercici4githu {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       
       System.out.print("Introdueix el nombre de costats del triangle:");
       int nombre=sc.nextInt();
       
       for (int i=0; i< nombre; i++){
           for (int j=0; j <=i ; j++){
               System.out.print("*");
           }
           System.out.println();
       }
    }
}
