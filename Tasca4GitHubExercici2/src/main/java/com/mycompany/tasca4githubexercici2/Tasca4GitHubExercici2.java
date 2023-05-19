/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tasca4githubexercici2;

/**
 *
 * @author Aina
 */
public class Tasca4GitHubExercici2 {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Taula de multiplicar del " + i + ":");
            System.out.println("---------------------");
            
            for (int j = 1; j <= 10; j++) {
                int resultat = i * j;
                System.out.println(i+ " * " + j + " = " + resultat);
            }
                System.out.println();
        
                }
        }
}
