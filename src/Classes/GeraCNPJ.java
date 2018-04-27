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
public class GeraCNPJ {
    
    // Método para gerar CNPJ aleatório e retornar como Long    
    public static long GeraCNPJ() {
        
    Random Gerador = new Random();
    int CNPJ[] = new int[14];
    int i;  
    long NumeroCNPJ;
    int resto;
  
    CNPJ[0] = Gerador.nextInt(8) + 1;  
     
    for (i = 0; i <= 11; i++){
        
        CNPJ[i] = Gerador.nextInt(10);
        
     }
   
     resto = ((CNPJ[0]*5) + (CNPJ[1]*4) + (CNPJ[2]*3) + (CNPJ[3]*2) + (CNPJ[4]*9) + (CNPJ[5]*8) + (CNPJ[6]*7) + (CNPJ[7]*6) + (CNPJ[8]*5) + (CNPJ[9]*4) + (CNPJ[10]*3) + (CNPJ[11]*2)) % 11;
     CNPJ[12] = 11 - resto;
     
     if(resto < 2){
      CNPJ[12] = 0;          
     } 
     
     resto = ((CNPJ[0]*6) + (CNPJ[1]*5) + (CNPJ[2]*4) + (CNPJ[3]*3) + (CNPJ[4]*2) + (CNPJ[5]*9) + (CNPJ[6]*8) + (CNPJ[7]*7) + (CNPJ[8]*6) + (CNPJ[9]*5) + (CNPJ[10]*4) + (CNPJ[11]*3) + (CNPJ[12]*2)) % 11;
     CNPJ[13] = 11 - resto;
     
     if(resto < 2){
      CNPJ[13] = 0;          
     } 
     
     
     NumeroCNPJ = CNPJ[0];
     
     for (i = 1; i < 12; i++){
         
         NumeroCNPJ = NumeroCNPJ * 10;
         NumeroCNPJ = NumeroCNPJ + CNPJ[i];
     }
     
     NumeroCNPJ = (NumeroCNPJ * 100) + (CNPJ[12] * 10);
     NumeroCNPJ = NumeroCNPJ + CNPJ[13];
      
     return NumeroCNPJ;
     
  
   } 
}
