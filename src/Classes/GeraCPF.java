/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.Random;
/**
 *
 * @author c1401801
 */
    
    
public class GeraCPF {
     // Método para gerar CPF aleatório e retornar como Long
     public static long GeraCPF(){
     Random gerador = new Random();
     int CPF[] = new int[11];
     int i;
     int resto;
     long NumCPF;
     
     CPF[0] = gerador.nextInt(8) + 1;
     for(i = 1; i < 9; i++){
         CPF[i] = gerador.nextInt(10);
              
     }
     
    resto = ((CPF[0] * 10) + (CPF[1] * 9) + (CPF[2] * 8) + (CPF[3] * 7) + (CPF[4] * 6) + (CPF[5] * 5) + (CPF[6] * 4) + (CPF[7] * 3) + (CPF[8] * 2)) % 11; 
    CPF[9] = 11 - resto;
    
    if(CPF[9] > 9){
      CPF[9] = 0;          
    } 
        
    resto = ((CPF[0] * 11) + (CPF[1] * 10) + (CPF[2] * 9) + (CPF[3] * 8) + (CPF[4] * 7) + (CPF[5] * 6) + (CPF[6] * 5) + (CPF[7] * 4) + (CPF[8] * 3) + (CPF[9] * 2)) % 11;
    CPF[10] = 11 - resto;
    
    if(CPF[10] > 9){
      CPF[10] = 0;          
    }
      
     NumCPF = CPF[0];
     
      for (i = 1; i < 9; i++){
         
        NumCPF = NumCPF * 10;
        NumCPF = NumCPF + CPF[i];
                 
         }
       NumCPF = (NumCPF * 100) + (CPF[9] * 10);
       NumCPF = NumCPF + CPF[10];
     
     return NumCPF;
     
    }
}