/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication41;

import java.util.Scanner;

/**
 *
 * @author gerar
 */
public class JavaApplication41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2;
        Scanner captu = new Scanner(System.in);
        System.out.println("Inicio");
        num1 = captu.nextInt();
        captu.nextLine();    
        System.out.println("Fin");
        num2 = captu.nextInt();
        captu.nextLine();
        for (int i=num1; i<=num2; i++){
            int modulo = 1%2;
            if (modulo ==1)
            continue;
            System.out.println(i + "-");
        }
       }  
}
