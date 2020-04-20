
package autos;

import java.util.Scanner;

public class Autos {
    
    
    
    public static void main(String[] args) {
      
        Scanner sc=new Scanner(System.in);
        
        
        System.out.println("Ingrese cuantos años tiene el vehiculo");
        int year=sc.nextInt();
        
        int c=0;
        int cp=0;
        int amu=0,amn=0,apu=0;
        int promedio=0;
        while(year !=0)
        {
            c++;
            if(year >=1 && year <=5)
            {
                System.out.println("Nuevo");
                 amn=amn+year;
            }
            else if(year >=6 && year<=10){
                System.out.println("Poco Uso");
                cp++;
                apu=apu+year;
            }
            else if(year >=11 && year<=20){
                System.out.println("Mucho Uso");
                amu=amu+year;
            }
            else if(year > 20){
                System.out.println("Muy Antiguo");
                
            }
            System.out.println("cantidad de autos: " + c);
            System.out.println("ingrese los años de uso");
            year=sc.nextInt();
        }
        promedio=(amn+amu+apu)/3;
        
        System.out.println("cant de autos con poco uso: "+cp);
        System.out.println("el Promedio de autos que no son muy antiguos es de: "+promedio);
        
    }
    
}
