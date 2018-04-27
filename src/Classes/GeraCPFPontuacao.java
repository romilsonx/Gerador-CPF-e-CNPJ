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
public class GeraCPFPontuacao {
    // Método para gerar CPF aleatório e retornar como String
    public static String GeraCPF(){
     Random gerador = new Random();
     int CPF[] = new int[11];
     String CPFPontucao[] = new String[14];
     int i;
     int resto;
     String NumCPF;
     
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
      
     // Converter numeros para Sring
     CPFPontucao[0] = Integer.toString (CPF[0]);
     CPFPontucao[1] = Integer.toString (CPF[1]);
     CPFPontucao[2] = Integer.toString (CPF[2]);
     CPFPontucao[3] = Integer.toString (CPF[3]);
     CPFPontucao[4] = Integer.toString (CPF[4]);
     CPFPontucao[5] = Integer.toString (CPF[5]);
     CPFPontucao[6] = Integer.toString (CPF[6]);
     CPFPontucao[7] = Integer.toString (CPF[7]);
     CPFPontucao[8] = Integer.toString (CPF[8]);
     CPFPontucao[9] = Integer.toString (CPF[9]);
     CPFPontucao[10] = Integer.toString (CPF[10]);
     
     // Coloca todos os numeros em uma unica variavel
     return NumCPF = (CPFPontucao[0]+CPFPontucao[1]+CPFPontucao[2]+"."+CPFPontucao[3]+CPFPontucao[4]+CPFPontucao[5]+"."+CPFPontucao[6]+CPFPontucao[7]+CPFPontucao[8]+"-"+CPFPontucao[9]+CPFPontucao[10]);
     
  }
    
}
