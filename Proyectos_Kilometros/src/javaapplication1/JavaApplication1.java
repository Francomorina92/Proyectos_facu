/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author lucia
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
       Scanner sc=new Scanner(System.in);
       
        System.out.println("ingrese el numero de kilometros");
        int ki= sc.nextInt();
        double total=300;
        int suma=5;
        double totalR=4300;
        if(ki <= 200)
        {
            System.out.println("el total a pagar es de $" + total);
        }
        else if(ki>200 && ki<=1000)
        {
          
            for (int i = 201; i <= ki; i++) {
                
                
               total+=5;
                
                
            }
            System.out.println("El total a pagar es $"+ total);   
                     
        }
        
         else if(ki >1000)
            {
            for (int i = 1001; i <= ki; i++) {
                totalR+=10;
            }
            System.out.println("el total a pagar es $"+totalR);
            }
         
       
        
       
        
        
        
      
      
      
        
        
       
        
    }
    
}
