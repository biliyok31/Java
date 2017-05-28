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
public class Prime {
    
public static void main(String[] args){
    int i;
    boolean IsPrime=true;
	Scanner scan= new Scanner(System.in);
        
System.out.println("Insert any number: ");
	
	int num=scan.nextInt();
        
	for( i=2; i<=num/2; i++)
	{
          int fill=num%i;
	   if(fill==0)
	   {
	      IsPrime=false;
	      break;
	   }
	}
	
	if(IsPrime){
	   System.out.println(num + " is Prime Number");
}else{
	   System.out.println(num + " is not Prime Number");
    }
}
}

