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
public class GeraCNPJPontuacao {
    // Método para gerar CNPJ aleatório e retornar como String
    public static String GeraCNPJ() {
        
    Random Gerador = new Random();
    int CNPJ[] = new int[14];
    String CNPJPontucao[] = new String[14];
    int i;  
    String NumeroCNPJ;
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
     
     // Converter numeros para Sring
     CNPJPontucao[0] = Integer.toString (CNPJ[0]);
     CNPJPontucao[1] = Integer.toString (CNPJ[1]);
     CNPJPontucao[2] = Integer.toString (CNPJ[2]);
     CNPJPontucao[3] = Integer.toString (CNPJ[3]);
     CNPJPontucao[4] = Integer.toString (CNPJ[4]);
     CNPJPontucao[5] = Integer.toString (CNPJ[5]);
     CNPJPontucao[6] = Integer.toString (CNPJ[6]);
     CNPJPontucao[7] = Integer.toString (CNPJ[7]);
     CNPJPontucao[8] = Integer.toString (CNPJ[8]);
     CNPJPontucao[9] = Integer.toString (CNPJ[9]);
     CNPJPontucao[10] = Integer.toString (CNPJ[10]);
     CNPJPontucao[11] = Integer.toString (CNPJ[11]);
     CNPJPontucao[12] = Integer.toString (CNPJ[12]);
     CNPJPontucao[13] = Integer.toString (CNPJ[13]);
     
     // Coloca todos os numeros em uma unica variavel
     return NumeroCNPJ = (CNPJPontucao[0]+CNPJPontucao[1]+"."+CNPJPontucao[2]+CNPJPontucao[3]+CNPJPontucao[4]+"."+CNPJPontucao[5]+CNPJPontucao[6]+CNPJPontucao[7]+"/"+CNPJPontucao[8]+CNPJPontucao[9]+CNPJPontucao[10]+CNPJPontucao[11]+"-"+CNPJPontucao[12]+CNPJPontucao[13]);
     
  
   } 
    
}
