/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package mavenproject1.tasca4githubexercici1;

import java.util.Scanner;

/**
 *
 * @author ainag
 */
public class Tasca4githubexercici1 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       System.out.print("Introdueix un nombre entre 1 i el 10:");
       int nombre= sc.nextInt();
       
       if (nombre < 1 || nombre > 10) {
           System.out.println("Malament! El nombre ha d'estar entre l'1 i el 10");
           return;
       }
       System.out.println("Taula de multiplicar del " + nombre+ ":" );
       for (int i= 1; i<=10; i++) {
           System.out.println(nombre+ "x" + i + "="+ (nombre*i));
       }
    }
}
