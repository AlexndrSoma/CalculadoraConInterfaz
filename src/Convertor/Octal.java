/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Convertor;
import Clases.Operacion;
/**
 *
 * @author alex
 */
public class Octal implements Operacion {

    @Override
    public String operar(int a, int b) {
        
        String oct = Integer.toOctalString(a);
    
  
        return oct ;
    }
    
}