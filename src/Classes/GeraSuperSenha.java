/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author c1401801
 */
public class GeraSuperSenha {
    
    public static int senha(){
      Date date = new Date();
      SimpleDateFormat hora = new SimpleDateFormat("HH");
      String hora1 = hora.format(new Date());
      int horaatual = Integer.parseInt(hora1);
       
      SimpleDateFormat dia = new SimpleDateFormat("dd");
      String dia1 = dia.format(new Date());
      int diaatual = Integer.parseInt(dia1);
      
      SimpleDateFormat mes = new SimpleDateFormat("MM");
      String mes1 = mes.format(new Date());
      int mesatual = Integer.parseInt(mes1);
      
      SimpleDateFormat ano = new SimpleDateFormat("yyyy");
      String ano1 = ano.format(new Date());
      int anoatual = Integer.parseInt(ano1);
      
      int supersenha = ((diaatual + mesatual) * anoatual) + horaatual;
      
      return supersenha;
        
    } 
    
    
}
