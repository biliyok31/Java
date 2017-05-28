/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

import java.util.Scanner;

/**
 *
 * @author KEZIAH
 */
public class Even {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a;// declaring the variable a 
         Scanner input = new Scanner(System.in);
         System.out.println ( " enter a number to find out if it an even or odd number" );
         
         a =  input.nextInt();
         
         
         
         if( a % 2 == 0)// condition to be satisfied 
         {System.out.println ( "the number you just entered is even" );//answer printed out if even
                 
                 }
         else
         { 
            System.out.println ( " the number you enetered is an odd number ");//text to be printed out if odd
         }
        
    }
    
}
